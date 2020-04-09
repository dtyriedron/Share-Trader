package com.userInterface;

import com.databases.DbEditRow;
import com.databases.DbGetData;
import com.system.PeriodicUpdate;
import com.system.Simulate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CompanyProfile extends javax.swing.JFrame {

    /**
     * Creates new form com.userInterface.CompanyProfile
     */
    public CompanyProfile(String code, String nameOfCompany, String news, String price, String dayChange, String cur) {
        initComponents();
        codeLbl.setText(code);
        companyNameLbl.setText(nameOfCompany);
        showPriceLbl.setText(price+ " "+ cur);
        showDayChangeLbl.setText(dayChange);
        newsLstMdl.addElement(news);
        showMajorShareholderLbl.setText(Simulate.simulateShareholder());
    }

    public CompanyProfile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        companyDetailsPane = new javax.swing.JPanel();
        codeLbl = new javax.swing.JLabel();
        companyNameLbl = new javax.swing.JLabel();
        companyNameSpr = new javax.swing.JSeparator();
        priceLbl = new javax.swing.JLabel();
        showPriceLbl = new javax.swing.JLabel();
        dayHighLbl = new javax.swing.JLabel();
        showDayHighLbl = new javax.swing.JLabel();
        dayLowLbl = new javax.swing.JLabel();
        showDayLowLbl = new javax.swing.JLabel();
        sharesLbl = new javax.swing.JLabel();
        showSharesLbl = new javax.swing.JLabel();
        openPriceLbl = new javax.swing.JLabel();
        showOpenPriceLbl = new javax.swing.JLabel();
        dayChangeLbl = new javax.swing.JLabel();
        periodHighLbl = new javax.swing.JLabel();
        periodLowLbl = new javax.swing.JLabel();
        showDayChangeLbl = new javax.swing.JLabel();
        showPeriodHighLbl = new javax.swing.JLabel();
        majorShareholderLbl = new javax.swing.JLabel();
        showMajorShareholderLbl = new javax.swing.JLabel();
        addToWatchBtn = new javax.swing.JButton();
        setMinMaxBtn = new javax.swing.JButton();
        SetAlertsPane = new javax.swing.JPanel();
        setMinSpr = new javax.swing.JSeparator();
        setMinLbl = new javax.swing.JLabel();
        setMinTb = new javax.swing.JTextField();
        alertPaneSpr = new javax.swing.JSeparator();
        setMaxLbl = new javax.swing.JLabel();
        setMaxSpr = new javax.swing.JSeparator();
        setMaxTb = new javax.swing.JTextField();
        setMinCurLbl = new javax.swing.JLabel();
        setMaxCurLbl = new javax.swing.JLabel();
        newsPane = new javax.swing.JPanel();
        newsLbl = new javax.swing.JLabel();
        newsSpr = new javax.swing.JSeparator();
        newsScroll = new javax.swing.JScrollPane();
        newsLst = new javax.swing.JList<>();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));

        companyDetailsPane.setBackground(new java.awt.Color(133, 164, 192));

        codeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codeLbl.setText("Code");

        companyNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyNameLbl.setText("CompanyName");

        companyNameSpr.setBackground(new java.awt.Color(1, 1, 1));
        companyNameSpr.setForeground(new java.awt.Color(1, 1, 1));

        priceLbl.setText("Price");

        showPriceLbl.setText("24 USD");

        dayHighLbl.setText("Day high");

        showDayHighLbl.setText("24 USD");

        dayLowLbl.setText("Day low");

        showDayLowLbl.setText("23 USD");

        sharesLbl.setText("Shares");

        showSharesLbl.setText("1234");
        majorShareholderLbl.setText("Major Shareholder");

        showMajorShareholderLbl.setText("gary");

        showMajorShareholderLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMajorShareholderLblMouseClicked(evt);
            }
        });

        openPriceLbl.setText("Price open");

        showOpenPriceLbl.setText("23.5 USD");

        dayChangeLbl.setText("Day change");

        periodHighLbl.setText("52 week high ");

        periodLowLbl.setText("52 week low");

        showDayChangeLbl.setText("1 USD");

        showPeriodHighLbl.setText("25 USD");


        javax.swing.GroupLayout companyDetailsPaneLayout = new javax.swing.GroupLayout(companyDetailsPane);
        companyDetailsPane.setLayout(companyDetailsPaneLayout);
        companyDetailsPaneLayout.setHorizontalGroup(
                companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(companyNameSpr, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                                                .addComponent(priceLbl)
                                                                .addGap(50, 50, 50)
                                                                .addComponent(showPriceLbl))
                                                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(dayChangeLbl)
                                                                        .addComponent(sharesLbl)
                                                                        .addComponent(majorShareholderLbl))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(showSharesLbl)
                                                                        .addComponent(showDayChangeLbl)
                                                                        .addComponent(showMajorShareholderLbl)))))
                                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(codeLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(companyNameLbl)))
                                .addContainerGap(123, Short.MAX_VALUE))
        );
        companyDetailsPaneLayout.setVerticalGroup(
                companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(companyDetailsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(codeLbl)
                                        .addComponent(companyNameLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(companyNameSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(priceLbl)
                                        .addComponent(showPriceLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dayChangeLbl)
                                        .addComponent(showDayChangeLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sharesLbl)
                                        .addComponent(showSharesLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(companyDetailsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(majorShareholderLbl)
                                        .addComponent(showMajorShareholderLbl))
                                .addContainerGap(131, Short.MAX_VALUE))
        );

        addToWatchBtn.setText("Add to watchlist");
        addToWatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToWatchBtnActionPerformed(evt);
            }
        });

        SetAlertsPane.setBackground(new java.awt.Color(133, 164, 192));

        setMinSpr.setBackground(new java.awt.Color(1, 1, 1));
        setMinSpr.setForeground(new java.awt.Color(1, 1, 1));

        setMinLbl.setText("Set minimum price alert");

        alertPaneSpr.setBackground(new java.awt.Color(1, 1, 1));
        alertPaneSpr.setForeground(new java.awt.Color(1, 1, 1));

        setMaxLbl.setText("Set maximum price alert");

        setMaxSpr.setBackground(new java.awt.Color(1, 1, 1));
        setMaxSpr.setForeground(new java.awt.Color(1, 1, 1));

        setMaxTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMaxTbActionPerformed(evt);
            }
        });

        setMinMaxBtn.setText("Set min and max");
        setMinMaxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMinMaxBtnActionPerformed(evt);
            }
        });

        setMinCurLbl.setText("cur");

        setMaxCurLbl.setText("cur");

        javax.swing.GroupLayout SetAlertsPaneLayout = new javax.swing.GroupLayout(SetAlertsPane);
        SetAlertsPane.setLayout(SetAlertsPaneLayout);
        SetAlertsPaneLayout.setHorizontalGroup(
                SetAlertsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(setMinSpr)
                        .addComponent(alertPaneSpr)
                        .addComponent(setMaxSpr)
                        .addGroup(SetAlertsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SetAlertsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(setMaxLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetAlertsPaneLayout.createSequentialGroup()
                                                .addGap(0, 18, Short.MAX_VALUE)
                                                .addComponent(setMinCurLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(setMinTb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                        .addGroup(SetAlertsPaneLayout.createSequentialGroup()
                                                .addComponent(setMinLbl)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetAlertsPaneLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addComponent(setMaxCurLbl)
                                .addGap(18, 18, 18)
                                .addComponent(setMaxTb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                        .addGroup(SetAlertsPaneLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(setMinMaxBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SetAlertsPaneLayout.setVerticalGroup(
                SetAlertsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SetAlertsPaneLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(setMinLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setMinSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SetAlertsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(setMinTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setMinCurLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alertPaneSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(setMaxLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setMaxSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SetAlertsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(setMaxTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setMaxCurLbl))
                                .addGap(18, 18, 18)
                                .addComponent(setMinMaxBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newsPane.setBackground(new java.awt.Color(133, 164, 192));

        newsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newsLbl.setText("Company News");

        newsSpr.setBackground(new java.awt.Color(1, 1, 1));
        newsSpr.setForeground(new java.awt.Color(1, 1, 1));

        newsLstMdl = new DefaultListModel();
        newsLst.setModel(newsLstMdl);
        newsScroll.setViewportView(newsLst);

        javax.swing.GroupLayout newsPaneLayout = new javax.swing.GroupLayout(newsPane);
        newsPane.setLayout(newsPaneLayout);
        newsPaneLayout.setHorizontalGroup(
                newsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newsSpr)
                        .addGroup(newsPaneLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(newsLbl)
                                .addContainerGap(148, Short.MAX_VALUE))
                        .addGroup(newsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(newsScroll)
                                .addContainerGap())
        );
        newsPaneLayout.setVerticalGroup(
                newsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(newsPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(newsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newsSpr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(homeBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(companyDetailsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SetAlertsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(addToWatchBtn)))
                                .addGap(21, 21, 21))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(newsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(addToWatchBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SetAlertsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(homeBtn))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(companyDetailsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(newsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void addToWatchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        //edit db to add the current user to the list of users that follow this share
        String user = "anything"; //temp user used user should be passed to this class when its called
        String companyCode = "SNAP"; //temp company need to take the details from the companyNameLbl
        DbEditRow.updateRows(user, companyCode);
        //periodicupdate for news
        PeriodicUpdate.update(null,0,0, true);
    }

    private void setMinMaxBtnActionPerformed(java.awt.event.ActionEvent evt) {
        //put this in with the set button
        PeriodicUpdate.update(codeLbl.getText(), Double.parseDouble(setMaxTb.getText()), Double.parseDouble(setMinTb.getText()), false);
    }

    private void setMaxTbActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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

    private void showMajorShareholderLblMouseClicked(java.awt.event.MouseEvent evt) {
        ShareholderProfile sh = new ShareholderProfile(Simulate.simulateShareholder(), Simulate.simulateAnnoucement(), DbGetData.getStock("BFGR"));
        sh.setVisible(true);
        sh.pack();
        sh.setLocationRelativeTo(null);
        sh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompanyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyProfile().setVisible(true);
            }
        });
    }


    private javax.swing.JPanel SetAlertsPane;
    private javax.swing.JButton addToWatchBtn;
    private javax.swing.JSeparator alertPaneSpr;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel codeLbl;
    private javax.swing.JPanel companyDetailsPane;
    public static javax.swing.JLabel companyNameLbl;
    private javax.swing.JSeparator companyNameSpr;
    private javax.swing.JLabel dayChangeLbl;
    private javax.swing.JLabel dayHighLbl;
    private javax.swing.JLabel dayLowLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel newsLbl;
    private javax.swing.JList<String> newsLst;
    private javax.swing.JPanel newsPane;
    private javax.swing.JScrollPane newsScroll;
    private javax.swing.JSeparator newsSpr;
    private javax.swing.JLabel openPriceLbl;
    private javax.swing.JLabel periodHighLbl;
    private javax.swing.JLabel periodLowLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JButton setMinMaxBtn;
    private javax.swing.JLabel setMaxCurLbl;
    private javax.swing.JLabel setMaxLbl;
    private javax.swing.JSeparator setMaxSpr;
    private javax.swing.JTextField setMaxTb;
    private javax.swing.JLabel setMinCurLbl;
    private javax.swing.JLabel setMinLbl;
    private javax.swing.JSeparator setMinSpr;
    private javax.swing.JTextField setMinTb;
    private javax.swing.JLabel sharesLbl;
    private javax.swing.JLabel showDayChangeLbl;
    private javax.swing.JLabel showDayHighLbl;
    private javax.swing.JLabel showDayLowLbl;
    private javax.swing.JLabel showOpenPriceLbl;
    private javax.swing.JLabel showPeriodHighLbl;
    private javax.swing.JLabel showPriceLbl;
    private javax.swing.JLabel showSharesLbl;
    private DefaultListModel newsLstMdl;
    private javax.swing.JLabel showMajorShareholderLbl;
    private javax.swing.JLabel majorShareholderLbl;

}
