//package anti.truancy;

package teachAttend;

import javax.swing.*;

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

    //Functions
    private static classlist[] classlist;
    private static java_sql js = new java_sql();
    // End of variables declaration
	
    //WTF
    private static Object[][] x;
    
    public static void main(String args[]) {
        //TESTING THIS SHIT
    	populate();
    	x = new Object[classlist.length][4];
    	
    	for(int c = 0; c < classlist.length; c++){
    		String c_code = classlist[c].getCoursecode();
    		String Time = classlist[c].getSched_time();
    		String Room = classlist[c].getSched_room();
    		String Fac = classlist[c].getLast_name();
    		x[c][0] = c_code;
    		x[c][1] = Time;
    		x[c][2] = Room;
    		x[c][3] = Fac;
    	}
    	//END TEST
    	
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
    	
    }
        
    
    //BUTTON FUNCTIONS
    private void dateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateButtonActionPerformed

    private void absentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absentBActionPerformed

    private void lateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lateBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lateBActionPerformed

    private void presentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentBActionPerformed

    private void excusedBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excusedBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excusedBActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed


    
    // GUI Layout Below
    /**
     * Creates new form teachAttendance
     */
    public teachAttendance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        attSheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ACTONEA", "8:00-9:30", "E413", "Ragudo"},
                {"ANALGEO", "8:00-9:00", "W403", "Lawas"},
                {"BUSCOMP", "8:00-9:30", "E-Lab A", "Encarnacion"},
                {"COMPRO1", "9:40-11:10", "W412", "Encarnacion"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course", "Time", "Room", "Faculty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        dateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateButtonActionPerformed(evt);
            }
        });

        attBar.setRollover(true);

        absentB.setBackground(new java.awt.Color(255, 0, 0));
        absentB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        absentB.setForeground(new java.awt.Color(255, 255, 255));
        absentB.setText("A");
        absentB.setActionCommand("Absent");
        absentB.setBorder(BorderFactory.createEtchedBorder());
        absentB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        absentB.setFocusable(false);
        absentB.setHorizontalTextPosition(SwingConstants.CENTER);
        absentB.setMaximumSize(new java.awt.Dimension(40, 40));
        absentB.setMinimumSize(new java.awt.Dimension(40, 40));
        absentB.setPreferredSize(new java.awt.Dimension(40, 40));
        absentB.setVerticalTextPosition(SwingConstants.BOTTOM);
        absentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentBActionPerformed(evt);
            }
        });
        attBar.add(absentB);

        lateB.setBackground(new java.awt.Color(255, 204, 0));
        lateB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lateB.setText("L");
        lateB.setActionCommand("Late");
        lateB.setBorder(BorderFactory.createEtchedBorder());
        lateB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lateB.setFocusable(false);
        lateB.setHorizontalTextPosition(SwingConstants.CENTER);
        lateB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        lateB.setMaximumSize(new java.awt.Dimension(40, 40));
        lateB.setMinimumSize(new java.awt.Dimension(40, 40));
        lateB.setPreferredSize(new java.awt.Dimension(40, 40));
        lateB.setVerticalTextPosition(SwingConstants.BOTTOM);
        lateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lateBActionPerformed(evt);
            }
        });
        attBar.add(lateB);

        presentB.setBackground(new java.awt.Color(0, 204, 0));
        presentB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        presentB.setText("P");
        presentB.setActionCommand("Present");
        presentB.setBorder(BorderFactory.createEtchedBorder());
        presentB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        presentB.setFocusable(false);
        presentB.setHorizontalTextPosition(SwingConstants.CENTER);
        presentB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        presentB.setMaximumSize(new java.awt.Dimension(40, 40));
        presentB.setMinimumSize(new java.awt.Dimension(40, 40));
        presentB.setPreferredSize(new java.awt.Dimension(40, 40));
        presentB.setVerticalTextPosition(SwingConstants.BOTTOM);
        presentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentBActionPerformed(evt);
            }
        });
        attBar.add(presentB);

        excusedB.setBackground(new java.awt.Color(153, 153, 255));
        excusedB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        excusedB.setText("E");
        excusedB.setActionCommand("Excused");
        excusedB.setBorder(BorderFactory.createEtchedBorder());
        excusedB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excusedB.setFocusable(false);
        excusedB.setHorizontalTextPosition(SwingConstants.CENTER);
        excusedB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        excusedB.setMaximumSize(new java.awt.Dimension(40, 40));
        excusedB.setMinimumSize(new java.awt.Dimension(40, 40));
        excusedB.setPreferredSize(new java.awt.Dimension(40, 40));
        excusedB.setVerticalTextPosition(SwingConstants.BOTTOM);
        excusedB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excusedBActionPerformed(evt);
            }
        });
        attBar.add(excusedB);

        searchBar.setText("Search...");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Go");

        schedButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schedButton.setText("Add Schedule");

        genReport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genReport.setText("Generate Report");

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
    }// </editor-fold>//GEN-END:initComponents

}
