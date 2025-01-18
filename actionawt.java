import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener {
TextField t1;
AEvent () {
super( "FRAME");
 t1 = new TextField();
t1.setBounds( 50 , 100 , 100 , 30);
t1.setBackground( Color.white);
Button b1 = new Button("Enter");
b1.setBounds( 50 , 150 , 100 , 30);
b1.setBackground( Color.white);
add(b1);
add(t1);
setLayout(null);
setVisible( true);
setSize( 300 , 300);
b1.addActionListener(this);
}
public void actionPerformed( ActionEvent a ) {
t1.setText( "YOU'RE IN !!!");
//System.out.println("Entered Text: " + t1.getText());
}
}


class Main {
public static void main ( String args[] ) {
new AEvent();
}
}


