import java.util.*;
class Main {
public static void main (String args[]){
int a =9;                                   // int to integer
Integer b = a;
int c = b.intValue();
System.out.println(c);
System.out.println(b);
String str = "98";                   // string to int through Integer
int i = Integer.parseInt(str);
System.out.println(i);
String s1 = Integer.toString(a);      //int to string 1
System.out.println(s1);
String s2 =String.valueOf(a);          //int to sring 2
System.out.println(s2);
String s3 = " "+a  ;                           //int to string 3
System.out.println(s3);
float d = 30000.0f;                                      //float to string
int t = (int)d;
System.out.println(t);
String s4=Float.toString(d);
int g = Integer.parseInt(d);
System.out.println(s4);

}
}
