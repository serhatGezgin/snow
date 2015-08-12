package org.yazgel.snow.codegen

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage.Registry
import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.SnowPackage
import org.yazgel.util.ecore.ModelIO

class SnowGenerator {
	val persistenceGenerator = new PersistenceModelGenerator

	def generate(PersistenceModel persistenceModel) {
		persistenceGenerator.generate(persistenceModel)
	}

	def generate(URI inputUri) {
		var modelIO = new ModelIO {

			override protected registerPackages(Registry packageRegistry) {
				/* Register snow package */
				packageRegistry.put(SnowPackage.eNS_URI, SnowPackage.eINSTANCE)
			}
		}

		var PersistenceModel model = modelIO.read(inputUri).get(0) as PersistenceModel

		generate(model)
	}
}