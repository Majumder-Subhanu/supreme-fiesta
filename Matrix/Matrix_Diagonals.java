package Matrix;
import java.util.Scanner;

public class Matrix_Diagonals
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square matrix :: ");
        int r = sc.nextInt();
        int[][] ar = new int[r][r];
        int[] primary = new int[r];
        int[] secondary = new int[r];
        //Input
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                System.out.printf("Enter the element in [%d][%d] :: ", i, j);
                ar[i][j] = sc.nextInt();
            } 
        }
        //Extract elements of primary and secondary dia
        for (int i = 0; i < r; i++)
        {
            primary[i] = ar[i][i];
            secondary[i] = ar[i][r - 1 - i];
        }
        System.out.println("Primary diagonal");
        //Print primary dia
        for (int i  : primary)
        {
            System.out.print(i + "  ");
        }
        System.out.println("\nSecondary diagonal");
        //Print secondary dia
        for (int i  : secondary)
        {
            System.out.print(i + "  ");
        }
    }
}
