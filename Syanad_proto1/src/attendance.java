/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikki-Pc
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

public class attendance extends javax.swing.JFrame {

    /**
     * Creates new form attendance
     */
    
    //java-sql connector
    java_sql js = new java_sql();
   
    public attendance() {
    	initTableModel();
//    	initTableRenderer();
        initComponents();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "serial" })
                              
    private void initComponents() {
// <editor-fold defaultstate="collapsed" desc="Generated Code">
        jScrollPane1 = new javax.swing.JScrollPane();
        attSheet = new javax.swing.JTable();
//        {
//        	public Component prepareRenderer(
//        	        TableCellRenderer renderer, int row, int column)
//        	    {
//        	        Component c = super.prepareRenderer(renderer, row, column);
//        	        c.setBackground(Color.GREEN);
//        	        return c;
//        	    }
//        };
        
        profName = new javax.swing.JLabel();
        courseCode = new javax.swing.JLabel();
        section = new javax.swing.JLabel();
        dateButton = new javax.swing.JButton();
        attBar = new javax.swing.JToolBar();
        absentB = new javax.swing.JButton();
        lateB = new javax.swing.JButton();
        presentB = new javax.swing.JButton();
        excusedB = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setPreferredSize(new java.awt.Dimension(600, 300));
        setResizable(false);
        
        attSheet.setAutoCreateRowSorter(true);
        attSheet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        
        attSheet.setDefaultRenderer(Object.class, myTableRenderer);
// </editor-fold>    
        
       //TODO yung login shit
        profNow = "200717411111";	//dito ilalagay yung profID from login
        
        //gets current subject depending on profID and current timestamp
        acquireSubj(profNow);
        acquireProfName(profNow);
        
    	Object[][] tabel = getClasslist(subjNow);

		tableEntries = tabel;
        
//<editor-fold defaultstate="collapsed" desc="Other Generated">
    	
    	attSheet.setModel( myTableModel );
        
        //TODO functionality nito
        //color coding of students according to status
        setColorCoding();
        
        
        attSheet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(attSheet);
        attSheet.getColumnModel().getColumn(0).setResizable(false);
        attSheet.getColumnModel().getColumn(0).setPreferredWidth(40);
        attSheet.getColumnModel().getColumn(1).setResizable(false);
        attSheet.getColumnModel().getColumn(1).setPreferredWidth(40);
        attSheet.getColumnModel().getColumn(2).setResizable(false);
        attSheet.getColumnModel().getColumn(2).setMinWidth(75);
        attSheet.getColumnModel().getColumn(3).sizeWidthToFit();
        attSheet.getColumnModel().getColumn(3).setResizable(false);
        attSheet.getColumnModel().getColumn(4).sizeWidthToFit();
        attSheet.getColumnModel().getColumn(4).setResizable(false);
        attSheet.getColumnModel().getColumn(5).sizeWidthToFit();
        attSheet.getColumnModel().getColumn(5).setResizable(false);
        attSheet.getColumnModel().getColumn(5).setPreferredWidth(50);
        
        profName.setText(profNameNow);

        courseCode.setText(subjNameNow);

        section.setText("S" + subjSec);

         dateButton.setText("MM/DD/YYYY");
        dateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateButtonActionPerformed(evt);
            }
        });

        attBar.setFloatable(false);
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
        lateB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lateB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lateB.setFocusable(false);
        lateB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lateB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        lateB.setMaximumSize(new java.awt.Dimension(40, 40));
        lateB.setMinimumSize(new java.awt.Dimension(40, 40));
        lateB.setPreferredSize(new java.awt.Dimension(40, 40));
        lateB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        presentB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        presentB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        presentB.setFocusable(false);
        presentB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        presentB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        presentB.setMaximumSize(new java.awt.Dimension(40, 40));
        presentB.setMinimumSize(new java.awt.Dimension(40, 40));
        presentB.setPreferredSize(new java.awt.Dimension(40, 40));
        presentB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        excusedB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        excusedB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excusedB.setFocusable(false);
        excusedB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excusedB.setMargin(new java.awt.Insets(2, 20, 2, 14));
        excusedB.setMaximumSize(new java.awt.Dimension(40, 40));
        excusedB.setMinimumSize(new java.awt.Dimension(40, 40));
        excusedB.setPreferredSize(new java.awt.Dimension(40, 40));
        excusedB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excusedB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excusedBActionPerformed(evt);
            }
        });
        attBar.add(excusedB);

        searchBar.setText("Search Student...");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Go");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(section))
                    .addComponent(dateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(profName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseCode)
                            .addComponent(section)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(18, 18, 18)
                        .addComponent(attBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

// </editor-fold>
        pack();
    }
 
// <editor-fold defaultstate="collapsed" desc="ActionPerformed methods">
    
	private void dateButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                           
        // TODO add your handling code here:
    }                                          

    private void absentBActionPerformed(java.awt.event.ActionEvent evt)
    {                                        
        // TODO add your handling code here:
    }                                       

    private void lateBActionPerformed(java.awt.event.ActionEvent evt) 
    {
         // TODO add your handling code here:
    }                                      
       
    private void presentBActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        // TODO add your handling code here:
    }                                        

    private void excusedBActionPerformed(java.awt.event.ActionEvent evt)
    {                                         
        // TODO add your handling code here:
    }                                        

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt)
    {                                          
      executeSearch();
    }                                         
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
       executeSearch();
    }
    
    //</editor-fold>
    
    //TODO ayusin ang colors
    private void initTableRenderer()
    {
    	myTableRenderer = new TableCellRenderer() {
			
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value,
					boolean isSelected, boolean hasFocus, int row, int col) {
				
				JLabel l = (JLabel) this.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
				
				//Get the status for the current row.
			   if (getStatus(row) == PRESENT) {
			      l.setBackground(Color.GREEN);
			    } else {
			      l.setBackground(Color.RED);
			    }

				return l;
			}
		};
    }
    
    @SuppressWarnings("serial")
	private void initTableModel()
    {
    	myTableModel = new AbstractTableModel() {
			
    		@Override
    		public String getColumnName(int column) {
    			// TODO Auto-generated method stub
    			return columnNames[column];
    		}
    		
			@Override
			public Object getValueAt(int row, int col) {
				// TODO Auto-generated method stub
				return tableEntries[row][col];
			}
			
			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return tableEntries.length;
			}
			
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return columnNames.length;
			}
			
			@Override
			public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
				// TODO Auto-generated method stub
				tableEntries[rowIndex][columnIndex] = aValue;
		        fireTableCellUpdated(rowIndex, columnIndex);
			}
			
		};
    }
    
    //if late, absent, present, or excused
    private int getStatus(int row)
	{
		//status of row
		int stat = -1;
		//TODO QUERY YUNG STATUS
		String q = "SELECT DISTINCT status FROM classlist WHERE student_id LIKE " + tableEntries[row][2] +
				" 	AND teacher_id LIKE "  + profNow +
				" 	AND course_id LIKE " + subjNow;
					
		String[][] result = js.query(q);
		switch(result[0][0])
		{
			case "absent" :
			{
				stat = ABSENT;
				break;
			}
			
			case "present" :
			{
				stat = PRESENT;
				break;
			}
			
			case "late" :
			{
				stat = LATE;
				break;
			}
			
			case "excused" :
			{
				stat = EXCUSED;
				break;
			}
		}
				
		return stat;
	}
    
    //TODO revert of values in table
    private void executeSearch()
    {
    	//save what you where searching for
    	String stud = searchBar.getText().toString();
    	
//    	SELECT FROM TABLE WHERE somecolumn = search key
    	String q = 
				"SELECT DISTINCT * " +
    			"	FROM classlist " +
    			"	WHERE teacher_id LIKE " + profNow +
    				"	AND COURSE_ID LIKE " + subjNow  +
					"	AND student_id LIKE " + stud ;
    	String[][] resultSearch = js.query(q);
    	
    	System.out.println(q);
    	
//    	debugging to check how many and waht are teh rows
//    	for(int c=0; c<resultSearch.length; c++)
//    	{
//    		System.out.println(resultSearch[c]);
//    	}
    	
    	if(resultSearch != null)
    	{
	    	//    	row of result
	    	String[] row = resultSearch[0];
	    	String[] studDetails = getDetails(stud);
    	//    	place into table entries
    	Object[][] newEntries = new Object[][]
    				{
    					{
    						convertMiToSt(row[4], true),
    						convertMiToSt(row[6], true),
    						studDetails[0],
    						studDetails[1],
    						studDetails[2],
    						studDetails[3]
    					}
    				};

    	//    	repaint that shit
	    	for(int x=0; x < resultSearch.length; x++)
	    	{
	    		for(int y=0; y<columnNames.length; y++)
	    		{
	    			Object temp = newEntries[x][y];
	    			myTableModel.setValueAt(temp, x, y);
	    		}
	    	}
	    	
//	    	remove non results
	    	for(int c=resultSearch.length; c <tableEntries.length; c++)
	    	{
	    		for(int y=0; y<columnNames.length; y++)
	    		{
	    			myTableModel.setValueAt(null, c, y);
	    		}
	    	}
    	}
    }
    //TODO gawin to 
    private void setColorCoding()
    {
    	//query
    	String q = "SELECT *" +
    			"	 FROM classlist" +
    			"	 WHERE teacher_id LIKE " + profNow;
//    	fetch from db the status of each student
//    	String[][] statuses = js.query(q);
//    	per row
//	    	get row
//	    	set color according to status
//    	update table(repaint that shit)
    }
    
    private void acquireProfName(String ID)
    {
    	String q = "SELECT last_name, first_name, middle_initial FROM teacher WHERE teacher_id LIKE "+ ID ;
    	String[][] result = js.query(q);
    	
    	profNameNow = result[0][0] + ", " + result[0][1] + " " + result[0][2] + ".";
    }
    
    //TODO check if working
    private int countCurrentSubject(String cursubj)
    {
    	String q = "SELECT COUNT(course_id) FROM classlist WHERE course_id LIKE '" + cursubj + "'";
    	String[][] attemp = js.query(q);
        int count = 0;
        
        if(attemp.length == 1)
        {
        	count = Integer.parseInt(attemp[0][0]);
        }
        
        return count;
    }
    
    //convert military timestamp to standard
    private String convertMiToSt(String military, boolean istimestamp)
    {
    	if(istimestamp)
    	{
    		military = military.substring(11,16);
    	}
    	
		char[] temp = military.toCharArray();
        
        String timeState = ""; //whether AM or PM
        
        //conversion to standard time 12 HOUR FORMAT
        switch(temp[0])
        {
            case '0':
                //if 0000 -> 0059
                if(temp[1] == '0')
                {
                    temp[0] = '1';
                    temp[1] = '2';
                }
                
                timeState = "AM";
                
                break;
                
            case '1':
                //if 1300+
                if(temp[1] > '2')
                {
                    temp[0] = '0';  //fist digit is 0
                    
                    //second digit is temp[1]
                    switch(temp[1])
                    {
                        case '3': temp[1] = '1'; break;
                        case '4': temp[1] = '2'; break;
                        case '5': temp[1] = '3'; break;
                        case '6': temp[1] = '4'; break;
                        case '7': temp[1] = '5'; break;
                        case '8': temp[1] = '6'; break;
                        case '9': temp[1] = '7'; break;
                    }
                    
                    timeState = "PM";
                }
                else
                {
                    timeState = "AM";
                }
                
                break;
            
            case '2': 
                //20-2100
                if(temp[1] == '1' || temp[1] =='0')
                {
                    temp[0] = '0';
                }
                else //22-2300
                {
                    temp[0] = '1';
                }
                
                switch(temp[1])
                {
                    case '0': temp[1] = '8'; break;
                    case '1': temp[1] = '9'; break;
                    case '2': temp[1] = '0'; break;
                    case '3': temp[1] = '1'; break;
                }
                
                timeState = "PM";
            
        }
        
        military = new String(temp) + " " + timeState;
        
//        System.out.print(military);
        
        return military;
    }
    
    //gets classlist/attendance to be displayed in UI
    private Object[][] getClasslist(String currentSubj)
    {
    	//gets entries from classlist table
    	String[][] listClass = js.query("SELECT * FROM classlist WHERE teacher_id LIKE " + profNow);
    	
    	//arranged 2D array classlist/attendance to be returned
    	Object[][] actualAtt = new Object[listClass.length][countCurrentSubject(subjNow)];	//actual attendance table to be displayed
    	
    	//according to how many rows of classlist table
    	for(int x=0; x<listClass.length; x++)
    	{
    		//details of student
    		String[] dets = getDetails(listClass[x][0]);
    		
    		System.out.println(listClass[x][3]);
    		
    		actualAtt[x] = new Object[]
    				{
    					convertMiToSt(listClass[x][4], true),	//time in
    					convertMiToSt(listClass[x][6], true),	//dapat time out to
						dets[0],						//student ID
						dets[1],						//last name
						dets[2],						//first name
						dets[3]							//degree program
    				};
		}
    	
    	return (Object[][])actualAtt;
    }
    
    //get ID full name and degprog of student with studID
	private String[] getDetails(String studID)
	{
		//query
		String q = "SELECT * FROM student WHERE student_id LIKE '" + studID + "'";
		
		//get row/tuple of whoever studID is from student table
		String[][] studTabel = js.query(q); 		
		String[] details = new String[4];
		
		//queried result shoud only have 1 row
		if(studTabel.length == 1)
		{
			details[0] = studTabel[0][0];	//ID
			details[1] = studTabel[0][2];	//last name
			details[2] = studTabel[0][1];	//first name
			details[3] = studTabel[0][5];	//degree program
		}
		
		return details;
	}

	private void acquireSubj(String prof)
	{
		//TODO use this as reference for what is the current ongoing class
        //for getting current date
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date current_date = new Date();
        
//    	TODO ayusin pa to yung current_date
       //query gets the ID of the current ongoing class of the current prof
        String q = "SELECT DISTINCT L.course_id, O.class_section, O.course_name" +
        		"	 FROM classlist L JOIN course O" +
        		"		ON L.course_id = O.course_id" +
        		"	 WHERE L.teacher_id LIKE '" + prof + "'"; //+
//        		"		AND sched <= '" + current_date + "'";
        //fetch prof's load(subjects handled)
        String[][] profLoad = js.query(q);
        
        //get the result
        subjNow = profLoad[0][0];
        
        //the current subject name
        subjNameNow = profLoad[0][2];
        
        // the section
        subjSec = profLoad[0][1];
                
//        debugging
//        System.out.println(dateFormat.format(current_date));
        
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton absentB;
    private javax.swing.JToolBar attBar;
    
    //rows in the table
    private Object[][] tableEntries;
    private javax.swing.JTable attSheet;
  
    //custom table model
    private AbstractTableModel myTableModel;
    
    //custom table renderer (for colors)
    private TableCellRenderer myTableRenderer;
    
    //column names duh
    private final String[] columnNames =	new String [] 
    		{	"IN", 
				"OUT",
				"ID",
				"Last Name",
				"First Name", 
				"Degree Program"
    		};
    
    ////<editor-fold defaultstate="collapsed" desc="strings to be displayed">

    //constants
    private final int ABSENT	= 0;
    private final int PRESENT	= 1;
    private final int LATE		= 2;
    private final int EXCUSED 	= 3;
    
    private String profNow;			//ID of current prof fetched from login
    private String subjNow;     	//ID of current subject
    private String subjSec;			//section of current subject	
    private String profNameNow;		//name of current prof
    private String subjNameNow;		//name of current subject
    	
    private javax.swing.JLabel courseCode;
    private javax.swing.JButton dateButton;
    private javax.swing.JButton excusedB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lateB;
    private javax.swing.JButton presentB;
    private javax.swing.JLabel profName;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel section;
    // End of variables declaration                   
}