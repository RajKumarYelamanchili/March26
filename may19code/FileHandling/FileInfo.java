package FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File fo = new File("D:\\pqr.txt");
		
		if (fo.exists())
		{
			System.out.println("Name of the file : " + fo.getName());
			System.out.println("Absolute path of the file: " + fo.getAbsolutePath());
			System.out.println("Is the file writable?: " + fo.canWrite());
			System.out.println("Is the file readable?: " + fo.canRead());
			System.out.println("Size of the file in bytes: " + fo.length());
		}
	}

}
