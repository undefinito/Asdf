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
	
	public String[][] query(String q){//hindi dapat to void
		String[][] st = new String[5][5];
		
                int i=0;
                int numOfColumns;   //number of columns of resultSet
                
		connect();
		
                if(con != null){
		//Testing of Queries
		try { 
				statement = con.createStatement();// creates an object used for sending sql statements to the database
				resultSet = statement.executeQuery(q);// receives the result set of the querty
				
                                //<editor-fold defaultstate="collapsed" desc="get number of columns">
                                
                                //get metadata to count resulting columns
                                ResultSetMetaData rsmd = resultSet.getMetaData();
                                
                                //get the number of columns
                                numOfColumns = rsmd.getColumnCount();
                                
                                //</editor-fold>
                                
                                 //makes the matrix dynamic
                                String[][] str = new String[30][numOfColumns+1]; //get only the first thirty rows
  
                                    while(resultSet.next()){//display result for each item in the result set
					
                                        //makes the matrix dynamic
                                        //get each attribute for row i
                                        for(int j = 1; j<numOfColumns+1; j++)
                                        {
                                                str[i][j-1] = resultSet.getString(j);//student id 
					}
                                        
                                        i++;//next row in resultSet matrix
                                    }
				//Close connections
				resultSet.close();
				statement.close();
				con.close();
                                
                                st = str;
                                
			} catch (Exception e){
				e.printStackTrace();
			} 
		}
                
                return st;
	}
	
}
