/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package anti.truancy;

/**
 *
 * @author Nikki-Pc
 */
public class teachAttendance extends javax.swing.JFrame {

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

        jScrollPane1 = new javax.swing.JScrollPane();
        attSheet = new javax.swing.JTable();
        dateButton = new javax.swing.JButton();
        attBar = new javax.swing.JToolBar();
        absentB = new javax.swing.JButton();
        lateB = new javax.swing.JButton();
        presentB = new javax.swing.JButton();
        excusedB = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        schedButton = new javax.swing.JButton();
        genReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        attSheet.setAutoCreateRowSorter(true);
        attSheet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attSheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ACTONEA", null, "8:00-9:30", "E413", "Ragudo"},
                {"ANALGEO", null, "8:00-9:00", "W403", "Lawas"},
                {"BUSCOMP", null, "8:00-9:30", "E-Lab A", "Encarnacion"},
                {"COMPRO1", null, "9:40-11:10", "W412", "Encarnacion"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course", "Section", "Time", "Room", "Faculty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attSheet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(attSheet);
        attSheet.getColumnModel().getColumn(0).setMinWidth(90);
        attSheet.getColumnModel().getColumn(0).setPreferredWidth(90);
        attSheet.getColumnModel().getColumn(0).setMaxWidth(90);
        attSheet.getColumnModel().getColumn(1).setPreferredWidth(10);
        attSheet.getColumnModel().getColumn(2).setMinWidth(80);
        attSheet.getColumnModel().getColumn(2).setPreferredWidth(80);
        attSheet.getColumnModel().getColumn(2).setMaxWidth(80);
        attSheet.getColumnModel().getColumn(3).setMinWidth(60);
        attSheet.getColumnModel().getColumn(3).setPreferredWidth(60);
        attSheet.getColumnModel().getColumn(3).setMaxWidth(60);

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

        searchBar.setText("Search...");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Go");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        schedButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        schedButton.setText("Add Schedule");
        schedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedButtonActionPerformed(evt);
            }
        });

        genReport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genReport.setText("Generate Report");
        genReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateButton)
                            .addComponent(schedButton)
                            .addComponent(genReport))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genReport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addGap(18, 18, 18)
                        .addComponent(attBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void schedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schedButtonActionPerformed

    private void genReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genReportActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teachAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teachAttendance().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absentB;
    private javax.swing.JToolBar attBar;
    private javax.swing.JTable attSheet;
    private javax.swing.JButton dateButton;
    private javax.swing.JButton excusedB;
    private javax.swing.JButton genReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lateB;
    private javax.swing.JButton presentB;
    private javax.swing.JButton schedButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
