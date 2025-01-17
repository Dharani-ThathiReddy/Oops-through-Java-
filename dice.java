import java.util.*;

class Main {
public static void main (String argas[] ) {
Roll a = new Roll();
a.dice();
}
}

class Roll {
Random r = new Random ();
int sucess =0;
Scanner sc = new Scanner(System.in);
void dice( ) {
for( int i =0 ; i<5 ; i++){
int d1 = r.nextInt(6) + 1;
int d2 = r.nextInt(6) +1;
System.out.println("The outputs are : " +d1 +" " +d2);
if( d1==d2){
sucess++;
}
try {
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println(e.getMessage());
}
}
System.out.println("The no.of attempts are: " +sucess);
}
}



