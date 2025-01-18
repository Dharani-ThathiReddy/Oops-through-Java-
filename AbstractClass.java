abstract class Employee {
abstract double getAmount();                       // can be created paramitized method , then constructors in child classes can be avoided
}

class WeeklyEmployee extends Employee {
int weeks , wages ;
WeeklyEmployee( int weeks , int wages){
this.weeks = weeks;
this.wages = wages;
}
double getAmount() {
int amount = weeks * wages;
return amount;
}
}

class HourlyEmployee extends Employee {
int hours , wages;
HourlyEmployee( int hours , int wages) {
this.hours = hours;
this.wages = wages;
}
double getAmount() {
int amount = hours * wages;
return amount;
}
}

class Main {
public static void main (String args[] ) {
HourlyEmployee h = new HourlyEmployee( 5 , 250);
System.out.println( h.getAmount() );
WeeklyEmployee w = new WeeklyEmployee( 4 , 1200);
System.out.println(w.getAmount() );
}
}


