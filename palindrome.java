import java.util.*;
class Main {
public static void main(String[] args) {
int a,rev=0,rem;
Scanner pal = new Scanner(System.in);
a=pal.nextInt();
int n = a;
while(a!=0){
rem=a%10;
rev=(rev*10 )+ rem;
a=a/10;
}
if(rev == n){
System.out.println("The given number is palindrome");
}
else{
System.out.println("The given number is not a palindrome");
}
}
}


