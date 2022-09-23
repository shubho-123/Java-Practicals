package filehanding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee em=new Employee(1, "Shubhendu");
		
		FileOutputStream file=new FileOutputStream("F:\\Serializable.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(em);
		obj.flush();
		System.out.println("Converted Byte into Stream");

	}

}
