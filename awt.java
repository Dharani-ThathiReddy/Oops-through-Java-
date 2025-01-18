import java.awt.*;
 
 class AWT extends Frame {
/* AWT () {
Button b = new Button( "Start");
b.setBounds( 40 , 100 , 80 , 30);                  // by extending Frame class
b.setBackground( Color.blue);
add(b);
setSize( 300 , 300);
setTitle("First One!!!");
setLayout( null );
setVisible(true);
}*/
AWT (  ) {
Frame f =  new Frame ( );
Button b = new Button("HELLO");
b.setBounds( 50 , 90 , 90 , 40);
b.setBackground( Color.white);
f.add(b);
f.setSize( 400 ,400);

f.setLayout( null);
f.setVisible( true);
}
}

class Main {
public static void main ( String args[] ) {
AWT a = new AWT ();
//AWT b = new AWT ( true);

}
}
