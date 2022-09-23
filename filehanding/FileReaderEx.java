package filehanding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader objReader=new FileReader("F:\\NewFileCreatedByCoding.txt");
		int i;
		while((i=objReader.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
