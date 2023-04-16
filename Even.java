// WAP in java to enter number and check number is even or odd

import java.util.Scanner;
public class Even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Integer Number: ");
        int num = sc.nextInt();

        if(num%2==0)
            System.out.println(num+" is even number ");
        else
            System.out.println(num+" is odd number ");
    }
}
