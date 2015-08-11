package org.yazgel.snow.codegen

import java.nio.file.Paths
import java.nio.file.Files
import java.nio.charset.Charset

class SnowFileSystemAccess {

	def saveFile(String fileName, String content) {
		Files.write(Paths.get(fileName), content.getBytes(Charset.forName("UTF8")));
	}
}