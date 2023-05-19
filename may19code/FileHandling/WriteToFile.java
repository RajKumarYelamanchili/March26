package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args){
		
		try {
			FileWriter fwrite = new FileWriter("D:\\xyz.doc");
			fwrite.write("I am passionate about automation testing");
			fwrite.close();
		}
		catch (IOException e) {
			System.out.println("some error occurred");
		}

	}

}
