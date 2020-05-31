/*
 * generated by Xtext 2.21.0
 */
package org.aedit.ui;

import com.google.inject.Injector;
import org.aedit.ui.internal.AeditActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AeditExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AeditActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AeditActivator activator = AeditActivator.getInstance();
		return activator != null ? activator.getInjector(AeditActivator.ORG_AEDIT_AEDIT) : null;
	}

}
