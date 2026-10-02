import java.util.*;
public class Temprature
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Temprature in celcius:");
        float cel=sc.nextFloat();
        float faren=(cel*9/5)+32;
        System.out.print("The"+" " +cel +" "+"degree celcius" +" "+"in farenheit is:"+faren);
    }
}