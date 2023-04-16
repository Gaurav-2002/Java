// Find the second largest element in the given array
import java.util.Scanner;

public class FindSecondMax
{
    static int findmax(int[] arr)
    {
        int max =Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if( arr[i] > max )
            {
                max = arr[i];
            }
        }
        return max;
    }
    static int secondmax(int[] arr)
    {
        int max = findmax(arr);
        for(int i =0 ; i<arr.length; i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner (System.in);
    System.out.println("Please Enter Array Size ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Please Enter Array Elements ");
    for(int i = 0; i<arr.length; i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Maximum number of array is = "+findmax(arr));
    System.out.println("Second Maximum number of array is = "+secondmax(arr));
 }
}
