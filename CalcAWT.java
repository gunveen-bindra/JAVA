//CalcAWT.java
/*
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CalcAWT extends Frame implements ActionListener
 {
 TextField t1,t2,t3;

 Label l1,l2,l3,l4,l5,l6;
 Button b1,b2,b3,b4,b5,b6;
 public CalcAWT() {
 l1= new Label("First number:");
 l2= new Label("Second number:");
 l3= new Label("Result:");


 t1= new TextField(10);
 t2= new TextField(10);
 t3= new TextField(20);

b1 = new Button("Add");
b2 = new Button("Sub");
b3 = new Button("Mul");
b4 = new Button("Div");
b5 = new Button("clear");
b6 = new Button("Exit");
 setLayout(new GridLayout(5,3));
 add(l1);
 add(l2);
 add(l3);

 add(t1);
 add(t2);
 add(t3);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 add(b5);
 add(b6);

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 setSize(500,500);
 setVisible(true);
addWindowListener(new WindowAdapter()
{ public void WindowClosing(WindowEvent we)
{ dispose();//System.exit(0);
}
 public void windowClosed(WindowEvent e) {}
});
}

 public static void main(String args[])
 {
 new CalcAWT();
 }
 public void actionPerformed(ActionEvent e)
{
 int n1 =Integer.parseInt(t1.getText());
 int n2 =Integer.parseInt(t2.getText());
 if(e.getSource()==b1)
 {
 t3.setText(String.valueOf(n1+n2));
 }
 if(e.getSource()==b2)
 {
 t3.setText(String.valueOf(n1-n2));
 }
 if(e.getSource()==b3)
 {
 t3.setText(String.valueOf(n1*n2));
 }
 if(e.getSource()==b4)
 {
 t3.setText(String.valueOf(n1/n2));
 }
 if(e.getSource()==b5)
 {
 t1.setText("");
 t2.setText("");
 t3.setText("");
 //System.exit(0);
 }
 if(e.getSource()==b6)
{
System.exit(0);
}
 }
}

*/

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CalcAWT extends Frame implements ActionListener
 {
 TextField t1,t2,t3;

 Label l1,l2,l3;
 Button b1,b2,b3;
 public CalcAWT() {
 l1= new Label("First number:");
 l2= new Label("Second number:");
 l3= new Label("Result:");



 t1= new TextField(10);
 t2= new TextField(10);
 t3= new TextField(50);

b1 = new Button("Mul");
b2 = new Button("clear");
b3 = new Button("Exit");

 setLayout(new GridLayout(3,3));
 add(l1);
 add(l2);
 add(l3);
 add(t1);
 add(t2);
 add(t3);
 add(b1);
 add(b2);
 add(b3);

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 setSize(500,500);
 setVisible(true);
addWindowListener(new WindowAdapter()
{ public void WindowClosing(WindowEvent we)
{ dispose();//System.exit(0);
}
 public void windowClosed(WindowEvent e) {}
});
}

 public static void main(String args[])
 {
 new CalcAWT();
 }
 public void actionPerformed(ActionEvent e)
{
 int n1 =Integer.parseInt(t1.getText());
 int n2 =Integer.parseInt(t2.getText());
 if(e.getSource()==b1)
 {
 t3.setText(String.valueOf(n1*n2));
 }
 if(e.getSource()==b2)
 {
 t1.setText("");
 t2.setText("");
 t3.setText("");
 //System.exit(0);
 }
 if(e.getSource()==b3)
{
System.exit(0);
}
}
}

