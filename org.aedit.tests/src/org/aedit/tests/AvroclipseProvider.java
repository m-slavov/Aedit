package org.aedit.tests;

import org.xtext.example.org.xtext.example.avdlclipse.AvdlClipseStandaloneSetup;

import com.google.inject.Injector;

public class AvroclipseProvider extends AeditInjectorProvider{

	@Override
	protected Injector internalCreateInjector() {
		AvdlClipseStandaloneSetup.doSetup();
		return super.internalCreateInjector();
		
	}
}
