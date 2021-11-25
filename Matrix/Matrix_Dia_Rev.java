package Matrix;
import java.util.Scanner;

public class Matrix_Dia_Rev
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
        //Reverse elements of diagonals
        for (int i = 0; i < r / 2; i++)
        {
            int n = r - 1;
            //Primary dia rev
            int temp = ar[i][i];
            ar[i][i] = ar[n - i][n - i];
            ar[n - i][n - i] = temp;
            //Secondary dia rev
            int temp2 = ar[i][n - i];
            ar[i][n - i] = ar[n - i][i];
            ar[n - i][i] = temp2;
        }
        System.out.println("The swapped matrix");
        print(r, r, ar);
    }
}
