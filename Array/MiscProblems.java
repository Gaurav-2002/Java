import java.util.Scanner;


public class MiscProblems
{
    //Give 2 integers a and b. Swap the 2 given values using temporary variable
    static void swap(int a, int b)
    {
        System.out.println("Swap with third variable ");
        System.out.println("Original values before swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Values after swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

        //Give 2 integers a and b. Swap the 2 given values using sum and differences method.
    static void swapWithoutThirdVariable(int a , int b)
    {
        System.out.println("Swap without third variable ");
        System.out.println("original values before swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swap ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    // Reverse of an array consisting of an integer value
    static int[] reverseArray(int[] arr)
    {
       int n = arr.length;
       int[] ans = new int[n];
       int j =0;

       // traverse original array in reverse direction
       for(int i = n-1; i>=0; i--   )
       {
        ans[j++] = arr[i]; 
       }
       System.out.print("Reverse of given Array is = ");
       return ans;
      
    } 
    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
       
        
    }

     // Reverse of an array consisting of an integer value using swap
    static void reverseArrayInPlace(int[] arr)
    {
        int i = 0, j = arr.length-1;
        while( i < j )
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        System.out.println();
        System.out.print("Reverse array using swap = ");
    }
    // rotate the given array 'a' by k steps, where k is non negative.
    static int[] rotate(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for( int i = n - k; i < n; i++)
        {
            ans[j++] = arr[i];
        }
        for( int i = 0; i < n-k; i++ )
        {
            ans[j++] = arr[i];
        }
        System.out.println("After rotating array is  ");
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Please Enter Second Number ");
        int b = sc.nextInt();
        System.out.println("Please Enter Array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Please Enter Array Elements ");
        for(int i =0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        swap(a,b);
        swapWithoutThirdVariable(a, b);
        int[] ans = reverseArray(arr);
        printArray(ans);
        reverseArrayInPlace(arr);
        printArray(arr);

        System.out.println(" How many times to be rotate Array: ");
        int k = sc.nextInt();
        int[] rotateAns = rotate(arr, k);
        printArray(rotateAns);
    }
}
 