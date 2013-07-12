import java.sql.*;

public class java_sql
{
	
	public Connection con;	//variable for the connection
	public Statement statement;//object for making sql statements
	public ResultSet resultSet;//object that receives sql results
	
	private final String user = "root";
	private final String pass = "password";
	private final String location = "localhost";
	private final String DBName = "syanad2";
	private final String port = ":3306"; // add : then port number
	private final String driverLoc = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://" + location + port + "/" + DBName;

	public java_sql( )
	{
		con = null;
		statement = null;
		resultSet = null;
	}
	
	private void connect(){//maybe private
		//COMMENTED OUT
		//for debugging db connections
		try {
			Class.forName(driverLoc);
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql JDBC driver is Missing ");
			e.printStackTrace();
			return; 			//apparently this stops running the remaining code
		}
		//System.out.println("JDBC driver loaded");
		
		//Checks The existence of the Database and authenticates the user 
		try{
			con = DriverManager.getConnection(URL, user, pass);
		} catch(SQLException e){
			System.out.println("Database does not exist or authentication failed ");
			e.printStackTrace();
			return;
		}
		//System.out.println("Authentication Complete");
		//System.out.println("Database found");
		
		if(con == null){
			System.out.println("Connection Failed");
		}/*
		else{
			System.out.println("Connected to " + DBName + " on " + location);
		}*/
		//END CONNECTION
	}
	
	private String[] query(String q){//hindi dapat to void
		String[] str;
		str = new String[30];
		int i=0;
		connect();
		if(con != null){
		//Testing of Queries
		try { 
				statement = con.createStatement();// creates an object used for sending sql statements to the database
				resultSet = statement.executeQuery(q);// receives the result set of the querty
					while(resultSet.next()){//display result for each item in the result set
						str[i] = (resultSet.getString(1) + " " + resultSet.getString(2));	//column
						i++;
					}
				//Close connections
				resultSet.close();
				statement.close();
				con.close();
			} catch (Exception e){
				e.printStackTrace();
			} 
		}
		return str;
	}
	
}
