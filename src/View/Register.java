
package View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterButton = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        unameTaken = new javax.swing.JLabel();
        invalidPassword = new javax.swing.JLabel();
        notMatchPass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        confpass = new javax.swing.JPasswordField();
        BackButton1 = new javax.swing.JButton();

        RegisterButton.setBackground(new java.awt.Color(255, 255, 255));
        RegisterButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(240, 240, 240));
        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackButton.setText("<Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        unameTaken.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unameTaken.setForeground(new java.awt.Color(255, 0, 0));
        unameTaken.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unameTaken.setText("Username already taken");
        unameTaken.setVisible(false);

        invalidPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        invalidPassword.setForeground(new java.awt.Color(255, 0, 0));
        invalidPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invalidPassword.setText("Invalid password");
        invalidPassword.setVisible(false);

        notMatchPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        notMatchPass.setForeground(new java.awt.Color(255, 0, 0));
        notMatchPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notMatchPass.setText("Password does not match!");
        notMatchPass.setVisible(false);

        password.setBackground(new java.awt.Color(240, 240, 240));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setToolTipText("<html>\n<body>\n<p>Password should have atleast 8 characters.</p>\n<p>Password should contain atleast 1 uppercase.</p>\n<p>Password should contain atleast 1 lowercase.</p>\n<p>Password should contain atleast 1 number.</p>\n<p>Password should contain atleast 1 special character.</p>\n</body>\n</html>\n\n"); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        confpass.setBackground(new java.awt.Color(240, 240, 240));
        confpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        BackButton1.setBackground(new java.awt.Color(239, 239, 239));
        BackButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/info-logo.png"))); // NOI18N
        BackButton1.setBorder(null);
        BackButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(unameTaken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invalidPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notMatchPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpass, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(unameTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(notMatchPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        boolean validUsername = false;
        boolean validPassword = false;
        boolean validConfirmPassword = false;
        
        String passText = new String( password.getPassword());
        String confpassText = new String( confpass.getPassword());
        
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
        
        if(!frame.checkUsername(username.getText())){ //username already taken?
            unameTaken.setText("Username already taken!"); //show invalid username prompt
            unameTaken.setVisible(true); //show invalid username prompt
        }else{
            validUsername=true;
            unameTaken.setVisible(false);
        }
        if(username.getText().isEmpty()){
            validUsername = false;
            unameTaken.setVisible(true); //show invalid username prompt
            unameTaken.setText("Invalid username!"); //show invalid username prompt
        }
            
        if(passText.length()<8 || !containsSpecialCharacter || !containsNumber || !hasLowerCase || !hasUpperCase){
            invalidPassword.setVisible(true);
        }else{
            validPassword = true;
            invalidPassword.setVisible(false);
        }
        if(!passText.equals(confpassText)){ //password and confirm password match?
            notMatchPass.setVisible(true); //show password not match prompt
        }else{
            validConfirmPassword = true;
            notMatchPass.setVisible(false);
        }
        
        if(validUsername && validPassword && validConfirmPassword){
            frame.registerAction(username.getText(), passText, confpassText);
            
            JOptionPane.showMessageDialog(null,"Account successfully created.","Registration",JOptionPane.INFORMATION_MESSAGE); 
            frame.loginNav();
            username.setText("");
            password.setText("");
            confpass.setText("");
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        username.setText("");
        password.setText("");
        confpass.setText("");
        unameTaken.setVisible(false);
        invalidPassword.setVisible(false);
        notMatchPass.setVisible(false);
        frame.loginNav();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"Password should have atleast 8 characters.\n" +
                                            "Password should contain atleast 1 uppercase.\n" +
                                            "Password should contain atleast 1 lowercase.\n" +
                                            "Password should contain atleast 1 number.\n" +
                                            "Password should contain atleast 1 special character.",
                                        "Password Requirements",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_BackButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPasswordField confpass;
    private javax.swing.JLabel invalidPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel notMatchPass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel unameTaken;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
