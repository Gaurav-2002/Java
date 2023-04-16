import java.util.Scanner;
public class MatrixRotate 
{
    static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int[] arr)
    {
        int i = 0; int j = arr.length-1;

        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    
    static void transposeInPlace(int[][] matrix , int r, int c)
    {
        for(int i = 0; i < c; i++)
        {
            for(int j = i; j < r; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void rotateMatrix(int[][] matrix, int n)
    {
        transposeInPlace(matrix, n, n);
        for(int i = 0; i < n; i++)
        {
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number of Rows for Matrix ");
        int r = sc.nextInt();
        System.out.println("Please Enter Number of Columns for Matrix ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Please Enter "+ r * c+ " Elements for Matrix " );
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix ");
        printMatrix(matrix);
        rotateMatrix(matrix, r);

        System.out.println("Rotation of Matrix ");
        printMatrix(matrix);
    }
}
