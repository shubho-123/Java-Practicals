package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataEx {
	Connection connection;
	Statement statement;
	ResultSet rSet;
	ResultSetMetaData rMetaData;
	
	public ResultSetMetaDataEx() throws ClassNotFoundException, SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("Connection completed");
	}
	
	public void metaData() throws SQLException {
		statement = connection.createStatement();
		rSet = statement.executeQuery("select * from employee");
		rMetaData =rSet.getMetaData();
		System.out.println("No of Column: "+rMetaData.getColumnCount());
		System.out.println("Column name: "+rMetaData.getColumnName(3));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ResultSetMetaDataEx obj=new ResultSetMetaDataEx();
		obj.metaData();
	}

}
