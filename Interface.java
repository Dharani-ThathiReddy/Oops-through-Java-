interface Vehicle {
void getColour ( );
void getName( );
void getConsumption( );
}

class TwoWheeler implements Vehicle {
String colour , name;
int prize , fuel;
TwoWheeler( String colour , String name , int prize , int fuel){
this.colour=colour;
this.name=name;
this.prize=prize;
this.fuel=fuel;
}

public void getColour( ){
System.out.println("The colour of vehicle is : " +colour);
}
public void getName( ){
System.out.println("The name of vehicle is : "+name);
}
public void getConsumption( ){
System.out.println("The total consumption of vehicle is : " +prize*fuel);
}
}
  
  
  
/*class FourWheeler  extends  TwoWheeler{                                               //extend can also be used 
FourWheeler( String colour , String name , int prize , int fuel){                
super(colour , name , prize , fuel);
}
}*/




class FourWheeler implements  Vehicle {
String colour , name;                              
int prize , fuel;
FourWheeler( String colour , String name , int prize , int fuel){
this.colour=colour;
this.name=name;
this.prize=prize;
this.fuel=fuel;
}
public void getColour( ){
System.out.println("The colour of vehicle is : " +colour);
}
public void getName( ){
System.out.println("The name of vehicle is : "+name);
}
public void getConsumption( ){
System.out.println("The total consumption of vehicle is : " +prize*fuel);
}
} 

class Main {
public static void main ( String args[]){
TwoWheeler t = new TwoWheeler( "Red" , "Bike" ,  56 , 3);
t.getColour( );
t.getConsumption( );
FourWheeler f = new FourWheeler("Blue" , "Car" , 67 , 4);
f.getColour();
f.getConsumption();
}
}






