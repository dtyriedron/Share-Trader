package com.userInterface;

import com.databases.DbGetData;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;

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

        jScrollPane2 = new javax.swing.JScrollPane();
        stocksList = new javax.swing.JTable();
        searchFilterPane = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        selectFromDateDc = new com.toedter.calendar.JDateChooser();
        showDateLbl = new javax.swing.JLabel();
        selectToDateDc = new com.toedter.calendar.JDateChooser();
        FromDateLbl = new javax.swing.JLabel();
        toDateLbl = new javax.swing.JLabel();
        searchFilterLbl = new javax.swing.JLabel();
        searchFilterSpr = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        DbGetData getFromDb = new DbGetData();
        String[] tableData;
        tableData = getFromDb.getDbStocksData();
        System.out.println("hey");
        System.out.println(tableData[3]);

        stocksList.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {tableData[0], tableData[1], tableData[2], Float.parseFloat(tableData[3]), Float.parseFloat(tableData[4]), Float.parseFloat(tableData[5]) },
                },
                new String [] {
                        "Code", "Name", "Cur", "Price", "+/-", "+/-%"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        showDateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showDateLbl.setText("outputDate");

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

        javax.swing.GroupLayout searchFilterPaneLayout = new javax.swing.GroupLayout(searchFilterPane);
        searchFilterPane.setLayout(searchFilterPaneLayout);
        searchFilterPaneLayout.setHorizontalGroup(
                searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(searchFilterSpr)
                                        .addComponent(searchFilterLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addComponent(showDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(toDateLbl))
                                        .addComponent(FromDateLbl))
                                .addGap(18, 18, 18)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGap(0, 65, Short.MAX_VALUE)
                                                .addComponent(searchBtn))
                                        .addComponent(selectToDateDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(selectFromDateDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21))
        );
        searchFilterPaneLayout.setVerticalGroup(
                searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchFilterPaneLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(FromDateLbl)
                                                .addComponent(searchFilterLbl))
                                        .addComponent(selectFromDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addComponent(showDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(37, 37, 37))
                                        .addGroup(searchFilterPaneLayout.createSequentialGroup()
                                                .addGroup(searchFilterPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(toDateLbl)
                                                        .addComponent(searchFilterSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(selectToDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addComponent(searchBtn)
                                                .addGap(0, 64, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                        .addComponent(searchFilterPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchFilterPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy", Locale.getDefault());
        String d = sdf.format(selectFromDateDc.getDate());
        showDateLbl.setText(d);
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

    // get selected row on mouse click
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

//           index = stocksList.getSelectedRow();
//           JTextField1.setText(model.getValueAt(index, 0).toString());

    }

    // display row values on keys click
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {

        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){

//           index = stocksList.getSelectedRow();
//           jTextField1.setText(model.getValueAt(index, 0).toString());

        }

    }




    private javax.swing.JLabel FromDateLbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchFilterLbl;
    private javax.swing.JPanel searchFilterPane;
    private javax.swing.JSeparator searchFilterSpr;
    private com.toedter.calendar.JDateChooser selectFromDateDc;
    private com.toedter.calendar.JDateChooser selectToDateDc;
    private javax.swing.JLabel showDateLbl;
    private static javax.swing.JTable stocksList;
    private javax.swing.JLabel toDateLbl;

}
