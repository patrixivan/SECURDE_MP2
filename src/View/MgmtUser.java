/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SQLite;
import Model.Logs;
import Model.User;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beepxD
 */
public class MgmtUser extends javax.swing.JPanel {

    public SQLite sqlite;
    public DefaultTableModel tableModel;
    public User user;
    
    public MgmtUser(SQLite sqlite, User user) {
        initComponents();
        this.sqlite = sqlite;
        this.user = user;
        tableModel = (DefaultTableModel)table.getModel();
        table.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));
        
//        UNCOMMENT TO DISABLE BUTTONS
//        editBtn.setVisible(false);
//        deleteBtn.setVisible(false);
//        lockBtn.setVisible(false);
//        chgpassBtn.setVisible(false);
    }
    
    public void init(){
        switch(user.getRole()){
            case 1: break;
            case 2:
                System.out.println(user.getUsername()+" || entered2");
                editRoleBtn.setVisible(false);
                deleteBtn.setVisible(false);
                lockBtn.setVisible(false);
                chgpassBtn.setVisible(true);
                break;
            case 3:
                System.out.println(user.getRole()+" ||entered3");
                editRoleBtn.setVisible(false);
                deleteBtn.setVisible(false);
                lockBtn.setVisible(false);
                chgpassBtn.setVisible(true);
                break;
            case 4:
                System.out.println(user.getRole()+" ||entered4");
                editRoleBtn.setVisible(true);
                deleteBtn.setVisible(false);
                lockBtn.setVisible(true);
                chgpassBtn.setVisible(true);
                break;
            case 5:
                System.out.println(user.getRole()+" ||entered5");
                editRoleBtn.setVisible(true);
                deleteBtn.setVisible(true);
                lockBtn.setVisible(true);
                chgpassBtn.setVisible(true);
                break;
        };
        //CLEAR TABLE
        for(int nCtr = tableModel.getRowCount(); nCtr > 0; nCtr--){
            tableModel.removeRow(0);
        }
        
        if(user.getRole() == 5){
            ArrayList<User> users = sqlite.getUsers();
            for(int nCtr = 0; nCtr < users.size(); nCtr++){
                tableModel.addRow(new Object[]{
                    users.get(nCtr).getUsername(), 
                    users.get(nCtr).getPassword(), 
                    users.get(nCtr).getRole(), 
                    users.get(nCtr).getLocked()});
            }
        }else if(user.getRole() == 4){
            ArrayList<User> users = sqlite.getUsers();
            for(int nCtr = 0; nCtr < users.size(); nCtr++){
                if(users.get(nCtr).getRole()!=5){
                    tableModel.addRow(new Object[]{
                        users.get(nCtr).getUsername(), 
                        users.get(nCtr).getPassword(), 
                        users.get(nCtr).getRole(), 
                        users.get(nCtr).getLocked()});
                }
            }
        }else if(user.getRole() == 3){
            ArrayList<User> users = sqlite.getUsers();
            for(int nCtr = 0; nCtr < users.size(); nCtr++){
                if(users.get(nCtr).getRole()!=5 && users.get(nCtr).getRole()!=4){
                    tableModel.addRow(new Object[]{
                        users.get(nCtr).getUsername(), 
                        users.get(nCtr).getPassword(), 
                        users.get(nCtr).getRole(), 
                        users.get(nCtr).getLocked()});
                }
            }
        }else{
            ArrayList<User> users = sqlite.getUsers();
            for(int nCtr = 0; nCtr < users.size(); nCtr++){
                if(users.get(nCtr).getUsername().equals(user.getUsername())){
                    tableModel.addRow(new Object[]{
                        users.get(nCtr).getUsername(), 
                        users.get(nCtr).getPassword(), 
                        users.get(nCtr).getRole(), 
                        users.get(nCtr).getLocked()});
                }
            }
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
        editRoleBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        lockBtn = new javax.swing.JButton();
        chgpassBtn = new javax.swing.JButton();

        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Role", "Locked"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(24);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(160);
            table.getColumnModel().getColumn(1).setPreferredWidth(400);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        editRoleBtn.setBackground(new java.awt.Color(255, 255, 255));
        editRoleBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editRoleBtn.setText("EDIT ROLE");
        editRoleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRoleBtnActionPerformed(evt);
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

        lockBtn.setBackground(new java.awt.Color(255, 255, 255));
        lockBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lockBtn.setText("LOCK/UNLOCK");
        lockBtn.setToolTipText("");
        lockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockBtnActionPerformed(evt);
            }
        });

        chgpassBtn.setBackground(new java.awt.Color(255, 255, 255));
        chgpassBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chgpassBtn.setText("CHANGE PASS");
        chgpassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpassBtnActionPerformed(evt);
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
                        .addComponent(editRoleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(lockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(chgpassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(chgpassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editRoleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editRoleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRoleBtnActionPerformed
        if(table.getSelectedRow() >= 0){
            String[] options = {"1-DISABLED","2-CLIENT","3-STAFF","4-MANAGER","5-ADMIN"};
            JComboBox optionList = new JComboBox(options);
            
            optionList.setSelectedIndex((int)tableModel.getValueAt(table.getSelectedRow(), 2) - 1);
            
            String result = (String) JOptionPane.showInputDialog(null, "USER: " + tableModel.getValueAt(table.getSelectedRow(), 0), 
                "EDIT USER ROLE", JOptionPane.QUESTION_MESSAGE, null, options, options[(int)tableModel.getValueAt(table.getSelectedRow(), 2) - 1]);
            
            if(result != null){
                Logs log = new Logs("USERS", user.getUsername(), "Edited role of user:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" to "+result.substring(2));
                sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                sqlite.editUserRole(tableModel.getValueAt(table.getSelectedRow(), 0).toString(), Integer.parseInt(result.charAt(0)+""));
                System.out.println(tableModel.getValueAt(table.getSelectedRow(), 0));
                System.out.println(result.charAt(0));       
                JOptionPane.showMessageDialog(null,"User: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" role has been updated to "+result.substring(2)+".","Edit Role",JOptionPane.INFORMATION_MESSAGE);
                init();
                
            }
        }
    }//GEN-LAST:event_editRoleBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if(table.getSelectedRow() >= 0){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + tableModel.getValueAt(table.getSelectedRow(), 0) + "?", "DELETE USER", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                Logs log = new Logs("USERS", user.getUsername(), "Deleted user:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                sqlite.removeUser(tableModel.getValueAt(table.getSelectedRow(), 0).toString());
                System.out.println(tableModel.getValueAt(table.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null,"User: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" has been deleted.","Delete User",JOptionPane.INFORMATION_MESSAGE);
                init();
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void lockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockBtnActionPerformed
        System.out.print(this.user.getUsername());
        if(table.getSelectedRow() >= 0){
            String state = "lock";
            int lock = 0;
            if("1".equals(tableModel.getValueAt(table.getSelectedRow(), 3) + "")){
                state = "unlock";
            }
            
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to " + state + " " + tableModel.getValueAt(table.getSelectedRow(), 0) + "?", "DELETE USER", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                if(state.equals("lock")){
                    lock = 1;
                }else if(state.equals("unlock")){
                    lock = 0;
                }
                sqlite.editUserLock(tableModel.getValueAt(table.getSelectedRow(), 0).toString(), lock);
                
                System.out.println(tableModel.getValueAt(table.getSelectedRow(), 0));
                if(lock==1){
                    Logs log = new Logs("USERS", user.getUsername(), "User:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString() +" has been locked.");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    JOptionPane.showMessageDialog(null,"User: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" has been locked.","Lock/Unlock User",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    Logs log = new Logs("USERS", user.getUsername(), "User:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString() +" has been unlocked.");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    JOptionPane.showMessageDialog(null,"User: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" has been unlocked","Lock/Unlock User",JOptionPane.INFORMATION_MESSAGE);
                }
                
                init();
            }
        }
    }//GEN-LAST:event_lockBtnActionPerformed

    private boolean checkPass(String passText, String confpassText){
        boolean validPassword = false;
        boolean validConfirmPassword = false;
        
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(passText);
        boolean containsSpecialCharacter = m.find();
   
        boolean containsNumber = false;
        for (char c : passText.toCharArray()) {
            if (containsNumber = Character.isDigit(c)) {
                break;
            }
        }
        
        boolean hasUpperCase = !passText.equals(passText.toLowerCase());
        boolean hasLowerCase = !passText.equals(passText.toUpperCase());
        if(passText.length()<8 || passText.length()>25 || !containsSpecialCharacter || !containsNumber || !hasLowerCase || !hasUpperCase){
            String error = "";
            if(passText.length()<8){
                error = error + "Password should have atleast 8 characters.\n";
            }
            if(passText.length()>25){
                error = error + "Password should have no more than 25 characters.\n";
            }
            if(!containsSpecialCharacter){
                error = error + "Password should have atleast 1 special character.\n";
            }
            if(!containsNumber){
                error = error + "Password should have atleast 1 number.\n";
            }
            if(!hasLowerCase){
                error = error + "Password should have atleast 1 lowercase.\n";
            }
            if(!hasUpperCase){
                error = error + "Password should have atleast 1 uppercase.\n"; 
            }
            JOptionPane.showMessageDialog(null,error,"Invalid Password",JOptionPane.ERROR_MESSAGE);
        }else{
            validPassword = true;
        }
        if(!passText.equals(confpassText) && validPassword){ //password and confirm password match?
            JOptionPane.showMessageDialog(null,"Password does not match.","Invalid Password",JOptionPane.ERROR_MESSAGE);
        }else{
            validConfirmPassword = true;
        }
        
        if(validPassword && validConfirmPassword){
            return true;
        }else{
            return false;
        }
        
    }
    
    private void chgpassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpassBtnActionPerformed
        if(table.getSelectedRow() >= 0 
                && ((tableModel.getValueAt(table.getSelectedRow(), 0).toString().equals(user.getUsername()) && user.getRole()!=5) || user.getRole()==5 )                               
          ){
            JTextField password = new JPasswordField();
            JTextField confpass = new JPasswordField();
            designer(password, "PASSWORD");
            designer(confpass, "CONFIRM PASSWORD");
            
            Object[] message = {
                "Enter New Password:", password, confpass, "*Password should have atleast 8-25 characters", "*Password should have atleast 1 special character & number", "*Password should have atleast 1 lowercase & uppercase"
            };

            int result = JOptionPane.showConfirmDialog(null, message, "CHANGE PASSWORD", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
            
            if (result == JOptionPane.OK_OPTION) {
                if(checkPass(password.getText(), confpass.getText())){
                    sqlite.editUserPass(tableModel.getValueAt(table.getSelectedRow(), 0).toString(), confpass.getText());
                    Logs log = new Logs("USERS", user.getUsername(), "User:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString() +" password has been updated.");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                    System.out.println(password.getText());
                    System.out.println(confpass.getText());
                    JOptionPane.showMessageDialog(null,"User: "+tableModel.getValueAt(table.getSelectedRow(), 0).toString()+" password has been updated.","Change Password",JOptionPane.INFORMATION_MESSAGE);
                    init();
                }else{
                     Logs log = new Logs("FAIL", user.getUsername(), "User:"+tableModel.getValueAt(table.getSelectedRow(), 0).toString() +" password change unsuccessful");
                    sqlite.addLogs(log.getEvent(), log.getUsername(), log.getDesc(), log.getTimestamp().toString());
                }                
                
                
            }
        }else{
              JOptionPane.showMessageDialog(null,"You are not authorized","Change Password",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_chgpassBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chgpassBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editRoleBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lockBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
