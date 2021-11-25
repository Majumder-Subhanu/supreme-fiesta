package Matrix;

import java.util.*;

public class Matrix_Input_Output
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        c = sc.nextInt();
        int[][] ar = new int[r][c];
        System.out.println("Enter the elements row wise : ");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("\tThe Matrix\n***********************");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
