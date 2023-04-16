// WAP to display Transpose of a matrix entered by user 

import java.util.Scanner;
public class MatrixTranspose 
{
    static void printMatrix(int[][] arr)
    {
        for( int i = 0; i < arr.length; i++)
        {
            for( int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] a, int r, int c)
    {
        int ans[][] = new int[c][r];
        for(int i = 0; i < c; i++ )
        {
            for( int j = 0; j < r; j++)
            {
                 ans[i][j] = a[j][i];
            }
        }
        return ans;

    }

 public static void main(String[] args) 
 {
    Scanner sc = new Scanner ( System.in );
    System.out.println("Please Enter Number of Rows ");
    int r = sc.nextInt();
    System.out.println("Please Enter Number of Columns ");
    int c = sc.nextInt();
    int[][] a = new int[r][c];
    System.out.println("Please Enter "+ r * c +" Elements ");
    for( int i = 0; i < r; i++ )
    {
        for( int j = 0; j < c; j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("Input Matrix ");
    printMatrix(a);
    System.out.println("Transpose of a Matrix ");
    int[][] ans = findTranspose(a, r, c);
    printMatrix(ans);

 }   
}
