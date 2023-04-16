//Example code for taking integer input in java

import java.util.Scanner;
public class User_Input
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        System.out.println(num);
        num=num+5;
        System.out.println(num);
    }
}
