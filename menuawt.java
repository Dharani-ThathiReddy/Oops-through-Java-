import java.awt.*;

class MyMenu extends Frame {
MyMenu () {
super( "FRAME TITLE ");
MenuBar menubar = new MenuBar();
this.setMenuBar(menubar);
Menu menu = new Menu("FILE");
menubar.add(menu);
MenuItem item1 = new MenuItem("EDIT");
MenuItem item2 = new MenuItem( "INSERT");
MenuItem item3 = new MenuItem( "DELETE");
menu.add(item1);
menu.add(item2);
menu.add(item3);
this.setVisible(true);
this.setSize( 500 , 500);
}
}

class Main {
public static void main ( String args[] ) {
MyMenu m = new MyMenu () ;
}
}
