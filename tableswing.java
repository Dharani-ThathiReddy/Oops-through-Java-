import javax.swing.*;
class Table extends JFrame {
Table() {
String[][] data = { { "2", "Lally"} , { "3", "Vijay"} , {"4", "Arjun"} };
String[] columns = { "id" , "name"};
JTable t = new JTable(data ,columns);
t.setBounds( 50 , 80 , 300 , 400);
JScrollPane s = new JScrollPane();
setSize( 300 , 300);
setVisible( true);
add( s);
add(t);
}

public static void main ( String args[] ) {
new Table();
}
}




