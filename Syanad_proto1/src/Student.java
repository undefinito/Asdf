//Author : Nedbie Amoranto
public class Student{
	
	private String student_ID;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String deg_prog;	//degree program OR course
	private int year_level;
												//value is just a sample
	public Student( String ID, String f_name, String mi, String l_name)
	{
		student_ID = ID;
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
	}
	
	public String getStudentID()
	{
		return student_ID;
	}
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public String getLastName()
	{
		return last_name;
	}
	
	public String getMiddleInitial()
	{
		return middle_name;
	}
        
        public void setDegProg( String dp )
        {
            deg_prog = dp;
        }
	
        public String getDegProg( )
        {
            return deg_prog;
        }
        
        public void setYearLevel( int year )
        {
            year_level = year;
        }
        
        public int getYearLevel( )
        {
            return year_level;
        }

}