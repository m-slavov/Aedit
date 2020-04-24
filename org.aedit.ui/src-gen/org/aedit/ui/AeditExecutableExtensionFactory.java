/*
 * generated by Xtext 2.12.0
 */
package org.aedit.ui;

import com.google.inject.Injector;
import org.aedit.ui.internal.AeditActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AeditExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AeditActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AeditActivator.getInstance().getInjector(AeditActivator.ORG_AEDIT_AEDIT);
	}
	
}