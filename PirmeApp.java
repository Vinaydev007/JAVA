import java.util.scanner;
class PrimeApp
{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number:");
int a=scan.nextInt();
prime p=new prime();
boolean res =p.isprime();
if(res==true)
{
System.out.println("entered number is prime");
}
else
{
System.out.printl("entered number is not a prime");
}
}
}
