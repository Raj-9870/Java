import java.util.*;
public class TypeCasting
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        //Here if we give input integer then the program will execute
        // but suppose we get a situation where the inside the program datatype is 
        //is smaller at left side and right side is bigger one then the program will give us error.
        float num=sc.nextFloat();
        System.out.print("Number entered is:"+num);
    }
}