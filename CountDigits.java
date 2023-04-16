import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter Integer Number: ");
      int n = sc.nextInt();
      int n1 = n;
      int numOfDigits =0;

      while ( n > 0 )
      {
          n = n / 10;
          numOfDigits++;
      }
        System.out.println("Number of Digits in "+ n1+" = "+numOfDigits);

    }
}
