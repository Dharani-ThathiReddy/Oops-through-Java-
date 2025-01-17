import java.util.*;
class StringMethods {
String s1,s2;
void stringCompare( String s1 , String s2){
System.out.println(s1.compareTo(s2));
}
void stringEquals(String s1 , String s2){
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
}
}
class Main{
public static void main(String args[]) {
StringMethods str = new StringMethods();
Scanner s= new Scanner(System.in);
System.out.println("Enter two strings");
str.s1=s.next();
 str.s2=s.next();
/*str.stringCompare(str.s1,str.s2);
str.stringEquals(str.s1,str.s2); */
System.out.println(str.s1.length());
System.out.println(str.s1.charAt(0));
System.out.println(str.s1.indexOf("e"));
System.out.println(str.s1.length());
//String s3=str.s1.concat(str.s2);
//System.out.println(s3);
//System.out.println(str.s1.contains(str.s2));
System.out.println(str.s1.toLowerCase());
System.out.println(str.s1.lastIndexOf("l"));
System.out.println(str.s1.startsWith("h"));
//System.out.println(str.s1.substring(3,4));
System.out.println(str.s1.trim());
String s9 = str.s1.concat(str.s2);
System.out.println(s9);



}
}

