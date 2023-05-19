package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws InterruptedException  {

		
		try {
			File fo = new File("D:\\pqr.txt");
			Scanner dr = new Scanner(fo);
			
			while(dr.hasNextLine())
			{
			String line	= dr.nextLine();
			System.out.println(line);
			Thread.sleep(1000);
			}
			dr.close();
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found exception occurred");
		}

	}

}
