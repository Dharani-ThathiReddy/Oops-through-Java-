import java.util.*;
class Quadratic{
public static void main (String[] args){
double a , b, c,d,r1,r2;
Scanner qua = new Scanner(System.in);
a=qua.nextDouble();
b=qua.nextDouble();
c=qua.nextDouble();
d=(b*b ) - (4*a*c);
r1 = -b + (Math.sqrt(d)) / (2*a);
r2 = -b - (Math.sqrt(d)) / (2*a);
if(d>0){
System.out.println("Roots are real"+r1 +r2);
}
if(d==0){
System.out.println("Roots are equall"+r1 +r2);
}
if(d<0){
System.out.println("Roots are imaginary");
r1= -b/2*a;
r2 = (Math.sqrt(d)) / 2*a;
System.out.println("Real part is"+ r1 );
System.out.println("Imaginary part is"+ r2);


}
}
}






