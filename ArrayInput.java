import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput 
{
    static void change_array(int[] arr)
    {
        System.out.println("Print after changing elements" );
        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=0;
        }
    }
    static void printArray(int[] arr)
    {
        System.out.println("Print array elements");
            for(int i =0; i < arr.length; i++)
              System.out.println(arr[i]+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements ");
        for(int i =0; i<arr.length; i++)
            arr[i]=sc.nextInt();

        System.out.println("Print Original Array ");
        printArray(arr);

             // copy array with no reflection
        //Print copied array with .clone method 
        int[] arr_2=arr.clone();
        System.out.println("Print copied array with .clone method ");
        printArray(arr_2);
    
        change_array(arr);
        printArray(arr);
        System.out.println("After copied array after changing");
        printArray(arr_2);

       // Mutidimensional Array
       int[][] m={{1,2,3},{4,6},{7,8}};
       for(int i = 0; i < m.length; i++)
       {
        System.out.print("{");
        for(int j =0; j<m[i].length; j++)
        
            System.out.print(m[i][j]+",");
            System.out.print("}");
       }

       // Array.copyOf();

       int[] arrcopy= Arrays.copyOf(arr,arr.length);
       System.out.println("\n Copied array of arr ");
       printArray(arrcopy);

       //copy only first 2 element
       int[] arr2copy= Arrays.copyOf(arr,  2);
       System.out.println("copy only first 2 element of arr");
       printArray(arr2copy);

       //copyOfRange
       int[] copyOfRange =Arrays.copyOfRange(arr_2, 0,4);
       System.out.println("Copied arr_2 from index 1 to 4");
       printArray(copyOfRange);

       
    } 
}
