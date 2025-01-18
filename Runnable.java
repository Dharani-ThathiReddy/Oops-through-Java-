class Multi implements Runnable {
public void run () {
for( int i =0 ; i < 5 ; i++){
System.out.println( "THREAD");
try {
Thread.sleep(2000);
}catch( Exception e) {
System.out.println( e);
}
}
}
}

class Main {
public static void main ( String args[] ) {
Multi m = new Multi ( );
Thread t1 = new Thread ( m);
t1.start();
for( int i =0 ; i < 5 ; i++){
System.out.println( "MAIN THREAD");
try {
Thread.sleep(1000);
}catch( Exception e) {
System.out.println( e);
}
}
}
}

