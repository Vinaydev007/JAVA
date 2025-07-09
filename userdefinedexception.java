class excephandling extends Exception{
 excephandling(String s){
        System.out.println(s);
    }
}
class userdefinedexception1{
void checkage(int age)  throws excephandling{
if(age<18){
    throw new excephandling("it is handled by user");
}
else{
    System.out.println("eligible");
}
}
}
class userdefinedexception{
    public static void main(String[]args){
       userdefinedexception1 obj=new userdefinedexception1();
       try{
        obj.checkage(10);
       }
       catch(Exception e){
         System.out.println("thrown error");
       }
    }
}