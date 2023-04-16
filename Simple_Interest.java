// Example code for calculation of simple interest:


import java.util.Scanner;
public class Simple_Interest
{
    public static void main(String[] args)
    {
     // create an object of Scanner class
     Scanner sc = new Scanner(System.in);
     //take input from user
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        double interest =(principal*time+rate)/100;
        System.out.println("Principal: "+principal);
        System.out.println("Interest Rate: "+ rate);
        System.out.println("TIme Duration: "+ time);
        System.out.println("Simple Interest: "+ interest);

        }
    }

