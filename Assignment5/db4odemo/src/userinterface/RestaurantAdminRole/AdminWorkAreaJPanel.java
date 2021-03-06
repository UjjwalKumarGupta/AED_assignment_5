

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageRestaurants;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        //this.account=account;
      
        valueLabel.setText("Admin Area of "+account.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageRestoInfo = new javax.swing.JButton();
        manageMenu = new javax.swing.JButton();
        manageOrders = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        manageRestoInfo.setBackground(new java.awt.Color(204, 0, 0));
        manageRestoInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageRestoInfo.setForeground(new java.awt.Color(255, 255, 255));
        manageRestoInfo.setText("Manage Restaurant Info");
        manageRestoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestoInfoActionPerformed(evt);
            }
        });

        manageMenu.setBackground(new java.awt.Color(204, 0, 0));
        manageMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageMenu.setForeground(new java.awt.Color(255, 255, 255));
        manageMenu.setText("Manage menu");
        manageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuActionPerformed(evt);
            }
        });

        manageOrders.setBackground(new java.awt.Color(204, 0, 0));
        manageOrders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageOrders.setForeground(new java.awt.Color(255, 255, 255));
        manageOrders.setText("Manage Orders");
        manageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(204, 0, 0));
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrders)
                    .addComponent(manageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageRestoInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageMenu, manageOrders, manageRestoInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(valueLabel)
                .addGap(120, 120, 120)
                .addComponent(manageOrders)
                .addGap(32, 32, 32)
                .addComponent(manageMenu)
                .addGap(33, 33, 33)
                .addComponent(manageRestoInfo)
                .addContainerGap(317, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageRestoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestoInfoActionPerformed
        // TODO add your handling code here:
        
        ManageInfo manageInfo=new ManageInfo(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_manageRestoInfoActionPerformed

    private void manageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuActionPerformed
         ManageMenu manageMenu=new ManageMenu(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageMenu);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMenuActionPerformed

    private void manageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageMenu;
    private javax.swing.JButton manageOrders;
    private javax.swing.JButton manageRestoInfo;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
