import java.util.Scanner;

public class MultidimensionalArray 
{
    static void printArray(int[][] arr)
    {   
        System.out.println("Print Multidimensional Array ");
        for(int i = 0; i < arr.length; i++)//row
        {
            for(int j = 0; j < arr[i].length; j++)//column
            {
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter Number of Rows: ");
    int r = sc.nextInt();
    System.out.println("Please Enter Number of Columns: ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c]; // total elements = r * c =
    System.out.println("Enter "+ r*c+" elements ");
    for(int i = 0; i < r; i++)// rows
    {
        for(int j = 0; j < c; j++)// columns
        {
            arr[i][j] = sc.nextInt();
        }
    }

    printArray(arr);
  }  
}
