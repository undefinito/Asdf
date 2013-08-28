package teachAttend;

//Author : Carlo Carabeo
public class classlist
{
	private String teacher_ID;
	private String course_ID;
	private String coursecode;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String sched_room;
	private String sched_Stime;
	private String sched_Etime;
	private String sched_day;
	private String classtype;
	private String time_in;
	private String time_out;
	private String status;
	private String date;
	private String section;
	
	public classlist( 
			String teachID,
			String f_name, 
			String l_name, 
			String mi, 
			String course_code, 
			String room, 
			String Stime, 
			String Etime, 
			String day, 
			String classtype1,
			String time_in1,
			String time_out1,
			String status1,
			String courseID,
			String d,
			String sec){
		
        teacher_ID = teachID;
        course_ID = courseID;
		first_name = f_name;
		middle_name = mi;
		last_name = l_name;
		coursecode = course_code;
		sched_room = room;
		sched_Stime = Stime;
		sched_Etime = Etime;
		sched_day = day;
		classtype = classtype1;
		time_in = time_in1;
		time_out = time_out1;
		status = status1;
		date = d;
		section = sec;
	}

	public String getTeacher_ID() {
		return teacher_ID;
	}

	public void setTeacher_ID(String teacher_ID) {
		this.teacher_ID = teacher_ID;
	}

	public String getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
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

	public String getSched_room() {
		return sched_room;
	}

	public void setSched_room(String sched_room) {
		this.sched_room = sched_room;
	}

	public String getSched_Stime() {
		return sched_Stime;
	}

	public void setSched_Stime(String sched_Stime) {
		this.sched_Stime = sched_Stime;
	}

	public String getSched_Etime() {
		return sched_Etime;
	}

	public void setSched_Etime(String sched_Etime) {
		this.sched_Etime = sched_Etime;
	}

	public String getSched_day() {
		return sched_day;
	}

	public void setSched_day(String sched_day) {
		this.sched_day = sched_day;
	}

	public String getClasstype() {
		return classtype;
	}

	public void setClasstype(String classtype) {
		this.classtype = classtype;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}