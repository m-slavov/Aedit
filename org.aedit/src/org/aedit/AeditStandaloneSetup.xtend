/*
 * generated by Xtext 2.12.0
 */
package org.aedit


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AeditStandaloneSetup extends AeditStandaloneSetupGenerated {

	def static void doSetup() {
		new AeditStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
