package filehanding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream opStream = new FileOutputStream("F:\\FileInputStream.txt",true); //byte-oriented class(FileOutputStream) //(you can pass FileName of FileLocation) // pass True to append you file ///////appending true Another string with previous // if you are not  Appending then it will updated and remove the previous String
		String s=" After Apanding";			// you can take user input also
		byte[] a=s.getBytes(); //Converting String into byte then Store in a[] //FileOutputStream is a byte-oriented so we need a byte array (a[])to store it.
		opStream.write(a);
		opStream.close();
		System.out.println("Updated is Completed");
		
		//you can created file also by coding (See FileWriterEx program)

	}

}
