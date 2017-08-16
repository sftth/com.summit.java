package chap121;

import java.io.File;
import java.io.FileFilter;

public class Example {
	public static void main(String[] args) {
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				
				return file.isHidden();
			}
			
		});
	}
}
