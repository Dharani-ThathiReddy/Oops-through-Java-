class MyException extends Exception {
String s;
MyException( String s) {
this.s = s;
}
void printMessage() {
System.out.println( s);
}

}

class Main {
public static void main ( String args[] ) {
try {
throw new MyException( "THROWING");
}catch(MyException e) {
e.getMessage();
e.printMessage();
}
}
}
