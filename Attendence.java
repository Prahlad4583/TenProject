package TenProjectlaptop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Random;
import java.util.Date;

public class Attendence  {
    static   Random pwd1;
    static int passw;
    static String  n,r,d, m,em,Name1,UserId;
    private static String getCurrentTime() {
        return new Date().toString().substring(11, 19);
    }
    void login() {
        JFrame f = new JFrame("LOGIN PAGE");
        JPanel p = new JPanel();
        f.setBounds(100, 100, 500, 430);
        p.setBounds(10, 10, 760, 370);
        p.setBackground(Color.decode("#93dbed"));
        JLabel l = new JLabel("UserId");
        JLabel l1 = new JLabel("Password");
        JLabel l3 = new JLabel();
        l.setBounds(20, 20, 80, 30);
        l1.setBounds(20, 80, 80, 30);
        l3.setBounds(60, 200, 400, 30);

        JTextField tf = new JTextField();
        JPasswordField pwd = new JPasswordField();
        tf.setBounds(130, 20, 300, 30);
        pwd.setBounds(130, 80, 300, 30);
        JButton LLogin = new JButton("Login");
        JButton Register = new JButton("Register");
        JButton pres = new JButton("Present");
        JButton forget = new JButton("Forget");
        LLogin.setBackground(Color.decode("#77d4b3"));
        Register.setBackground(Color.decode("#4287f5"));
        pres.setBackground(Color.decode("#77d4b3"));
        forget.setBackground(Color.decode("#77d4b3"));
        LLogin.setBounds(130, 140, 100, 30);
        Register.setBounds(300, 140, 100, 30);
        pres.setBounds(550, 330, 100, 30);
        forget.setBounds(130, 250, 100, 30);

        JLabel showl = new JLabel();
        showl.setBounds(50, 200, 200, 30);

        String[] columnNames = {"Name", "UserID", "     "};
        Object[][] data = {};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

        JTable jt = new JTable(tableModel);
        JScrollPane sc = new JScrollPane(jt);
        jt.setBackground(Color.LIGHT_GRAY);
        jt.setBounds(490, 100, 260, 200);
        sc.setBounds(490, 100, 260, 200);

        f.setLayout(null);
        p.setLayout(null);
        f.add(p);
        p.add(l);
        p.add(l1);
        p.add(forget);
        p.add(tf);
        p.add(pwd);
        p.add(LLogin);
        p.add(Register);
        p.add(l3);
        p.add(showl);
        forget.setVisible(false);
        jt.setVisible(false);
        f.setVisible(true);


        JFrame f1 = new JFrame("TCG ENROLLMENT");
        JPanel panel = new JPanel();
        f1.setBackground(Color.decode("#9677d4"));
        panel.setBackground(Color.decode("#9677d4"));
        f1.setBounds(500, 100, 420, 420);
        panel.setBounds(5, 5, 410, 410);
        JLabel Title = new JLabel("TCG ENROLLMENT");
        JLabel Name = new JLabel("Name");
        JLabel Rank = new JLabel("Rank");
        Title.setFont(new Font("Arial", Font.PLAIN, 20));
        Title.setBounds(110, 5, 200, 30);
        Name.setBounds(30, 50, 70, 25);
        Rank.setBounds(30, 90, 70, 25);

        JLabel Domain = new JLabel("Domain");
        JLabel Mobile = new JLabel("Mobile No.");
        JLabel Email = new JLabel("UserId");
        Domain.setBounds(30, 130, 70, 25);
        Mobile.setBounds(30, 170, 70, 25);
        Email.setBounds(30, 210, 70, 25);
        f1.setLayout(null);
        panel.setLayout(null);
        f1.add(panel);
        panel.add(Title);
        panel.add(Name);
        panel.add(Rank);
        panel.add(Domain);
        panel.add(Mobile);
        panel.add(Email);
        JTextField Namet = new JTextField();
        JTextField Rankt = new JTextField();
        JTextField Domaint = new JTextField();
        JTextField Mobilet = new JTextField();
        JTextField Emailt = new JTextField();
        Namet.setBounds(100, 50, 200, 20);
        Rankt.setBounds(100, 90, 200, 20);
        Domaint.setBounds(100, 130, 200, 20);
        Mobilet.setBounds(100, 170, 200, 20);
        Emailt.setBounds(100, 210, 200, 20);
        JButton SUBMIT = new JButton("SUBMIT");
        JButton Login = new JButton("Login");
        SUBMIT.setBounds(150, 260, 100, 25);
        Login.setBounds(150, 300, 100, 25);

        JLabel show = new JLabel();
        JLabel show1 = new JLabel();
        JLabel show2 = new JLabel();
        show.setBounds(100, 325, 300, 25);
        show1.setBounds(100, 350, 300, 25);
        show2.setBounds(100, 375, 300, 25);

        panel.add(Namet);
        panel.add(Rankt);
        panel.add(Domaint);
        panel.add(Mobilet);
        panel.add(Emailt);
        panel.add(SUBMIT);
        panel.add(Login);
        panel.add(show);
        panel.add(show1);
        panel.add(show2);

        n = Namet.getText();
        r = Rankt.getText();
        d = Domaint.getText();
        m = Mobilet.getText();
        em = Emailt.getText();

    LLogin.addActionListener(e -> {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence", "root", "12345");
                    Statement smt = con.createStatement();

                    String qr = "Select * from Employees";
                    ResultSet rs = smt.executeQuery(qr);
                    while (rs.next()) {
                        Name1 = rs.getString("Name");
                        String Password = rs.getString("Password");
                        UserId = rs.getString("UserId");

                        if (tf.getText().equals(UserId) && pwd.getText().equals(Password)) {
                            p.add(pres);
                            f.setBounds(100, 100, 800, 430);
                            p.add(sc);
                            jt.setVisible(true);
                            Object[] data2 = {Name1, UserId,};
                            tableModel.addRow(data2);

                        } else {
                            showl.setText("please register before login");
                            forget.setVisible(true);
                        }
                    }
                } catch (Exception t) {
                    System.out.println(t);
                }
        });

