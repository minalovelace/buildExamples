/**
 * generated by Xtext 2.11.0
 */
package org.learning.example;

import org.learning.example.MyDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
