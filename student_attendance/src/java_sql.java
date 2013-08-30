import java.sql.*;
import java.util.*;

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
        
        private int getNumRows()
        {
            int size = 0;
            try {
                resultSet.last();
                size = resultSet.getRow();
                resultSet.beforeFirst();
            }
            catch(Exception ex) {
                return 0;
            }
            return size;
        }
	
       
	public String[][]query(String q)
        {
            //ArrayList of arrays(of Strings) yo dawg
            String[][] st ={{""}};
                
                int i=0;
                int numOfColumns;   //number of columns of resultSet
                int numOfRows;      //number of rows of resultSet
                
                connect();
		
                if(con != null)
                {
		//Testing of Queries
                    try { 
				statement = con.createStatement();// creates an object used for sending sql statements to the database
				resultSet = statement.executeQuery(q);// receives the result set of the querty
				
                                //<editor-fold defaultstate="collapsed" desc="get number of columns">
                                
                                //get metadata to count resulting columns
                                ResultSetMetaData rsmd = resultSet.getMetaData();
                                
                                //get the number of columns
                                numOfColumns = rsmd.getColumnCount();
                                
                                numOfRows = getNumRows();
                                
                                //</editor-fold>
                                
//                               for debugging
//                               System.out.println(numOfColumns);
//                               System.out.println(numOfRows);
                               
                                String[][] temps = new String[numOfRows][numOfColumns];
                                while(resultSet.next())
                                {
                                    //iterate through columns
                                    for(int j = 0; j<numOfColumns; j++)
                                    {
                                       temps[i][j] = resultSet.getString(j+1);
                                    }
                                    
                                    i++;//next row in resultSet matrix
                                }
                                
				//Close connections
				resultSet.close();
				statement.close();
				con.close();
                                
                               st = temps;
                                
			} catch (Exception e){
				e.printStackTrace();
			} 
		}
                
                return st;
	}

	public void updateQuery(String q)
	{
		connect();
		
        if(con != null)
        {
	//Testing of Queries
            try
            { 
            	
            	statement = con.createStatement();// creates an object used for sending sql statements to the database
			
				statement.executeUpdate(q);
                                
				//Close connections
				statement.close();
				con.close();
	             
			}
            catch (Exception e)
            {
				e.printStackTrace();
			}
        }
	}
	
}
