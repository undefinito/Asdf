package teachAttend;

//Author : Carlo Carabeo
public class classlist
{
	private String teacher_ID;
	private String coursecode;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String sched_room;
	private String sched_Stime;
	private String sched_Etime;
	private String sched_day;

	/* 
SELECT teacher.teacher_ID, course_name, first_name, last_name, middle_initial, sched_room, sched_time, sched_day
FROM classlist, teacher, course
WHERE classlist.teacher_ID = teacher.teacher_ID
AND classlist.course_ID = course.course_ID
	 */
	
	public classlist( String ID, String f_name, String l_name, String mi, String course_code, String room, String Stime, String Etime, String day )
	{
        teacher_ID = ID;
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
		coursecode = course_code;
		sched_room = room;
		sched_Stime = Stime;
		sched_Etime = Etime;
		sched_day = day;
	}

	//@return the teacher_ID
	public String getTeacher_ID() {
		return teacher_ID;
	}

	//@return the classcode
	public String getCoursecode() {
		return coursecode;
	}

	//@return the first_name
	public String getFirst_name() {
		return first_name;
	}

	//@return the middle_name
	public String getMiddle_name() {
		return middle_name;
	}

	//@return the last_name
	public String getLast_name() {
		return last_name;
	}

	//@return the sched_room
	public String getSched_room() {
		return sched_room;
	}

	//@return the sched_time
	public String getSched_Stime() {
		return sched_Stime;
	}
	
	public String getSched_Etime() {
		return sched_Etime;
	}

	//@return the sched_day
	public String getSched_day() {
		return sched_day;
	}

	//@param teacher_ID the teacher_ID to set
	public void setTeacher_ID(String teacher_ID) {
		this.teacher_ID = teacher_ID;
	}

	//@param classcode the coursecode to set
	public void setClasscode(String classcode) {
		this.coursecode = classcode;
	}

	//@param first_name the first_name to set
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	//@param middle_name the middle_name to set
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	//@param last_name the last_name to set
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	//@param sched_room the sched_room to set
	public void setSched_room(String sched_room) {
		this.sched_room = sched_room;
	}

	//@param sched_time the sched_time to set
	public void setSched_Stime(String sched_Stime) {
		this.sched_Stime = sched_Stime;
	}
	
	//@param sched_time the sched_time to set
	public void setSched_Etime(String sched_Etime) {
		this.sched_Etime = sched_Etime;
	}

	//@param sched_day the sched_day to set
	public void setSched_day(String sched_day) {
		this.sched_day = sched_day;
	}

}