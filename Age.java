// WAP to divide people into 3 age groups depending upon their age

import java .util.Scanner;
public class Age
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Your Age: ");
        int age = sc.nextInt();

        if(age<=12)
            System.out.println("You are child");
        else if (age>12 && age<18)
            System.out.println("Your are Teenager");
        else
            System.out.println("You are adult ");
    }
}
