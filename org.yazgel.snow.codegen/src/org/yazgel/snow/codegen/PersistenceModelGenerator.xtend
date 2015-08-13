package org.yazgel.snow.codegen

import org.yazgel.snow.PersistenceModel
import org.yazgel.snow.Entity

class PersistenceModelGenerator {
	extension SnowExtensions ext = new SnowExtensions
	val fs = new SnowFileSystemAccess

	def generate(PersistenceModel model) {
		/* Generate entities */
		model.entities.forEach [ e |
			fs.write(e.extEntiyModelPath, e.generateEntity)
		]

		/* Generate pom.xml */
		fs.write(model.extProjectRootPath + '/pom.xml', model.generatePom)
	}

	def protected String generatePom(PersistenceModel persistence) '''
		<?xml version="1.0"?>
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<modelVersion>4.0.0</modelVersion>
			
			<groupId>«persistence.groupId»</groupId>
			<artifactId>«persistence.artifactId»</artifactId>
			<version>1.0.0-SNAPSHOT</version>
			<packaging>jar</packaging>
			
			<name>«persistence.artifactId»</name>
			
			<properties>
				<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
				<project.java.version>1.8</project.java.version>
				
				<!-- Dependency versions -->
				<junit.version>4.12</junit.version>
				<derby.version>10.9.1.0</derby.version>
				<guice.version>4.0</guice.version>
				<hibernate.version>4.3.10.Final</hibernate.version>
				<javaee-api.version>7.0</javaee-api.version>
			</properties>
			
			<dependencies>
				<dependency>
					<groupId>javax</groupId>
					<artifactId>javaee-api</artifactId>
					<version>${javaee-api.version}</version>
					<scope>provided</scope>
				</dependency>
				<dependency>
					<groupId>org.hibernate</groupId>
					<artifactId>hibernate-entitymanager</artifactId>
					<version>${hibernate.version}</version>
				</dependency>
				<dependency>
					<groupId>com.google.inject</groupId>
					<artifactId>guice</artifactId>
					<version>${guice.version}</version>
				</dependency>
		
				<!-- Test dependencies -->
				<dependency>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
					<version>${junit.version}</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.apache.derby</groupId>
					<artifactId>derby</artifactId>
					<version>${derby.version}</version>
					<scope>test</scope>
				</dependency>
			</dependencies>
		</project>
	'''

	def protected String generateEntity(Entity entity) '''
		package «entity.extEntityPackage»;
		
		public class «entity.name» {
		}
	'''
}