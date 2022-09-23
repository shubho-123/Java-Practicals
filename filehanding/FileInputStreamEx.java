package filehanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream objOfFileInputStreamClass= new FileInputStream("F:\\FileInputStream.txt");
		int i=0;															//taking integer because read() method will check -1 for file completly read or not in while condition we do that
		while((i=objOfFileInputStreamClass.read())!=-1)			//once -1 get found loop will stop //checking all the character's ascy values  individualy then it's passes under the loop
		{
			System.out.print((char)i);					//it printed ascy values // so we need to typecast integer into char so we get character values
		}
		objOfFileInputStreamClass.close(); // another

	}

}
