//package anti.truancy;

package teachAttend;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class teachAttendance extends JFrame {

    // Variables declaration
    //GUI
    private JButton absentB;
    private JToolBar attBar;
    private JTable attSheet;
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
    
    //Functions
    private static classlist[] classlist;
    private static java_sql js = new java_sql();
    // End of variables declaration
	//Para sa atttable yun vars na to
    private static Object[][] entries;
    private static String[] headers = {"Course", "Time", "Room", "Faculty"};
    
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
    private static void populate(){
    	final String query = "SELECT DISTINCT teacher.teacher_ID, course_name, first_name, "
				+ " last_name, middle_initial, sched_room, sched_time, sched_day "
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
			final int time = 6;
			final int day = 7;
			//( String ID, String f_name, String l_name, String mi, String course_code, String room, String time, String day )
			classlist[row] = new classlist(tmp[row][ID], tmp[row][fName], tmp[row][lName], tmp[row][mi], tmp[row][course], tmp[row][room], tmp[row][time], tmp[row][day]);
		}
    	
    	//Insert query into entries for att table
    	entries = new Object[classlist.length][4];
    	
    	for(int c = 0; c < classlist.length; c++){
    		String c_code = classlist[c].getCoursecode();
    		String Time = classlist[c].getSched_time();
    		String Room = classlist[c].getSched_room();
    		String Fac = classlist[c].getFirst_name() + " " + classlist[c].getLast_name();
    		entries[c][0] = c_code;
    		entries[c][1] = Time;
    		entries[c][2] = Room;
    		entries[c][3] = Fac;
    	}
    	//End entries
    	
    }
        
    private static void addSched(){
    	//TODO
    	addSched = new JDialog();
    	addSched.setVisible(true);
    	new JPanel();
        JTextField E_timetxt = new JTextField();
        JLabel E_timlbl = new JLabel();
        JComboBox RoomCombo = new JComboBox();;
        JLabel S_timeLbl = new JLabel();
        JTextField S_timetxt = new JTextField();
        JLabel TitleLabel = new JLabel();
        JButton cancelbtn = new JButton();
        JLabel courseCodeLbl = new JLabel();
        JTextField courseCodetxt = new JTextField();
        JButton okbtb = new JButton();
        JLabel roomlbl = new JLabel();     
        addSched.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //BUTTONS
        okbtb.setText("Ok");
        okbtb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //TODO okbtbActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	addSched.dispose();
            }
        });
        //END BUTTONS

        TitleLabel.setText("New Schedule Form");

        courseCodetxt.setText("jTextField1");

        courseCodeLbl.setText("Course Code :");

        S_timeLbl.setText("Start Time : ");

        E_timlbl.setText("End Time : ");

        roomlbl.setText("Room : ");

        S_timetxt.setText("jTextField1");
        S_timetxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //TODO S_timetxtActionPerformed(evt);
            }
        });

        E_timetxt.setText("jTextField1");

        RoomCombo.setModel(new DefaultComboBoxModel(new String[] { "W401", "W402", "W403", "W404", "W405", "W406", "W407", "W408", "W409", "W410", "W411", "W412", "W413", "W414", "E401", "E402", "E403", "E404", "E405", "E406", "E407", "E408", "E409", "E410", "E411", "E412", "E413", "E414", "ELAB-A", "ELAB-B", "E208", "FACRM", "ENGFACRM", " " }));

        //NEW WINDOW LAYOUT
        GroupLayout layout = new GroupLayout(addSched.getContentPane());
        addSched.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(S_timeLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(S_timetxt))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(courseCodeLbl)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(courseCodetxt))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(E_timlbl)
                                        .addComponent(roomlbl))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(E_timetxt, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RoomCombo, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(okbtb, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(cancelbtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TitleLabel)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCodetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCodeLbl))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(S_timeLbl)
                    .addComponent(S_timetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(E_timlbl)
                    .addComponent(E_timetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(roomlbl)
                    .addComponent(RoomCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtb)
                    .addComponent(cancelbtn))
                .addGap(66, 66, 66))
        );

        addSched.pack();
    }                        
    
    //BUTTON FUNCTIONS
    private void dateButtonActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    	System.out.println("date");
    }                                          

    private void searchBarActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
    	System.out.println("search");
    }                                         

    private void schedButtonActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    	System.out.println("addsched");
    	addSched();
    }                                           

    private void genReportActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
    	System.out.println("genRep");
    }                                         
    
    private void searchButtonActionPerformed(ActionEvent evt) {                                             
        // TODO add your handling code here:
    	System.out.println("search B");
    }                                            
    
    //ALPE
    private void absentBActionPerformed(ActionEvent evt) {                                        
        // TODO add your handling code here:
    	System.out.println("A");
    }                                       

    private void lateBActionPerformed(ActionEvent evt) {                                      
        // TODO add your handling code here:
    	System.out.println("L");
    }                                     

    private void presentBActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    	System.out.println("P");
    }                                        

    private void excusedBActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    	System.out.println("E");
    }                                        
    
    // GUI Layout Below
    public teachAttendance() {
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
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

        attSheet.setAutoCreateRowSorter(true);
        attSheet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attSheet.setModel(new javax.swing.table.DefaultTableModel(entries, headers) {
            Class[] types = new Class [] {
                String.class, Object.class, String.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        attSheet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(attSheet);
        attSheet.getColumnModel().getColumn(0).setMinWidth(90);
        attSheet.getColumnModel().getColumn(0).setPreferredWidth(90);
        attSheet.getColumnModel().getColumn(0).setMaxWidth(90);
        attSheet.getColumnModel().getColumn(1).setMinWidth(80);
        attSheet.getColumnModel().getColumn(1).setPreferredWidth(80);
        attSheet.getColumnModel().getColumn(1).setMaxWidth(80);
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
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
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

}
