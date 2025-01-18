class A {
private final static int max = 25;
private  static Object lock = new Object();
static boolean isEven = true ;

public static void main ( String args[] ) {
Thread even = new Thread(() ->{


for ( int i = 2 ; i < max ; i+=2) {
synchronized (lock) {
while( !isEven) {
try {
 lock.wait();
 }catch( Exception e) {
 e.printStackTrace();
 }
 }
 System.out.println( "The even number from even thread is : " +i);
 isEven = false;
 lock.notify();
 }
 }
 });
 
 
 Thread odd = new Thread(()-> {
for ( int i = 1 ; i < max ; i+=2) {
synchronized (lock) {
while( isEven) {
try {
 lock.wait();
 }catch( Exception e) {
 e.printStackTrace();
 }
 }
 System.out.println( "The odd number from odd thread is : " +i);
 isEven = true;
 lock.notify();
 }
 }
 });
 
 even.start();
 odd.start();
 
 }
 }
 
 
 
 
   
