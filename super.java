import java.util.*;
class Student {
int id ,age;
String name;
Student( int id , String name){
this.id=id;
this.name=name;
}
void display(){
System.out.println("The details of the Student are : " + id + "  "+name+" "+age);
}
}
class Details extends Student {
Details( int id , String name , int age){
super( id , name);
this.age=age;
super.display();
}
}
class Main {
public static void main (String args[]){
Details d = new Details ( 369 , "Ravi",79);
}
}




