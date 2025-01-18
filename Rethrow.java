class ReThrow{
public static void main ( String args[] ){
try{
 methodOne();
 }catch(Exception e){
System.out.println("Exception of rethrow caught");
}
}

public static void methodOne()  throws Exception{
try{
 methodTwo();
 }catch(Exception e){
System.out.println("Exception of methodTwo()");
throw e;
}
}

public static void methodTwo() throws Exception {
throw new Exception ("Exception in methodTwo");
}


}
