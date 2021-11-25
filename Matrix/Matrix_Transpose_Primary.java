package Matrix;
import java.util.Scanner;

public class Matrix_Transpose_Primary
{
    public static void print(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square matrix :: ");
        int r = sc.nextInt();
        int[][] ar = new int[r][r];
        int[][] ar2 = new int[r][r];
        //Input
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                // System.out.printf("Enter the element in [%d][%d] :: ", i, j);
                // ar[i][j] = sc.nextInt();
                ar[i][j] = (int)(Math.random()*r*r)+1;
            } 
        }
        System.out.println("The original matrix");
        print(r, r, ar);
        //Transpose elements across primary dia
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                ar2[i][j] = ar[j][i];
            } 
        }
        System.out.println("The transposed matrix");
        print(r, r, ar2);
    }
}
