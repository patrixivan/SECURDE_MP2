/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SQLite;
import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beepxD
 */
public class MgmtProduct extends javax.swing.JPanel {

    public SQLite sqlite;
    public DefaultTableModel tableModel;
    public User user;
    
    public MgmtProduct(SQLite sqlite,User user) {
        initComponents();
        this.sqlite = sqlite;
        this.user = user;
        
        tableModel = (DefaultTableModel)table.getModel();
        table.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));

//        UNCOMMENT TO DISABLE BUTTONS
//        purchaseBtn.setVisible(false);
//        addBtn.setVisible(false);
//        editBtn.setVisible(false);
//        deleteBtn.setVisible(false);
    }

    public void init(){
        switch(user.getRole()){
            case 1: break;
            case 2:
//                System.out.println(user.getUsername()+" || entered2");
                purchaseBtn.setVisible(true);
                addBtn.setVisible(false);
                editBtn.setVisible(false);
                deleteBtn.setVisible(false);
                break;
            case 3:
//                System.out.println(user.getRole()+" ||entered3");
                purchaseBtn.setVisible(false);
                addBtn.setVisible(true);
                editBtn.setVisible(true);
                deleteBtn.setVisible(true);
                break;
            case 4:
//                System.out.println(user.getRole()+" ||entered4");
                purchaseBtn.setVisible(false);
                addBtn.setVisible(true);
                editBtn.setVisible(true);
                deleteBtn.setVisible(true);
                break;
            case 5:
//                System.out.println(user.getRole()+" ||entered5");
                purchaseBtn.setVisible(false);
                addBtn.setVisible(false);
                editBtn.setVisible(false);
                deleteBtn.setVisible(false);
                break;
        };
        //      CLEAR TABLE
        for(int nCtr = tableModel.getRowCount(); nCtr > 0; nCtr--){
            tableModel.removeRow(0);
        }
        
//      LOAD CONTENTS
        ArrayList<Product> products = sqlite.getProduct();
        for(int nCtr = 0; nCtr < products.size(); nCtr++){
            tableModel.addRow(new Object[]{
                products.get(nCtr).getName(), 
                products.get(nCtr).getStock(), 
                products.get(nCtr).getPrice()});
        }
    }
    
    public void designer(JTextField component, String text){
        component.setSize(70, 600);
        component.setFont(new java.awt.Font("Tahoma", 0, 18));
        component.setBackground(new java.awt.Color(240, 240, 240));
        component.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        component.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), text, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12)));
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
        table = new javax.swing.JTable();
        purchaseBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Stock", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(1).setMaxWidth(100);
            table.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        purchaseBtn.setBackground(new java.awt.Color(255, 255, 255));
        purchaseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        purchaseBtn.setText("PURCHASE");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.setToolTipText("");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
        if(table.getSelectedRow() >= 0){
            JTextField stockFld = new JTextField("0");
            designer(stockFld, "PRODUCT STOCK");

            Object[] message = {
                "How many " + tableModel.getValueAt(table.getSelectedRow(), 0) + " do you want to purchase?", stockFld
            };
            if(Integer.parseInt(tableModel.getValueAt(table.getSelectedRow(), 1).toString()) == 0){
                JOptionPane.showMessageDialog(null,"Product out of stock.","Out of Stock",JOptionPane.ERROR_MESSAGE);
            }else{
                int result = JOptionPane.showConfirmDialog(null, message, "PURCHASE PRODUCT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
                if (result == JOptionPane.OK_OPTION) {
                    Pattern p = Pattern.compile("^[0-9]*$", Pattern.CASE_INSENSITIVE);
                    Matcher m = p.matcher(stockFld.getText());
                    boolean validStock = m.find();

                    if(!stockFld.getText().isEmpty() && validStock && Integer.parseInt(stockFld.getText())>0 && Integer.parseInt(stockFld.getText()) <= Integer.parseInt(tableModel.getValueAt(table.getSelectedRow(), 1).toString())){
                        JOptionPane.showMessageDialog(null,"Successfully purchased "+stockFld.getText()+" "+tableModel.getValueAt(table.getSelectedRow(), 0)+".","Purchase",JOptionPane.INFORMATION_MESSAGE);
                        sqlite.purchaseProduct(tableModel.getValueAt(table.getSelectedRow(), 0).toString(), Integer.parseInt(stockFld.getText()));
                        History h = new History(user.getUsername(), tableModel.getValueAt(table.getSelectedRow(), 0).toString(), Integer.parseInt(stockFld.getText()));
                        sqlite.addHistory(h.getUsername(), h.getName(), h.getStock(), h.getTimestamp().toString());
                        Logs log = new Logs("PROD", user.getUsername(), "Purchased "+Integer.parseInt(stockFld.getText())+" product:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                        sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                        init();
                    }else{
                        if(Integer.parseInt(tableModel.getValueAt(table.getSelectedRow(), 1).toString()) == 0){
                            JOptionPane.showMessageDialog(null,"Product out of stock.","Out of Stock",JOptionPane.ERROR_MESSAGE);
                        }else{
                            Logs log = new Logs("FAIL", user.getUsername(), "Purchase unsuccessful");
                            sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                            JOptionPane.showMessageDialog(null,"Invalid value of stock/s.","Invalid Stock",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    System.out.println(stockFld.getText());
                }
            }
        }
    }//GEN-LAST:event_purchaseBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        JTextField nameFld = new JTextField();
        JTextField stockFld = new JTextField();
        JTextField priceFld = new JTextField();

        designer(nameFld, "PRODUCT NAME");
        designer(stockFld, "PRODUCT STOCK");
        designer(priceFld, "PRODUCT PRICE");

        Object[] message = {
            "Insert New Product Details:", nameFld, stockFld, priceFld
        };

        int result = JOptionPane.showConfirmDialog(null, message, "ADD PRODUCT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);

        if (result == JOptionPane.OK_OPTION) {
                if(nameFld.getText().trim().isEmpty()){
                    nameFld.setText(nameFld.getText().replace(" ", ""));
                }else{
                     nameFld.setText(nameFld.getText().trim());
                }        
                stockFld.setText(stockFld.getText().replace(" ", ""));
                priceFld.setText(priceFld.getText().replace(" ", ""));
                String error = "";
                boolean validName = true;
                Product checkName = sqlite.getProduct(nameFld.getText());
                if(checkName!=null){ //CHECKS IF PRODUCT NAME ALREADY EXISTS IN THE DB
                    validName = false;
                }
             
                Pattern p = Pattern.compile("^[0-9]*$", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(stockFld.getText());
                boolean validStock = m.find();
                //"^([0-9]*[.])?[0-9]{0,2}$" REGEX FOR PRICE WITHOUT COMMA
                Pattern p1 = Pattern.compile("^([0-9]*[,]?[0-9]+[.])?[0-9]{0,2}$", Pattern.CASE_INSENSITIVE);
                Matcher m1 = p1.matcher(priceFld.getText());
                boolean validPrice = m1.find();
                String cleanPrice = priceFld.getText().replace(",", "");
                
                if(!stockFld.getText().isEmpty() && !nameFld.getText().isEmpty() && !priceFld.getText().isEmpty() && validStock && validPrice && validName && Integer.parseInt(stockFld.getText())>0){
                    JOptionPane.showMessageDialog(null,"Successfully added "+stockFld.getText()+" "+nameFld.getText()+".","Add Product",JOptionPane.INFORMATION_MESSAGE);
                    sqlite.addProduct(nameFld.getText(), Integer.parseInt(stockFld.getText()), Double.parseDouble(cleanPrice) );
                    Logs log = new Logs("PROD", user.getUsername(), "Added product:"+nameFld.getText());
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    init();
                }else{
                    if(nameFld.getText().isEmpty()){
                        error = error + "Product name is empty.\n";
                    }else if(!validName){
                        error = error + "Duplicate product name.\n";                        
                    }
                    if(priceFld.getText().isEmpty()){
                        error = error + "Product price is empty.\n";
                    }else if(!validPrice){
                        error = error + "Invalid value for product price.\n";
                        
                    }
                    if(stockFld.getText().isEmpty()){
                        error = error + "Number of stock/s is empty.\n";
                    }else if(!validStock){
                        error = error + "Invalid value for product stocks.\n";
                    }else if(Integer.parseInt(stockFld.getText())<=0){
                        error = error + "Stocks must be greater than 0.\n";
                    }
                    Logs log = new Logs("FAIL", user.getUsername(), "Add product unsuccessful");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    
                    JOptionPane.showMessageDialog(null,error,"Invalid Product",JOptionPane.ERROR_MESSAGE);
                }
            System.out.println(nameFld.getText());
            System.out.println(stockFld.getText());
            System.out.println(priceFld.getText());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(table.getSelectedRow() >= 0){
            JTextField nameFld = new JTextField(tableModel.getValueAt(table.getSelectedRow(), 0) + "");
            JTextField stockFld = new JTextField(tableModel.getValueAt(table.getSelectedRow(), 1) + "");
            JTextField priceFld = new JTextField(tableModel.getValueAt(table.getSelectedRow(), 2) + "");

            designer(nameFld, "PRODUCT NAME");
            designer(stockFld, "PRODUCT STOCK");
            designer(priceFld, "PRODUCT PRICE");

            Object[] message = {
                "Edit Product Details:", nameFld, stockFld, priceFld
            };

            int result = JOptionPane.showConfirmDialog(null, message, "EDIT PRODUCT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);

            if (result == JOptionPane.OK_OPTION) {
                if(nameFld.getText().trim().isEmpty()){
                    nameFld.setText(nameFld.getText().replace(" ", ""));
                }else{
                     nameFld.setText(nameFld.getText().trim());
                }        
                stockFld.setText(stockFld.getText().replace(" ", ""));
                priceFld.setText(priceFld.getText().replace(" ", ""));
                
                String error = "";
                
                boolean validName = true;
                int editIndex = -1; //THIS WILL HOLD THE INDEX OF THE PRODUCT TO BE EDITED
                ArrayList<Product> products = sqlite.getProduct();
                for(int nCtr = 0; nCtr < products.size(); nCtr++){
                    if(products.get(nCtr).getName().equals(tableModel.getValueAt(table.getSelectedRow(), 0).toString())){
                        editIndex = nCtr;
                    }
                }
                
                //IF THE NAME HAS A DUPLICATE IN THE DB BESIDE THE CURRENT PRODUCT'S NAME TO BE EDITED
                for(int nCtr = 0; nCtr < products.size(); nCtr++){
                    if(products.get(nCtr).getName().toLowerCase().equals(nameFld.getText().toLowerCase()) && editIndex!=nCtr){
                        validName = false;
                    }
                }

             
                Pattern p = Pattern.compile("^[0-9]*$", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(stockFld.getText());
                boolean validStock = m.find();
                //"^([0-9]*[.])?[0-9]{0,2}$" REGEX FOR PRICE WITHOUT COMMA
                Pattern p1 = Pattern.compile("^([0-9]*[,]?[0-9]+[.])?[0-9]{0,2}$", Pattern.CASE_INSENSITIVE);
                Matcher m1 = p1.matcher(priceFld.getText());
                boolean validPrice = m1.find();
                String cleanPrice = priceFld.getText().replace(",", "");
                
                if(!stockFld.getText().isEmpty() && !nameFld.getText().isEmpty() && !priceFld.getText().isEmpty() && validStock && validPrice && validName && Integer.parseInt(stockFld.getText())>0){
                    JOptionPane.showMessageDialog(null,"Successfully edited "+nameFld.getText()+".","Edit Product",JOptionPane.INFORMATION_MESSAGE);
                    sqlite.editProduct(tableModel.getValueAt(table.getSelectedRow(), 0).toString(), nameFld.getText(), Integer.parseInt(stockFld.getText()), Double.parseDouble(cleanPrice) );
                    Logs log = new Logs("PROD", user.getUsername(), "Edited product:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    init();
                }else{
                    if(nameFld.getText().isEmpty()){
                        error = error + "Product name is empty.\n";
                    }else if(!validName){
                        error = error + "Duplicate product name.\n";                        
                    }
                    if(priceFld.getText().isEmpty()){
                        error = error + "Product price is empty.\n";
                    }else if(!validPrice){
                        error = error + "Invalid value for product price.\n";
                        
                    }
                    if(stockFld.getText().isEmpty()){
                        error = error + "Number of stock/s is empty.\n";
                    }else if(!validStock){
                        error = error + "Invalid value for product stocks.\n";
                    }else if(Integer.parseInt(stockFld.getText())<=0){
                        error = error + "Stocks must be greater than 0.\n";
                    }
                    Logs log = new Logs("FAIL", user.getUsername(), "Edit product unsuccessful");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    JOptionPane.showMessageDialog(null,error,"Edit Product",JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(nameFld.getText());
                System.out.println(stockFld.getText());
                System.out.println(priceFld.getText());
            }
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if(table.getSelectedRow() >= 0){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + tableModel.getValueAt(table.getSelectedRow(), 0) + "?", "DELETE PRODUCT", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                sqlite.removeProduct(tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                Logs log = new Logs("PROD", user.getUsername(), "Deleted product:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                System.out.println(tableModel.getValueAt(table.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null,"Successfully deleted product: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+".","Delete Product",JOptionPane.INFORMATION_MESSAGE);
                init();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
