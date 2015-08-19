package org.yazgel.snow.notation.text.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.yazgel.snow.notation.text.snow.Entity

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class SnowJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * a builder API to programmatically create Jvm elements 
	 * in readable way.
	 */
	@Inject extension JvmTypesBuilder

	@Inject extension IQualifiedNameProvider

	def dispatch void infer(Entity element, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(element.toClass(element.fullyQualifiedName)) [
			documentation = element.documentation
			if (element.superType != null)
				superTypes += element.superType.cloneWithProxies
			for (feature : element.features) { 
				switch feature {
					org.yazgel.snow.notation.text.snow.Property: { 
						members += feature.toField(feature.name, feature.type)
						members += feature.toGetter(feature.name, feature.type)
						members += feature.toSetter(feature.name, feature.type)
					}
				}
			}
		]
	}
}

