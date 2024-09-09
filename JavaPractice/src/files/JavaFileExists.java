package files;

import java.io.File;

public class JavaFileExists {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir");
		System.out.println("file path: "+path);
		String filePath=path+"\\src\\regexpressions\\text_to_search.txt";
		
		// Create a File object
		File file = new File(filePath);

		// Check if the file exists
		if (file.exists()) {
			System.out.println("The file exists.");
		} else {
			System.out.println("The file does not exist.");
		}
	}

}
