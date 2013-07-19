//Author : Nedbie Amoranto
public class Course	//ang weird ng spelling
{
	private String course_name;	//o course code?
	private String description;
	private String course_ID;	//o ito yung course code?
	private int section;
	private int units;
	private int totalNumSections=0;	//ito yung kung ilan sections meron
	
	public Course( String name )	//constructor
	{
		setCourseName(name);
		genCourseID();
		setSection();
	}
	
	private void setSection()
	{
		section = totalNumSections++;	//new section for course is added
	}
	
	private void setCourseName( String name )
	{
		course_name = name;
	}
	
	private void genCourseID( ) //other way
	{
		Double temp = new Double( (int)Math.abs(Math.random()) );
		
		while(temp.doubleValue() <= 99999999999.0)	//if ID generated has less than 12 digits
		{
			if(temp.doubleValue() > 99999999999.0)
			{
				course_ID = temp.toString();
			}
		}
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
