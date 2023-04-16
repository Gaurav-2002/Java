import java.util.Scanner;

public class SpiralMatrix 
{
    static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for( int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix, int r, int c)
    {
        int topRow = 0, bottomRow = r-1, rightCol = c-1, leftCol = 0;
        int totalElements = 0;

        while(totalElements < r * c)
        {
            //toprow ->  leftcolumn to right column
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++)
            {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            
            topRow++;

            // rightColumn -> toprow to bottomrow
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++)
            {
                System.out.print(matrix[i][rightCol]+ " ");
                totalElements++;
            }
            
            rightCol--;

            // bottom row -> right column to left column 
            for( int j  = rightCol; j >= leftCol && totalElements < r * c; j--)
            {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            
            bottomRow--;

            // left Column -> bottom row to top row
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--)
            {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
           
            leftCol++;
           

        }
    }

    public static void main(String[] args) 
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter Numbers Of Rows ");
      int r = sc.nextInt();
      System.out.println("Enter Numbers of Columns ");
      int c = sc.nextInt();
      int[][] matrix = new int[r][c];
      System.out.println("Enter "+ r*c+ " Elements ");
      for( int i = 0; i < matrix.length; i++)
      {
        for(int j = 0; j < matrix[i].length; j++)
        {
            matrix[i][j] = sc.nextInt();
        }
      }
      System.out.println("Given Matrix is: ");
      printMatrix(matrix);
      System.out.println("Spiral Matrix is: ");
      printSpiralOrder(matrix, r, c);

    }
}
