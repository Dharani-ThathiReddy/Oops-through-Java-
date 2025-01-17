import java.util.*;

class Book {
String name , author ;
int count;
void display( ){
System.out.println(name + " "+author+" "+count);
}
}

class Customer{
int cus_id ;
String cus_name , cus_add;
}

class Main{
public static void main(String args[] ){
Scanner sc = new Scanner(System.in);
Book b[] = new Book[4];
Book obj = new Book();
System.out.println("Enter books details");
for( int i = 0 ; i <3 ; i++){
b[i] = new Book();
b[i].name = sc.next();
b[i].author = sc.next();
b[i].count= sc.nextInt();
}
System.out.println("Enter the book name you want to enter :");
String key = sc.next();
int sold = 0;
for( int i = 0 ; i <3 ; i++){
if((b[i].name.equals(key))) {
sold++;
b[i].count--;
b[i].display();
break;
}
}
if(sold==0){
System.out.println("NOT FOUND");
}
}
}







