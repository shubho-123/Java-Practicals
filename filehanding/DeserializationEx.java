package filehanding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException,  ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("F:\\\\Serializable.txt"));
		Employee em= (Employee) obj.readObject();
		System.out.println(em);
		obj.close();

	}

}
