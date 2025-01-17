import java.util.*;
class Prime{
public static void main (String[] args){
int b,i,j,flag=0;
Scanner fac = new  Scanner(System.in);
System.out.println("Enter a number ");
b=fac.nextInt();
System.out.println("Prime factors of a number are:");
for(i=2;i<b;i++){
if(b%i==0){
for(j=2;j<i;j++){
if(i%j==0){
flag++;
break;
}
}
if(flag==0){
System.out.println(+i);
}
}
}
}
}


