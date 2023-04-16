
import java.util.Scanner;
public class ArrayLinearSearch 
{
  void Search()
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of an array");
    int n = sc.nextInt();
    System.out.println("Enter " +n+" array elements");
    int arr[]=new int[n];
    
    for(int i =0; i<arr.length; i++)
            arr[i]=sc.nextInt();

    int ans = -1;
    System.out.println("Enter Search Maximum element ");
    int x = sc.nextInt();
    for(int i = 0; i<arr.length; i++)
    {
        if(arr[i]==x)
        {
            ans = i;
            break;
        }
    }
        if(ans ==-1)
        {
            System.out.println("Not found");
        }
        else
    
             System.out.println("Found "+x+" at index "+ans);
    
  }
    public static void main(String[] args)
    {
        ArrayLinearSearch obj = new ArrayLinearSearch();
        obj.Search();

    }


}


