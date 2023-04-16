// Find the total number of pairs int the Array whose sum is equal to the given value x.

import java.util.Scanner;

public class TriplePairSum 
{
    static int triplepairsum(int[] arr, int target) 
    {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                for(int k = j+1; k<n; k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    ans++;
                }
            }
        }
        return ans;
    }
  

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Array Size ");
        int n = sc.nextInt();   //5 
        int arr[] = new int[n]; 
        System.out.println(" Please Enter Array Elements ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt(); //1 4 5 6 3
        }
        System.out.println("Please Enter Target Sum "); //12   (1,5,6) (4,5,3)
        int target=sc.nextInt();
       System.out.println("Pair of Target Sum = "+triplepairsum(arr,target));// output = 2

    }

}
