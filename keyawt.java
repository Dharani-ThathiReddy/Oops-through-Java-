import java.awt.*;
import java.awt.event.*;

class Key extends Frame implements KeyListener {
Label l ;
TextArea t ;
Key() {
l = new Label();
t = new TextArea();
l.setBounds( 50 , 100 , 100 , 30);
t.setBounds( 50 , 150 , 300 , 300);
t.addKeyListener( this);
setSize( 300 , 300);
setLayout( null);
add( l);
add( t);
setVisible( true);
}
public void keyPressed( KeyEvent e){
l.setText( "Pressed");
}
public void keyReleased( KeyEvent e) {
l.setText( "Released");
}  
public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }
public static void main ( String args[] ) {
new Key();
}
      
}

    
    

