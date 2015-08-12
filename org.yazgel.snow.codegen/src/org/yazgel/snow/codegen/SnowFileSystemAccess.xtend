package org.yazgel.snow.codegen

import java.nio.file.Paths
import java.nio.file.Files
import java.nio.charset.Charset
import org.yazgel.util.file.PathManager

class SnowFileSystemAccess {

	def write(String file, String content) {
		PathManager.create.file(file).build;
		Files.write(Paths.get(file), content.getBytes(Charset.forName("UTF8")));
	}
}