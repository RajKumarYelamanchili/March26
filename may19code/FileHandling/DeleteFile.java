package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File fo = new File("D:\\pqr.txt");
		
		if (fo.delete())
		{
			System.out.println(fo.getName() + " file is deleted successfully");
		}
		else
		{
			System.out.println("unexpected error");
		}
	}

}