        pres.addActionListener(e -> {
                    String time = getCurrentTime();
                    String mor = "Morning";
                    String aft = "Afternoon";
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence", "root", "12345");
                        //Statement smt = con.createStatement();
                        //smt.execute("create table Attendence(SNo int AUTO_INCREMENT PRIMARY KEY, Name varchar(25),UserID varchar(25),Time varchar(20))");
                        PreparedStatement psmt = con.prepareStatement("insert into Attendence values(?,?,?,?)");
                        psmt.setInt(1, 0);
                        psmt.setString(2, Name1);
                        psmt.setString(3, UserId);
                        psmt.setString(4, time);
                        psmt.executeUpdate();

                        if (time.compareTo("10:00:00") >= 0 && time.compareTo("12:00:00") < 0) {

                            Object[] data1 = {mor, time, ""};
                            tableModel.addRow(data1);
                        }
                        if (time.compareTo("12:00:00") >= 0 && time.compareTo("17:00:00") <= 0) {
                            Object[] data1 = {"", aft, time};
                            tableModel.addRow(data1);
                        }
                    } catch (Exception ll) {
                        System.out.println(ll);
                    }
                });

    Register.addActionListener(e -> {

                f1.setVisible(true);
                f.setVisible(false);
                showl.setText("");
                tf.setText("");
                pwd.setText("");
                jt.setVisible(false);
                forget.setVisible(false);
                showl.setText("");
        });

    SUBMIT.addActionListener(e ->  {
                pwd1 = new Random();
                passw = pwd1.nextInt(1111, 9999);
                n = Namet.getText();
                r = Rankt.getText();
                d = Domaint.getText();
                m = Mobilet.getText();
                em = Emailt.getText();
                if (!n.equals("") && !r.equals("") && !d.equals("") && !m.equals("") && !em.equals("")) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence", "root", "12345");
                        Statement smt = con.createStatement();
                        //  smt.execute("create Database Employees");
//                         smt.execute("create table Employees(id int AUTO_INCREMENT PRIMARY KEY,Name varchar(15),Rank1 varchar(20)," +
//                          "Domain varchar(20),Mobile_NO varchar(10),UserId varchar(25),Password varchar(10))");
//                        System.out.println("table created sucessfully");

                        String emailQuery = "SELECT * FROM Employees WHERE UserId = ?";
                        PreparedStatement emailStatement = con.prepareStatement(emailQuery);
                        emailStatement.setString(1, em);
                        ResultSet emailResult = emailStatement.executeQuery();

                        if (emailResult.next()) {
                            // email already exists in the database
                            show.setText("You are already registered");
                            show1.setText("");
                        } else {
                            PreparedStatement psmt = con.prepareStatement("insert into Employees values(?,?,?,?,?,?,?)");
                            psmt.setInt(1, 0);
                            psmt.setString(2, n);
                            psmt.setString(3, r);
                            psmt.setString(4, d);
                            psmt.setString(5, m);
                            psmt.setString(6, em);
                            psmt.setInt(7, passw);

                            psmt.executeUpdate();
                            System.out.println(passw + "\t" + em);
                            show.setText("Your Registration is done");
                            show1.setText("Your password is  " + passw);
                        }
                    } catch (Exception y) {
                        System.out.println(y);
                    }
                } else {
                    show.setText("Please fill any details");
                    show1.setText("");
                }
    });

    Login.addActionListener(e -> {
                f1.setVisible(false);
                f.setVisible(true);
        });

    forget.addActionListener(e ->   {
                forget();
                forget.setVisible(false);
                showl.setText("");
        });
    }
    void forget(){
        JFrame fo=new JFrame("Forget Password");
        JLabel l = new JLabel("UserId");
        JLabel l1 = new JLabel("Mobile NO.");
        JLabel l2 = new JLabel("ReEnter Password");
        JLabel show = new JLabel();
        fo.setBounds(700,100,300,300);
        l.setBounds(20, 20, 80, 30);
        l1.setBounds(20, 60, 100, 30);
        l2.setBounds(20, 100, 120, 30);
        show.setBounds(20, 200, 250, 30);
        JTextField tf = new JTextField();
        JTextField mob = new JTextField();
        JTextField repa=new JTextField();
        tf.setBounds(100, 20, 170, 25);
        mob.setBounds(100, 80, 170, 25);
        repa.setBounds(100, 130, 170, 25);
        JButton reset = new JButton("Reset");
        JButton submit = new JButton("Submit");
        reset.setBackground(Color.decode("#77d4b3"));
        submit.setBackground(Color.decode("#77d4b3"));
        reset.setBounds(130, 140, 100, 30);
        submit.setBounds(130, 170, 100, 30);
        fo.add(l);
        fo.add(l1);
        fo.add(show);
        fo.setLayout(null);
        fo.add(reset);
        fo.add(tf);
        fo.add(mob);
        fo.add(submit);
        submit.setVisible(false);
        fo.setVisible(true);

        reset.addActionListener(e ->  {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence", "root", "12345");
                    Statement smt = con.createStatement();

                    String qr = "Select * from Employees";
                    ResultSet rs = smt.executeQuery(qr);
                    while (rs.next()) {
                        UserId = rs.getString("UserId");
                        String mobile = rs.getString("Mobile_NO");

                     if (tf.getText().equals(UserId) && mob.getText().equals(mobile)) {
                            l1.setText("Enter password");
                            fo.add(l2);
                            reset.setVisible(false);
                            submit.setVisible(true);
                                mob.setText("");
                                fo.add(repa);
                        } else {
                            System.out.println("Enter correct");
                       }
                    }
                } catch (Exception y) {
                    System.out.println(y);
                }
        });

     submit.addActionListener(e ->  {

                try {
                    String emailId = tf.getText();
                    String password = repa.getText();
                    if (repa.getText().equals(mob.getText())) {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Attendence", "root", "12345");

                        String sql = "UPDATE Employees SET Password = ? WHERE UserId = ?";
                        PreparedStatement stmt = con.prepareStatement(sql);

                        stmt.setString(1, password);
                        stmt.setString(2, emailId);

                        int rowsUpdated = stmt.executeUpdate();
                        if (rowsUpdated > 0) {
                            show.setText("Password updated successfully");
                            System.out.println("Password updated successfully");

                        } else {
                            show.setText("Password update failed");
                            System.out.println("Password update failed");
                        }
                    } else {
                        show.setText("Enter same password");
                        System.out.println("Enter same password");
                    }
                } catch (Exception ee) {
                    System.out.println(ee);
                }
        });
    }
    public static void main(String[] args) throws SQLException {
        Attendence t=new Attendence();
        t.login();
    }
}
