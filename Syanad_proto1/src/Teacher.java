//Author : Nedbie Amoranto
public class Teacher
{
	private String teacher_ID;
	private String first_name;
	private String middle_name;
	private String last_name;
	private int current_load = 0;
	private static final int MAX_LOAD = 15;	//for teh lulz... but not sure if needed
												//value is just a sample
	public Teacher( String ID, String f_name, String mi, String l_name)
	{
                teacher_ID = ID;
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
	}
        
        public void setCurrentLoad( int cur_l )
        { 
        //if the current load is within the maximum allowed
            if( cur_l <= MAX_LOAD)   
            {
                current_load = cur_l;
            }
            else
            {
                //print error
            }
        }
        
        public int getCurrentLoad( )
        {
            return current_load;
        }
        
}