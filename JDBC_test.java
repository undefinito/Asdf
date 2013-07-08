/*THIS TESTS JDBC connections 
 *Uses a predetermined database and results of a query
 *NOTES When using JDBC with eclipse
 *Right-click project > Properties > Java Build path > Libraries > add External JAR*/
import java.sql.*;
import java.util.Scanner;

public class JDBC_test {
	public static void main(String args[]){
		Connection con = null;	//variable for the connection
		Statement statement = null;//object for making sql statements
		ResultSet resultSet = null;//object that receives sql results
		
		Scanner i = new Scanner(System.in);
		//Constant Variable Declaration
		//User and password for authenticating phpMyAdmin Access
		
		System.out.printf("Enter Database user : ");
		final String user = i.next();
		System.out.printf("Enter Database password : ");
		final String pass = i.next();
		System.out.printf("Enter Database name : ");
		final String DBName = i.next();
		
		String location = "localhost";
		final String port = ":3306"; // add : then port number
		final String driverLoc = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://" + location + port + "/" + DBName;
		//Constant Query for pre-determined result
		
		System.out.printf("Enter possible query : ");
		final String q = i.next();

		
		//BEGIN CONNECTION
		//Checks if driver location is correct
		try {
			Class.forName(driverLoc);
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql JDBC driver is Missing ");
			e.printStackTrace();
			return; 			//apparently this stops running the remaining code
		}
		System.out.println("JDBC driver loaded");
		
		//Checks The existence of the Database and authenticates the user 
		try{
			con = DriverManager.getConnection(URL, user, pass);
		} catch(SQLException e){
			System.out.println("Database does not exist or authentication failed ");
			e.printStackTrace();
			return;
		}
		System.out.println("Authentication Complete");
		System.out.println("Database found");
		
		if(con == null){
			System.out.println("Connection Failed");
		}
		else{
			System.out.println("Connected to " + DBName + " on " + location);
		}
		//END CONNECTION	
		System.out.println("\n\n");
		if(con != null){
			//Testing of Queries
			try { 
				statement = con.createStatement();// creates an object used for sending sql statements to the database
				resultSet = statement.executeQuery(q);// receives the result set of the querty
					while(resultSet.next()){//display result for each item in the result set
						System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
					}
				//Close connections
				resultSet.close();
				statement.close();
				con.close();
			} catch (Exception e){
				e.printStackTrace();
			} 
		}
		
	}
}
