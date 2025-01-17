abstract class Emp {
abstract void calSalary();
abstract void display();
String name;
double salary , bonus ;
Emp ( String name , double salary , double bonus){
this.name=name;
this.salary=salary;
this.bonus=bonus;
}
}

class Manager extends Emp {
Manager( String name , double salary , double bonus ) {
super(name,salary,bonus);
}
void calSalary() {
System.out.println( (salary + bonus));
}
void display() {
System.out.println( name + " " +salary +" "+bonus);
}
}

class Worker extends Emp {
Worker( String name , double salary , double bonus ) {
super(name,salary,bonus);
}
void calSalary() {
System.out.println( (salary + bonus));
}
void display() {
System.out.println( name + " " +salary +" "+bonus);
}
}

class Sales extends Manager{
Sales( String name , double salary , double bonus ) {
super(name,salary,bonus);
}

}

class Main {
public static void main (String args[] ) {
Sales s = new Sales ( "ERT",60000,4000);
s.display();
s.calSalary();
}
}



