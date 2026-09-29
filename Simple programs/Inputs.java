import java.util.Scanner;
class Inputs
{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=input.nextLine();
        System.out.print("Your Name is:"+name);
    }
}