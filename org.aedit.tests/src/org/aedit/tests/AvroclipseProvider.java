package org.aedit.tests;

import com.google.inject.Injector;

import avroclipse.AvroIDLStandaloneSetup;

public class AvroclipseProvider extends AeditInjectorProvider{

	@Override
	protected Injector internalCreateInjector() {
		AvroIDLStandaloneSetup.doSetup();
		return super.internalCreateInjector();
		
	}

}
