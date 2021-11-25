package Matrix;

import java.util.*;

public class Matrix_Max_Min
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
        int max = ar[0][0], min = ar[0][0];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (ar[i][j] > max) max = ar[i][j];
                if (ar[i][j] < min) min = ar[i][j];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
