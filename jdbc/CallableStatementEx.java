package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementEx {
	Connection connection;
	CallableStatement cStatement;
	
	public CallableStatementEx() throws ClassNotFoundException, SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get Open:");
	}
	
	public void callingProcedure(int id,String name) throws SQLException {
		cStatement = connection.prepareCall("{call insertUserRecord(?,?)}");
		cStatement.setInt(1, id);
		cStatement.setString(2, name);
		cStatement.execute();
		System.out.println("inserted Successfuly");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CallableStatementEx obj=new CallableStatementEx();
		obj.callingProcedure(103, "Ajay");

	}

}
