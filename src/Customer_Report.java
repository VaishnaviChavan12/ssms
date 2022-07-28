
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vaishnavi Chavan
 */
public class Customer_Report extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Report
     */
    public Customer_Report() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        updateFName();
        updateLName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbFName = new javax.swing.JComboBox<>();
        cmbLName = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        btnReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Report");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Customer Report");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Customer First Name:");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Customer last name:");

        cmbFName.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        cmbFName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select First Name--" }));
        cmbFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFNameActionPerformed(evt);
            }
        });

        cmbLName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbLName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select last Name--" }));
        cmbLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLNameActionPerformed(evt);
            }
        });

        tbCustomer.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product Name", "Selled Stock", "Selled Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCustomer);
        if (tbCustomer.getColumnModel().getColumnCount() > 0) {
            tbCustomer.getColumnModel().getColumn(0).setResizable(false);
            tbCustomer.getColumnModel().getColumn(1).setResizable(false);
            tbCustomer.getColumnModel().getColumn(2).setResizable(false);
            tbCustomer.getColumnModel().getColumn(3).setResizable(false);
        }

        btnReport.setText("Generate Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0)
        {
            try{
                DefaultTableModel tb1Model1=(DefaultTableModel)tbCustomer.getModel();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                Object cfname=cmbFName.getSelectedItem();
                Object clname=cmbLName.getSelectedItem();
                PreparedStatement pd;
                pd=con.prepareStatement("select * from customer where FName=? and LName=?");
                pd.setString(1,cfname.toString());
                pd.setString(2,clname.toString());
                ResultSet rs=pd.executeQuery();
                if(rs.next())
                {

                   JOptionPane.showMessageDialog(this,"Customer Found!!!");
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Customer Not Found!!!");
                    tb1Model1.setRowCount(0);
                    cmbFName.setSelectedIndex(0);
                    cmbLName.setSelectedIndex(0);
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_cmbFNameActionPerformed

    private void cmbLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLNameActionPerformed
        // TODO add your handling code here:
        if(cmbFName.getSelectedIndex()!=0 && cmbLName.getSelectedIndex()!=0)
        {
            try{
                DefaultTableModel tb1Model1=(DefaultTableModel)tbCustomer.getModel();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
                Object cfname=cmbFName.getSelectedItem();
                Object clname=cmbLName.getSelectedItem();
                PreparedStatement pd;
                pd=con.prepareStatement("select * from customer where FName=? and LName=?");
                pd.setString(1,cfname.toString());
                pd.setString(2,clname.toString());
                ResultSet rs=pd.executeQuery();
                if(rs.next())
                {

                   JOptionPane.showMessageDialog(this,"Customer Found!!!");
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Customer Not Found!!!");
                    tb1Model1.setRowCount(0);
                    cmbFName.setSelectedIndex(0);
                    cmbLName.setSelectedIndex(0);
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_cmbLNameActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            Object sfname=cmbFName.getSelectedItem();
            Object slname=cmbLName.getSelectedItem();
            DefaultTableModel tb1Model=(DefaultTableModel)tbCustomer.getModel();
            tb1Model.setRowCount(0);
            PreparedStatement pd,pm;
            pd=con.prepareStatement("SELECT * FROM Selled WHERE CFName=? and CLName=?");
            pd.setString(1,sfname.toString());
            pd.setString(2,slname.toString());
            ResultSet rs=pd.executeQuery();
            
            pm=con.prepareStatement("SELECT * FROM Selled WHERE CFName=? and CLName=? order by SDate");
            pm.setString(1,sfname.toString());
            pm.setString(2,slname.toString());
            ResultSet rs1=pm.executeQuery();
            
            
            if(rs.next())
            {
                while(rs1.next())
            {
                String pname,quantity,total,SDate;
                SDate=rs1.getString("SDate");
                pname=rs1.getString("PName");
                quantity=rs1.getString("Quantity");
                total=rs1.getString("Total");

                String data[]={SDate,pname,quantity,total};
                tb1Model.addRow(data);
            } 
            }
           else
            {
                 JOptionPane.showMessageDialog(this,"Record Not Exist!!!"); 
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnReportActionPerformed

    public void updateFName()
    {
        String sql="select distinct(FName) from customer order by FName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbFName.addItem(rs.getString("FName"));
             
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      public void updateLName()
    {
        String sql="select distinct(LName) from customer order by LName";
        try{
            Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement pd;        
         pd=con.prepareStatement(sql);
         ResultSet rs;
         rs=pd.executeQuery();
         while(rs.next())
         {
             cmbLName.addItem(rs.getString("LName"));
             
         }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cmbFName;
    private javax.swing.JComboBox<String> cmbLName;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCustomer;
    // End of variables declaration//GEN-END:variables
}