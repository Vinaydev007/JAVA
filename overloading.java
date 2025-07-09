class overloading{
    void fun(){
        System.out.println("no parameters");
    }
    void fun(int a){
        System.out.println(a+"according to the para");
    }
    
public static void main(String[]args)
{
        overloading aa=new overloading();
        aa.fun(10);
       aa.fun();
}
}
