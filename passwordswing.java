import javax.swing.*;

class Password extends JFrame {
Password() {
super( "FRAME");
JLabel l = new JLabel ("Password");
JPasswordField p = new JPasswordField(  );
l.setBounds( 50 , 100 , 100 , 30);
p.setBounds( 150 , 100 , 100 , 30);
add(l);
add(p);
setSize( 300, 300);
setLayout(null);
setVisible(true);
}
}

class Main {
public static void main ( String args[] ){
new Password();
}
}
