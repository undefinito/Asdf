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
	
	private void setCourseName( String name )
	{
		course_name = name;
	}
	
	private void genCourseID( )
	{
		Integer temp = new Integer( (int)Math.abs(Math.random()) );
		course_ID = temp.toString();
	}
	
	private String getCourseID( )
	{
		return course_ID;
	}

	private String getCourseName()
	{
		return course_name;
	}
	
	private void setDescription( String desc )
	{
		description = desc;
	}
	
	private String getDescription()
	{
		return description;
	}
	
	
}
