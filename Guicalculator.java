package TenProjectlaptop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guicalculator {
    static String
    s0 ,    s1 ,     s2 ;
    static JTextField tf;
    Guicalculator(){s0=s1=s2="";}
    void calculator(){
        JFrame f=new JFrame("Calculator");
        f.setSize(400,400);
        f.setLayout(null);

         tf=new JTextField("");
        tf.setBounds(10,10,360,30);
        tf.setEditable(false);

        JPanel p=new JPanel();

        p.setLayout(new GridLayout(4,4,10,10));
        p.setBounds(10,50,360,300);
        p.setBackground(Color.decode("#f5c36e"));
        f.add(p);
        JButton b0=new JButton("0");
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton badd=new JButton("+");
        JButton bsub=new JButton("-");
        JButton bmul=new JButton("*");
        JButton bdiv=new JButton("/");
        JButton bclr=new JButton("c");
        JButton beq=new JButton("=");
       f.add(tf);  p.add(b1);p.add(b2);p.add(b3);p.add(badd);p.add(b4);p.add(b5);p.add(b6);p.add(bsub);p.add(b7);p.add(b8);
        p.add(b9);p.add(bmul);p.add(bclr);p.add(b0);p.add(beq);p.add(bdiv);


        f.setVisible(true);
        ActionListener ac=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                System.out.println(s);
                //tf.setText(s);
                   if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                    if (!s1.equals("")){
                        s2 = s2 + s;}
                    else{
                        s0 = s0 + s;}

                    tf.setText(s0 + s1 + s2);
                }
                else if (s.charAt(0) == 'c') {
                     s0 = s1 = s2 = "";
                    tf.setText(s0 + s1 + s2);
                }
                else if (s.charAt(0) == '=') {
                    double te;

                    if (s1.equals("+"))
                        te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                    else if (s1.equals("-"))
                        te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                    else if (s1.equals("/"))
                        te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                    else
                        te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                     tf.setText(s0 + s1 + s2 + "=" + te);
                    s0 = Double.toString(te);
                    s1 = s2 = "";
                }
                else {
                    if (s1.equals("") || s2.equals(""))
                        s1 = s;
                    else {
                        double te;

                        if (s1.equals("+"))
                            te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                        else if (s1.equals("-"))
                            te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                        else if (s1.equals("/"))
                            te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                        else
                            te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                        s0 = Double.toString(te);

                        s1 = s;

                        s2 = "";
                    }
                    tf.setText(s0 + s1 + s2);
                }
            }
        }; b9.addActionListener(ac);
        b8.addActionListener(ac);
        b7.addActionListener(ac);
        b6.addActionListener(ac);
        b5.addActionListener(ac);
        b4.addActionListener(ac);
        b3.addActionListener(ac);
        b2.addActionListener(ac);
        b1.addActionListener(ac);
        badd.addActionListener(ac);
        bsub.addActionListener(ac);
        bmul.addActionListener(ac);
        bdiv.addActionListener(ac);
        bclr.addActionListener(ac);
        beq.addActionListener(ac);
        b0.addActionListener(ac);
    }

    public static void main(String[] args) {
        Guicalculator g=new Guicalculator();
        g.calculator();
    }
}
