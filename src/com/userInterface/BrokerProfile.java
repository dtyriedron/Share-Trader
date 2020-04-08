package com.userInterface;

import javax.swing.*;

public class BrokerProfile extends javax.swing.JFrame {

    /**
     * Creates new form com.userInterface.BrokerProfile
     */
    public BrokerProfile() {
        initComponents();
    }

    public BrokerProfile(String brokerName, String brokerRating, String domain, String contacts, String brokerRecord){
        initComponents();
        //input data to labels and lsits
        nameLbl.setText(brokerName);
        ratingLbl.setText(brokerRating);
        viewSpecialistDomainLbl.setText(domain);

        String[] formattedContacts = new String[10];
        int index = 0;
        String word = "";
        for (char i : contacts.toCharArray()) {
            if(i== ','){
                formattedContacts[index] = word;
                word="";
                index++;
            }else{
                word = word+i;
            }
        }
        for(int i=0; i<formattedContacts.length;++i){
            contactsListMdl.addElement(formattedContacts[i]);
        }




    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        brokerDetailsPane = new javax.swing.JPanel();
        brokerNameSpr = new javax.swing.JSeparator();
        specialistDomainLbl = new javax.swing.JLabel();
        viewSpecialistDomainLbl = new javax.swing.JLabel();
        ratingLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        introBrokerRatingLbl = new javax.swing.JLabel();
        contactsScroll = new javax.swing.JScrollPane();
        contactsList = new javax.swing.JList<>();
        contactsListSpr = new javax.swing.JSeparator();
        contactsLbl = new javax.swing.JLabel();
        brokerRecordPane = new javax.swing.JPanel();
        brokerRecordSpr = new javax.swing.JSeparator();
        brokerRecordLbl = new javax.swing.JLabel();
        brokerRecordScroll = new javax.swing.JScrollPane();
        brokerRecordTbl = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));

        brokerDetailsPane.setBackground(new java.awt.Color(133, 164, 192));

        brokerNameSpr.setBackground(new java.awt.Color(1, 1, 1));
        brokerNameSpr.setForeground(new java.awt.Color(1, 1, 1));

        introBrokerRatingLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        introBrokerRatingLbl.setText("Rating");

        specialistDomainLbl.setText("Specialist Domain");

        viewSpecialistDomainLbl.setText("Science");

        ratingLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ratingLbl.setText("BrokerRating");

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLbl.setText("BrokerName");

        contactsListMdl = new DefaultListModel();
        contactsList.setModel(contactsListMdl);
        contactsScroll.setViewportView(contactsList);

        contactsListSpr.setBackground(new java.awt.Color(1, 1, 1));
        contactsListSpr.setForeground(new java.awt.Color(1, 1, 1));

        contactsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactsLbl.setText("Contacts");

        javax.swing.GroupLayout brokerDetailsPaneLayout = new javax.swing.GroupLayout(brokerDetailsPane);
        brokerDetailsPane.setLayout(brokerDetailsPaneLayout);
        brokerDetailsPaneLayout.setHorizontalGroup(
                brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(brokerNameSpr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(brokerDetailsPaneLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(nameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(introBrokerRatingLbl)
                                .addGap(18, 18, 18)
                                .addComponent(ratingLbl)
                                .addGap(41, 41, 41))
                        .addGroup(brokerDetailsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(specialistDomainLbl)
                                .addGap(32, 32, 32)
                                .addComponent(viewSpecialistDomainLbl)
                                .addGroup(brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(brokerDetailsPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(contactsScroll, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(contactsListSpr))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brokerDetailsPaneLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(contactsLbl)
                                                .addGap(127, 127, 127))))
        );
        brokerDetailsPaneLayout.setVerticalGroup(
                brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(brokerDetailsPaneLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ratingLbl)
                                        .addComponent(nameLbl)
                                        .addComponent(introBrokerRatingLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brokerNameSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(brokerDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(specialistDomainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewSpecialistDomainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contactsLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactsListSpr, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contactsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        brokerRecordPane.setBackground(new java.awt.Color(133, 164, 192));

        brokerRecordSpr.setBackground(new java.awt.Color(1, 1, 1));
        brokerRecordSpr.setForeground(new java.awt.Color(1, 1, 1));

        brokerRecordLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brokerRecordLbl.setText("Broker Record");

        brokerRecordTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        brokerRecordScroll.setViewportView(brokerRecordTbl);

        javax.swing.GroupLayout brokerRecordPaneLayout = new javax.swing.GroupLayout(brokerRecordPane);
        brokerRecordPane.setLayout(brokerRecordPaneLayout);
        brokerRecordPaneLayout.setHorizontalGroup(
                brokerRecordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(brokerRecordSpr)
                        .addGroup(brokerRecordPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(brokerRecordScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brokerRecordPaneLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brokerRecordLbl)
                                .addGap(177, 177, 177))
        );
        brokerRecordPaneLayout.setVerticalGroup(
                brokerRecordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(brokerRecordPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(brokerRecordLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brokerRecordSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brokerRecordScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addContainerGap())
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(brokerDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(brokerRecordPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(homeBtn)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brokerDetailsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brokerRecordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(BrokerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel brokerDetailsPane;
    private javax.swing.JSeparator brokerNameSpr;
    private javax.swing.JLabel brokerRecordLbl;
    private javax.swing.JPanel brokerRecordPane;
    private javax.swing.JScrollPane brokerRecordScroll;
    private javax.swing.JSeparator brokerRecordSpr;
    private javax.swing.JTable brokerRecordTbl;
    private javax.swing.JLabel contactsLbl;
    private javax.swing.JList<String> contactsList;
    private javax.swing.JSeparator contactsListSpr;
    private javax.swing.JScrollPane contactsScroll;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel ratingLbl;
    private javax.swing.JLabel specialistDomainLbl;
    private javax.swing.JLabel viewSpecialistDomainLbl;
    private javax.swing.JLabel introBrokerRatingLbl;
    private DefaultListModel contactsListMdl;
    // End of variables declaration
}
