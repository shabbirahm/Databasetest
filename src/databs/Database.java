package databs;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Database {
//	Class.forName("net.sourceforge.jtds.jdbc.Driver");
	public static void main(String[] args) {
		
		//Establishing a connection to the DataBase
		Connection con=DriverManager.getConnection("DataBaseUrl","userName","password");
		
		//Connection Url Syntax
		jdbc:sqlserver://ipAdress:portNumber/dbName
		
//		Executing Sql Queries:
		
		Statement sqlStatement=con.createStatement();
		String sqlQuery="Select * From table-name WHERE condition";
		ResultSet resSet=sqlStatement.executeQuery(sqlQuery);
		
//		Fetching data from result set
		
		while(resSet.next()) {
			System.out.println(resSet.getString(required_column_name));
		}
		
//		Disconnecting the database connection
		con.close();
		

	}
	
	
	
	

}
