import java.util.Scanner;

public class FindSecondMin
{
    static int firstmin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for( int i = 0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    static int secondmin(int[] arr)
    {
        int min = firstmin(arr);
        for( int i = 0; i < arr.length; i++)
        {
            if(arr[i]==min)
            arr[i]=Integer.MAX_VALUE;
        }
        int secondmin =firstmin(arr);
        return secondmin;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Please Enter Array Elements ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Minimum number of given Array is = "+firstmin(arr));
        System.out.println( " Second Minimum number of given Array is = "+secondmin(arr));

    }
}