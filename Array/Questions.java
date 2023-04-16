import java.util.*;
public class Questions 
{
    static int countOccurrences(int[] arr, int x)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==x)
            count++;
        }
        return count; 
    }

    /// Find the last occurrence of an element x in a given array.
    static int lastOccurrence(int[]arr, int x)
    {
        int lastIndex=-1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==x)
            lastIndex = i;
        }
        return lastIndex;
    }

    // Count the number of element strictly greater than value x

    static void countStrictly(int[] arr, int x)
    {
        int count =0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>x)
            count++;
        }
        System.out.println(count);
    }


    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of an Array ");
      int n = sc.nextInt();
      
      int[] arr = new int[n];
      System.out.println("Enter "+n+" Array Elements ");
      for(int i =0; i < n; i++)
        arr[i] = sc.nextInt();
        
     System.out.println("Enter x elements which have count ");
     int x = sc.nextInt();
     System.out.println("COUNT Of X: "+countOccurrences(arr, x));
     System.out.println("LastOccurence Of X: "+lastOccurrence(arr, x));
     countStrictly(arr,x);
     
    }
}
