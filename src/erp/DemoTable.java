package erp;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DemoTable extends JFrame{

  //MAIN METHOD
  public static void main(String[] args)
  {

       EventQueue.invokeLater(new Runnable()
       {
           private String msg;
           private String msg1;
           public void run()
           {
               //INITIALIZE JFRAME FORM
               DemoTable form=new DemoTable(msg,msg1);
               form.setVisible(true);;
           }
       });

  }

  //CONSTRUCTOR
  public DemoTable(String a , String n)
  {
    //the form
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(200,200,800,500);
    setTitle("View Attendance");
    getContentPane().setLayout(null);

    //ADD SCROLLPANE
    JScrollPane scroll=new JScrollPane();
    scroll.setBounds(70,80,600,200);
    getContentPane().add(scroll);

    //THE TABLE
    final JTable table=new JTable();
    scroll.setViewportView(table);

    //THE MODEL OF OUR TABLE
    DefaultTableModel model=new DefaultTableModel()
    {
      public Class<?> getColumnClass(int column)
      {
        switch(column)
        {
        case 0:
          return Boolean.class;
        case 1:
          return String.class;
        case 2:
          return String.class;
//        case 3:
//          return String.class;
//        case 4:
//          return String.class;

          default:
            return String.class;
        }
      }
    };

    //ASSIGN THE MODEL TO TABLE
    table.setModel(model);

    model.addColumn("Select");
    model.addColumn("Student Id");
    model.addColumn("Student Name");
//    model.addColumn("Points");
//    model.addColumn("Manager");

    //THE ROW
    try
    {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection con = DriverManager.getConnection("jdbc:sqlserver://COMPAQ-PC\\ SQLEXPRESS;databaseName=bios;user=sa;password=opk16168");
          String sql = "select idstudent,studentname from student where subject_subjectid=? ";
          PreparedStatement pst  =  con.prepareStatement(sql);
          pst.setString(1,a);
         // pst.setString(2,n);
          ResultSet rs = pst.executeQuery();
          int c=0;
          while(rs.next())
          {
          String p = rs.getString("idstudent");
          String b = rs.getString("studentname");  
  
 
           model.addRow(new Object[]{p,b});
           model.setValueAt(false,c,0);
      
      model.setValueAt(rs.getObject("idstudent"),c,1);
      model.setValueAt(rs.getObject("studentname"),c,2);
      c++;
    } 
          
    
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    //OBTAIN SELECTED ROW
    JButton btn=new JButton("Present");
    JButton btn1 = new JButton("Absent");
    btn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

        //GET SELECTED ROW
        for(int i=0;i<table.getRowCount();i++)
        {
          Boolean checked=Boolean.valueOf(table.getValueAt(i, 0).toString());
    
          String col="present";
          
          //DISPLAY
          if(checked)
          {
           try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;database=bios;user=sa;password=opk16168");
            String sql = "insert into attendence (date1,status,student_idstudent, student_subject_subjectid) values(?,?,?,?)";
            PreparedStatement pst =  con.prepareStatement(sql);
            Calendar cal = Calendar.getInstance(); 
             cal.getTime(); 
             SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss");
             SimpleDateFormat Date = new SimpleDateFormat("yyyy/MM/dd");
            pst.setString(1,Date.format(cal.getTime()));
            pst.setString(2, "Present");
            pst.setString(3,(table.getValueAt(i,1).toString()));
            pst.setString(4,a);
           // System.out.println(jLabel1.getText())
        pst.execute(); 
           }catch (Exception e ) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, e);
                                }
            JOptionPane.showMessageDialog(null, col);
          }
        }

      }
    });
    
    btn1.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

        //GET SELECTED ROW
        for(int i=0;i<table.getRowCount();i++)
        {
          Boolean checked=Boolean.valueOf(table.getValueAt(i, 0).toString());
    
          String col="absent";

          //DISPLAY
          if(!checked)
          {
           try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1434;database=bios;user=sa;password=opk16168");
            String sql = "insert into attendance (date1,status,student_idstudent, student_subject_subjectid) values(?,?,?,?)";
            PreparedStatement pst =  con.prepareStatement(sql);
            
           Calendar cal = Calendar.getInstance(); 
             cal.getTime(); 
             SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss");
             SimpleDateFormat Date = new SimpleDateFormat("yyyy/MM/dd");
            pst.setString(1,Date.format(cal.getTime()));
            pst.setString(2, "Absent");
            pst.setString(3,(table.getValueAt(i,1).toString()));
            pst.setString(4,a);
           // System.out.println(jLabel1.getText())
        pst.execute(); 
           }catch (Exception e ) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, e);
                                }
            JOptionPane.showMessageDialog(null, col);
          }
        }

      }
    });

    //ADD BUTTON TO FORM
    btn.setBounds(20,30,130,30);
    btn1.setBounds(150,30,130,30);
    getContentPane().add(btn);
    getContentPane().add(btn1);
  }

}