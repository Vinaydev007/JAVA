class exceptionhandling{
    int a;
    int b;
    int c;
    String name="vinay";
public static void main(String[]args){
   exceptionhandling obj=new exceptionhandling();
   obj.a=10;
   obj.b=0;
   try{
    obj.name.charAt(6);
   obj.c=obj.a/obj.b;
   }
   catch(ArithmeticException e){
   System.out.println("exceptionhandled");
}
finally{
    System.out.println("without or with error it should be execute");
}
}
}

