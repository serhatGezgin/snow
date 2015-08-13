package org.yazgel.snow.codegen

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.yazgel.snow.SnowFactory
import org.junit.Assert

class PersistenceModelGeneratorTest {
	@Rule
	public var folder = new TemporaryFolder();

	@Test
	def void testGeneratePersistenceModel() {
		// TODO: Assert.fail("Not yet implemented");
	}

	@Test
	def void testGenerateEntity() {
		var persistenceModel = SnowFactory.eINSTANCE.createPersistenceModel();
		persistenceModel.setGroupId("com.akgund");
		persistenceModel.setArtifactId("myproj");
		persistenceModel.setOutputFolder(folder.getRoot().toString());

		var entity = SnowFactory.eINSTANCE.createEntity();
		entity.setName("Ogrenci");
		entity.tableName = 'OGRENCI'
		persistenceModel.entities.add(entity);

		var propertyAd = SnowFactory.eINSTANCE.createProperty
		propertyAd.name = 'ad'
		propertyAd.type = 'String'
		entity.properties.add(propertyAd)

		var persistenceModelGenerator = new PersistenceModelGenerator();
		var entityString = persistenceModelGenerator.generateEntity(entity);

		Assert.assertEquals('''
			package com.akgund.myproj.model;
			
			@javax.persistence.Entity
			@javax.persistence.Table(name="OGRENCI")
			public class Ogrenci {
				@javax.persistence.Id
				@javax.persistence.GeneratedValue
				private Long id;
				private String ad;
				
				public Long getId(){
					return this.id;
				}
				
				public void setId(Long id){
					this.id = id;
				}
				
				public String getAd(){
					return this.ad;
				}
				
				public void setAd(String ad){
					this.ad = ad;
				}
			}
		'''.toString, entityString);
	}

	@Test
	def void testGeneratePom() {
		var persistenceModel = SnowFactory.eINSTANCE.createPersistenceModel();
		persistenceModel.setGroupId("com.akgund");
		persistenceModel.setArtifactId("myproj");
		persistenceModel.setOutputFolder(folder.root.toString);

		var entity = SnowFactory.eINSTANCE.createEntity();
		entity.setName("Ogrenci");
		persistenceModel.getEntities().add(entity);

		var persistenceModelGenerator = new PersistenceModelGenerator();
		var pomxml = persistenceModelGenerator.generatePom(persistenceModel)

		Assert.assertEquals('''
			<?xml version="1.0"?>
			<project
				xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
				xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
				<modelVersion>4.0.0</modelVersion>
				
				<groupId>com.akgund</groupId>
				<artifactId>myproj</artifactId>
				<version>1.0.0-SNAPSHOT</version>
				<packaging>jar</packaging>
				
				<name>myproj</name>
				
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
		'''.toString, pomxml)
	}
}