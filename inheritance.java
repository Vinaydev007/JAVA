class vehicle{
    int wheels;
   void start(){
        System.out.println("starting the car");
    }
}
class car extends vehicle{
    char modelname;
   void boost(){
        System.out.println("leveling power up");
    }
}
public class inheritance{
public static void main (String[]args){
    car car1=new car();
    car1.wheels=4;
    car1.start();
}
}