import java.awt.*;
import java.awt.event.*;

class Calc extends Frame implements ActionListener {
Button b1 , b2;
TextField t1 , t2 , t3;
Calc () {
super("CALCULATION");
b1 = new Button ( "+");
b2 = new Button ( "-");
b1.setBounds( 50,200,50,50);
b2.setBounds( 120,200,50,50);
b1.addActionListener(this);
b2.addActionListener(this);
t1 = new TextField();
t2 = new TextField();
t1.setBounds(50,50,150,20);
t2.setBounds(50,100,150,20); 
t3 = new TextField();
 t3.setBounds(50,150,150,20);
 t3.setEditable( false);
 add(b1);
 add(b2);
 add(t1);
 add(t2);
 add(t3);
 setLayout(null);
 setSize( 300 , 300);
 setVisible(true);
 
 
  /*addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
            }
        });*/
 }
 
 public void actionPerformed( ActionEvent e ) {
 try{
String s1 = t1.getText();
String s2 = t2.getText();
int a = Integer.parseInt(s1);
int b = Integer.parseInt(s2);
int c = 0;
if ( e.getSource( ) == b1) {
   c = a+b;
  }
if ( e.getSource() == b2) {
   c = a-b;
  }
 String s = Integer.toString( c); 
 t3.setText(s);
 }catch(Exception E) {
System.out.println( E);
}
}
 }
 
 class Main {
public static void main ( String args[] ) {
new Calc();
}
}   



