/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ujjwal
 */
public class ManageRestaurants extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurants
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    //private RestaurantDirectory resDir=new RestaurantDirectory();
    
    UserAccount user;
   
    public ManageRestaurants(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkTable();
        ConfirmBtn.setEnabled(false);
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
        networkJTable = new javax.swing.JTable();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        uNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        ConfirmBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblerr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        networkJTable.setForeground(new java.awt.Color(204, 0, 0));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        backJButton.setBackground(new java.awt.Color(204, 0, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(204, 0, 0));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Save");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Full Name :");

        uNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uNameTextFieldFocusLost(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("New Password :");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(204, 0, 0));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("View");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(204, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        ConfirmBtn.setBackground(new java.awt.Color(204, 0, 0));
        ConfirmBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBtn.setText(" Update");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("New UserName :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESTAURANT MANAGER DIRECTORY");

        lblerr.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblerr.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblerr, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ConfirmBtn, backJButton, deleteBtn, submitJButton, updateBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(ConfirmBtn))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblerr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
              
        boolean check;
        String alphapattern = "^[a-zA-Z\\s]{1,}$";
        //String numpattern = "\\d+";
        String alphanum = "^[a-zA-Z0-9\\s]+$";
        
        Pattern aP = Pattern.compile(alphapattern);
        //Pattern nP = Pattern.compile(numpattern);
        Pattern an = Pattern.compile(alphanum);
        
        Matcher cM = aP.matcher(nameJTextField.getText());
        Matcher mM = an.matcher(uNameTextField.getText());
        Matcher ctM = an.matcher(PasswordField.getText());
        
        
        
        if ((!cM.matches()) || (!mM.matches()) || (!ctM.matches()) || (!system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)))
            {
            check=false;
            }
         
         else{
                check=true;
            }
        
        
        if (check == true){
            
            UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name,uname,password, null, new AdminRole());
            Restaurant restro= system.getRestaurantDirectory().createRestaurantInfo(uname);
            populateNetworkTable();
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
            }
       else {
            JOptionPane.showMessageDialog(this, "ERROR! Enter the correct value in the field.");} 
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = networkJTable.getSelectedRow();

        if(selectRow>=0){
            String username= (String) networkJTable.getValueAt(selectRow, 1);
                String pwd= (String) networkJTable.getValueAt(selectRow, 2);
                user=system.getUserAccountDirectory().authenticateUser(username, pwd);

                nameJTextField.setText(user.getName()+"");
                uNameTextField.setText(user.getUsername()+"");
                PasswordField.setText(user.getPassword()+"");
               // system.getUserAccountDirectory().deleteUserAccount(user);
            

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        submitJButton.setEnabled(false);
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        ConfirmBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) networkJTable.getValueAt(selectedRow, 1);
                String pwd= (String) networkJTable.getValueAt(selectedRow, 2);
                UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);
                
                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getRestaurantDirectory().deleteRestaurent(user.getUsername());
                populateNetworkTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        // TODO add your handling code here:
        
        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
        
              
        boolean check;
        String alphapattern = "^[a-zA-Z\\s]{1,}$";
        //String numpattern = "\\d+";
        String alphanum = "^[a-zA-Z0-9\\s]+$";
        
        Pattern aP = Pattern.compile(alphapattern);
        //Pattern nP = Pattern.compile(numpattern);
        Pattern an = Pattern.compile(alphanum);
        
        Matcher cM = aP.matcher(nameJTextField.getText());
        Matcher mM = an.matcher(uNameTextField.getText());
        Matcher ctM = an.matcher(PasswordField.getText());
        
        
        
        if ((!cM.matches()) || (!mM.matches()) || (!ctM.matches()) || (!system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)))
            {
            check=false;
            }
         
         else{
                check=true;
            }
        if (check == true){  
            system.getUserAccountDirectory().updateUserAccount(user,name,uname,password);
            populateNetworkTable();
            submitJButton.setEnabled(true);
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
            ConfirmBtn.setEnabled(false);
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
            }
        else {
            JOptionPane.showMessageDialog(this, "ERROR! Enter the correct value in the field.");}
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void uNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uNameTextFieldFocusLost
        // TODO add your handling code here:
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(uNameTextField.getText())){
                lblerr.setText("");
        }
            else{
                lblerr.setText("User Name ALready Exists !");
            }
    }//GEN-LAST:event_uNameTextFieldFocusLost

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        
        model.setRowCount(0);
        
       // for()
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.AdminRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblerr;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField uNameTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
