/*
 * generated by Xtext 2.12.0
 */
package org.aedit.generator;

import com.google.common.io.Files;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import avroclipse.AvroIDLStandaloneSetup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.aedit.AeditStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		Injector injector = new AeditStandaloneSetup().createInjectorAndDoEMFRegistration();

		new AvroIDLStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);

		Singleton.getInstance().setWorkspaceDir(args[0]);
		main.runGenerator(args[0]);
		
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String rootDirPath) {
		List<Resource> mainFiles = new ArrayList<Resource>();

		ResourceSet set = resourceSetProvider.get();

		getFiles(rootDirPath, mainFiles, set);

		// Configure and start the generator
		fileAccess.setOutputPath(rootDirPath + "\\aedit-gen");

		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);

		for (Resource resource : mainFiles) {
			generator.generate(resource, fileAccess, context);
		}

		System.out.println("Code generation finished.");
	}

	public void getFiles(String directoryName, List<Resource> mainFiles, ResourceSet set) {
		File directory = new File(directoryName);

		// Get all files from a directory.
		File[] fList = directory.listFiles();
		if (fList != null)
			for (File file : fList) {
				if (file.isFile()) {

					if (Files.getFileExtension(file.getPath()).equals("aedit")) {
						mainFiles.add(set.getResource(URI.createFileURI(file.getPath()), true));
					} else if (Files.getFileExtension(file.getPath()).equals("avdl")) {
						set.getResource(URI.createFileURI(file.getPath()), true);
					} else if (Files.getFileExtension(file.getPath()).equals("smap")) {
						mainFiles.add(set.getResource(URI.createFileURI(file.getPath()), true));
					}

				} else if (file.isDirectory()) {
					getFiles(file.getAbsolutePath(), mainFiles, set);
				}
			}
	}
}
