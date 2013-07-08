//Author : Nedbie Amoranto
public class Course	//ang weird ng spelling
{
	private String course_name;	//o course code?
	private String description;
	private String course_ID;	//o ito yung course code?
	private int section;
	private int units;
	
	public Course( )	//limot ko na constructor
	{
		genCourseID();
	}
	
	public void setCourseName( String name )
	{
		course_name = name;
	}
	
	public void genCourseID( )
	{
		Integer temp = new Integer( (int)Math.abs(Math.random()) );
		course_ID = temp.toString();
	}
	
	public String getCourseID( )
	{
		return course_ID;
	}

	public String getCourseName()
	{
		return course_name;
	}
	
	public void setDescription( String desc )
	{
		description = desc;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	
}
