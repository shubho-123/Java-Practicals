package filehanding;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter objfile=new FileWriter("F:\\NewFileCreatedByCoding.txt");
		objfile.write("Wellcome");
		objfile.close();
		System.out.println("File Created");
		
		
		System.out.println("After Appending we get ");
		FileWriter obj2=new FileWriter("F:\\NewFileCreatedByCoding.txt", true); //appending true Another string with privious // if you are not  Appending then it will updated and remove the privious String
		obj2.write("    ..........This is also included");
		obj2.close();
		System.out.println("File Created");
		
		

	}

}
