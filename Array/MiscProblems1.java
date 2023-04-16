
public class MiscProblems1 
{
  static int fact(int n)
  {
    int fact =1;
    for(int i = n; i>=1; i--)
    {
        fact = fact*i;
    }
   return fact;
  }
  static void Armstrong(int n)
  {
    int sum=0; int n1 = n;
    {
        while (n > 0)
        {
             int digit = n % 10;
             sum = sum + digit * digit *digit;
             n = n / 10;
        }
        if(sum==n1)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
  }
  public static void main(String[] args) 
  {
    System.out.println(fact(5));
    Armstrong(153);
  }

}
