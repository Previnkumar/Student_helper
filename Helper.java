

package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Helper 
{
    public static void main(String[] args) 
    {
        PreparedStatement ps=null;
        Connection con;
        ResultSet rs;
        try
        {
           
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/", "root", ""); //no database is selected
          
           ps=con.prepareStatement("CREATE DATABASE IF NOT EXISTS helper");
           int Result=ps.executeUpdate(); // creating database if not exist

           con = DriverManager.getConnection("jdbc:mysql://localhost/helper", "root", ""); 
           //selecting databse for statement

           if(Result==0)
           {
               System.out.println("Databse Exist");
           }
           else if(Result==1)
           {
               System.out.println("Databse Created");
               System.out.println("Creatiing Table. . . . .");
               
               String user = "CREATE TABLE IF NOT EXISTS login (\n"
                   			+ "	USERNAME VARCHAR(32) PRIMARY KEY,\n"
                       		+ "	PASSWORD VARCHAR(32) NOT NULL,  \n"
                       		+ "	HINT VARCHAR(32) NOT NULL \n"
                       		+ ");";
                    ps=con.prepareStatement(user);
                    ps.execute();
                    System.out.println("LOGIN created");
                    
                      String staff = "CREATE TABLE IF NOT EXISTS staff (\n"
                    				+ "	 STAFFNAME varchar(32) PRIMARY KEY,\n"
                       				+ "	GENDER varchar(32)  NOT NULL,\n"
                       				+ "	DEPARTMENT varchar(32)  NOT NULL,\n"
                                	+ "	COLLEGE varchar(50)  NOT NULL,\n"
                                	+ "	BATCH varchar(32)  NOT NULL,\n"
                                	+ "	DESIGNATION varchar(50)  NOT NULL,\n"
                                	+ "	PHOTO longblob  NOT NULL\n"
                       				+ ");";
                    ps=con.prepareStatement(staff);
                    ps.execute();
                    System.out.println("staff created");
                    
                    
                  String semester = "CREATE TABLE IF NOT EXISTS semester (\n"
                    + "	 semesterno varchar(32) PRIMARY KEY,\n"
                       + "	sub1 varchar(32)  NOT NULL,\n"
                       + "	credit1 varchar(32)  NOT NULL,\n"
                            + "	sub2 varchar(32)  NOT NULL,\n"
                       + "	credit2 varchar(32)  NOT NULL,\n"
                            + "	sub3 varchar(32)  NOT NULL,\n"
                       + "	credit3 varchar(32)  NOT NULL,\n"
                            + "	sub4 varchar(32)  NOT NULL,\n"
                       + "	credit4 varchar(32)  NOT NULL,\n"
                            + "	sub5 varchar(32)  NOT NULL,\n"
                       + "	credit5 varchar(32)  NOT NULL,\n"
                            + "	sub6 varchar(32)  NOT NULL,\n"
                       + "	credit6 varchar(32)  NOT NULL,\n"
                            + "	sub7 varchar(32)  NOT NULL,\n"
                       + "	credit7 varchar(32)  NOT NULL,\n"
                            + "	sub8 varchar(32)  NOT NULL,\n"
                       + "	credit8 varchar(32)  NOT NULL,\n"
                            + "	sub9 varchar(32)  NOT NULL,\n"
                       + "	credit9 varchar(32)  NOT NULL\n"
                       + ");";
                    ps=con.prepareStatement(semester);
                    ps.execute();
                    System.out.println("semester created");
                    
               String profile = "CREATE TABLE IF NOT EXISTS profile (\n"
                    + "	REGNO varchar(32) PRIMARY KEY,\n"
                       + "	NAME varchar(50),  \n"
                       + "	ROLLNO varchar(32), \n"
                       + "	DEPARTMENT varchar(50),  \n"
                       + "	COLLEGE varchar(50),  \n"
                       + "	DATEOFBIRTH varchar(32),  \n"
                       + "	MOBILE varchar(32),  \n"
                       + "	MAIL varchar(32),  \n"
                       + "	ADDRESS varchar(200), \n"
                       + "	HOSDAY varchar(32),  \n"
                       + "	COUMAN varchar(32),  \n"
                       + "	FATHER varchar(32),  \n"
                       + "	MOTHER varchar(32),  \n"
                       + "	INCOME varchar(32),  \n"
                       + "	COMMUNITY varchar(32), \n"
                       + "	CASTE varchar(32),  \n"
                       + "	RELIGION varchar(32), \n"
                       + "	NATIONALITY varchar(32), \n"
                       + "	IMAGE longblob, \n"
                       + "	LATERAL varchar(32) \n"
                    + ");";
                    ps=con.prepareStatement(profile);
                    ps.execute();
                    System.out.println("profile created");
                    
               String tablename;
               for (int i=1; i<=8;i++){
                    tablename ="sem"+i;
                    String sem = "CREATE TABLE IF NOT EXISTS "+tablename+" (\n"
                    + "	RegisterNumber varchar(32) PRIMARY KEY,\n"
                    + "	sub1 varchar(32)  NOT NULL,\n"
                    + "	sub2 varchar(32)  NOT NULL,\n"
                            + "	sub3 varchar(32)  NOT NULL,\n"
                            + "	sub4 varchar(32)  NOT NULL,\n"
                            + "	sub5 varchar(32)  NOT NULL,\n"
                            + "	sub6 varchar(32)  NOT NULL,\n"
                            + "	sub7 varchar(32)  NOT NULL,\n"
                            + "	sub8 varchar(32)  NOT NULL,\n"
                            + "	sub9 varchar(32)  NOT NULL\n"
                    + ");";
                    ps=con.prepareStatement(sem);
                    ps.execute();
                    System.out.println(tablename+"created");
                }



         // Assign default grade points
          String sem1[]={"HS6151","4","MA6151","4","PH6151","3","CY6151","3","GE6151","3","GE6152","4","GE6161","2","GE6162","2","GE6163","1"};         
          String sem2[]={"HS6251","4","MA6251","4","PH6251","3","CY6251","3","CS6201","3","CS6202","3","GE6262","1","CS6211","2","CS6212","2"};
          String sem3[]={"MA6351","4","CS6301","3","CS6302","3","CS6303","3","CS6304","3","GE6351","3","CS6311","2","CS6312","2","NULL","0"};
          String sem4[]={"MA6453","4","CS6551","3","CS6401","3","CS6402","3","EC6504","3","CS6403","3","CS6411","2","CS6412","2","CS6413","2"};
          String sem5[]={"MA6566","4","CS6501","4","CS6502","3","CS6503","3","CS6504","3","CS6511","2","CS6512","2","CS6513","2","NULL","0"};
          String sem6[]={"CS6601","3","IT6601","3","CS6660","3","IT6502","4","CS6659","3","CS6611","2","CS6612","2","GE6674","2","CS6001","0"};
          String sem7[]={"CS6701","3","CS6702","3","CS6703","3","CS6704","3","CS6711","2","CS6712","2","EL2","3","EL3","3","NULL","0"};
          String sem8[]={"CS6801","3","CS6811","6","EL3","3","EL4","3","NULL","0","NULL","0","NULL","0","NULL","0","NULL","0"};
          String insert_maindb="INSERT INTO semester (semesterno,sub1,credit1,sub2,credit2,sub3,credit3,sub4,credit4,sub5,credit5,sub6,credit6,sub7,credit7,sub8,credit8,sub9,credit9) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
          ps=con.prepareStatement(insert_maindb);
          for(int i=1;i<9;i++)
           {
            String num=Integer.toString(i);
            ps.setString(1,num);
                   if(i==1)
                   {
                       for(int j=2;j<20;j++)
                       {
                            ps.setString(j,sem1[j-2]);
                       }
                   }
                   else if(i==2)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem2[j-2]);
                       }
                   }
                    else if(i==3)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem3[j-2]);
                       }
                   }
                    else if(i==4)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem4[j-2]);
                       }
                   }
                    else if(i==5)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem5[j-2]);
                       }
                   }
                    else if(i==6)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem6[j-2]);
                       }
                   }
                    else if(i==7)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem7[j-2]);
                       }
                   }
                    else if(i==8)
                   {
                       for(int j=2;j<20;j++)
                       {
                           ps.setString(j,sem8[j-2]);
                       }
                   }
                                       
              ps.execute();
           }                  
           
           }
            helper1 h1=new helper1();           
            h1.show();
            h1.starter();
        }
        catch(ClassNotFoundException | SQLException e)
        {
        JOptionPane.showMessageDialog(null,e+"\n"+"Check your server connection");
        }       
    }    
}
