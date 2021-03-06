/*
 * generated by Xtext
 */
package org.yazgel.snow.notation.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.yazgel.snow.notation.text.ui.internal.SnowActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SnowExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SnowActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SnowActivator.getInstance().getInjector(SnowActivator.ORG_YAZGEL_SNOW_NOTATION_TEXT_SNOW);
	}
	
}
