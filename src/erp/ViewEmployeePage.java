package erp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewEmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form ViewEmployeePage
     */
    public ViewEmployeePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel model = null;
            model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("EMPLOYEE ID"); //1
            model.addColumn("FIRSTNAME"); //2
            model.addColumn("SURNAME");//3
            model.addColumn("EMAIL");//4
            model.addColumn("DOB");//5
            model.addColumn("DEPT.");//6
            model.addColumn("GENDER");//7
            model.addColumn("DESIGNATION");//8
            model.addColumn("PHONE NO.");//9
            model.addColumn("ADDRESS"); //10
            model.addColumn("BS");// BS-BASIC SALARY //11
            model.addColumn("HRA");// HRA - HOUSE RENT ALLOWANCE //12
            model.addColumn("DA"); // DA- DEARNESS ALLOWANCE //13
            model.addColumn("SA"); // SA - SALARY ALLOWANCE //14
            model.addColumn("PF"); // PF- PROVIDENT FUND //15
          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Employee");

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(600, 250));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Enter FirstName:");

        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String msg = "";
                new AdminHomePage(msg).setVisible(true);
                
 
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      if(jTextField1.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Please enter something");
      }
      else
      {
        try
        {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection con = DriverManager.getConnection("jdbc:sqlserver://COMPAQ-PC\\ SQLEXPRESS;databaseName=bios;user=sa;password=opk16168");
          String a = "" ,b = "" , c = "" , d = "" , e = "", f = "" , g= "" , h= "" , i="";
          String p="";
            DefaultTableModel model = null;
            model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("EMPLOYEE ID");//1
            model.addColumn("FIRSTNAME"); //2
            model.addColumn("SURNAME");//3
            model.addColumn("EMAIL");//4
            model.addColumn("DOB");//5
            model.addColumn("DEPT.");//15
            model.addColumn("GENDER");//6
            model.addColumn("DESIGNATION");//7
            model.addColumn("PHONE NO.");//8
            model.addColumn("ADDRESS"); //9
            model.addColumn("BS");// BS-BASIC SALARY //10
            model.addColumn("HRA");// HRA - HOUSE RENT ALLOWANCE //11
            model.addColumn("DA"); // DA- DEARNESS ALLOWANCE //12
            model.addColumn("SA"); // SA - SALARY ALLOWANCE //13
            model.addColumn("PF"); // PF- PROVIDENT FUND //14
            String sql = "select * from EmployeeDetail where firstname like lower('" + jTextField1.getText() +"%') OR firstname like upper('" + jTextField1.getText() +"%')" ;
         
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next())
           {
            p = rs.getString(1);  
            a = rs.getString(2);
            b = rs.getString(3);
            c = rs.getString(4);
            d = rs.getString(5);
            e = rs.getString(6);
            f = rs.getString(7);
            g = String.valueOf(rs.getString(8));
            h = rs.getString(9);
            i = String.valueOf(rs.getString(10));
           String j = String.valueOf(rs.getString(11));
           String k = String.valueOf(rs.getString(12));
           String l = String.valueOf(rs.getString(13));
           String m = String.valueOf(rs.getString(14));
           String n = String.valueOf(rs.getString(15));
           model.addRow(new Object[]{p,a,b,c,d,e,f,g,h,i,j,k,l,m,n});
           String img = rs.getString("img");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH));
            jLabel2.setIcon(imageIcon);
           }
            else
                JOptionPane.showMessageDialog(null,"Data not found");
        }
        catch(Exception e)
        {
            
        }
      }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jLabel2.setText(null);
        jLabel2.setIcon(null);
        try
        {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection con = DriverManager.getConnection("jdbc:sqlserver://COMPAQ-PC\\ SQLEXPRESS;databaseName=bios;user=sa;password=opk16168");
          String a = "" ,b = "" , c = "" , d = "" , e = "", f = "" , g= "" , h= "" , i="";
          String p="";
            DefaultTableModel model = null;
            model = new DefaultTableModel();
            jTable1.setModel(model);
            model.addColumn("EMPLOYEE ID"); //1
            model.addColumn("FIRSTNAME"); //2
            model.addColumn("SURNAME");//3
            model.addColumn("EMAIL");//4
            model.addColumn("DOB");//5
            model.addColumn("DEPT.");//15
            model.addColumn("GENDER");//6
            model.addColumn("DESIGNATION");//7
            model.addColumn("PHONE NO.");//8
            model.addColumn("ADDRESS"); //9
            model.addColumn("BS");// BS-BASIC SALARY //10
            model.addColumn("HRA");// HRA - HOUSE RENT ALLOWANCE //11
            model.addColumn("DA"); // DA- DEARNESS ALLOWANCE //12
            model.addColumn("SA"); // SA - SALARY ALLOWANCE //13
            model.addColumn("PF"); // PF- PROVIDENT FUND //14
            String sql = "select * from EmployeeDetail " ;
         
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next())
           {
            p = rs.getString(1);
            a = rs.getString(2);
            b = rs.getString(3);
            c = rs.getString(4);
            d = rs.getString(5);
            e = rs.getString(6);
            f = rs.getString(7);
            g = String.valueOf(rs.getString(8));
            h = rs.getString(9);
            i = String.valueOf(rs.getString(10));
           String j = String.valueOf(rs.getString(11));
           String k = String.valueOf(rs.getString(12));
           String l = String.valueOf(rs.getString(13));
           String m = String.valueOf(rs.getString(14));
           String n = String.valueOf(rs.getString(15));
            model.addRow(new Object[]{p,a,b,c,d,e,f,g,h,i,j,k,l,m,n});
           }
            
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        //model1.removeRow(jTable1.getSelectedRow());
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //System.out.println(jTable1.getSelectedRow());
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;databaseName=bios;user=sa;password=opk16168");
        if(jTable1.getSelectedRow() >= 0 )
        {
            PreparedStatement pst = con.prepareStatement("delete EmployeeDetail where empid = ?");
           //System.out.println((String)(jTable1.getValueAt(jTable1.getSelectedRow(),0)));
            pst.setString(1,(String)(jTable1.getValueAt(jTable1.getSelectedRow(),0)));
            int rs = pst.executeUpdate();
            model1.removeRow(jTable1.getSelectedRow());
            if(rs>=0)
            {
                JOptionPane.showMessageDialog(null,"Employee removed successfully");
            }
        }
        }
        catch(Exception e){
        System.out.println(e);}
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
