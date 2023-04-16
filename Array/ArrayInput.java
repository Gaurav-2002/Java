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

        printArray(arr);

             // copy array with no reflection 
        int[] arr_2=arr.clone();
        System.out.println("print arry_2");
        printArray(arr_2);
    
        change_array(arr);
        printArray(arr);
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

       
    } 
}
