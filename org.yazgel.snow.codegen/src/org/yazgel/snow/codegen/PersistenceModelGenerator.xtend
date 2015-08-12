package org.yazgel.snow.codegen

import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.Entity

class PersistenceModelGenerator {
	extension SnowExtensions ext = new SnowExtensions
	val fs = new SnowFileSystemAccess

	def generate(PersistenceModel model) {
		model.entities.forEach [ e |
			fs.write(e.extEntiyModelPath, e.generate)
		]
	}

	def String generate(Entity entity) '''
		package «entity.extEntityPackage»;
		
		public class «entity.name» {
		}
	'''
}