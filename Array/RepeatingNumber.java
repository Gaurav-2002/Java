//  Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no value is being repeated return -1.

import java.util.Scanner;
public class RepeatingNumber 
{
    static int firstRepeatingNumber(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if( arr[i]== arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("First Repeating Number in given Array is = "+firstRepeatingNumber(arr));
    }
}
