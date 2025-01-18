class TicketCounter {
int ticket_no = 0;
int getTicket(){
ticket_no++;
System.out.println("Ticket issued ");
return ticket_no ;
}
}

class Show extends Thread {
TicketCounter ticketcounter;
int person_id;
int ticket;
Show( TicketCounter t , int id){
ticketcounter = t;
person_id = id;
}

public void run() {
ticket = ticketcounter.getTicket();
showTicket();
enterHall();
}

synchronized void showTicket () {
System.out.println("Person : " +person_id + " is showing ticket : " +ticket);
}

synchronized void enterHall() {
System.out.println("Person : " +person_id + " entered hall ");
}

}


class Main {
public static void main ( String args[] ) {
TicketCounter ticketcounter = new TicketCounter() ;               //creating the counter
for( int i = 0 ; i < 5 ; i++){
Show s = new Show( ticketcounter , i+1);
s.start();
try {
  s.join() ;                                                                              // wait for one person to finish
}catch(Exception e) {
System.out.println(e);
}
}
}
}
  


