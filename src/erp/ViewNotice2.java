/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Compaq
 */
public class ViewNotice2 extends javax.swing.JFrame {

    /**
     * Creates new form ViewNotice2
     */
    public ViewNotice2() {
        initComponents();
         DefaultTableModel model=new DefaultTableModel()
    {
      public Class<?> getColumnClass(int column)
      {
        switch(column)
        {
        case 0:
          return Boolean.class;

          default:
            return String.class;
        }
      }
    };
         
         jTable1.setModel(model);

    model.addColumn("Select");
     model.addColumn("NOTICE ID"); //1
            model.addColumn("DEPARTMENT");//2
            model.addColumn("DESIGNATION");//3
            model.addColumn("DESCRIPTION");//4
            model.addColumn("DATE YYYY/MM/DD");//14
            model.addColumn("TIME");//5
            
             try      
      {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;databaseName=bios;user=sa;password=opk16168");   
          String sql = "select * from AdminNotice " ;
          PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();      
          int p=0;
          while(rs.next())
          {
             String a = rs.getString("noticeid");
           String b = rs.getString("dept");
           String c = rs.getString("desig");
           String d = rs.getString("descript");
           String e = rs.getString("dop");
           String f = rs.getString("TimeOfPublish");
            model.addRow(new Object[]{a,b,c,d,e,f}); 
            model.setValueAt(false, p, 0);
            model.setValueAt(rs.getObject("noticeid"), p, 1);
            model.setValueAt(rs.getObject("dept"), p, 2);
            model.setValueAt(rs.getObject("desig"), p, 3);
            model.setValueAt(rs.getObject("descript"),p,4);
            model.setValueAt(rs.getObject("dop"), p, 5);
            model.setValueAt(rs.getObject("TimeOfPublish"),p,6);
            p++;
          }
          con.close();
       }
    catch(Exception e)
    {
    System.out.println(e);
    }
        
        
        
        
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      for(int i =0;i < jTable1.getRowCount();i++ ) {
        Boolean checked=Boolean.valueOf(jTable1.getValueAt(i,0).toString());
       
        if(checked)
        {
          DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
            try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //System.out.println(jTable1.getSelectedRow());
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;databaseName=bios;user=sa;password=opk16168");
        while(jTable1.getSelectedRow() >= 0 )
        {
            PreparedStatement pst = con.prepareStatement("delete AdminNotice where noticeid = ?");
           //System.out.println((String)(table.getValueAt(i,1)));
            pst.setString(1,jTable1.getValueAt(i,1).toString());
            int rs = pst.executeUpdate();
            model1.removeRow(i);
            if(rs>=0)
            {
               
            }
        }
         JOptionPane.showMessageDialog(null,"Notice removed successfully");
        }
        catch(Exception e){
        System.out.println(e);}
            //System.out.println(1);
        }
        if(!checked)
        {
            JOptionPane.showMessageDialog(null,"please Enter Something");
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminNotice().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewNotice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNotice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNotice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNotice2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNotice2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
