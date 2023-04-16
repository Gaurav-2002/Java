// Find the total number of pairs int the Array whose sum is equal to the given value x.

import java.util.Scanner;

public class PairSum 
{
    static int pairsum(int[] arr, int target) 
    {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] + arr[j] == target)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" Please Enter Array Elements ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Please Enter Target Sum ");
        int target=sc.nextInt();
       System.out.println("Pair of Target Sum = "+pairsum(arr,target));

    }

}
