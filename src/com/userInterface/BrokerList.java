package com.userInterface;

import com.databases.DbGetData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class BrokerList extends javax.swing.JFrame {

    /**
     * Creates new form brokerList
     */
    public BrokerList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        brokerListScroll = new javax.swing.JScrollPane();
        brokerListTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        brokerData = DbGetData.getDbBrokerData();

        brokerListTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {brokerData[0]+ " "+brokerData[1], brokerData[2], brokerData[3]},
                },
                new String [] {
                        "Broker", "Rating", "Specialist Domain"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        brokerListTbl.setMaximumSize(new java.awt.Dimension(500, 500));
        brokerListTbl.setPreferredSize(new java.awt.Dimension(500, 500));
        brokerListScroll.setViewportView(brokerListTbl);

        brokerListTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brokerListMouseClicked(evt);
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

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(brokerListScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(homeBtn)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(homeBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(brokerListScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {
        StocksList sl = new StocksList();
        sl.setVisible(true);
        sl.pack();
        sl.setLocationRelativeTo(null);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(BrokerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerList().setVisible(true);
            }
        });
    }

    // get selected row on mouse click
    private void brokerListMouseClicked(java.awt.event.MouseEvent evt) {
        //get data from db and send it to the brokerlist window
        //get the details from the table
        DefaultTableModel model;
        model = (DefaultTableModel)brokerListTbl.getModel();


        int index = brokerListTbl.getSelectedRow();
        String brokerName = model.getValueAt(index,0).toString();
        String brokerRating = model.getValueAt(index,1).toString();
        String domain = model.getValueAt(index,2).toString();
        String contacts = brokerData[4];
        String brokerRecord = brokerData[5];

        //send the user to the broker profile page
        BrokerProfile bp = new BrokerProfile(brokerName, brokerRating, domain, contacts, brokerRecord);
        bp.setVisible(true);
        bp.pack();
        bp.setLocationRelativeTo(null);
        bp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane brokerListScroll;
    private javax.swing.JTable brokerListTbl;
    private javax.swing.JButton homeBtn;
    private String[] brokerData;
    // End of variables declaration
}
