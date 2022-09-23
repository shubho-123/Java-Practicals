package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection get Open:");
	}
	
	public void getData() throws SQLException
	{
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from contact");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+ "\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getFloat(4));
			System.out.println();
		}
		con.close();
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StatementEx st=new StatementEx();
		st.getData();
	}
}
