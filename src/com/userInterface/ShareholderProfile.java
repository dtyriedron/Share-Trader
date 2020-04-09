package com.userInterface;

import javax.swing.*;

public class ShareholderProfile extends javax.swing.JFrame {

    /**
     * Creates new form com.userInterface.ShareholderProfile
     */
    public ShareholderProfile() {
        initComponents();
    }

    public ShareholderProfile(String shareholderName, String annoucement, String[] activity){
        initComponents();
        nameLbl.setText(shareholderName);

        annoucementLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { annoucement, };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announcementScroll.setViewportView(annoucementLst);

        shareHolderActivityTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {activity[0], activity[1], activity[2], Float.parseFloat(activity[3]), Float.parseFloat(activity[4]), Float.parseFloat(activity[5]), activity[6]},
                },
                new String [] {
                        "Code", "Name", "Cur", "Price", "+/-", "+/-%", "Date"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        shareholderActivityScroll.setViewportView(shareHolderActivityTbl);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        shareholderDetailsPane = new javax.swing.JPanel();
        sharholderNameSpr = new javax.swing.JSeparator();
        nameLbl = new javax.swing.JLabel();
        shareholderActivityPane = new javax.swing.JPanel();
        shareholderActivitySpr = new javax.swing.JSeparator();
        shareholderActivityLbl = new javax.swing.JLabel();
        shareholderActivityScroll = new javax.swing.JScrollPane();
        shareHolderActivityTbl = new javax.swing.JTable();
        announcementsPane = new javax.swing.JPanel();
        announcementsSpr = new javax.swing.JSeparator();
        announcementsLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        annoucementLst = new javax.swing.JList<>();
        announcementScroll = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));

        shareholderDetailsPane.setBackground(new java.awt.Color(133, 164, 192));

        sharholderNameSpr.setBackground(new java.awt.Color(1, 1, 1));
        sharholderNameSpr.setForeground(new java.awt.Color(1, 1, 1));


        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLbl.setText("ShareHolderName");

        javax.swing.GroupLayout shareholderDetailsPaneLayout = new javax.swing.GroupLayout(shareholderDetailsPane);
        shareholderDetailsPane.setLayout(shareholderDetailsPaneLayout);
        shareholderDetailsPaneLayout.setHorizontalGroup(
                shareholderDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sharholderNameSpr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(shareholderDetailsPaneLayout.createSequentialGroup()
                                .addContainerGap(109, Short.MAX_VALUE)
                                .addComponent(nameLbl)
                                .addGap(136, 136, 136))
        );
        shareholderDetailsPaneLayout.setVerticalGroup(
                shareholderDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(shareholderDetailsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sharholderNameSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        shareholderActivityPane.setBackground(new java.awt.Color(133, 164, 192));

        shareholderActivitySpr.setBackground(new java.awt.Color(1, 1, 1));
        shareholderActivitySpr.setForeground(new java.awt.Color(1, 1, 1));

        shareholderActivityLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shareholderActivityLbl.setText("Shareholder Activity");

        annoucementLst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1," };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announcementScroll.setViewportView(annoucementLst);

        shareHolderActivityTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Code", "Name", "Cur", "Price", "+/-", "+/-%", "watch", "Date", "Profit"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        shareholderActivityScroll.setViewportView(shareHolderActivityTbl);

        javax.swing.GroupLayout shareholderActivityPaneLayout = new javax.swing.GroupLayout(shareholderActivityPane);
        shareholderActivityPane.setLayout(shareholderActivityPaneLayout);
        shareholderActivityPaneLayout.setHorizontalGroup(
                shareholderActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(shareholderActivitySpr)
                        .addGroup(shareholderActivityPaneLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(shareholderActivityLbl)
                                .addContainerGap(193, Short.MAX_VALUE))
                        .addGroup(shareholderActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(shareholderActivityPaneLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(shareholderActivityScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        shareholderActivityPaneLayout.setVerticalGroup(
                shareholderActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(shareholderActivityPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(shareholderActivityLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shareholderActivitySpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(211, Short.MAX_VALUE))
                        .addGroup(shareholderActivityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shareholderActivityPaneLayout.createSequentialGroup()
                                        .addContainerGap(44, Short.MAX_VALUE)
                                        .addComponent(shareholderActivityScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        announcementsPane.setBackground(new java.awt.Color(133, 164, 192));

        announcementsSpr.setBackground(new java.awt.Color(1, 1, 1));
        announcementsSpr.setForeground(new java.awt.Color(1, 1, 1));

        announcementsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        announcementsLbl.setText("Announcements");

        javax.swing.GroupLayout announcementsPaneLayout = new javax.swing.GroupLayout(announcementsPane);
        announcementsPane.setLayout(announcementsPaneLayout);
        announcementsPaneLayout.setHorizontalGroup(
                announcementsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(announcementsSpr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, announcementsPaneLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(announcementsLbl)
                                .addGap(26, 26, 26))
                        .addGroup(announcementsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(announcementScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        announcementsPaneLayout.setVerticalGroup(
                announcementsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(announcementsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(announcementsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(announcementsSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(announcementScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.setMaximumSize(new java.awt.Dimension(61, 23));
        backBtn.setMinimumSize(new java.awt.Dimension(61, 23));
        backBtn.setPreferredSize(new java.awt.Dimension(61, 23));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(shareholderActivityPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(homeBtn)
                                                                .addGap(0, 227, Short.MAX_VALUE))
                                                        .addComponent(shareholderDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(announcementsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(announcementsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(shareholderDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11)
                                .addComponent(shareholderActivityPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
        StocksList sl = new StocksList();
        sl.setVisible(true);
        sl.pack();
        sl.setLocationRelativeTo(null);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {
        StocksList sl = new StocksList();
        sl.setVisible(true);
        sl.pack();
        sl.setLocationRelativeTo(null);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
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
            java.util.logging.Logger.getLogger(ShareholderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShareholderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShareholderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShareholderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShareholderProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel announcementsLbl;
    private javax.swing.JPanel announcementsPane;
    private javax.swing.JSeparator announcementsSpr;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTable shareHolderActivityTbl;
    private javax.swing.JLabel shareholderActivityLbl;
    private javax.swing.JPanel shareholderActivityPane;
    private javax.swing.JScrollPane shareholderActivityScroll;
    private javax.swing.JSeparator shareholderActivitySpr;
    private javax.swing.JPanel shareholderDetailsPane;
    private javax.swing.JSeparator sharholderNameSpr;
    private javax.swing.JList<String> annoucementLst;
    private javax.swing.JScrollPane announcementScroll;
    // End of variables declaration
}
