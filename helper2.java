

package helper;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class helper2 extends javax.swing.JFrame{
       
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    String imgloc=null;
    String data[]=new String[20];
    String datas[][]=new String[50][50];
    String colname[]=new String[20];
    String h[]=new String [10];
    int point[]=new int[10];
    int credit[]=new int[10];
    String no="1";
    int checker=0;
    String choice="sem1";
    String item=null;
    float gpa[]=new float[150];
    float totcre=0;
    String selecteditem="1";
    String grades[]=new String[11];
    float gpas[][]=new float[10][150];
    float totalcredit[]=new float[9];
    float cgpa[][]=new float[10][150];
    float gpcredit=0,totcredit=0;
    String location=null;
    ArrayList name=new ArrayList() ;
    int confirmation=0;
    String path=null;
    String details[][]=new String[150][25];
    int count=1;
    int totalrecords=0;
    int currentrecord=0;
    Image newimage[][]=new Image[150][1];
    String nam[]=null;
    String mailid[]=null;   
      
    public helper2() 
    {       
       initComponents();
       this.setLocationRelativeTo(null);
       try
        {      
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/helper","root","");
      //    System.out.println("connected");       
        }
       catch(Exception e)
       {
            System.out.println(e);
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text9 = new javax.swing.JTextField();
        text8 = new javax.swing.JTextField();
        text11 = new javax.swing.JTextField();
        text10 = new javax.swing.JTextField();
        text12 = new javax.swing.JTextField();
        text16 = new javax.swing.JTextField();
        text13 = new javax.swing.JTextField();
        text15 = new javax.swing.JTextField();
        text14 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        text17 = new javax.swing.JTextField();
        text18 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lateral = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        a5 = new javax.swing.JTextField();
        a1 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        BSAVE = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        a4 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton27 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        c0 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel78 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        p3 = new javax.swing.JPasswordField();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        p5 = new javax.swing.JPasswordField();
        jLabel66 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        p6 = new javax.swing.JPasswordField();
        jButton43 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton17 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        t18 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        r2 = new javax.swing.JTextField();
        jButton44 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(754, 567));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(981, 577));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Hello..");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Welcome To Student Helper..");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Easy Click to Manage Records..");

        jButton30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton30.setText("Edit");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        jLabel80.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(249, 249, 249))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)))
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addGap(712, 712, 712)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel11, "card8");
        jPanel11.setVisible(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile1.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Name:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Register no:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Department:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Roll no:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Date of Birth:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("College:");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Mobile number:");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("Email ID:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Address:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("Counselling/Management:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Hostel/Dayscholar:");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("Mother's Name:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText("Father's Name:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setText("Annual Income:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText("Community:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("Caste:");

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton16.setText("Browse");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text1KeyPressed(evt);
            }
        });

        text2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text2KeyPressed(evt);
            }
        });

        text3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text3KeyPressed(evt);
            }
        });

        text4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text4KeyPressed(evt);
            }
        });

        text5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text5KeyPressed(evt);
            }
        });

        text7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text7KeyPressed(evt);
            }
        });

        text6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text6KeyPressed(evt);
            }
        });

        text9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text9KeyPressed(evt);
            }
        });

        text8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text8KeyPressed(evt);
            }
        });

        text11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text11KeyPressed(evt);
            }
        });

        text10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text10KeyPressed(evt);
            }
        });

        text12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text12KeyPressed(evt);
            }
        });

        text16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text16KeyPressed(evt);
            }
        });

        text13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text13KeyPressed(evt);
            }
        });

        text15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text15KeyPressed(evt);
            }
        });

        text14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text14ActionPerformed(evt);
            }
        });
        text14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text14KeyPressed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton18.setText("Save");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton19.setText("Clear All");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        text17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text17KeyPressed(evt);
            }
        });

        text18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        text18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text18KeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Religion:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Nationality:");

        lateral.setBackground(new java.awt.Color(102, 102, 255));
        lateral.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lateral.setText("LateralEntry");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addComponent(jLabel9))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(5, 5, 5)
                                .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(128, 128, 128)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lateral)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton16, jLabel9});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lateral))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jScrollPane1.setViewportView(jPanel6);
        jPanel5.setVisible(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        jPanel2.add(jPanel5, "card4");
        jPanel5.setVisible(false);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(981, 577));

        a5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a5.setAutoscrolls(false);
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a1.setAutoscrolls(false);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a3.setAutoscrolls(false);
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a2.setAutoscrolls(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Name:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Designation:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Department:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("College");

        jRadioButton3.setBackground(new java.awt.Color(102, 102, 255));
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Male");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(102, 102, 255));
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton4.setText("Female");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setText("Browse");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        BSAVE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BSAVE.setText("Save");
        BSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSAVEActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton14.setText("Clear");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile1.png"))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel61.setText("Batch:");

        a4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        a4.setAutoscrolls(false);

        B1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        B1.setText("Back");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        B2.setText("update");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Your profile info...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BSAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, "card2");
        jPanel3.setVisible(false);

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(981, 577));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEMESTER", "SUB1", "CREDIT1", "SUB2", "CREDIT2", "SUB3", "CREDIT3", "SUB4", "CREDIT4", "SUB5", "CREDIT5", "SUB6", "CREDIT6", "SUB7", "CREDIT7", "SUB8", "CREDIT8", "SUB9", "CREDIT9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(3);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
            jTable1.getColumnModel().getColumn(14).setResizable(false);
            jTable1.getColumnModel().getColumn(15).setResizable(false);
            jTable1.getColumnModel().getColumn(16).setResizable(false);
            jTable1.getColumnModel().getColumn(17).setResizable(false);
            jTable1.getColumnModel().getColumn(18).setResizable(false);
        }

        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton20.setText("Save");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel38.setText("NOTE: If there is any extra subject mentioned, kindly mention the subject as null and credit as 0");

        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton23.setText("Clear");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton24.setText("Cancel");

        jButton37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton37.setText("Print");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton20, jButton23, jButton24, jButton37});

        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton20, jButton23, jButton24, jButton37});

        jPanel2.add(jPanel9, "card6");
        jPanel9.setVisible(false);

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(981, 577));

        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton21.setText("View");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setText("Semester:");

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setText("Add/Edit Grades");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jPanel12.setLayout(new java.awt.CardLayout());

        jPanel13.setBackground(new java.awt.Color(102, 102, 255));

        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegisterNumber", "null", "null", "null", "null", "null", "null", "null", "null", "null", "GPA", "CGPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setAutoscrolls(false);
        jTable3.setColumnSelectionAllowed(true);
        jTable3.setRowHeight(35);
        jTable3.setRowMargin(3);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.setVerifyInputWhenFocusTarget(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable3MouseExited(evt);
            }
        });
        jTable3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable3PropertyChange(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(125);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
            jTable3.getColumnModel().getColumn(7).setResizable(false);
            jTable3.getColumnModel().getColumn(8).setResizable(false);
            jTable3.getColumnModel().getColumn(9).setResizable(false);
            jTable3.getColumnModel().getColumn(10).setResizable(false);
            jTable3.getColumnModel().getColumn(11).setResizable(false);
        }

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Double Click on a cell to update the record");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("Total Records:");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel72.setText("All Clear:");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel70.setText("Number Of Backlogs:");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel71.setText("View Details");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel70)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(309, 309, 309)))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel39, jLabel70, jLabel71, jLabel72, jTextField4, jTextField5, jTextField6});

        jPanel12.add(jPanel13, "card2");

        jPanel14.setBackground(new java.awt.Color(102, 102, 255));

        jTable4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegisterNumber", "null", "null", "null", "null", "null", "null", "null", "null", "null"
            }
        ));
        jTable4.setColumnSelectionAllowed(true);
        jTable4.setRowHeight(35);
        jTable4.setRowMargin(3);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.setVerifyInputWhenFocusTarget(false);
        jScrollPane6.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(6).setResizable(false);
            jTable4.getColumnModel().getColumn(7).setResizable(false);
            jTable4.getColumnModel().getColumn(8).setResizable(false);
            jTable4.getColumnModel().getColumn(9).setResizable(false);
        }

        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton26.setText("Insert");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton22.setText("Save");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton32.setText("Clear All");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton33.setText("Delete");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton38.setText("Import");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel30.setText("Grades for RegisterNumber added in student list only can be updated");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 19, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.add(jPanel14, "card3");

        jButton34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton34.setText("Print");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton36.setText("Export");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27)
                        .addGap(18, 18, 18)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton21, jButton27});

        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton36, jComboBox2, jLabel40});

        jPanel2.add(jPanel10, "card7");
        jPanel10.setVisible(false);

        jPanel15.setBackground(new java.awt.Color(102, 102, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(981, 577));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel75.setText("Select Name:");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        c0.setBackground(new java.awt.Color(102, 102, 255));
        c0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c0.setSelected(true);
        c0.setText("Default");
        c0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0ActionPerformed(evt);
            }
        });

        c1.setBackground(new java.awt.Color(102, 102, 255));
        c1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c1.setText("Custom");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jTable5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable5.setColumnSelectionAllowed(true);
        jTable5.setRowHeight(30);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
        }

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel76.setText("Recipient ID:");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel77.setText("Sender ID:");

        jButton35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton35.setText("Add to List");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel78.setText("Password:");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel79.setText("Subject:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane8.setViewportView(jTextArea1);

        jButton45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton45.setText("Delete");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton46.setText("Send Mail");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton47.setText("Clear All");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(c0, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField1, jTextField1, jTextField2});

        jPanel15Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton46, jButton47});

        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField1, jTextField1, jTextField2});

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton35, jButton45, jButton46, jButton47});

        jPanel2.add(jPanel15, "card9");
        jPanel15.setVisible(false);

        jPanel16.setBackground(new java.awt.Color(102, 102, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(981, 577));

        jPanel17.setBackground(new java.awt.Color(102, 102, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(51, 0, 153))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("New Password:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Old Password:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Retype New Password:");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel63.setText("Password Hint:");

        p4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        p1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        p2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        p3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton39.setText("Clear");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton40.setText("Update");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel17Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {p1, p2, p3, p4});

        jPanel18.setBackground(new java.awt.Color(102, 102, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Files", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(51, 0, 153))); // NOI18N

        jButton41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton41.setText("Export All");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton42.setText("Erase Data");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel64.setText("Store Everything in a Excel sheet");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel65.setText("Erase Total Records By Keeyping Your Account");

        p5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel66.setText("Enter Your Password:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton41, jButton42, p5});

        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(102, 102, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(51, 0, 153))); // NOI18N

        p6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton43.setText("Delete Account");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel67.setText("Enter Your Password:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel19Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel67, p6});

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.add(jPanel16, "card10");
        jPanel16.setVisible(false);

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(981, 577));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setRowHeight(35);
        jTable2.setRowMargin(3);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable2PropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("Semester");

        jRadioButton6.setBackground(new java.awt.Color(102, 102, 255));
        jRadioButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Semester Gally");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(102, 102, 255));
        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton7.setText("All");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton17.setText("Print");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton28.setText("Export");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7)
                        .addGap(56, 56, 56)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton17, jComboBox3, jLabel41, jRadioButton6, jRadioButton7});

        jPanel2.add(jPanel8, "card5");
        jPanel8.setVisible(false);

        jPanel7.setPreferredSize(new java.awt.Dimension(981, 577));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setText("Register no:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setText("Name:");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel43.setText("Roll no:");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel44.setText("Department:");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel45.setText("College:");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel46.setText("Date of Birth:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel47.setText("Mobile number:");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel48.setText("Email ID:");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel49.setText("Address:");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel50.setText("Hostel/Dayscholar:");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel51.setText("Counselling/Management:");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setText("Nationality:");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Religion:");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Caste:");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setText("Community:");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel57.setText("Annual Income:");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel58.setText("Mother's Name:");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel59.setText("Father's Name:");

        t18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t18.setToolTipText("");

        t17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t17.setToolTipText("");

        t16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t16.setToolTipText("");

        t15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t15.setToolTipText("");
        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });

        t14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        t7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel21.setBackground(new java.awt.Color(102, 102, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile1.png"))); // NOI18N

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton13.setText("Browse");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leftarrow.jpg"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        r1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel68.setText("RegisterNumber");

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rightarrow.jpg"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel69.setText("Name");

        r2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton44.setText("Search");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton29.setText("Update");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton31.setText("Delete");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 18, Short.MAX_VALUE)))
        );

        jPanel21Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton29, jButton31, jButton44, r1, r2});

        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(13, 13, 13)
                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 289, Short.MAX_VALUE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 287, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel35, jLabel42, jLabel43, jLabel44, jLabel45, jLabel46, jLabel47, jLabel48, jLabel49, jLabel50, jLabel51, jLabel52, jLabel53, jLabel54, jLabel55, jLabel57, jLabel58, jLabel59, t1, t10, t11, t12, t13, t14, t15, t16, t17, t18, t2, t3, t4, t5, t6, t7, t8, t9});

        jScrollPane5.setViewportView(jPanel4);
        jPanel4.setVisible(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        jScrollPane5.getVerticalScrollBar().setUnitIncrement(16);

        jPanel2.add(jPanel7, "card10");
        jPanel7.setVisible(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(102, 102, 255));
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setToolTipText("");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane9.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel20, "card11");

        jPanel22.setBackground(new java.awt.Color(102, 102, 255));

        jTable6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegisterNumber", "Name", "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Backlog Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable6.setColumnSelectionAllowed(true);
        jTable6.setRowHeight(35);
        jTable6.setRowMargin(3);
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTable6);
        jTable6.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(125);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
            jTable6.getColumnModel().getColumn(3).setResizable(false);
            jTable6.getColumnModel().getColumn(4).setResizable(false);
            jTable6.getColumnModel().getColumn(5).setResizable(false);
            jTable6.getColumnModel().getColumn(6).setResizable(false);
            jTable6.getColumnModel().getColumn(7).setResizable(false);
            jTable6.getColumnModel().getColumn(8).setResizable(false);
            jTable6.getColumnModel().getColumn(9).setResizable(false);
            jTable6.getColumnModel().getColumn(10).setResizable(false);
            jTable6.getColumnModel().getColumn(11).setResizable(false);
            jTable6.getColumnModel().getColumn(11).setPreferredWidth(100);
        }

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel73.setText("Semester:");

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel74.setText("Total Number Of Students With Backlogs:");

        jTextField7.setEditable(false);

        jButton48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton48.setText("Back");
        jButton48.setMaximumSize(new java.awt.Dimension(85, 31));
        jButton48.setMinimumSize(new java.awt.Dimension(85, 31));
        jButton48.setPreferredSize(new java.awt.Dimension(85, 31));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel22, "card12");
        jPanel22.setVisible(false);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 113, 999, 554));
        jPanel2.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("    Student helper");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 212, 84));

        jPanel32.setBackground(new java.awt.Color(0, 0, 102));
        jPanel32.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viewstud.jpg"))); // NOI18N
        jButton2.setText("Students List   ");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user_add.png"))); // NOI18N
        jButton3.setText("Add Students");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(300, 300));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/semester.jpg"))); // NOI18N
        jButton1.setText("Semester         ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.jpg"))); // NOI18N
        jButton6.setText("LogOut    ");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setMaximumSize(new java.awt.Dimension(145, 39));
        jButton6.setMinimumSize(new java.awt.Dimension(145, 39));
        jButton6.setPreferredSize(new java.awt.Dimension(145, 39));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mail.jpg"))); // NOI18N
        jButton4.setText("Send Mail     ");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings1.jpg"))); // NOI18N
        jButton5.setText("Settings         ");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.jpg"))); // NOI18N
        jButton7.setText("Help            ");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, -1, -1));

        jPanel33.setBackground(new java.awt.Color(0, 0, 102));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/manage.jpg"))); // NOI18N
        jButton10.setText("DB settings");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viewall.jpg"))); // NOI18N
        jButton9.setText("View All");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setMaximumSize(new java.awt.Dimension(99, 25));
        jButton9.setMinimumSize(new java.awt.Dimension(99, 25));
        jButton9.setPreferredSize(new java.awt.Dimension(99, 25));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.jpg"))); // NOI18N
        jButton8.setText(" Home          ");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setMaximumSize(new java.awt.Dimension(99, 25));
        jButton8.setMinimumSize(new java.awt.Dimension(99, 25));
        jButton8.setPreferredSize(new java.awt.Dimension(99, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/qiut1.jpg"))); // NOI18N
        jButton11.setText("Quit");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton11, jButton8, jButton9});

        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 13, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int sure=JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Warning",JOptionPane.YES_NO_OPTION);      
        if(sure==0) 
        {
            helper1 h1=new helper1();
            h1.starter();
            h1.show();
            this.dispose();
        }   
    }//GEN-LAST:event_jButton6ActionPerformed

    public void databasestarter()
    {
        String names[]=new String[20];
        try
        {
            ps=con.prepareStatement("select * from profile");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            while(rs.next())
            {
                for(int i=1;i<rsmd.getColumnCount();i++)
                {
                  names[i]=rs.getString(i);
                  name.add(names[i]);
                }                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void autocomplete(String txt,JTextField text)
    {
        String complete="";
        int start=txt.length();
        int last=txt.length();
        int a;
        for(a=0;a<name.size();a++)
        {
         if(name.get(a).toString().startsWith(txt))
                 {
                     complete=name.get(a).toString();
                     last=complete.length();
                     break;
                 }
        }
        if(last>start)
        {
            text.setText(complete);
            text.setCaretPosition(last);
            text.moveCaretPosition(start);
        }
    }
    
    

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    int sure=JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?","Warning",JOptionPane.YES_NO_OPTION);
    if(sure==0)
    { 
     exit(0);
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel9.setVisible(false);
       jPanel10.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel11.setVisible(false);
       jPanel15.setVisible(false);
       jPanel16.setVisible(false);
       jPanel22.setVisible(false);
       jPanel20.setVisible(true);
       jTextArea2.setText(null);
       try
       {
        InputStream ins=this.getClass().getResourceAsStream("/resources/help.docx");
        XWPFDocument doc = new XWPFDocument(ins);
        XWPFWordExtractor extract = new XWPFWordExtractor(doc);
        jTextArea2.append(extract.getText());
        jTextArea2.setCaretPosition(0);
//System.out.println(extract.getText());    
       }
       catch (Exception ex) 
       {
           System.out.println(ex);
       } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel22.setVisible(false);
        jPanel5.setVisible(false);
        jPanel3.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel9.setVisible(false);
        jPanel8.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
        jPanel7.setVisible(true);
        jPanel20.setVisible(false);
        jPanel4.setVisible(true);
          jScrollPane5.getVerticalScrollBar().setValue(0);
        getdata();
        setdata();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setdata()
    {
       r2.setText(details[currentrecord][2]);
       r1.setText(details[currentrecord][1]);
        t1.setText(details[currentrecord][1]);
         t2.setText(details[currentrecord][2]);
          t3.setText(details[currentrecord][3]);
           t4.setText(details[currentrecord][4]);
            t5.setText(details[currentrecord][5]);
             t6.setText(details[currentrecord][6]);
              t7.setText(details[currentrecord][7]);
               t8.setText(details[currentrecord][8]);
                t9.setText(details[currentrecord][9]);
                 t10.setText(details[currentrecord][10]);
                  t11.setText(details[currentrecord][11]);
                   t12.setText(details[currentrecord][12]);
                    t13.setText(details[currentrecord][13]);
                     t14.setText(details[currentrecord][14]);
                      t15.setText(details[currentrecord][15]);
                       t16.setText(details[currentrecord][16]);
                        t17.setText(details[currentrecord][17]);
                         t18.setText(details[currentrecord][18]);
                         ImageIcon imageicon=new ImageIcon(fitimage(newimage[currentrecord][0],jLabel60.getWidth(),jLabel60.getHeight())); 
                         jLabel60.setIcon(imageicon);
    }
    
    public void getdata()
    {
        int i=0;  
        try
        {        
            InputStream imagedata;
            ps=con.prepareStatement("Select * from profile order by REGNO");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();          
            while(rs.next())
            {
                for(int j=1;j<rsmd.getColumnCount();j++)
                {
                  if(j==rsmd.getColumnCount()-1)
                    {                      
                     imagedata= rs.getBinaryStream(j);            
                     newimage[i][0]=ImageIO.read(imagedata);
                    }
                    else
                    {
                        details[i][j]=rs.getString(j);
                    }
                }
                i++;
            }
            totalrecords=i;
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Image bi;
        try
        {
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File f=jfc.getSelectedFile();
            path=f.getAbsolutePath();
            bi=ImageIO.read(f);
            ImageIcon imageicon=new ImageIcon(fitimage(bi,jLabel2.getWidth(),jLabel2.getHeight()));
            jLabel2.setIcon(imageicon);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel22.setVisible(false);
        jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel9.setVisible(false);
       jPanel10.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel11.setVisible(false);
       jPanel15.setVisible(true);
       jPanel16.setVisible(false);
       jPanel20.setVisible(false);
       initiatemailing();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void initiatemailing()
    {
        try
        {
            jComboBox1.removeAllItems();
            nam=null;
            mailid=null;
            
            ps=con.prepareStatement("Select NAME,MAIL from profile");
            rs=ps.executeQuery();            
            nam=new String[150];
            mailid=new String[150];
            int i=0;
            while(rs.next())
            {               
                nam[i]=rs.getString("NAME");
                mailid[i]=rs.getString("MAIL");                
                i++;
            }
            for(int j=0;j<i;j++)
            {             
            jComboBox1.addItem(nam[j]);
            }
            jTextField1.setText(mailid[0]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void initiate()
    {
        String getdata[]=new String[10];
        try
        {
            ps=con.prepareStatement("select STAFFNAME, GENDER, DEPARTMENT, BATCH, PHOTO , COLLEGE from staff");
            rs=ps.executeQuery();          
            if(rs.next())
            {
            jPanel11.setVisible(true); 
            B1.setVisible(true);
            B2.setVisible(true);
            BSAVE.setVisible(false);
            jButton30.setVisible(true);
            for(int i=1;i<=6;i++)
            {
               if(i!=5)
               {
               getdata[i]=rs.getString(i);
               }
               else
               {
               InputStream is=rs.getBinaryStream(5);
               Image  photo=ImageIO.read(is);
               ImageIcon imageicon=new ImageIcon(fitimage(photo,jLabel3.getWidth(),jLabel3.getHeight())); 
               jLabel3.setIcon(imageicon);
               }
            }
            if(getdata[2].equals("MALE"))
            {
              jLabel6.setText("Mr. "+getdata[1]);
            }
            else if(getdata[2].equals("FEMALE"))
            {
              jLabel6.setText("Mrs. "+getdata[1]);
            }
              
              jLabel80.setText(getdata[3]);   
              jLabel8.setText(getdata[4]);
              jLabel56.setText(getdata[6]);
              jPanel3.setVisible(false);
              jPanel8.setVisible(false);
              jPanel9.setVisible(false);
              jPanel10.setVisible(false);
              jPanel5.setVisible(false);
              jPanel7.setVisible(false);
              jPanel15.setVisible(false);
              jPanel16.setVisible(false);
              jPanel20.setVisible(false);
              jPanel22.setVisible(false);
              
            }
            else
            {
             jPanel20.setVisible(false);
             jPanel22.setVisible(false);
             jPanel3.setVisible(true);
             jPanel8.setVisible(false);
             jPanel9.setVisible(false);
             jPanel10.setVisible(false);
             jPanel15.setVisible(false);
             jPanel16.setVisible(false);
             jPanel5.setVisible(false);
             jPanel7.setVisible(false);
             jPanel11.setVisible(false);
             B1.setVisible(false);
             B2.setVisible(false);
             BSAVE.setVisible(true);
             jButton30.setVisible(false);
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       initiate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Image bi;
        try
        {
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File f=jfc.getSelectedFile();
            imgloc=f.getAbsolutePath();          
            bi=ImageIO.read(f);
            ImageIcon imageicon=new ImageIcon(fitimage(bi,jLabel9.getWidth(),jLabel9.getHeight()));
            jLabel9.setIcon(imageicon);    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }      
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        addprofile();
        jScrollPane1.getVerticalScrollBar().setValue(0);
        databasestarter();  
    }//GEN-LAST:event_jButton18ActionPerformed

    public void addprofile()
    {
         try
         {
             InputStream is;
             File pic;
             if(imgloc==null)
             { 
                 is=this.getClass().getResourceAsStream("/resources/profile1.png");                 
             }
             else
             {
                 pic=new File(imgloc);
                 is=new FileInputStream(pic);      
             }
             String ltrl;
            if(lateral.isSelected())
            {
               ltrl="yes";
            }
            else
            {
                ltrl="no";
            }
                
          ps=con.prepareStatement("insert into profile (REGNO,NAME,ROLLNO,DEPARTMENT,COLLEGE,DATEOFBIRTH,MOBILE,MAIL,ADDRESS,HOSDAY,COUMAN,FATHER,MOTHER,INCOME,COMMUNITY,CASTE,RELIGION,NATIONALITY,IMAGE,LATERAL) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          
          ps.setString(1,text1.getText().toString());
          ps.setString(2,text2.getText().toString());
          ps.setString(3,text3.getText().toString());
          ps.setString(4,text4.getText().toString());
          ps.setString(5,text5.getText().toString());
          ps.setString(6,text6.getText().toString());
          ps.setString(7,text7.getText().toString());
          ps.setString(8,text8.getText().toString());
          ps.setString(9,text9.getText().toString());
          ps.setString(10,text10.getText().toString());
          ps.setString(11,text11.getText().toString());
          ps.setString(12,text12.getText().toString());
          ps.setString(13,text13.getText().toString());
          ps.setString(14,text14.getText().toString());
          ps.setString(15,text15.getText().toString());
          ps.setString(16,text15.getText().toString());
          ps.setString(17,text16.getText().toString());
          ps.setString(18,text17.getText().toString());
          ps.setBinaryStream(19,is );
          ps.setString(20, ltrl);
          int r= ps.executeUpdate();
          if(r!=0)
          {
            JOptionPane.showMessageDialog(null,"Added Successfully");
          }
          else
          {
             JOptionPane.showMessageDialog(null,"Something Went Wrong");
          }

         for(int sem=1;sem<9;sem++)
         {         
          ps=con.prepareStatement("insert into sem"+sem+" (RegisterNumber,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9) values(?,0,0,0,0,0,0,0,0,0)");          
          ps.setString(1, text1.getText().toString());
          ps.executeUpdate();
         }  
         }
         catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex)
         {
             JOptionPane.showMessageDialog(null,"Duplicate Entry Exists"+"\n"+ex,null,JOptionPane.ERROR_MESSAGE);
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
         
 
            Image bi=null;
            
            try 
            {                              
             InputStream  is1=this.getClass().getResourceAsStream("/resources/profile1.png");             
             bi = ImageIO.read(is1);
            }
            catch (IOException ex) 
            {
                Logger.getLogger(helper2.class.getName()).log(Level.SEVERE, null, ex);
            } 
            ImageIcon imageicon=new ImageIcon(fitimage(bi,jLabel9.getWidth(),jLabel9.getHeight()));
            jLabel9.setIcon(imageicon);
            
             imgloc=null;
             text1.setText(null);
             text2.setText(null);
             text3.setText(null);
             text4.setText(null);
             text5.setText(null);
             text6.setText(null);
             text7.setText(null);
             text8.setText(null);
             text9.setText(null);
             text10.setText(null);
             text11.setText(null);
             text12.setText(null);
             text13.setText(null);
             text14.setText(null);
             text15.setText(null);
             text15.setText(null);
             text16.setText(null);
             text17.setText(null);
             text18.setText(null);
             lateral.setSelected(false);
    }
    
   
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
text1.setText("");
text2.setText("");
text3.setText("");
text4.setText("");
text5.setText("");
text6.setText("");
text7.setText("");
text8.setText("");
text9.setText("");
text10.setText("");
text11.setText("");
text12.setText("");
text13.setText("");
text14.setText("");
text15.setText("");
text15.setText("");
text16.setText("");
text17.setText("");
lateral.setSelected(false);
jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jButton19ActionPerformed
    
   /* public void check()
    {
        if(checker==0)
        {
            gettotalcreditsforeachsem();
            checker=1;
        }
    }*/
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel20.setVisible(false);
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
        jPanel3.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
        jPanel11.setVisible(false);
        jPanel8.setVisible(true);  
        jPanel22.setVisible(false);
        jRadioButton6.setSelected(true);
        jRadioButton7.setSelected(false);
        jComboBox3.setSelectedItem("1");
//        check();
        empty();
        reginit();
        semgally();
        clearforlateral();
        if(Integer.parseInt(jComboBox3.getSelectedItem().toString())>2)
        {
            cgpaforsemlateral();
        }
       jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
       TableColumnAdjuster tcm=new TableColumnAdjuster(jTable2); 
       tcm.adjustColumns();
     
    }//GEN-LAST:event_jButton9ActionPerformed

    public void cgpaforsemlateral()
    {
        try
        {
            String lateralreg[]=new String[150];
            ps=con.prepareStatement("select REGNO from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
            for(int i=0;i<jTable2.getRowCount();i++)
            {
                for(int j=0;j<u;j++)
                {
                    if(jTable2.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {
                             //assign(i,jTable2);
                             //getcredit(jComboBox3.getSelectedItem().toString());
                             //calculate(i,jTable2);   
                             gpainitforlateral(jComboBox3.getSelectedItem().toString());       
                             lcgpa(jTable2,jComboBox3.getSelectedItem().toString(),10);
                    }
                }
            }                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
    public void clearforlateral()
    {
        try
        {
            DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
            String lateralreg[]=new String[150];           
            ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
        for(int i=0;i<dtm.getRowCount();i++)
        {
         for(int j=0;j<u;j++)
           {
             if(dtm.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {
                        String seme=jComboBox3.getSelectedItem().toString();
                        dtm.setValueAt("", i, 10);
                        for(int k=0;k<Integer.parseInt(seme);k++)
                        {
                            if(k<2)
                            {
                        dtm.setValueAt("LE", i, k+2);                     
                            }
                        }
                    }
           }        
        }        
        }
        catch(SQLException | NumberFormatException e)
        {
            System.out.println(e);
        }
    }
    public void fillbottom()
    {
        int all_clear=0;
        int backlog=0;
        int indicator=0;
        jTextField4.setText(Integer.toString(jTable3.getRowCount()));
        DefaultTableModel dtm=(DefaultTableModel) jTable3.getModel();
        
        for(int i=0;i<dtm.getRowCount();i++)
        {
            for(int j=0;j<dtm.getColumnCount();j++)
            {
                if(!(dtm.getValueAt(i,j).equals("U")))
                {
                   indicator=0;
                }
                else
                {
                    indicator=1;
                    break;
                }
                
            }
            if(indicator==0)
            {
                all_clear++;
            }
            else
            {
                backlog++;
            }
            indicator=0;
        }     
        jTextField6.setText(Integer.toString(all_clear));
        jTextField5.setText(Integer.toString(backlog));
    }
    
    
    
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
       dtm.setRowCount(0);
       jPanel22.setVisible(false);
       jPanel15.setVisible(false);
       jPanel16.setVisible(false);
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel9.setVisible(true);
       jPanel10.setVisible(false);
       jPanel11.setVisible(false);
       jPanel20.setVisible(false);
       loaddefault();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void loaddefault(){
        try
        {
            ps=con.prepareStatement("select * from semester");
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            if (!rs.isBeforeFirst() ) 
            {
                for(int i=1;i<=8;i++) 
                {
                    ps=con.prepareStatement("insert into semester (semesterno,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9) values (?,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
                    ps.setString(1, Integer.toString(i));
                    ps.executeUpdate();
                }
                dtm.setRowCount(8);
                dtm.setValueAt(1,0,0);
                 dtm.setValueAt(2,1,0);
                   dtm.setValueAt(3,2,0);
                     dtm.setValueAt(4,3,0);
                       dtm.setValueAt(5,4,0);
                         dtm.setValueAt(6,5,0);
                           dtm.setValueAt(7,6,0);
                             dtm.setValueAt(8,7,0);
          
            } 
            else            
            {
                while(rs.next())
                {
                    Object [] rowData = new Object[rsmd.getColumnCount()];
                    for ( int i = 0; i < rowData.length; i++)
                    {
                        rowData[i] = rs.getObject(i+1);
                    }
                    dtm.addRow(rowData);
                }               
            }                            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
 int rowcount=jTable1.getRowCount();
 int columncount=jTable1.getColumnCount();
 String data1[][]=new String[rowcount][columncount];
 if (jTable1.isEditing())
     jTable1.getCellEditor().stopCellEditing();
 int success=0;
 for(int u=0;u<rowcount;u++)
 {
    try
    {
        ps=con.prepareStatement("update semester set sub1=?,credit1=?,sub2=?,credit2=?,sub3=?,credit3=?,sub4=?,credit4=?,sub5=?,credit5=?,sub6=?,credit6=?,sub7=?,credit7=?,sub8=?,credit8=?,sub9=?,credit9=? where semesterno=?");
        for(int j=0;j<columncount;j++)
        {        
            if(j!=0)
            {
                if(jTable1.getValueAt(u,j)==null||jTable1.getValueAt(u,j).toString().isEmpty()||jTable1.getValueAt(u, j).toString().trim().length() == 0)
                {
                 ps.setString(j,Integer.toString(0));
                }
                else
                {
                     data1[u][j]=jTable1.getValueAt(u,j).toString();             
                     ps.setString(j,data1[u][j]);  
                }
            }
            else
            {
            ps.setString(19,Integer.toString(u+1));           
            }
        }
       int r=  ps.executeUpdate();
       if(r!=0)
       {
          success++;
       }
    }
   catch(Exception e)
   {
      System.out.println(e);  
   }
}
if(success==8)
{
    JOptionPane.showMessageDialog(null, "Updated Successfully");
}
 DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
              dtm.setRowCount(8);
               dtm.setValueAt(1,0,0);
                 dtm.setValueAt(2,1,0);
                   dtm.setValueAt(3,2,0);
                     dtm.setValueAt(4,3,0);
                       dtm.setValueAt(5,4,0);
                         dtm.setValueAt(6,5,0);
                           dtm.setValueAt(7,6,0);
                             dtm.setValueAt(8,7,0);
  //gettotalcreditsforeachsem();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
       int a=1;
       for(int i=0;i<jTable1.getRowCount();i++)
       {
           for(int j=0;j<jTable1.getColumnCount();j++)
           {
               String s=Integer.toString(a);
               if(j==0)
               {
                dtm.setValueAt((Object)s, i, j);
                a++;
               }
                else
               {
                   dtm.setValueAt(null, i, j);
               }
           }
       }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jPanel20.setVisible(false);    
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel22.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel9.setVisible(false);
       jPanel11.setVisible(false);
       jPanel15.setVisible(false);
       jPanel16.setVisible(false);
       jPanel10.setVisible(true);
       jPanel13.setVisible(true);
       jPanel14.setVisible(false);
          jComboBox2.setSelectedItem("1");
        visit(jTable3);
        if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>2)
        {
            cleargpacgpa(jTable3);
           addlaterals(jTable3);
        }
        else
        {
            clearlateral(jTable3);   
        }
            fillbottom();
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
  
    
    int lateralchecker=0;
    private void addlaterals(JTable table)
    {
        try
        {
            String lateralreg[]=new String[150];
            ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
            for(int i=0;i<table.getRowCount();i++)
            {
                for(int j=0;j<u;j++)
                {
                    if(table.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {
                            // assign(i,table);
                             //getcredit(jComboBox2.getSelectedItem().toString());
                             //calculate(i,table);   
                             gpainitforlateral(jComboBox2.getSelectedItem().toString());
                                    // if(lateralchecker==0)
                                      //    {
                                          //   gettotalcreditsforlateral();
                                        //     lateralchecker=1;
                                           //}    
                                     //gettotalcreditsforlateral();
                                     lcgpa(jTable3,jComboBox2.getSelectedItem().toString(),11);
                    }
                }
            }                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
public void lcgpa(JTable table,String num,int columncount)
{
   
    try    
    {
        String lateralreg[]=new String[150];
        ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
        ps.setString(1,"yes");
        rs=ps.executeQuery();
        int u=0;
        while(rs.next())
        {
                lateralreg[u]=rs.getString(1);
                u++;
        }
  for(int j=0;j<table.getRowCount();j++)
    {        
        for(int a=0;a<u;a++)
        {
          if(table.getValueAt(j,0).toString().equals(lateralreg[a]))
                    {           
                        gpcredit=0;        
                        totcredit=0;
                        for(int i=3;i<=Integer.parseInt(num);i++)        
                        {      
                            gpcredit=gpcredit+lgpas[i-3][j]*lfinalcredits[i-3][j];
                            totcredit=totcredit+lfinalcredits[i-3][j];
                            if(i==Integer.parseInt(num))
                            {
                                cgpa[i][j]=gpcredit/totcredit;
                                DecimalFormat f = new DecimalFormat("##.00");
                                table.setValueAt(f.format(cgpa[i][j]),j,columncount);
                            }
                            else
                            {
                                table.setValueAt(0, j, columncount);
                            }
                        }
                    }
        }
    } 
}

catch(Exception e)
{
    System.out.println(e);
}
}
    float ltotalcredit[]=new float[8];
    public void gettotalcreditsforlateral()
    {
         for(int i=3;i<=8;i++)
         {
            float ans=0;
            for(int j=0;j<10;j++)
            {
                getcredit(Integer.toString(i));
                ans=ans+credit[j];
            }
            ltotalcredit[i]=ans;
         }
    }
    float lgpa[]=new float[150];   
    float lgpas[][]=new float[10][150];
    
    
    Float lfinalcredits[][]=new Float[8][150];
    public void gpainitforlateral(String num)
    {  
       String temp[]=new String[11];   
        for(int sem=3;sem<=Integer.parseInt(num);sem++)
        {
            int k=0;
          
            getcredit(Integer.toString(sem));
            try
            {           
                ps=con.prepareStatement("select * from sem"+sem+" order by RegisterNumber");
                rs=ps.executeQuery();
                
                 while(rs.next())
                 {
                       for(int j=1;j<=10;j++)
                        {       
                            temp[j]=rs.getString(j);
                            if(j!=1)
                            {
                                grades[j-2]=temp[j];
                                if(grades[j-2]==null)
                                {
                                    point[j-2]=0;   
                                }
                                else
                                {
                                    assignpoint(grades[j-2], j-2);
                                }
                               
                                
                            }
                       }
                       lfinalcredits[sem-3][k]=lcalculatecorrespondingcredits(Integer.parseInt(num),sem);  
                       lgpa[k]=calculategpa(k);     
                       lgpas[sem-3][k]=lgpa[k];
                       //System.out.println(finalcredits[sem][k]+"...."+sem+"...."+k);
                       //System.out.println("i am reached");
                       k++;
                }
               
            } 
            catch(Exception e)
            {
                 System.out.println(e);
            }
        }
    }
    
    public float lcalculatecorrespondingcredits(int num,int sem)
{
    //System.out.println("i am running");
    float totalcreditsofhim=0;
    try
    {
        PreparedStatement pst;
       ResultSet rst;
       
       
            pst=con.prepareCall("select credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9 from semester where semesterno=?");
            pst.setString(1, Integer.toString(sem));
            rst=pst.executeQuery();
            ResultSetMetaData rsmd=rst.getMetaData();
            
            while(rst.next())
            {
                for(int counters=0;counters<rsmd.getColumnCount();counters++)
                {
               // System.out.println("point"+point[counters]);
                String cre=rst.getString(counters+1);
                if(point[counters]!=0)
                {
                   // System.out.println(rsmd.getColumnCount());
                totalcreditsofhim=totalcreditsofhim+Float.parseFloat(cre);
                }
                else
                {
                    totalcreditsofhim=totalcreditsofhim+0;
                }
                
                }
            
        }
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    //System.out.println(totalcreditsofhim+"hello");
    return totalcreditsofhim;
}
    
    
   public void cleargpacgpa(JTable table)
   {
       try
        {
            String lateralreg[]=new String[150];
            DefaultTableModel dtm=(DefaultTableModel) table.getModel();
            ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
            for(int i=0;i<table.getRowCount();i++)
            {
                for(int j=0;j<u;j++)
                {
                    if(table.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {       
                        dtm.setValueAt("", i, 11);
                        //dtm.setValueAt("", i, 10);   
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
   }
    
    public void clearlateral(JTable table)
    {
        try
        {
            String lateralreg[]=new String[150];
            DefaultTableModel dtm=(DefaultTableModel) table.getModel();
            ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
        for(int i=0;i<table.getRowCount();i++)
        {
         for(int j=0;j<u;j++)
         {
             if(table.getValueAt(i,0).toString().equals(lateralreg[j]))
             {
                 for(int k=1;k<dtm.getColumnCount();k++)
                 {
                     dtm.setValueAt("LE", i, k);
                 }
             }
         }
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
   
    public void visit(JTable table)
    {

       DefaultTableModel dtm=(DefaultTableModel) table.getModel();
       dtm.setRowCount(0);
       initialize(table);
       
       gpainit(no);
//       check();
       cgpa(table,no,11);
       gpa(table,Integer.parseInt(no),10);
    }
    
    
  

    
    private void initialize(JTable table)
    {         
     
        JTableHeader th=table.getTableHeader();
        TableColumnModel tcm=th.getColumnModel();
        String colname[]=new String[20];
        Object [] rowData = new Object[10];
        int i=0;
        String col[]=new String[9];
        try
        {
            System.out.println(no);
            ps=con.prepareStatement("select sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9 from semester where semesterno=?");          
            ps.setString(1,no);        
            rs=ps.executeQuery();
            while(rs.next())
            {
                for(i=0;i<9;i++)
                {
                    col[i]=rs.getString(i+1);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(i=0;i<9;i++)
        {
            TableColumn cm=tcm.getColumn(i+1);
            cm.setHeaderValue(col[i]);
            th.repaint();
        }
        if(table.equals(jTable3))
        {
            DefaultTableModel dtm=(DefaultTableModel) table.getModel();
            try
            {
                ps=con.prepareStatement("select * from "+choice+" order by RegisterNumber");       
                rs=ps.executeQuery();
                while(rs.next())
                {
                    for (  i = 0; i < rowData.length; i++)
                    {
                        rowData[i] = rs.getObject(i+1);                   
                    }
                    dtm.addRow(rowData);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
        
        for( i=0;i<10;i++)
        {
            for(int j=0;j<150;j++)
            {
                gpas[i][j]=0;
                cgpa[i][j]=0;
                gpcredit=0;
                totcredit=0;
                rowData[i]=0;  
            }
        }
       
    }
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
     
        item=jComboBox2.getSelectedItem().toString();    
        if(item.equals("1"))
        {
             choice="sem1";
             no="1";
        }
        else if(item.equals("2"))
        {
             choice="sem2";
             no="2";
        }
       else if(item.equals("3"))
        {
             choice="sem3";
             no="3";
        }
        else if(item.equals("4"))
        {
             choice="sem4";  
             no="4";
        }
        else if(item.equals("5"))
        {
             choice="sem5";
             no="5";
        }
        else if(item.equals("6"))
        {
             choice="sem6";
             no="6";
        }
        else if(item.equals("7"))
        {
             choice="sem7";
             no="7";
        }
        else
        {  
             choice="sem8";
             no="8";
        }
     
        if(jPanel13.isVisible())
        {
            clear(jTable3);
            initialize(jTable3); 
            
        }
        else if(jPanel14.isVisible())
        {
            initialize(jTable4); 
        }
        gpainit(no);
        cgpa(jTable3,no,11); 
        if(jPanel13.isVisible())
        {
            gpa(jTable3,Integer.parseInt(no),10);
        }
        if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>2)
        {
            cleargpacgpa(jTable3);
            addlaterals(jTable3);
        }
        else
        {
            clearlateral(jTable3);   
        }
        fillbottom();
    
    }//GEN-LAST:event_jComboBox2ActionPerformed

      private void clear(JTable table){
      DefaultTableModel dtm=(DefaultTableModel) table.getModel();
      dtm.setRowCount(0);
  } 
    
public void cgpa(JTable table,String num,int columncount)
{
    for(int j=0;j<table.getRowCount();j++)
    {
        gpcredit=0;
        totcredit=0;
        for(int i=1;i<=Integer.parseInt(num);i++)
        {             
            gpcredit=gpcredit+gpas[i][j]*finalcredits[i][j];
            totcredit=totcredit+finalcredits[i][j];
                 if(i==Integer.parseInt(num))
                 {
                    cgpa[i][j]=gpcredit/totcredit;
                    DecimalFormat f = new DecimalFormat("##.00");
                    table.setValueAt(f.format(cgpa[i][j]),j,columncount);
                 }
                 else
                 {
                     table.setValueAt(0, j, columncount);
                 }
        }
       
    } 
   
}
  Float finalcredits[][]=new Float[8][150];
    public void gpainit(String num)
    {
    String temp[]=new String[11];   
        for(int sem=1;sem<=Integer.parseInt(num);sem++)
        {
            int k=0;
          
            getcredit(Integer.toString(sem));
            try
            {           
                ps=con.prepareStatement("select * from sem"+sem+" order by RegisterNumber");
                rs=ps.executeQuery();
                
                 while(rs.next())
                 {
                       for(int j=1;j<=10;j++)
                        {       
                            temp[j]=rs.getString(j);
                            if(j!=1)
                            {
                                grades[j-2]=temp[j];
                                if(grades[j-2]==null)
                                {
                                    point[j-2]=0;   
                                }
                                else
                                {
                                    assignpoint(grades[j-2], j-2);
                                }
                               
                                
                            }
                       }
                       finalcredits[sem][k]=calculatecorrespondingcredits(Integer.parseInt(num),sem);  
                       gpa[k]=calculategpa(k);     
                       gpas[sem][k]=gpa[k];
                       //System.out.println(gpas[sem][k]+"...."+sem+"...."+k);
                       //System.out.println("i am reached");
                       k++;
                }
               
            } 
            catch(Exception e)
            {
                 System.out.println(e);
            }
        }
}
 
public float calculatecorrespondingcredits(int num,int sem)
{
    //System.out.println("i am running");
    float totalcreditsofhim=0;
    try
    {
        PreparedStatement pst;
       ResultSet rst;
       
       
            pst=con.prepareCall("select credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9 from semester where semesterno=?");
            pst.setString(1, Integer.toString(sem));
            rst=pst.executeQuery();
            ResultSetMetaData rsmd=rst.getMetaData();
            
            while(rst.next())
            {
                for(int counters=0;counters<rsmd.getColumnCount();counters++)
                {
              //  System.out.println("point"+point[counters]);
                String cre=rst.getString(counters+1);
                if(point[counters]!=0)
                {
                   // System.out.println(rsmd.getColumnCount());
                totalcreditsofhim=totalcreditsofhim+Float.parseFloat(cre);
                }
                else
                {
                    totalcreditsofhim=totalcreditsofhim+0;
                }
                
                }
            
        }
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    //System.out.println(totalcreditsofhim+"hello");
    return totalcreditsofhim;
}
    
public void assignpoint(String h,int j)
{
  
    if(h.equals("S"))
    {
        point[j]=10; 
    }
    else if(h.equals("A"))
    {
        point[j]=9;
    }
    else if(h.equals("B"))
    {
        point[j]=8;
    } 
    else if(h.equals("C"))
    {
        point[j]=7;
    }
    else if(h.equals("D"))
    {
        point[j]=6;
    }
    else if(h.equals("E"))
    {
        point[j]=5;
    }
    else if(h.equals("U"))
    {
        point[j]=0;
    }
    else
    {
        point[j]=0;
    }

   
}

public  float calculategpa(int i)
{    
    float tot=0;
    totcre=0;
    float gpa;
    
    for(int j=0;j<9;j++)
    {
        if(point[j]!=0)
        {
        tot=tot+point[j]*credit[j];
        totcre=totcre+credit[j];
        }
        else
        {
            tot=tot+0;
            totcre=totcre+0;
        }
        
    }
    //System.out.println("tot/totcre"+tot+",,,,"+totcre);
      for(int ij=0;ij<point.length;ij++)
    {
        point[ij]=0;
    }
    if(totcre!=0.0)
    {
        
    gpa=tot/totcre;
    DecimalFormat f = new DecimalFormat("##.00");
    return Float.parseFloat(f.format(gpa));
    }
    else
    {
    return 0;
    }
  
    
    
}
    
    
    public void gpa(JTable table,int sem,int column)
    { 
        for(int i=0;i<table.getRowCount();i++)
        {
        /*    assign(i,table);
            getcredit(no);
            calculate(i,table); */
            table.setValueAt(gpas[sem][i], i, column);
        }
    }
    
    public void calculate(int i,JTable table)
    {
        float sum=0;
        float totalcredits=0;
        float gpa=(float) 0;
        
        for(int j=0;j<10;j++)
        {   
            if(point[j]!=0) 
            {
            sum=sum+(point[j]*credit[j]);
            totalcredits=totalcredits+credit[j]; 
            }
        }
       // System.out.println(sum+"..."+i);
        //System.out.println(totalcredits);
        gpa=sum/totalcredits;
        
        DecimalFormat f = new DecimalFormat("##.00");        
        if(gpa!=0)
        {
             table.setValueAt(f.format(gpa), i, 10);  
        }
        else
        {
             table.setValueAt(0, i, 10); 
        }
    }
    
    String cred[]=new String[10];
  public void getcredit(String num)
  {
      try
      {
          ps=con.prepareStatement("Select credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9 from semester where semesterno=?");
          ps.setString(1, num);
          rs=ps.executeQuery();
         
          while(rs.next())
          {
              for(int v=0;v<9;v++)
              {
                    cred[v]=rs.getString(v+1);
                    credit[v]=Integer.parseInt(cred[v]); 
              }
          }
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
  }
   
  

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
                 if (jTable4.isEditing())
                 {
                     jTable4.getCellEditor().stopCellEditing();
                 }
                 
        DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
        int i=dtm.getRowCount();
        for(int j=i-1;j>=0;j--)
        {    
            if(!(jTable4.getValueAt(j, 0) != null 
            && jTable4.getValueAt(j, 0).toString().trim().length() != 0) )
            {
               dtm.removeRow(j);
            }
        }
        converttocaps(jTable4);
        int block=0;
        try
        {
            if(Integer.parseInt(jComboBox2.getSelectedItem().toString())<3)
            {
                for(int x=0;x<jTable4.getRowCount();x++)
                {
                    ps=con.prepareStatement("select LATERAL from profile where REGNO=?");
                    ps.setString(1, jTable4.getValueAt(x, 0).toString());
                    rs=ps.executeQuery();
                    while(rs.next())
                    {
                        if(rs.getString(1).equals("yes"))
                        {
                            JOptionPane.showMessageDialog(null,"Data cannot be added for lateral Entries till 2nd semester");
                            block=1;
                        }
                    }
                    if(block==1)
                    {
                        break;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(block==0)
        {
            add(jTable4);   
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    public void converttocaps(JTable table)
    {
        DefaultTableModel dtm=(DefaultTableModel) table.getModel();
        for(int i=0;i<dtm.getRowCount();i++)
        {
            for(int j=0;j<dtm.getColumnCount();j++)
            {
                if((table.getValueAt(i, j)==null)||(table.getValueAt(i,j).toString().trim().length()==0))
                {
                }
                else
                {
                    table.setValueAt(table.getValueAt(i,j).toString().toUpperCase(), i, j);
                }
            }
        }
    }
    
    public void regcheck()
    {
        getregprofile();
        gettablereg();
        checkreg();
    }

String regprofile[]=new String[150];

    public void getregprofile()
    {
        int i=0;
        try
        {
            ps=con.prepareStatement("select REGNO from profile order by REGNO");
            rs=ps.executeQuery();
      
            while(rs.next())
            {
                regprofile[i]=rs.getString(1);
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     
String regtable[]=new String[150];
public void gettablereg()
{
    for(int i=0;i<jTable4.getRowCount();i++)
    {
        regtable[i]=jTable4.getValueAt(i,0).toString();
    }
}
String errorreg[]=new String[150];
int errorchecker=0;
public void checkreg()
{
    for(int j=0;j<jTable4.getRowCount();j++)
    {
        int checkeri=0;
        for(int i=0;i<150;i++)
        {
            if(regtable[j].equals(regprofile[i]))
            {     
                checkeri=1;
            }
        }
        if(checkeri==0)
        {
            errorreg[j]=regtable[j];
        }
    }
    
    for(int j=0;j<jTable4.getRowCount();j++)
    {
        if(!(errorreg[j]==null))
        {
            JOptionPane.showMessageDialog(null,errorreg[j]+" is not added in Students List",null,JOptionPane.WARNING_MESSAGE);
            errorchecker=1;
        }
    }
}

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
      
    }//GEN-LAST:event_jTable3KeyPressed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
    int count=dtm.getRowCount();
    dtm.setRowCount(count+1);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    jPanel14.setVisible(true);
    jPanel13.setVisible(false);

    DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
    if(dtm.getRowCount()<10)
    {
        dtm.setRowCount(10);
    }
    initialize(jTable4);
    }//GEN-LAST:event_jButton27ActionPerformed

  
    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        String m=null;
        JTable jTable3 =(JTable) evt.getSource();
        Point p = evt.getPoint();
        int row = jTable3.rowAtPoint(p);
        int column=jTable3.columnAtPoint(p);
        if (evt.getClickCount() == 2) 
        {
            if(column!=0&&column<10)
            {
                m = JOptionPane.showInputDialog(null, "Enter new Grade for the cell",
                "Edit", JOptionPane.OK_CANCEL_OPTION);
            }
            else
                JOptionPane.showMessageDialog(null,"Editing is not allowed here",null,JOptionPane.WARNING_MESSAGE);
        }     
        if(m!=null)
        {
            try
            {
                ps=con.prepareStatement("update  "+choice+" set sub"+column+"=? where RegisterNumber=?");
                ps.setString(1,m.toString().toUpperCase());
                ps.setString(2, jTable3.getValueAt(row, 0).toString());
                ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
            clear(jTable3);
            initialize(jTable3);
        }
    }//GEN-LAST:event_jTable3MousePressed

    private void BSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSAVEActionPerformed

    String gdata[]=new String[10];
    InputStream fis=null;
    try
    {
        File pic=null;
        gdata[1]=a1.getText();
        if(jRadioButton3.isSelected())
        {
            gdata[2]="MALE";
        }
        else if(jRadioButton4.isSelected())
        {
        gdata[2]="FALSE";
        }
        gdata[3]=a2.getText();
        gdata[4]=a3.getText();
        gdata[5]=a4.getText();
        gdata[6]=a5.getText();
        if(path==null)
        {
            fis=this.getClass().getResourceAsStream("/resources/profile1.png");
        }
        else
        {
            pic=new File(path);
            fis=new FileInputStream(pic);
        }  
        ps=con.prepareStatement("insert into staff (STAFFNAME,GENDER,DEPARTMENT,COLLEGE,BATCH,DESIGNATION,PHOTO) values (?,?,?,?,?,?,?)");
        for(int i=1;i<7;i++)
        {
            //System.out.println(gdata[i]);
            ps.setString(i, gdata[i]);
        }
        ps.setBinaryStream(7,fis); 
        int r=ps.executeUpdate();
        if(r!=0)
        {
            JOptionPane.showMessageDialog(null,"Saved Successfully");
        }
   
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    
    initiate();
    }//GEN-LAST:event_BSAVEActionPerformed

    private void jTable3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseExited
        
    }//GEN-LAST:event_jTable3MouseExited

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
            for(int i=1;i<9;i++)
            {
                  for(int j=0;j<150;j++)
                  {
                    gpas[i][j]=0;
                  }
            }
       
        empty();
        selecteditem=jComboBox3.getSelectedItem().toString();
        if(jRadioButton6.isSelected())
        {
            semgally();
            clearforlateral();
            if(Integer.parseInt(jComboBox3.getSelectedItem().toString())>2)
            {
                cgpaforsemlateral();
            }
        }
        else if(jRadioButton7.isSelected())
        {
            totalgally();
            clearforlaterals();
            if(Integer.parseInt(jComboBox3.getSelectedItem().toString())>2)
            {
                cgpafortotallateral();
            }
        }
      
        TableColumnAdjuster tcm=new TableColumnAdjuster(jTable2);
        tcm.adjustColumns();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed

    jRadioButton6.setSelected(true);
    jRadioButton7.setSelected(false);
    empty();
    semgally();
    clearforlateral();
    if(Integer.parseInt(jComboBox3.getSelectedItem().toString())>2)
    {
            cgpaforsemlateral();
    }
    jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    TableColumnAdjuster tcm=new TableColumnAdjuster(jTable2);
    tcm.adjustColumns();
    }//GEN-LAST:event_jRadioButton6ActionPerformed
    
    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed

    jRadioButton6.setSelected(false);
    jRadioButton7.setSelected(true);
    empty();
    totalgally();
    clearforlaterals();
    if(Integer.parseInt(jComboBox3.getSelectedItem().toString())>2)
    {
            cgpafortotallateral();
    }
    jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TableColumnAdjuster tcm=new TableColumnAdjuster(jTable2);
    tcm.adjustColumns();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    
    private void cgpafortotallateral()
    {
        try
        {
            String lateralreg[]=new String[150];
            ps=con.prepareStatement("select REGNO from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
            for(int i=0;i<jTable2.getRowCount();i++)
            {
                for(int j=0;j<u;j++)
                {
                    if(jTable2.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {
                          //   assign(i,jTable2);
                            // getcredit(jComboBox3.getSelectedItem().toString());
                             //calculate(i,jTable2);   
                             gpainitforlateral(jComboBox3.getSelectedItem().toString());                             
                             lcgpa(jTable2,jComboBox3.getSelectedItem().toString(),26);
                    }
                }
            }                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    private void clearforlaterals()
    {
        try
        {
            DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
            String lateralreg[]=new String[150];           
            ps=con.prepareStatement("select * from profile where Lateral=? order by REGNO");
            ps.setString(1,"yes");
            rs=ps.executeQuery();
            int u=0;
            while(rs.next())
            {
                lateralreg[u]=rs.getString(1);
                u++;
            }
        for(int i=0;i<dtm.getRowCount();i++)
        {
         for(int j=0;j<u;j++)
           {
             if(dtm.getValueAt(i,0).toString().equals(lateralreg[j]))
                    {
                        String seme=jComboBox3.getSelectedItem().toString();
                        dtm.setValueAt("", i, 26);
                        for(int k=0;k<Integer.parseInt(seme);k++)
                        {
                            if(k<2)
                            {
                               dtm.setValueAt("LE", i, k+18);              
                            }
                        }
                    }
           }
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed

    }//GEN-LAST:event_t1ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(currentrecord<totalrecords-1)
        {         
           currentrecord=currentrecord+1;        
           getdata();
           setdata();
            jScrollPane5.getVerticalScrollBar().setValue(0);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "No More Records Found");
        }
    }//GEN-LAST:event_jButton25ActionPerformed
String imglocation=null;
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    if(currentrecord!=0)
    {
        currentrecord=currentrecord-1;  
        getdata();
        setdata();
         jScrollPane5.getVerticalScrollBar().setValue(0);
    }
    else
    {
        JOptionPane.showMessageDialog(null,"This is the First Record");
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
    
    String updata[]=new String[20];
    try
    {     
        updata[1]=t1.getText();
        updata[2]=t2.getText();
        updata[3]=t3.getText();
        updata[4]=t4.getText();
        updata[5]=t5.getText();
        updata[6]=t6.getText();
        updata[7]=t7.getText();
        updata[8]=t8.getText();
        updata[9]=t9.getText();
        updata[10]=t10.getText();
        updata[11]=t11.getText();
        updata[12]=t12.getText();
        updata[13]=t13.getText();
        updata[14]=t14.getText();
        updata[15]=t15.getText();
        updata[16]=t16.getText();
        updata[17]=t17.getText();
        updata[18]=t18.getText();
        if(location!=null)
        {
              File pic=new File(location);
              InputStream fis=new FileInputStream(pic);
         
               ps=con.prepareStatement("update profile set NAME=?,ROLLNO=?,DEPARTMENT=?,COLLEGE=?,DATEOFBIRTH=?,MOBILE=?,MAIL=?,ADDRESS=?,HOSDAY=?,COUMAN=?,FATHER=?,MOTHER=?,INCOME=?,COMMUNITY=?,CASTE=?,RELIGION=?,NATIONALITY=?,IMAGE=? where REGNO=?");
               for(int i=1;i<19;i++)
               {
                    if(i==1)
                    {
                        ps.setString(19, updata[i]);
                    }
                    else
                    {
                        ps.setString(i-1, updata[i]); 
                    }

                     ps.setBinaryStream(18,fis );            
               }
        }
        else
        {
            ps=con.prepareStatement("update profile set NAME=?,ROLLNO=?,DEPARTMENT=?,COLLEGE=?,DATEOFBIRTH=?,MOBILE=?,MAIL=?,ADDRESS=?,HOSDAY=?,COUMAN=?,FATHER=?,MOTHER=?,INCOME=?,COMMUNITY=?,CASTE=?,RELIGION=?,NATIONALITY=? where REGNO=?");
            for(int i=1;i<19;i++)
            {
                if(i==1)
                {
                    ps.setString(18, updata[i]);
                }
                else
                {
                    ps.setString(i-1, updata[i]); 
                } 
            }                       
        }
        int r=ps.executeUpdate();        
        if(r!=0)
        {
            JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
            location=null;
             jScrollPane5.getVerticalScrollBar().setValue(0);
        }           
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        a1.setEditable(false);
        BSAVE.setVisible(false);
        jPanel11.setVisible(false);
        jPanel3.setVisible(true);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel5.setVisible(false);
        jPanel7.setVisible(false);
        try
        {
           ps=con.prepareStatement("select * from staff");
           rs=ps.executeQuery();
           if(rs.next())
           {
               a1.setText(rs.getString(1));
               if(rs.getString(2).equals("MALE"))
               {
                   jRadioButton3.setSelected(true);
                   jRadioButton4.setSelected(false);
               }
               else 
               {
                   jRadioButton4.setSelected(true);
                   jRadioButton3.setSelected(false);
               }
               a2.setText(rs.getString(3));
               a3.setText(rs.getString(4));
               a4.setText(rs.getString(5));
               a5.setText(rs.getString(6));
               InputStream is=rs.getBinaryStream(7);
               Image picture=ImageIO.read(is);
               ImageIcon imageicon=new ImageIcon(fitimage(picture,jLabel2.getWidth(),jLabel2.getHeight())); 
               jLabel2.setIcon(imageicon);
               
           }
       }
       catch(IOException | SQLException e)
       {
           System.out.println(e);
       }       
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
jRadioButton3.setSelected(true);
jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    initiate();        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
    String newdata[]=new String[10];

    try
    {
        File fi=null;
        InputStream fin=null;
        if(path==null)
        {
            fin=this.getClass().getResourceAsStream("/resources/profile1.png");
        }
        else
        {       
            fi=new File(path);
            fin=new FileInputStream(fi);    
        }
        newdata[1]=a1.getText();
        if(jRadioButton3.isSelected())
        {
            newdata[2]="MALE";
        }
        else if(jRadioButton4.isSelected())
        {
            newdata[2]="FEMALE";
        }           
        newdata[3]=a2.getText();
        newdata[4]=a3.getText();
        newdata[5]=a4.getText();
        newdata[6]=a5.getText();  
        ps=con.prepareStatement("UPDATE staff set GENDER=?,DEPARTMENT=?,COLLEGE=?,BATCH=?,DESIGNATION=?,PHOTO=? where STAFFNAME=?");    
        ps.setString(1,newdata[2]);
        ps.setString(2,newdata[3]);
        ps.setString(3,newdata[4]);
        ps.setString(4,newdata[5]);
        ps.setString(5,newdata[6]);
        ps.setBinaryStream(6,fin);        
        ps.setString(7, newdata[1]);    
        int r=ps.executeUpdate();
        if(r!=0)
        {
            JOptionPane.showMessageDialog(null,"Updated Successfully");
        }
    }
    catch(Exception e)
    {   
        System.out.println(e);
    }
    initiate();
    }//GEN-LAST:event_B2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel9.setVisible(false);
       jPanel10.setVisible(false);
       jPanel22.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel11.setVisible(false);  
       jPanel16.setVisible(true);
       jPanel15.setVisible(false);
        jPanel20.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3PropertyChange

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
 
        jPanel13.setVisible(true);
        jPanel14.setVisible(false);
           jComboBox2.setSelectedItem("1");
        visit(jTable3);
        if(Integer.parseInt(jComboBox2.getSelectedItem().toString())>2)
        {
            cleargpacgpa(jTable3);
            addlaterals(jTable3);
        }
        else
        {
            clearlateral(jTable3);   
        }
        fillbottom();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        databasestarter();
        jPanel22.setVisible(false);
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel9.setVisible(false);
       jPanel10.setVisible(false);
       jPanel5.setVisible(true);
       jPanel7.setVisible(false);
       jPanel11.setVisible(false);    
       jPanel16.setVisible(false);
       jPanel20.setVisible(false);
       
      jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
    DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
    dtm.setRowCount(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        removeSelectedRows(jTable4);
    }//GEN-LAST:event_jButton33ActionPerformed

    public void removeSelectedRows(JTable table)
    {
         DefaultTableModel dtm=(DefaultTableModel) table.getModel();
         int row=table.getSelectedRow();
         while (row != -1)
         {
               int modelRow = table.convertRowIndexToModel( row );
               dtm.removeRow( modelRow );
               row = table.getSelectedRow();
         }
    }
        
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Image bi;
        try
        {
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File f=jfc.getSelectedFile();
            location=f.getAbsolutePath();
          
            bi=ImageIO.read(f);
            ImageIcon imageicon=new ImageIcon(fitimage(bi,jLabel60.getWidth(),jLabel60.getHeight()));
            jLabel60.setIcon(imageicon);    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
    if(jPanel13.isVisible())
    {
        print(jTable3);
    }
    else if(jPanel14.isVisible())
    {
        print(jTable4);
    }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
    if(jPanel13.isVisible())
    {    
        export(jTable3);    
    } 
    else if(jPanel14.isVisible())
    {    
        export(jTable4);   
    }
   
    }//GEN-LAST:event_jButton36ActionPerformed

    public void export(JTable table)
    {
         if (table.isEditing())
                table.getCellEditor().stopCellEditing(); 
         try
         {
            String names=JOptionPane.showInputDialog(null,"Enter a name for the file:",null,JOptionPane.OK_CANCEL_OPTION);
            if(names!=null){
            names=names.concat(".xls");
            String exportdata[]=new String[table.getColumnCount()];
        
            FileOutputStream file=new FileOutputStream(new File(names));
            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("exported");
            for(int rows=0;rows<table.getRowCount();rows++)
            {
                XSSFRow row=spreadsheet.createRow(rows);
                XSSFCell cell;
                if(rows==0)
                {
                    for(int j=0;j<table.getColumnCount();j++)
                    {
                        exportdata[j]=table.getColumnModel().getColumn(j).getHeaderValue().toString();
                        cell=row.createCell(j);
                        cell.setCellValue(exportdata[j]);
                    }
                }
                else
                {
                    for(int i=0;i<table.getColumnCount();i++)
                    {
                        if(table.getValueAt(rows,i)==null||table.getValueAt(rows,i).toString().trim().length()==0)
                        {
                            exportdata[i]=Integer.toString(0);
                        }
                        else
                        {
                            exportdata[i]=table.getValueAt(rows,i).toString();
                        }
                        cell=row.createCell(i);
                        cell.setCellValue(exportdata[i]);
                    }
                }
            }
            workbook.write(file);
            JOptionPane.showMessageDialog(null,"Exported Successfully");
            }        
        }
        catch(Exception e)
        {
            System.out.println(e);   
        }
    }
    
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
    print(jTable1);       
    }//GEN-LAST:event_jButton37ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed

    }//GEN-LAST:event_t1KeyPressed

    private void text1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyPressed
    switchforautocomplete(evt,text1);     
    }//GEN-LAST:event_text1KeyPressed

    private void text2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyPressed
    switchforautocomplete(evt,text2);        // TODO add your handling code here:
    }//GEN-LAST:event_text2KeyPressed

    private void text3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyPressed
    switchforautocomplete(evt,text3);        // TODO add your handling code here:
    }//GEN-LAST:event_text3KeyPressed

    private void text4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyPressed
    switchforautocomplete(evt,text4);        // TODO add your handling code here:
    }//GEN-LAST:event_text4KeyPressed

    private void text5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyPressed
    switchforautocomplete(evt,text5);        // TODO add your handling code here:
    }//GEN-LAST:event_text5KeyPressed

    private void text6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text6KeyPressed
    switchforautocomplete(evt,text6);        // TODO add your handling code here:
    }//GEN-LAST:event_text6KeyPressed

    private void text7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text7KeyPressed
    switchforautocomplete(evt,text7);        // TODO add your handling code here:
    }//GEN-LAST:event_text7KeyPressed

    private void text8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text8KeyPressed
    switchforautocomplete(evt,text8);        // TODO add your handling code here:
    }//GEN-LAST:event_text8KeyPressed

    private void text9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text9KeyPressed
    switchforautocomplete(evt,text9);        // TODO add your handling code here:
    }//GEN-LAST:event_text9KeyPressed

    private void text10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text10KeyPressed
    switchforautocomplete(evt,text10);        // TODO add your handling code here:
    }//GEN-LAST:event_text10KeyPressed

    private void text11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text11KeyPressed
    switchforautocomplete(evt,text11);        // TODO add your handling code here:
    }//GEN-LAST:event_text11KeyPressed

    private void text12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text12KeyPressed
    switchforautocomplete(evt,text12);        // TODO add your handling code here:
    }//GEN-LAST:event_text12KeyPressed

    private void text13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text13KeyPressed
    switchforautocomplete(evt,text13);        // TODO add your handling code here:
    }//GEN-LAST:event_text13KeyPressed

    private void text14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text14KeyPressed
    switchforautocomplete(evt,text14);        // TODO add your handling code here:
    }//GEN-LAST:event_text14KeyPressed

    private void text15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text15KeyPressed
    switchforautocomplete(evt,text15);  // TODO add your handling code here:
    }//GEN-LAST:event_text15KeyPressed

    private void text16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text16KeyPressed
    switchforautocomplete(evt,text16);  
    }//GEN-LAST:event_text16KeyPressed

    private void text17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text17KeyPressed
    switchforautocomplete(evt,text17);         // TODO add your handling code here:
    }//GEN-LAST:event_text17KeyPressed

    private void text18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text18KeyPressed
    switchforautocomplete(evt,text18);         // TODO add your handling code here:
    }//GEN-LAST:event_text18KeyPressed
    String FilePath=null;
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
            int sure;
            sure =  JOptionPane.showConfirmDialog(null, "Make sure all register numbers are available in Students list",null, JOptionPane.OK_CANCEL_OPTION);
            if(sure==0)
            {               
                System.out.println("success");
                getfilepath();
                connectexcel();             
            }            
    }//GEN-LAST:event_jButton38ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p6ActionPerformed

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t15ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
    String old=p1.getText().toString();
    String new1=p2.getText().toString();
    String new2=p3.getText().toString();
    String hint=p4.getText().toString();
    String ancient=null;
    if(!(old.isEmpty()&&new1.isEmpty()&&new2.isEmpty()&&hint.isEmpty()))
    {
        if(new1.equals(new2))
        {
            try
            {
                ps=con.prepareStatement("select PASSWORD from LOGIN");
                rs=ps.executeQuery();
                while(rs.next())
                {
                    ancient=rs.getString(1);
                }
                if(old.equals(ancient))
                {
                    ps=con.prepareStatement("update LOGIN set PASSWORD=?");
                    ps.setString(1, new1);
                    int r=ps.executeUpdate();
                    if(r!=0)
                    {
                        JOptionPane.showMessageDialog(null,"Successfully Updated",null, JOptionPane.INFORMATION_MESSAGE);
                        p1.setText(null);
                        p2.setText(null);
                        p3.setText(null);
                        p4.setText(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Something Wrong..Try again");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Old Password is Wrong",null,JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Passwords Dont't Match",null,JOptionPane.ERROR_MESSAGE);
        }
    }
    else    
    {
        JOptionPane.showMessageDialog(null, "Empty Blocks Found", null, JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed

    settings(p5);
    if(confirmation==1)
    {
        int sure=JOptionPane.showConfirmDialog(null, "Records Once Erased can't be Restored!!!"+"\n"+"Are you sure you want to proceed?","WARNING_MESSAGE",JOptionPane.OK_CANCEL_OPTION); 
        if(sure==0)
        {
            JOptionPane.showMessageDialog(null,"Please Wait Till You Get a Confirmation");
            for(int i=0;i<9;i++)
            {
                try
                {
                    if(i==0)
                    {
                        ps=con.prepareStatement("Delete from profile");
                    }
                    else
                    {
                        ps=con.prepareStatement("Delete from sem"+i);
                    }
                    ps.executeUpdate();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }     
            JOptionPane.showMessageDialog(null,"Data Erased",null,JOptionPane.INFORMATION_MESSAGE);
            confirmation=0;
            p5.setText("");        
        }
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Password Error","ERROR",JOptionPane.ERROR_MESSAGE);
    }    
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
    String reg=r1.getText();
    String namer=r2.getText();
    if(!((reg.isEmpty()&&namer.isEmpty())))
    {
        if(reg.isEmpty())
        {
                int set=0;
                for(int i=0;i<totalrecords;i++)
                {
                    if(details[i][2].equals(namer))
                    {                  
                        set=1;
                        currentrecord=i;
                        setdata();                     
                        break;
                    }          
                }
                if(set==0)
                {
                     JOptionPane.showMessageDialog(null,"Name not Found",null,JOptionPane.WARNING_MESSAGE);
                }                            
        }
        else if(namer.isEmpty())
        {
                int set=0;
                for(int i=0;i<totalrecords;i++)
                {
                    if(details[i][1].equals(reg))
                    {                        
                        set=1;
                        currentrecord=i;
                        setdata();                        
                        break;
                    }
                }
                if(set==0)
                {
                    JOptionPane.showMessageDialog(null,"RegisterNumber not Found",null,JOptionPane.WARNING_MESSAGE);
                }
        }
        else
        {
            int set=0;
            for(int i=0;i<totalrecords;i++)
            {
                if(details[i][1].equals(reg))
                {
                    set=1;
                    if(details[i][2].equals(namer))
                    {                    
                        currentrecord=i;
                        setdata(); 
                         jScrollPane5.getVerticalScrollBar().setValue(0);
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null,"RegisterNumber and Name donot Match",null,JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                }
            }
            if(set==0)
            {
                 JOptionPane.showMessageDialog(null,"RegisterNumber not Found",null,JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Both RegisterNumber and Name are empty");
    }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed

    settings(p6);
    if(confirmation==1)
    {                
        int sure=JOptionPane.showConfirmDialog(null,"Are you sure...This will erase all data in the app"+"\n"+"Do you want to delete the account?",null,JOptionPane.OK_CANCEL_OPTION);
        if(sure==0)
        {       
            try
            {
                for(int i=0;i<11;i++)
                {
                    if(i>=1&&i<=8)
                    {
                        ps=con.prepareStatement("Delete  from sem"+i);
                    }
                    else if(i==0)
                    {
                        ps=con.prepareStatement("Delete  from profile");
                    }
                    else if(i==9)
                    {
                        ps=con.prepareStatement("Delete  from staff");
                    }
                    else
                    {
                        ps=con.prepareStatement("Delete  from LOGIN");
                    }
                    ps.executeUpdate();
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }            
            JOptionPane.showMessageDialog(null,"Data cleared.."+"\n"+"GOOD BYE...",null,JOptionPane.INFORMATION_MESSAGE);
            this.hide();
            helper1 h1=new helper1();
            h1.show();
        }            
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Password Error",null,JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
     settings(p5);
     if(confirmation ==1)
     {
        JOptionPane.showMessageDialog(null,"Please Wait Till You Get a Confirmation");   
        for(int i=1;i<=8;i++)
        {
            exportmarks("sem"+i,i);         
        }
        export("profile");   
        JOptionPane.showMessageDialog(null,"Exported Successfully");   
     }
     else
     {
        JOptionPane.showMessageDialog(null,"Password Error","ERROR",JOptionPane.ERROR_MESSAGE);
     }
    
    confirmation=0;
    p5.setText("");    
    }//GEN-LAST:event_jButton41ActionPerformed

    public void exportmarks(String sem, int num)
    {
         String detail[][]=new String[150][25];
         String headvalues[]=new String[10];
        try
        {
           ps=con.prepareStatement("select sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9 from semester where semesterno=? ");
           ps.setString(1, Integer.toString(num));
           rs=ps.executeQuery();
           while(rs.next())
           {
               headvalues[0]=rs.getString("sub1");
               headvalues[1]=rs.getString("sub2");
               headvalues[2]=rs.getString("sub3");
               headvalues[3]=rs.getString("sub4");
               headvalues[4]=rs.getString("sub5");
               headvalues[5]=rs.getString("sub6");
               headvalues[6]=rs.getString("sub7");
               headvalues[7]=rs.getString("sub8");
               headvalues[8]=rs.getString("sub9");              
           }

            ps=con.prepareStatement("select * from "+sem);
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();            
            int in=0;
            while(rs.next())
            {
               for(int j=1;j<=rsmd.getColumnCount();j++)
               {
                   detail[in][j-1]=rs.getString(j);
               }
               in++;
            }
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet spreadsheet=workbook.createSheet(sem);
        XSSFRow row=spreadsheet.createRow(0);
        for(int i=0;i<10;i++)
        {
            if(i==0)
            {
                row.createCell(i).setCellValue("RegisterNumber");
            }
            else
            {
                row.createCell(i).setCellValue(headvalues[i-1]);
            }
        }
        
        for(int i=0;i<10;i++)
        {
            row=spreadsheet.createRow(i+1);
            for(int j=0;j<10;j++)
            {
                row.createCell(j).setCellValue(detail[i][j]);
            }
        }
        FileOutputStream out=new FileOutputStream(new File(sem+".xls"));
        workbook.write(out);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
    }
        
    public void export(String dbname)
    {
        try
        {
            ps=con.prepareStatement("select * from "+dbname);
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            String dbdata[][]=new String[151][rsmd.getColumnCount()+1];
            String dbheader[]=new String[rsmd.getColumnCount()+1];           
            for(int i=1;i<=rsmd.getColumnCount();i++)
            {
                dbheader[i]=rsmd.getColumnName(i);
            }
            int i=1;        
            while(rs.next())
            {
                for(int j=1;j<=rsmd.getColumnCount();j++)
                {
                  dbdata[i][j]=rs.getString(j);
                }
                i++;
            }
            XSSFWorkbook workbook = new XSSFWorkbook(); 
            XSSFSheet spreadsheet = workbook.createSheet(dbname);
            XSSFRow row=spreadsheet.createRow(0);
            XSSFCell cell;  
            for(int j=1;j<=rsmd.getColumnCount();j++)
            {
                cell=row.createCell(j-1);
                cell.setCellValue(dbheader[j]);                
            }      
            for(int rows=1;rows<150;rows++)
            {
                row=spreadsheet.createRow(rows);
                for(int column=1;column<=rsmd.getColumnCount();column++)
                {
                    row.createCell(column-1).setCellValue(dbdata[rows][column]);
                }
            }
            FileOutputStream out = new FileOutputStream(new File(dbname+".xls"));
            workbook.write(out);                           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
    p1.setText("");
    p2.setText("");
    p3.setText("");
    p4.setText("");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        
        String out=t1.getText().toString();
        int sure=JOptionPane.showConfirmDialog(null,"Are you Sure..."+"\n"+"Do you want to delete all records of "+out, null , JOptionPane.OK_CANCEL_OPTION);
        if(sure==0)
        {             
           try
           {
               ps=con.prepareStatement("delete  from profile where REGNO=?");
               ps.setString(1, out);
               int r= ps.executeUpdate();
               for(int i=1;i<9;i++)
               {
                   ps=con.prepareStatement("Delete  from sem"+i+" where RegisterNumber=?");
                   ps.setString(1, out);
                   r = ps.executeUpdate();
               }
               if(r!=0)
               {
                   JOptionPane.showMessageDialog(null,"Deleted Successfully",null,JOptionPane.OK_OPTION);
                    jScrollPane5.getVerticalScrollBar().setValue(0);
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }        
        }                
        getdata();
        if(totalrecords!=0)
        {
            setdata();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"All records are cleared");          
            for(int i=0;i<150;i++)
            {
                for(int j=0;j<25;j++)
                {
                    details[i][j]=null;
                    newimage[i][0]=null;
                }
            }
            setdata();            
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void text14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text14ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        export(jTable2);        // TODO add your handling code here:                 
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    print(jTable2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void c0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0ActionPerformed
    c0.setSelected(true);
    jTextField1.setEditable(false);
    c1.setSelected(false);
    jLabel75.setEnabled(true);
    jComboBox1.setEnabled(true);
    }//GEN-LAST:event_c0ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

       jTextField1.setEditable(true);
        c0.setSelected(false);
    c1.setSelected(true);
    jLabel75.setEnabled(false);
    jComboBox1.setEnabled(false);
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

     String mailid=jTextField1.getText();
    if(mailid.isEmpty())
    {
        JOptionPane.showMessageDialog(null,"Recipient Field is Empty",null,JOptionPane.WARNING_MESSAGE);
    }
    else
    {
        DefaultTableModel dtm=(DefaultTableModel)  jTable5.getModel();
        dtm.setRowCount(dtm.getRowCount()+1);
        dtm.setValueAt(mailid, dtm.getRowCount()-1, 0);        
    }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
     removeSelectedRows(jTable5);   
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String person=jComboBox1.getSelectedItem().toString();
       for(int i=0;i<jComboBox1.getItemCount();i++)
       {
           if(nam[i].equals(person))
           {
               jTextField1.setText(mailid[i]);
           }
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextArea1.setText(null);
    jPasswordField1.setText(null);
    DefaultTableModel dtm=(DefaultTableModel) jTable5.getModel();
    dtm.setRowCount(0);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
       
        String sender=jTextField2.getText();
        String password=jPasswordField1.getText();
        String subject=jTextField3.getText();
        String body=jTextArea1.getText();
        if(sender.endsWith("gmail.com"))
        {        
            String recipient[]=new String[jTable5.getRowCount()];
            for(int i=0;i<jTable5.getRowCount();i++)
            {
                recipient[i]=jTable5.getValueAt(i,0).toString();
            }
            if(!(password.isEmpty()&&subject.isEmpty()&&body.isEmpty()&&recipient.length==0))
            {
                 JOptionPane.showMessageDialog(null,"Please Wait Till You Get a Confirmation");           
                 int success = Mailer.send(sender,password,recipient,subject,body);  
                 if(success==1)
                 {
                      jTextField2.setText(null);
                      jTextField3.setText(null);
                      jTextArea1.setText(null);
                      jPasswordField1.setText(null);
                      DefaultTableModel dtm=(DefaultTableModel) jTable5.getModel();
                      dtm.setRowCount(0);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Empty Blocks Found",null,JOptionPane.WARNING_MESSAGE);
            }        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Only Gmail Account can be used as Sender",null,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable2PropertyChange
       
    }//GEN-LAST:event_jTable2PropertyChange

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        
       jPanel20.setVisible(false);    
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel9.setVisible(false);
       jPanel11.setVisible(false);
       jPanel15.setVisible(false);
       jPanel16.setVisible(false);
       jPanel10.setVisible(false);
       jPanel22.setVisible(true);
       clear(jTable6);
       jComboBox5.setSelectedItem("1");
       initiate_from_2();
       load_data();
       set_regno();
       set_backlogcount();
      Numberofstudentswithbacklog();
    }//GEN-LAST:event_jLabel71MouseClicked

    private void initiate_from_2()
    {
     JTableHeader th=jTable6.getTableHeader();
     TableColumnModel tcm=th.getColumnModel();
     int i;
     String col[]=new String[9];
      try
      {
         ps=con.prepareStatement("select sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9 from semester where semesterno=?");          
         ps.setString(1,jComboBox5.getSelectedItem().toString());        
         rs=ps.executeQuery();
         while(rs.next())
         {
             for(i=0;i<9;i++)
             {
                 col[i]=rs.getString(i+1);
             }
         }
     }
     catch(SQLException e)
     {
         System.out.println(e);
     }
     for(i=0;i<9;i++)
     {
         TableColumn cm=tcm.getColumn(i+2);
         cm.setHeaderValue(col[i]);
         th.repaint();
     }  
    }
    
    private void load_data()
    {
        try
        {            
            DefaultTableModel dtm=(DefaultTableModel) jTable6.getModel();
            String sem_no=jComboBox5.getSelectedItem().toString();
            ps=con.prepareStatement("select * from sem"+sem_no+" where sub1=? or sub2=? or sub3=? or sub4=? or sub5=? or sub6=? or sub7=? or sub8=? or sub9=?");
            for(int i=1;i<10;i++)
            {
               ps.setString(i, "U");
            }
            rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            int rows=0;
            while(rs.next())
            {               
               dtm.setRowCount(rows+1);
               for(int i=0;i<rsmd.getColumnCount();i++)
               {
                   if(i==0)
                   {
                        jTable6.setValueAt(rs.getString(i+1), rows, 0);
                   }
                   else
                   {
                        jTable6.setValueAt(rs.getString(i+1), rows, i+1);
                   }
               }
               rows=rows+1;
            }             
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    private void set_regno()
    {
        try
        {
            DefaultTableModel dtm=(DefaultTableModel)jTable6.getModel();
            for(int i=0;i<dtm.getRowCount();i++)
            {
                ps=con.prepareStatement("Select NAME  from profile where REGNO = ?");
                ps.setString(1,dtm.getValueAt(i,0).toString());
                rs=ps.executeQuery();
                while(rs.next())
                {
                    dtm.setValueAt(rs.getString("NAME"),i, 1);
                }        
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    private void set_backlogcount()
    {
         int log;
         DefaultTableModel dtm=(DefaultTableModel)jTable6.getModel();
         for(int i=0;i<dtm.getRowCount();i++)
         {
             log=0;
             for(int j=2;j<dtm.getColumnCount()-1;j++)
             {
                 if(dtm.getValueAt(i,j).toString().equals("U"))
                 {
                     log++;
                 }                     
             }
             dtm.setValueAt(log, i, 11);
         }
    }
    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
       clear(jTable6);
       initiate_from_2();
       load_data();
       set_regno();
       set_backlogcount();
       Numberofstudentswithbacklog();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void Numberofstudentswithbacklog()
    {
        jTextField7.setText(Integer.toString(jTable6.getRowCount()));
    }
    
    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
       jPanel20.setVisible(false);    
       jPanel3.setVisible(false);
       jPanel8.setVisible(false);
       jPanel5.setVisible(false);
       jPanel7.setVisible(false);
       jPanel9.setVisible(false);
       jPanel11.setVisible(false);
       jPanel15.setVisible(false);
       jPanel16.setVisible(false);
       jPanel10.setVisible(true);
       jPanel22.setVisible(false);
    }//GEN-LAST:event_jButton48ActionPerformed
private void settings(JTextField text)
{
    String psd=text.getText().toString();
    String actpsd=null;
    try
    {
        ps=con.prepareStatement("Select PASSWORD from LOGIN");
        rs=ps.executeQuery();
        while(rs.next())
        {
            actpsd=rs.getString("PASSWORD").toString();
        }
        if(psd.equals(actpsd))
        {
            confirmation=1;
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    private void connectexcel()
    {
        try
        {
            DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
            FileInputStream file=new FileInputStream(new File(FilePath));
            Workbook workbook=new XSSFWorkbook(file);                           
            Row row;       
            Sheet firstSheet=workbook.getSheetAt(0);
            for( int i=1;i<=firstSheet.getLastRowNum();i++)
            {                  
                int ch=checkforavailablerows();
                if(ch<firstSheet.getLastRowNum())
                {                          
                    dtm.setRowCount(ch+(firstSheet.getLastRowNum()-ch)+2);
                }           
                row=firstSheet.getRow(i);
                row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);                    
                String Number=row.getCell(0).getStringCellValue();                                      
                String sub1=row.getCell(2).getStringCellValue().toString();                    
                String sub2=row.getCell(3).getStringCellValue().toString();                    
                String sub3=row.getCell(4).getStringCellValue().toString();            
                String sub4=row.getCell(5).getStringCellValue().toString();                  
                String sub5=row.getCell(6).getStringCellValue().toString();                     
                String sub6=row.getCell(7).getStringCellValue().toString();                   
                String sub7=row.getCell(8).getStringCellValue().toString();                       
                String sub8=row.getCell(9).getStringCellValue().toString();                      
                String sub9=row.getCell(10).getStringCellValue().toString();                      
                
                jTable4.setValueAt(Number, i-1,0);
                jTable4.setValueAt(sub1, i-1, 1);
                jTable4.setValueAt(sub2,i-1,2);
                jTable4.setValueAt(sub3,i-1,3);
                jTable4.setValueAt(sub4,i-1,4);
                jTable4.setValueAt(sub5,i-1,5);
                jTable4.setValueAt(sub6,i-1,6);
                jTable4.setValueAt(sub7,i-1,7);
                jTable4.setValueAt(sub8,i-1,8);
                jTable4.setValueAt(sub9,i-1,9);                                                            
            }                                                       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public int checkforavailablerows()
    {
        int countemptyrows=0;
        DefaultTableModel dtm=(DefaultTableModel) jTable4.getModel();
        int i=dtm.getRowCount();
        for(int j=i-1;j>=0;j--)
        {          
            if(!(jTable4.getValueAt(j, 0) != null 
            && jTable4.getValueAt(j, 0).toString().trim().length() != 0) )
            {
                   countemptyrows=countemptyrows+1;
            }
        }
        return countemptyrows;
    }
            
    public void getfilepath()
    {
        JFileChooser jfc=new JFileChooser();
        if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
            FilePath=jfc.getSelectedFile().getAbsolutePath();
        }
        
    }
    
    
    public void switchforautocomplete(KeyEvent evt,final JTextField text)
    {
        switch(evt.getKeyCode())
        {
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                text.setText(text.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                @Override

            public void run() {
              String txt=text.getText();
              autocomplete(txt,text);
            }
                });
        }
    }
    
    
    public void print(JTable table)
    {
        try
        {
            boolean complete=table.print(JTable.PrintMode.FIT_WIDTH);
            if (complete) 
            {
                JOptionPane.showMessageDialog(null,"Printing Successfull",null,JOptionPane.INFORMATION_MESSAGE);
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Something Error. Try Again",null,JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(HeadlessException | PrinterException e)
        {
            System.out.println(e);
        }
    }
  
    
    public void totalgally()
    {
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
        JTableHeader th=jTable2.getTableHeader();
        TableColumnModel tcm=th.getColumnModel();
        try
        {
             ps=con.prepareStatement("Select * from profile order by REGNO");
             rs=ps.executeQuery();
             ResultSetMetaData rsmd=rs.getMetaData();
             
             String proname[][]=new String[150][25];
             String headername[]=new String[25];                        
             for(int j=1;j<rsmd.getColumnCount()-1;j++)
             {
                 headername[j]=rsmd.getColumnName(j);
                 dtm.addColumn(headername[j]);
                 th.repaint();
             }
             for(int j=1;j<10;j++)
             {
                 if(j==9)
                 {
                     dtm.addColumn("CGPA");
                     th.repaint();
                 }
                 else
                 {
                     dtm.addColumn("sem"+j);
                     th.repaint();
                 }
             }
            
             int i=0;
             while(rs.next())
             {
                 dtm.setRowCount(i+1);
                 for(int j=1;j<rsmd.getColumnCount();j++)
                 {
                     proname[i][j-1]=rs.getString(j);
                     jTable2.setValueAt(proname[i][j-1], i, j-1);
                 }
                 i++;
             }             
            gpainit(selecteditem);            
            int order[]=new int[150];
            int g=0;
            for(int y=0;y<jTable2.getRowCount();y++)
            {
                if(proname[y][0]!=null)
                {
                   for(int z=0;z<150;z++)
                    {
                        if(reginit[Integer.parseInt(selecteditem)][z].equals(proname[y][0]))
                        {
                            order[g]=y;
                            g++;
                        }
                    } 
                }
            }
                                    
            for(int k=0;k<g;k++)
            {
                 for(int d=0;d<=jTable2.getRowCount()-1;d++)
                 { 
                    if(d==order[k])
                    {                
                        for(int sem=1;sem<=Integer.parseInt(selecteditem);sem++)
                        {
                            if(gpas[sem][k]!=0)
                            {
                                DecimalFormat f=new DecimalFormat("##.00");
                                jTable2.setValueAt(f.format(gpas[sem][k]), d, (sem+17));
                            }
                            else
                            jTable2.setValueAt(0, d, sem+17);
                        }                  
                        gpcredit=0;
                        totcredit=0;
                        for(int c=1;c<=Integer.parseInt(selecteditem);c++)
                        {                              
                            gpcredit=gpcredit+gpas[c][k]*finalcredits[c][k];
                            totcredit=totcredit+finalcredits[c][k];
                            if(c==Integer.parseInt(selecteditem))
                            {
                                cgpa[c][k]= gpcredit/totcredit;
                                DecimalFormat f = new DecimalFormat("##.00");
                                jTable2.setValueAt(f.format(cgpa[c][k]),d,26);
                            }
                            else
                            {
                                jTable2.setValueAt(0, d, 26);
                            }           
                        }                                
                    }                           
                }
          }         
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
        
    public void semgally()
    {
        selecteditem=jComboBox3.getSelectedItem().toString();
        gpainit(selecteditem);
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
        JTableHeader th=jTable2.getTableHeader();
        TableColumnModel tcm=th.getColumnModel();        
        dtm.setColumnCount(11);            
        for(int i=0;i<=10;i++)
        {
             if(i==0)
             {
                  TableColumn cm=tcm.getColumn(i);
                  cm.setHeaderValue("RegisterNumber");  
                  th.repaint();
             }
             else if(i==1)
             {
                  TableColumn cm=tcm.getColumn(i);
                  cm.setHeaderValue("NAME");  
                  th.repaint();   
             }
             else if(i==10)
             {
                   TableColumn cm=tcm.getColumn(i);
                   cm.setHeaderValue("CGPA");
             }
             else
             {
                   TableColumn cm=tcm.getColumn(i);
                   cm.setHeaderValue("sem"+(i-1));
                   th.repaint();
             }
        }
        int r=0;
        int i=0;
        int assign=0;                                                                              
        String rowData[][] = new String[150][3];
        try
        {
                ps=con.prepareStatement("select REGNO,NAME from profile order by REGNO asc");
                rs=ps.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();         
                while(rs.next())
                {
                    assign=0;
                    for(int t=1;t<=rsmd.getColumnCount();t++)
                    {                    
                        rowData[i][t]=rs.getString(t);
                        if(t==1)
                        {
                            for(int j=0;j<150;j++)
                            {
                                if(reginit[Integer.parseInt(selecteditem)][j].equals(rowData[i][1]))
                                {                                    
                                    r=r+1;
                                    dtm.setRowCount(r);
                                    assign=1;
                                    break;
                                }       
                                
                            }
                        }
                        if(assign==1)
                        {
                            jTable2.setValueAt(rowData[i][t], r-1,t-1);
                        }                                        
                    }
                    i++;              
                }            
        }            
        catch(Exception e)
        {                
            System.out.println(e);
        }
        for(int j=0;j<jTable2.getRowCount();j++)
        {
              for(int sem=1;sem<=Integer.parseInt(selecteditem);sem++)
              {
                    if(gpas[sem][j]!=0)
                    {
                          DecimalFormat f=new DecimalFormat("##.00");                
                          jTable2.setValueAt(f.format(gpas[sem][j]), j, sem+1);
                    }
                    else
                          jTable2.setValueAt(0, j, sem+1);
              }          
        }          
        cgpa(jTable2,selecteditem,10 );     
    }
    String reginit[][]=new String[9][150];
    public void reginit()
    {
        for(int sem=1;sem<=8;sem++)
        {            
            int k=0;             
             try
             {                 
                 ps=con.prepareStatement("select RegisterNumber from sem"+sem+" order by RegisterNumber");
                 rs=ps.executeQuery();
                 //ResultSetMetaData rsmd=rs.getMetaData();
                 while(rs.next())
                 {
                     reginit[sem][k]=rs.getString(1);
                     k++;                 
                }               
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }        
        }     
        for(int y=0;y<9;y++)
        {
              for(int z=0;z<150;z++)
              {
                   if(reginit[y][z]!=null)
                   {                  
                   }
                   else
                   {
                       reginit[y][z]="empty";
                   }             
              }                              
        }                           
    }
    
    public void empty()
    {
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
    }
   
    public void add(JTable table)
    {
        int rowchecker=0;       
        for(int i=0;i<table.getRowCount();i++)
        {        
            try
            {                
                ps=con.prepareStatement("update "+choice+" set sub1=?,sub2=?,sub3=?,sub4=?,sub5=?,sub6=?,sub7=?,sub8=?,sub9=? where RegisterNumber=?");
                for(int j=0;j<table.getColumnCount();j++)
                {
                    if(j==0)
                    {
                        ps.setString(10, table.getValueAt(i,0).toString());
                    }
                    else
                    {
                        datas[i][j]=table.getValueAt(i,j).toString();
                        ps.setString(j, datas[i][j]);
                    }
                }            
                rowchecker=rowchecker+ps.executeUpdate();
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(null, "Empty Values Found");
            }
            catch(Exception e)
            {                    
            System.out.println(e);
            }            
        }                   
        if(rowchecker!=0)
        {
        JOptionPane.showMessageDialog(null,rowchecker+" / "+table.getRowCount()+" Rows Added",null,JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    private Image fitimage(Image img,int w, int h)
    {
        BufferedImage resizedimage=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2=resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img,0,0,w,h, null);
        g2.dispose();
        return resizedimage;    
    }
    
    public static void main(String args[]) {    
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
            java.util.logging.Logger.getLogger(helper2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helper2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helper2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helper2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helper2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton BSAVE;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JRadioButton c0;
    private javax.swing.JRadioButton c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    protected javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    protected javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    protected javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    protected javax.swing.JTextField jTextField2;
    protected javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JCheckBox lateral;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JPasswordField p5;
    private javax.swing.JPasswordField p6;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text10;
    private javax.swing.JTextField text11;
    private javax.swing.JTextField text12;
    private javax.swing.JTextField text13;
    private javax.swing.JTextField text14;
    private javax.swing.JTextField text15;
    private javax.swing.JTextField text16;
    private javax.swing.JTextField text17;
    private javax.swing.JTextField text18;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    private javax.swing.JTextField text7;
    private javax.swing.JTextField text8;
    private javax.swing.JTextField text9;
    // End of variables declaration//GEN-END:variables
}


class Mailer {  
    

    
        public  static int send(final String from,final String password,String to[],String sub,String msg){  
            
//Get properties object    
              Properties props = new Properties();    
              props.put("mail.smtp.host", "smtp.gmail.com");    
              props.put("mail.smtp.socketFactory.port", "465");    
              props.put("mail.smtp.socketFactory.class",    
                        "javax.net.ssl.SSLSocketFactory");    
              props.put("mail.smtp.auth", "true");    
              props.put("mail.smtp.port", "465");    
              //get Session   
              Session session = Session.getDefaultInstance(props,    
               new javax.mail.Authenticator() {    
               @Override
               protected PasswordAuthentication getPasswordAuthentication() {    
               return new PasswordAuthentication(from,password);  
               }    
              });    
              //compose message    
              try
              {    
               MimeMessage message = new MimeMessage(session);    
               for(int i=0;i<to.length;i++)
               {
               message.addRecipient(Message.RecipientType.TO,new InternetAddress(to[i]));    
               }
               message.setSubject(sub);    
               message.setText(msg);    
               //send message  
               Transport.send(message);    
               JOptionPane.showMessageDialog(null,"Mail Sent Successfully");
               
              }
              catch(AuthenticationFailedException ex)
              {
                  JOptionPane.showMessageDialog(null,"Username and Password Don't Match",null,JOptionPane.ERROR_MESSAGE);
                  return 0;
                  
              }
              catch (MessagingException e)
              {               
                JOptionPane.showMessageDialog(null,e,null,JOptionPane.ERROR_MESSAGE);
                return 0;
              }
        
                 return 1;
        } 
    }
