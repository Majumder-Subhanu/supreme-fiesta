package Matrix;
import java.util.Scanner;

public class Matrix_Dia_Swap
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
                System.out.printf("Enter the element in [%d][%d] :: ", i, j);
                ar[i][j] = sc.nextInt();
            } 
        }
        System.out.println("The original matrix");
        print(r, r, ar);
        //Swap elements of primary and secondary dia
        for (int i = 0; i < r; i++)
        {
            int temp = ar[i][i];
            ar[i][i] = ar[i][r - 1 - i];
            ar[i][r - 1 - i] = temp;
        }
        System.out.println("The swapped matrix");
        print(r, r, ar);
    }
}
