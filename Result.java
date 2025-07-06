abstract class abstractcla{
   String name="vinay";
   abstract void marks();
}
class Score extends abstractcla{
    void marks(){
        System.out.println("he scored 90%");
    }
}
public class Result{
    public static void main(String[]args){
     Score aa=new Score();
     aa.marks();
    }
}