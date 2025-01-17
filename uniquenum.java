import java.util.*;
class UniqueNum {
boolean isDuplicate( int a[] , int num , int count){
for(int i=0 ; i<count ; i++){
if(a[i]==num){
return true;
}
}
return false;
}
void display( int a[] , int count){
for(int i=0 ; i<count ; i++){
System.out.print(a[i]+" ");
}
}
}
class Main{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int count =0, num;
UniqueNum key = new UniqueNum();
int a[] = new int[5];
System.out.println("Enter the numbers between 10 to 100");
while(count < 5){
num=s.nextInt();
if( num >=10 && num<=100){
if (key.isDuplicate(a , num , count )==true){
System.out.println("The number already exists in the list");
System.out.println("The existing unique numbers are");
key.display( a,  count);
}
else{
a[count]=num;
count++;
}
}
else{
System.out.println("ERROR!!  Enter the numerical values between 10 and 100");
}
}
System.out.println("The total list of unique values is:");
key.display( a , count);
}
}




