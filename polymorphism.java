class Employee {
String Fname , Lname ;
Employee( String f , String l){
Fname = f;
Lname =l;
}
String getFirstName( ){
return Fname;
}
String getLastName( ){
return Lname;
}
}

class ContractEmployee extends Employee {
String designation , dept ;
ContractEmployee( String Fname , String Lname , String design , String dept){
super(Fname , Lname);
this.dept = dept;
designation = design;
}
void getDept() {
System.out.println( dept);
}
void getDesignation() {
System.out.println( designation);
}
void getFullName() {
System.out.println( super.getFirstName() + "  " + super.getLastName());
}
}

class RegularEmployee extends Employee {
String designation , dept ;
RegularEmployee( String Fname , String Lname , String design , String dept){
super(Fname , Lname);
this.dept = dept;
designation = design;
}
void getDept() {
System.out.println( dept);
}
void getDesignation() {
System.out.println( designation);
}
void getFullName() {
System.out.println( super.getFirstName() + "  " + super.getLastName());
}
}

class WeeklyEmployee extends ContractEmployee {
int weeks , wages;
WeeklyEmployee( String Fname , String Lname , String design , String dept , int weeks, int wages) {
super( Fname , Lname , design , dept);
this.weeks= weeks;
this.wages=wages;
}
void getSalary() {
System.out.println( weeks * wages);
}
void getDesignation() {
System.out.println( "WEEKLY");
}
}


class HourlyEmployee extends ContractEmployee {
int hours , wages;
HourlyEmployee( String Fname , String Lname , String design , String dept , int hours, int wages) {
super( Fname , Lname , design , dept);
this.hours= hours;
this.wages=wages;
}
void getSalary() {
System.out.println( hours * wages);
}
void getDesignation() {
System.out.println( "WEEKLY");
}
}



class Main {
public static void main ( String args[] ){
RegularEmployee r = new RegularEmployee( "Arjun","Reddy" , "HOD" , "CSE");
r.getFullName();
ContractEmployee c = new ContractEmployee("Varun" ,"Reddy" , "DEAN", "MME");
c.getDept();
WeeklyEmployee e = new WeeklyEmployee("Aditya" , "Reddy" , "HEAD" , "ECE" , 5  ,  500);
e.getDesignation();
e.getFullName();
}
}



