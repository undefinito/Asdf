//package teachAttend
package teachAttend;

import java.awt.Color;
import java.awt.Component;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;


@SuppressWarnings("serial")
public class teachAttendance extends JFrame {

    // Variables declaration
	//CONSTANTS
    //Colors for ALPE
    private final static  Color cABSENT = Color.RED;
    private final static Color cLATE = Color.YELLOW;
    private final static Color cPRESENT = Color.GREEN;
    private final static Color cEXCUSED = Color.BLUE;
	
    //GUI
    private static JTable attSheet;
    private JButton absentB;
    private JToolBar attBar;
    private JButton dateButton;
    private JButton excusedB;
    private JButton schedButton;
    private JButton genReport;
    private JScrollPane jScrollPane1;
    private JButton lateB;
    private JButton presentB;
    private JTextField searchBar;
    private JButton searchButton;

    //Other Windows
    private static JDialog addSched;
    
    //Functionalities
    private static classlist[] classlist;
    private static java_sql js = new java_sql();
    //custom table model
    private static MyTableModel myTableModel;
    //custom table renderer (for colors)
    private MyTableCellRenderer myTableRenderer;
    
	//Para sa atttable yun vars na to
    private static Object[][] entries;
    private static String[] columnNames = {"Course", "Time", "Room", "Faculty"};

    
    public static void main(String args[]) {
        //Entries for le table
    	populate();
    	try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teachAttendance().setVisible(true);
            }
        });
     }

    //OTHER FUNCTIONS
    private static void setRowColorStats(Object[][] tabel)//Sets row color depending on prof status
    {
    	for(int x=0; x<tabel.length; x++)
    	{
    		if(classlist[x].getStatus().equals("absent")){
    			myTableModel.setRowColour(x, cABSENT);
    		}
    		else if(classlist[x].getStatus().equals("late")){
    			myTableModel.setRowColour(x, cLATE);
    		}
    		else if(classlist[x].getStatus().equals("excused")){
    			myTableModel.setRowColour(x, cEXCUSED);
    		}
    		else if(classlist[x].getStatus().equals("present")){
    			myTableModel.setRowColour(x, cPRESENT);
    		}	
    	}
    }
    
    private static void populate(){//Populates the table and the classlist object
    	final String query = "SELECT DISTINCT teacher.teacher_ID, course_name, first_name, "
				+ " last_name, middle_initial, sched_room, sched_start_time, sched_end_time, sched_day, "
				+ " class_type, Ptime_in, Ptime_out, Pstatus, course.course_ID"
				+ " FROM classlist, teacher, course "
				+ " WHERE classlist.teacher_ID = teacher.teacher_ID "
				+ " AND classlist.course_ID = course.course_ID";

    	String tmp[][];   	
    	tmp = js.query(query);
    	classlist = new classlist[tmp.length];
    	
    	for(int row = 0; row < tmp.length; row++ ){
			final int ID = 0;
			final int course = 1;
			final int fName = 2;
			final int lName = 3;
			final int mi = 4;
			final int room = 5;
			final int Stime = 6;
			final int Etime = 7;
			final int day = 8;
			final int classtype = 9;
			final int ptime_in = 10;
			final int ptime_out = 11;
			final int pstatus = 12;
			final int courseID = 13;
			classlist[row] = new classlist(
					tmp[row][ID], 
					tmp[row][fName], 
					tmp[row][lName], 
					tmp[row][mi], 
					tmp[row][course], 
					tmp[row][room], 
					tmp[row][Stime], 
					tmp[row][Etime], 
					tmp[row][day],
					tmp[row][classtype],
					tmp[row][ptime_in],
					tmp[row][ptime_out],
					tmp[row][pstatus],
					tmp[row][courseID]
							);
		}
    	
    	//Insert query into entries for att table
    	entries = new Object[classlist.length][4];
    	enterAllEntries();
    	
    }
          
    private static void enterAllEntries() {
    	for(int c = 0; c < classlist.length; c++){
    		String c_code = classlist[c].getCoursecode();
    		String Time = classlist[c].getSched_Stime() + " - " + classlist[c].getSched_Etime();
    		String Room = classlist[c].getSched_room();
    		String Fac = classlist[c].getFirst_name() + " " + classlist[c].getLast_name();
    		entries[c][0] = c_code;
    		entries[c][1] = Time;
    		entries[c][2] = Room;
    		entries[c][3] = Fac;
    	}
	}

    private static void addSched(String course, String sec, String Stime, String Etime, String room){
    	//TODO
    	//CONSTANTS
    	final int preCourseID = 0;
    	final int preCourseName = 1;
    	final int preDescription = 2;
    	final int preSection = 3;
    	final int preUnits = 4;
    	final int preSchedDay = 5;
    	final int preSchedRoom = 6;
    	final int preSchedTime = 7; // part nito date

    	//Query if class exists
        final String prequery = "SELECT * "
        					+ "FROM course "
        					+ "WHERE course_name = '" + course + "'"
        					+ "AND class_section = '" + sec + "'";
        
        String pretmp[][] = js.query(prequery);
        
    	if(pretmp.length > 0){  //Class exists		
    		/* TODO
    		 * SELECT DISTINCT 3-id, classtype, starttime, endtime
    		 * FROM classlist, course
    		 * WHERE 
    		 */
    		final String q = "SELECT * FROM classlist WHERE course_ID = '" + pretmp[0][preCourseID] + "'";
    		final int StudID = 0;
        	final int TeacherID = 1;
        	final int CourseID = 2;
        	final int classType = 5;
        	final int studStatus = 3;
        	final int studTime_in = 4;
        	final int studTime_out = 6;
        	final int profTime_in = 7;
        	final int profTime_out = 8;
        	final int profStatus = 9;
    		
    		String tmp[][] = js.query(q);
    		//ALL Classes in 'course' - 'sec'
    		for(int c = 0; c < tmp.length; c++){
    			for(int c2 = 0; c2 < 9; c2++){
    				System.out.printf("%s ", tmp[c][c2]);
    			}
    			System.out.println();
    		}
        }
    	//Does not exist
        else{
        	System.out.println("Shit");
        }
    }
    
    private static void addSchedWindow(){
    	addSched = new JDialog();
    	addSched.setVisible(true);

        final JLabel TitleLabel = new  JLabel();
        final JLabel courseCodeLbl = new  JLabel();
        final JLabel Sectionlbl = new  JLabel();
        final JLabel S_timeLbl = new  JLabel();
        final JLabel E_timlbl = new  JLabel();
        final JLabel DateLbl = new  JLabel();
        final JTextField courseCodetxt = new  JTextField();
        final JTextField sectiontxt = new  JTextField();
        final JComboBox monthCombo = new  JComboBox();
        final JComboBox dayCombo = new  JComboBox();
        final JComboBox yearCombo = new  JComboBox();
        final JTextField S_timetxt = new  JTextField();
        final JTextField E_timetxt = new  JTextField();
        final JLabel formatLabel = new  JLabel();
        final JButton okbtb = new  JButton();
        final JButton cancelbtn = new  JButton();
        final JLabel roomlbl = new  JLabel();
        final JComboBox RoomCombo = new  JComboBox();
        final String[] rm = new String[] { "W401", "W402", "W403", "W404", "W405", "W406", "W407", "W408", "W409", "W410", "W411", "W412", "W413", "W414", "E401", "E402", "E403", "E404", "E405", "E406", "E407", "E408", "E409", "E410", "E411", "E412", "E413", "E414", "ELAB-A", "ELAB-B", "E208", "FACRM", "ENGFACRM", "E208" };        
        final String[] mo = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        final String[] moNum = new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        final String[] day = new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        final String[] yr = new String[] { "2013", "2014", "2015", "2016", "2017" };

        addSched.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitleLabel.setText("Add Subject");
        courseCodeLbl.setText("Course Code :");
        Sectionlbl.setText("Section : ");
        S_timeLbl.setText("Start Time : ");
        E_timlbl.setText("End Time : ");
        DateLbl.setText("Date : ");
        formatLabel.setText("Use hh:mm:ss in military time format");
        roomlbl.setText("Room : ");
        
        monthCombo.setModel(new DefaultComboBoxModel(mo));
        dayCombo.setModel(new DefaultComboBoxModel(day));
        yearCombo.setModel(new DefaultComboBoxModel(yr));
        RoomCombo.setModel(new DefaultComboBoxModel(rm));
        
        okbtb.setText("Ok");
        okbtb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                final String course = courseCodetxt.getText();
                final String sec = sectiontxt.getText();
                final String Stime = "'" + yearCombo.getItemAt(yearCombo.getSelectedIndex()).toString() + "-" + 
										moNum[monthCombo.getSelectedIndex()] + "-" +
										dayCombo.getItemAt(dayCombo.getSelectedIndex()).toString() + " " +
										S_timetxt.getText() + "'";
                final String Etime = "'" + yearCombo.getItemAt(yearCombo.getSelectedIndex()).toString() + "-" + 
											moNum[monthCombo.getSelectedIndex()] + "-" +
											dayCombo.getItemAt(dayCombo.getSelectedIndex()).toString() + " " +
											E_timetxt.getText() + "'";
                final String room = RoomCombo.getItemAt(RoomCombo.getSelectedIndex()).toString();
                            
                addSched(course, sec, Stime, Etime, room); //TODO
                
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	addSched.dispose();
            }
        });

        GroupLayout layout = new GroupLayout(addSched.getContentPane());
        addSched.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Sectionlbl)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sectiontxt, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(courseCodeLbl)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TitleLabel)
                                                .addGap(0, 86, Short.MAX_VALUE))
                                            .addComponent(courseCodetxt)))))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(okbtb, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancelbtn, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(DateLbl)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(monthCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(yearCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(S_timeLbl)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(S_timetxt))
                                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(E_timlbl)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(E_timetxt, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formatLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomlbl)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoomCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCodeLbl)
                    .addComponent(courseCodetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Sectionlbl)
                    .addComponent(sectiontxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLbl)
                    .addComponent(monthCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(roomlbl)
                    .addComponent(RoomCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(formatLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(S_timeLbl)
                    .addComponent(S_timetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(E_timlbl)
                    .addComponent(E_timetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtb)
                    .addComponent(cancelbtn))
                .addGap(9, 9, 9))
        );
        addSched.pack();
    }                        
    
    //BUTTON FUNCTIONS
    private void dateButtonActionPerformed(ActionEvent evt) {//Button MM/DD/YYYY                                           
        // TODO add your handling code here:
    	System.out.println("date");
    }                                          

    private void searchBarActionPerformed(ActionEvent evt) { //No idea                                         
        // TODO add your handling code here:
    	System.out.println("search");
    }                                         

    private void schedButtonActionPerformed(ActionEvent evt) {//Button Add Schedule                                    
    	addSchedWindow();
    }                                           

    private void genReportActionPerformed(ActionEvent evt) {//Button Generate Report
        // TODO add your handling code here:
    	System.out.println("genRep");
    }                                         
    
    private void searchButtonActionPerformed(ActionEvent evt) {//Go                        
        // TODO add your handling code here:
    	System.out.println("search B");
    }                                            
    
    //ALPE
    private void absentBActionPerformed(ActionEvent evt) {                                        
    	int	row = attSheet.getSelectedRow();
    	String u = "UPDATE classlist "
    				+ "SET Pstatus = 'absent'	"
    				+ "WHERE course_ID = '" + classlist[row].getCourse_ID() + "'" 
    				+ "AND teacher_ID = '" + classlist[row].getTeacher_ID() + "'";
    	js.updateQuery(u);
    	classlist[row].setStatus("absent");
    	myTableModel.fireTableRowsUpdated(row, row);//row your boat gently down the stream
    }                                       

    private void lateBActionPerformed(ActionEvent evt) {                                      
    	int	row = attSheet.getSelectedRow();
    	String u = "UPDATE classlist "
				+ "SET Pstatus = 'late'	"
				+ "WHERE course_ID = '" + classlist[row].getCourse_ID() + "'" 
				+ "AND teacher_ID = '" + classlist[row].getTeacher_ID() + "'";
    	js.updateQuery(u);
    	classlist[row].setStatus("late");
    	myTableModel.fireTableRowsUpdated(row, row);//row your boat gently down the stream
    }                                     

    private void presentBActionPerformed(ActionEvent evt) {                                         
    	int	row = attSheet.getSelectedRow();
    	classlist[row].setStatus("present");
    	String u = "UPDATE classlist "
				+ "SET Pstatus = 'present'	"
				+ "WHERE course_ID = '" + classlist[row].getCourse_ID() + "'" 
				+ "AND teacher_ID = '" + classlist[row].getTeacher_ID() + "'";
    	js.updateQuery(u);
    	myTableModel.fireTableRowsUpdated(row, row);//row your boat gently down the stream
    }                                        

    private void excusedBActionPerformed(ActionEvent evt) {                                         
    	int	row = attSheet.getSelectedRow();
    	String u = "UPDATE classlist "
				+ "SET Pstatus = 'excused'	"
				+ "WHERE course_ID = '" + classlist[row].getCourse_ID() + "'" 
				+ "AND teacher_ID = '" + classlist[row].getTeacher_ID() + "'";
    	js.updateQuery(u);
    	classlist[row].setStatus("excused");
    	myTableModel.fireTableRowsUpdated(row, row);//row your boat gently down the stream
    }                                        
    
    // GUI Layout Below
    public teachAttendance() {
    	initTableModel();
    	initTableRenderer();
        initComponents();
    }
    
    private void initTableRenderer(){
    	myTableRenderer = new MyTableCellRenderer();
    }
    
    private void initTableModel(){
    	myTableModel = new MyTableModel();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        attSheet = new JTable();
        dateButton = new JButton();
        attBar = new JToolBar();
        absentB = new JButton();
        lateB = new JButton();
        presentB = new JButton();
        excusedB = new JButton();
        searchBar = new JTextField();
        searchButton = new JButton();
        schedButton = new JButton();
        genReport = new JButton();
       
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        attSheet.setModel(myTableModel);
        attSheet.setDefaultRenderer(Object.class, myTableRenderer);
    	setRowColorStats(entries);
        
        attSheet.setAutoCreateRowSorter(true);
        attSheet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attSheet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(attSheet);
        
        attSheet.getColumnModel().getColumn(0).setMinWidth(90);
        attSheet.getColumnModel().getColumn(0).setPreferredWidth(90);
        attSheet.getColumnModel().getColumn(0).setMaxWidth(90);
        attSheet.getColumnModel().getColumn(1).setMinWidth(80);
        attSheet.getColumnModel().getColumn(1).setPreferredWidth(150);
        attSheet.getColumnModel().getColumn(1).setMaxWidth(200);
        attSheet.getColumnModel().getColumn(2).setMinWidth(60);
        attSheet.getColumnModel().getColumn(2).setPreferredWidth(60);
        attSheet.getColumnModel().getColumn(2).setMaxWidth(60);
        
        dateButton.setText("MM/DD/YYYY");
        dateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dateButtonActionPerformed(evt);
            }
        });

        attBar.setRollover(true);

        absentB.setBackground(new java.awt.Color(255, 0, 0));
        absentB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        absentB.setForeground(new java.awt.Color(255, 255, 255));
        absentB.setText("A");
        absentB.setActionCommand("Absent");
        absentB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        absentB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        absentB.setFocusable(false);
        absentB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        absentB.setMaximumSize(new java.awt.Dimension(40, 40));
        absentB.setMinimumSize(new java.awt.Dimension(40, 40));
        absentB.setPreferredSize(new java.awt.Dimension(40, 40));
        absentB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        absentB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                absentBActionPerformed(evt);
            }
        });
        attBar.add(absentB);

        lateB.setBackground(new java.awt.Color(255, 204, 0));
        lateB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lateB.setText("L");
        lateB.setActionCommand("Late");
        lateB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lateB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lateB.setFocusable(false);
        lateB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lateB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        lateB.setMaximumSize(new java.awt.Dimension(40, 40));
        lateB.setMinimumSize(new java.awt.Dimension(40, 40));
        lateB.setPreferredSize(new java.awt.Dimension(40, 40));
        lateB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lateB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lateBActionPerformed(evt);
            }
        });
        attBar.add(lateB);

        presentB.setBackground(new java.awt.Color(0, 204, 0));
        presentB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        presentB.setText("P");
        presentB.setActionCommand("Present");
        presentB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        presentB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        presentB.setFocusable(false);
        presentB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        presentB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        presentB.setMaximumSize(new java.awt.Dimension(40, 40));
        presentB.setMinimumSize(new java.awt.Dimension(40, 40));
        presentB.setPreferredSize(new java.awt.Dimension(40, 40));
        presentB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        presentB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                presentBActionPerformed(evt);
            }
        });
        attBar.add(presentB);

        excusedB.setBackground(new java.awt.Color(153, 153, 255));
        excusedB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        excusedB.setText("E");
        excusedB.setActionCommand("Excused");
        excusedB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        excusedB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excusedB.setFocusable(false);
        excusedB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excusedB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        excusedB.setMaximumSize(new java.awt.Dimension(40, 40));
        excusedB.setMinimumSize(new java.awt.Dimension(40, 40));
        excusedB.setPreferredSize(new java.awt.Dimension(40, 40));
        excusedB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excusedB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                excusedBActionPerformed(evt);
            }
        });
        attBar.add(excusedB);

        searchBar.setText("Search...");
        searchBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Go");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });


        schedButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schedButton.setText("Add Schedule");
        schedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                schedButtonActionPerformed(evt);
            }
        });

        genReport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genReport.setText("Generate Report");
        genReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                genReportActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(dateButton)
                    .addComponent(schedButton)
                    .addComponent(genReport))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(attBar, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))))
            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schedButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genReport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(18, 18, 18)
                        .addComponent(attBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }    
    

    
    //FROM ZE NED COLORING
    private static class MyTableCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            MyTableModel model = (MyTableModel) table.getModel();
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(model.getRowColour(row));
            return c;
        }
    }
    
    //tabel model
    private static class MyTableModel extends AbstractTableModel {
		
    	//default is white everywhere
    	List<Color> rowColours = Arrays.asList(
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE,
    			Color.WHITE, Color.WHITE, Color.WHITE
    			);
    	
	    public void setRowColour(int row, Color c) {
	    	rowColours.set(row, c);
	    	fireTableRowsUpdated(row, row);
	    }

	    public Color getRowColour(int row) {
	    	Color chosen = Color.white;
	    	
	    	if(classlist[row].getStatus().equals("absent")){
    			chosen = cABSENT;
    		}
    		else if(classlist[row].getStatus().equals("late")){
    			chosen = cLATE;
    		}
    		else if(classlist[row].getStatus().equals("excused")){
    			chosen = cEXCUSED;
    		}
    		else if(classlist[row].getStatus().equals("present")){
    			chosen = cPRESENT;
    		}

	    	setRowColour(row, chosen);
	    	return rowColours.get(row);
	    }
		
		@Override
		public String getColumnName(int column) {
			return columnNames[column];
		}
		
		@Override
		public Object getValueAt(int row, int col) {
			return entries[row][col];
		}
		
		@Override
		public int getRowCount() {
			return entries.length;
		}
		
		@Override
		public int getColumnCount() {
			return columnNames.length;
		}
		
		@Override
		public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			entries[rowIndex][columnIndex] = aValue;
	        fireTableCellUpdated(rowIndex, columnIndex);
		}
		
	}
}