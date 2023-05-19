package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File fo = new File("D:\\abc.xlsx");
			
			if (fo.createNewFile())
			{
				System.out.println("File " + fo.getName() + " is created successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch (IOException e) {
		System.out.println("some error occurred");
		}

	}

}
