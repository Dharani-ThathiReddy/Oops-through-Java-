class Main {
public static void main ( String args[] ) {


try {
int[] a = new int[6];
a[7] = 4;
} catch (IndexOutOfBoundsException r) {
System.out.println(r);
}
System.out.println("HELLO");


/*try {
int c = 3/0;
}catch(IndexOutOfBoundsException r){
System.out.println(r);
}*/


try {
int c = 3/0;                            //default exception
}catch(Exception r){
System.out.println(r);            
}


try {
int b = 3/0;                                                              //Mulitple catch for one try : Switch case 
}catch( IndexOutOfBoundsException r) {
System.out.println(r);
}
catch(NumberFormatException n){
System.out.println( n);
}
catch(Exception e) {                                                 //default
System.out.println( e);
}


 
try{                                                                                  // Nested try blocks
int n = 6/0;   
                           
try{
String b = null;
System.out.println(b.length());
}catch(NullPointerException p){
System.out.println(p);
}
}catch(Exception e){
System.out.println(e);
}



}
}

