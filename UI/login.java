/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.truancy;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Carabengbeng =))
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setText("Password:");

        title.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        title.setText("Attendance Check");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Swipe ID or manually log in below.");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameField)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(title)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton1)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	tryLogin();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });

        
    }
    
    @SuppressWarnings("deprecation")
	private void tryLogin(){
        user = usernameField.getText();
        pass = passwordField.getText();
        String q = "SELECT * FROM teacher WHERE teacher_ID = '" + user + "' ";
        x = js.query(q);
                
        if(x.length != 0){
        	//ID Exists
        	if(pass.equals(x[0][5])){

        		final JDialog y = new JDialog();
    			y.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    			y.setVisible(true);
    			y.setModalityType(ModalityType.APPLICATION_MODAL);
    			y.setBounds(250, 250, 181, 108);
    		
    			JPanel contentPanel1 = new JPanel();
    			y.getContentPane().setLayout(new BorderLayout());
    			contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
    			y.getContentPane().add(contentPanel1, BorderLayout.CENTER);
    			contentPanel1.setLayout(null);
    			JButton btn_Ok = new JButton("OK");	
    			    			
    			btn_Ok.addActionListener(new ActionListener() {						//actions for the OK button
    				public void actionPerformed(ActionEvent arg0) {
    						//GO TO TEACHER PAKING ATTENDANCE
    						y.dispose();			
                    }
    			});
    			btn_Ok.setBounds(30, 36, 89, 23);
    			contentPanel1.add(btn_Ok);
    			JLabel msg = new JLabel("Succesful");
    			msg.setBounds(10, 11, 100, 20);
    			contentPanel1.add(msg);
    				
        	}
        	else{
        		final JDialog y = new JDialog();
        		y.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        		y.setVisible(true);
        		y.setModalityType(ModalityType.APPLICATION_MODAL);
        		y.setBounds(250, 250, 181, 108);
        	
        		JPanel contentPanel1 = new JPanel();
        		y.getContentPane().setLayout(new BorderLayout());
        		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        		y.getContentPane().add(contentPanel1, BorderLayout.CENTER);
        		contentPanel1.setLayout(null);
        		JButton btn_Ok = new JButton("OK");	
        		
        		btn_Ok.addActionListener(new ActionListener() {						//actions for the OK button
        			public void actionPerformed(ActionEvent arg0) {
        					y.dispose();			
                       }
        		});
        		btn_Ok.setBounds(30, 36, 89, 23);
        		contentPanel1.add(btn_Ok);
        		JLabel msg = new JLabel("password mismatch");
        		msg.setBounds(10, 11, 150, 20);
        		contentPanel1.add(msg);
        	
        	}
        }
        
        else if(user.equals("Jenny")){
    		if(pass.equals("minion")){
    		//adminWindow(); //Teach Attendance
    		}	
    		else{
    			final JDialog y = new JDialog();
        		y.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        		y.setVisible(true);
        		y.setModalityType(ModalityType.APPLICATION_MODAL);
        		y.setBounds(250, 250, 181, 108);
        	
        		JPanel contentPanel1 = new JPanel();
        		y.getContentPane().setLayout(new BorderLayout());
        		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        		y.getContentPane().add(contentPanel1, BorderLayout.CENTER);
        		contentPanel1.setLayout(null);
        		JButton btn_Ok = new JButton("OK");	
        		
        		btn_Ok.addActionListener(new ActionListener() {						//actions for the OK button
        			public void actionPerformed(ActionEvent arg0) {
        					y.dispose();			
                       }
        		});
        		btn_Ok.setBounds(30, 36, 89, 23);
        		contentPanel1.add(btn_Ok);
        		JLabel msg = new JLabel("password mismatch");
        		msg.setBounds(10, 11, 100, 20);
        		contentPanel1.add(msg);
    			
    		}
    	}
        else{
        	final JDialog y = new JDialog();
    		y.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    		y.setVisible(true);
    		y.setModalityType(ModalityType.APPLICATION_MODAL);
    		y.setBounds(250, 250, 181, 108);
    	
    		JPanel contentPanel1 = new JPanel();
    		y.getContentPane().setLayout(new BorderLayout());
    		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
    		y.getContentPane().add(contentPanel1, BorderLayout.CENTER);
    		contentPanel1.setLayout(null);
    		JButton btn_Ok = new JButton("OK");	
    		
    		btn_Ok.addActionListener(new ActionListener() {						//actions for the OK button
    			public void actionPerformed(ActionEvent arg0) {
    					y.dispose();			
                   }
    		});
    		btn_Ok.setBounds(30, 36, 89, 23);
    		contentPanel1.add(btn_Ok);
    		JLabel msg = new JLabel("ID does not exist");
    		msg.setBounds(10, 11, 100, 20);
    		contentPanel1.add(msg);
        }
}       
        

    	
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel title;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private static String user;
    private static String pass;
    static java_sql js = new java_sql();
    private static String x[][]; 
}
