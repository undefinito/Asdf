//Author : Nedbie Amoranto
public class Teacher
{
	private String teacher_ID;
	private String first_name;
	private String middle_name;
	private String last_name;
	private int current_load;
	private static final int TOTAL_LOAD = 15;	//for teh lulz... but not sure if needed
												//value is just a sample
	public Teacher( String f_name, String mi, String l_name)
	{
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
	}
	//tinamad na ko gumawa get set methods nito
}