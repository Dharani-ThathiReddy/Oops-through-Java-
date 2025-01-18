import java.util.Scanner;


class Train {
int total_tickets;
Train( int t){
total_tickets = t;
}
}

class BookTicket extends Thread{
int person_id , n;
Train t;
BookTicket(Train t , int person_id , int n){
this.t= t;
this.person_id = person_id;
this.n = n;
}

synchronized boolean checkBerth ( int n ) {
if ( n <= t.total_tickets) {
 return true;
 }
 return false;
}


public void run() {
synchronized ( t) {
if ( checkBerth( n) ) {
t.total_tickets -= n ; 
System.out.println( "Tickets are booked ");
printTicket( person_id , n);
}
else {
System.out.println( "Only " +t.total_tickets + "  tickets  are availaible");
}
}
}

synchronized void printTicket( int person_id , int n) {
System.out.println( "The ticket referencing the booking id " +person_id  +" is been booked ");
System.out.println( "No.of persons travelling : " +n);
}

}

class Main {
public static void main ( String args[] ) {
Scanner sc = new Scanner(System.in);
Train t = new Train( 10);
for( int i = 0 ; i < 3 ; i++){
System.out.println("Enter no.of tickets you want to book");
int n = sc.nextInt();
BookTicket b = new BookTicket( t, i + 1 , n);
b.start();
try {
b.join();
}catch(InterruptedException e) {
System.out.println( e);
}
}
}
}





