// StudentinfoAWT
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class StudentinfoAWT extends Frame implements ActionListener
 {
 TextField t1,t2,t3;

 Label l1,l2,l3,l4,l5,l6;
 Button b1,b2;
 public StudentinfoAWT() {
 l1= new Label("Name:");
 l2= new Label("phone:");
 l3= new Label("Address:");
 l4= new Label("");
 l5= new Label("");
 l6=new Label("");

 t1= new TextField(10);
 t2= new TextField(10);
 t3= new TextField(20);

 b1 = new Button("submit");
 b2 = new Button("clear");
 setLayout(new GridLayout(5,3));
 add(l1);
 add(l2);
 add(l3);
 add(l4);
 add(l5);
 add(l6);
 add(t1);
 add(t2);
 add(t3);
 add(b1);
 add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);
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
 new StudentinfoAWT();

 }
 public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
 {
 String a = t1.getText();
 l4.setText(a);
 String b = t2.getText();
 l5.setText(b);
 String c = t3.getText(); 

 l6.setText(c);
 }
 else
 {
 t1.setText("");
 t2.setText("");
 t3.setText("");
 l4.setText("");
 l5.setText("");
 l6.setText("");
 System.exit(0);
 }
 }
}