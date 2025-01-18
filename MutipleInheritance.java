interface Vehicle {
default void display(){
System.out.println("VEHICLE NO : 123456789");
}
}

interface A extends Vehicle{
void getName();
}

interface B extends Vehicle{
void getType();
}

class Bike implements A , B {
public void getName() {
System.out.println("BIKE");
}
public void getType() {
System.out.println("TWO WHEELER");
}
}

class Main {
public static void main ( String args[] ) {
Bike b = new Bike();
b.getType();
b.display();
}
}
