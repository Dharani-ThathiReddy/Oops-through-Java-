class Main {
public static void main(String args[] ){
String str = "HELLO";
try{
int num = Integer.parseInt(str);
System.out.println("No exception");
}catch(Exception e) {
System.out.println(e);
}
}
}
