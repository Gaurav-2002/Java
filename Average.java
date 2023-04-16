//Write a Java method to compute the average of three numbers

import java.util.Scanner;

public class Average{

   public static void main(String[] args)
   {

       Scanner scn = new Scanner(System.in);

       System.out.println("Enter the three numbers: ");

       int a = scn.nextInt();

       int b = scn.nextInt();

       int c = scn.nextInt();

   System.out.print("Average of Numbers: "+avg(a, b, c));

   }

   public static int avg(int a, int b, int c){

       return (a+b+c)/3;

   }

}
