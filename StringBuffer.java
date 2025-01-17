import java.util.*;
class Buffer {
StringBuffer s1= new StringBuffer("GAG");
}
class Main{
public static void main (String args[]){
Scanner s = new Scanner(System.in);
Buffer str = new Buffer();
//str.s1.append(s.nextLine());
System.out.println(str.s1);
System.out.println(str.s1.insert(2,"DD"));
System.out.println(str.s1.capacity());
System.out.println(str.s1.delete(0,1));
System.out.println(str.s1.reverse());
System.out.println(str.s1.capacity());

}
}
