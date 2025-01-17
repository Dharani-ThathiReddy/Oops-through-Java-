import java.util.*;

 class StringPalindrome{
 void Palindrome( String name){
 int len = name.length();
 int j = len-1;
 for( int i = 0 ; i<(len/2) ; i++) {
 if( name.charAt(i) != name.charAt(j)){
 System.out.println("NOT A PALINDROME");
 return;
 }
 else{
 j--;
 }
 
 }
 System.out.println("PALINDROME");
 }
 }
 
 class Main {
public static void main ( String args[] ){
Scanner s = new Scanner(System.in);
String n = s.next();
StringPalindrome st = new StringPalindrome();
 st.Palindrome(n);
}
}

 
 
 
 
 
 
 
 
 
 
 
 
 
