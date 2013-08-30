/*\

***			FOR STUDENT ATTENDANCE

\*/
//Author : Carlo Carabeo
//Edited by: Amoranto, Nedbie Francis F.
public class classlist
{
	private String student_ID;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String deg_prog;
	private String time_in;
	private String time_out;
	private String status;
	
	public classlist( 
			String ID,
			String f_name, 
			String l_name, 
			String mi, 
			String major,
			String time_in1,
			String time_out1,
			String status1){
		
        student_ID = ID;
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
		deg_prog = major;
		time_in = time_in1;
		time_out = time_out1;
		status = status1;
	}

	public String getStudID() {
		return student_ID;
	}

	public void setStudID(String ID) {
		student_ID = ID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getDegProg()
	{
		return deg_prog;
	}
	
	public void setDegProg(String major)
	{
		deg_prog = major;
	}

	public String getTime_in() {
		return time_in;
	}

	public void setTime_in(String time_in) {
		this.time_in = time_in;
	}

	public String getTime_out() {
		return time_out;
	}

	public void setTime_out(String time_out) {
		this.time_out = time_out;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}