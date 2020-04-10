package com.userInterface;

import com.databases.DbGetData;
import com.system.Simulate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;

public class StocksList extends javax.swing.JFrame {

    /**
     * Creates new form com.userInterface.StocksList
     */
    public StocksList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        brokerListBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        stocksList = new javax.swing.JTable();
        searchFilterPane = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        selectFromDateDc = new com.toedter.calendar.JDateChooser();
        selectToDateDc = new com.toedter.calendar.JDateChooser();
        FromDateLbl = new javax.swing.JLabel();
        toDateLbl = new javax.swing.JLabel();
        searchFilterLbl = new javax.swing.JLabel();
        searchFilterSpr = new javax.swing.JSeparator();
        shareCodeLbl = new javax.swing.JLabel();
        shareCodeTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        DbGetData getFromDb = new DbGetData();
        String[] tableData;
        tableData = getFromDb.getDbStocksData();

        stockslistMdl = new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {tableData[0], tableData[1], tableData[2], Float.parseFloat(tableData[3]), Float.parseFloat(tableData[4]), Float.parseFloat(tableData[5]), tableData[6]},
                },
                new String [] {
                        "Code", "Name", "Cur", "Price", "+/-", "+/-%", "date"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        stocksList.setModel(stockslistMdl);

        stocksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocksListMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(stocksList);

        searchFilterPane.setBackground(new java.awt.Color(133, 164, 192));

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        selectFromDateDc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectFromDateDc.setMaximumSize(new java.awt.Dimension(69, 20));
        selectFromDateDc.setMinimumSize(new java.awt.Dimension(69, 20));

        selectToDateDc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectToDateDc.setMaximumSize(new java.awt.Dimension(69, 20));
        selectToDateDc.setMinimumSize(new java.awt.Dimension(69, 20));

        FromDateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FromDateLbl.setText("From:");

        toDateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toDateLbl.setText("To:");

        searchFilterLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchFilterLbl.setText("Search filter");

        searchFilterSpr.setBackground(new java.awt.Color(1, 1, 1));
        searchFilterSpr.setForeground(new java.awt.Color(1, 1, 1));

        shareCodeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shareCodeLbl.setText("Share Code:");

        shareCodeTb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout searchFilterPaneLayout = new javax.swing.GroupLayout(searchFilterPane);
        searchFilterPane.setLayout(searchFilterPaneLayout);
        searchFilterPaneLayout.setHorizontalGroup(
                searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(searchFilterSpr)
                                        .addComponent(searchFilterLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(shareCodeLbl)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(toDateLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(FromDateLbl, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(searchBtn))
                                        .addComponent(selectToDateDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(selectFromDateDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(shareCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
        );
        searchFilterPaneLayout.setVerticalGroup(
                searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchFilterPaneLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(searchFilterLbl)
                                .addGap(9, 9, 9)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchFilterSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(toDateLbl))
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(shareCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(shareCodeLbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(FromDateLbl)
                                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                                .addComponent(selectFromDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(selectToDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(searchBtn)))))
                                .addGap(0, 14, Short.MAX_VALUE))
        );

        brokerListBtn.setText("brokers");
        brokerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brokerListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchFilterPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(brokerListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchFilterPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(brokerListBtn)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(StocksList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StocksList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StocksList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StocksList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StocksList().setVisible(true);
            }
        });
    }

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String fromDate = sdf.format(selectFromDateDc.getDate());
        String toDate = sdf.format(selectToDateDc.getDate());
        System.out.println(fromDate);
        String companyCode = shareCodeTb.getText();
        String[] inputData = new String[]{companyCode, fromDate, toDate};
        Vector<String> outputData = DbGetData.getDbSearchData(inputData);
        if (stockslistMdl.getRowCount() > 0) {
            for (int i = stockslistMdl.getRowCount() - 1; i > -1; i--) {
                stockslistMdl.removeRow(i);
            }
        }
        Vector<String> tempRow = new Vector<>();
        Vector<Vector<String>> tempMdl = new Vector<>();
        for(int i=0; i<outputData.size();++i){
            //check if the date has changed (should be unique for each row)

            if(((i+1) % 7 == 0)){
//                || (outputData.size()-1 == i)
                tempRow.add(outputData.get(i));
                tempMdl.add((Vector<String>) tempRow.clone());
                System.out.println("hey "+tempRow);
                tempRow.clear();
            }
            else{
                tempRow.add(outputData.get(i));
            }
        }

        stockslistMdl = new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {tempMdl.get(0).get(0), tempMdl.get(0).get(1), tempMdl.get(0).get(2),Float.parseFloat(tempMdl.get(0).get(3)), Float.parseFloat(tempMdl.get(0).get(4)), Float.parseFloat(tempMdl.get(0).get(5)), tempMdl.get(0).get(6)},
                        {tempMdl.get(1).get(0), tempMdl.get(1).get(1), tempMdl.get(1).get(2),Float.parseFloat(tempMdl.get(1).get(3)), Float.parseFloat(tempMdl.get(1).get(4)), Float.parseFloat(tempMdl.get(1).get(5)), tempMdl.get(1).get(6) }
                },
                new String [] {
                        "Code", "Name", "Cur", "Price", "+/-", "+/-%", "date"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        stocksList.setModel(stockslistMdl);
    }


    // get selected row on mouse click
    private void stocksListMouseClicked(java.awt.event.MouseEvent evt) {
        //get the details from the table
        DefaultTableModel model;
        model = (DefaultTableModel)stocksList.getModel();
        int index = stocksList.getSelectedRow();
        String code = model.getValueAt(index,0).toString();
        String nameOfCompany = model.getValueAt(index,1).toString();
        String cur = model.getValueAt(index,2).toString();
        String price = model.getValueAt(index, 3).toString();
        String dayChange = model.getValueAt(index, 4).toString();

        //generate random news for the company about to be displayed
        String news = Simulate.simulateNews();

        //send the user to the company profile page
        CompanyProfile cp = new CompanyProfile(code, nameOfCompany, news, price, dayChange, cur);
        cp.setVisible(true);
        cp.pack();
        cp.setLocationRelativeTo(null);
        cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void brokerListBtnActionPerformed(java.awt.event.ActionEvent evt) {
        //recomend broker
        Simulate.recommendBroker();
        //send the user to the brokerlist page
        BrokerList bl = new BrokerList();
        bl.setVisible(true);
        bl.pack();
        bl.setLocationRelativeTo(null);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    // display row values on keys click
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {

        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){

//           index = stocksList.getSelectedRow();
//           jTextField1.setText(model.getValueAt(index, 0).toString());

        }

    }



    private javax.swing.JButton brokerListBtn;
    private javax.swing.JLabel FromDateLbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchFilterLbl;
    private javax.swing.JPanel searchFilterPane;
    private javax.swing.JSeparator searchFilterSpr;
    private com.toedter.calendar.JDateChooser selectFromDateDc;
    private com.toedter.calendar.JDateChooser selectToDateDc;
    private static javax.swing.JTable stocksList;
    private javax.swing.JLabel toDateLbl;
    private javax.swing.JLabel shareCodeLbl;
    private javax.swing.JTextField shareCodeTb;
    private DefaultTableModel stockslistMdl;

}
