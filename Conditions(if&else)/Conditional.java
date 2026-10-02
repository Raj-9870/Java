import java.util.*;
public class Conditional
{
    public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Your salary:");
  int salary=sc.nextInt();
  if(salary>=2000)
  {
    System.out.print("The salary will be increment by 1000:");
  }
  else
  {
    System.out.print("The salary will be increment by 2000");
  }
 }   
}