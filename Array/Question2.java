// Check if the given array is sorted or not

import java.util.Arrays;
import java.util.Scanner;
public class Question2
{
  static boolean isSorted(int[] arr)
  {
    boolean check = true;
    for(int i = 1; i < arr.length; i++)
    {
      if(arr[i] < arr[i-1])
      {
        check = false;
        break;
      }
    }
     return check;
  }

  static void sorted(int[] arr)
  {
    Arrays.sort(arr);
    for(int i = 0; i<arr.length; i++)
      System.out.println(arr[i]);
  }

  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Please Enter Array Size");
     int n = sc.nextInt();
    
     int[] arr = new int[n];
     System.out.print("Please Enter"+n+" Array Elements");
     for(int i = 0; i<arr.length; i++)
        arr[i]=sc.nextInt();

    System.out.println("Is Sorted "+(isSorted(arr) ));
    sorted(arr);
  }
}