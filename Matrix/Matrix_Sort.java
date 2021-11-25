package Matrix;

import java.util.*;

public class Matrix_Sort
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
    }

    public static int[][] generate_array(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                ar[i][j] = (int)(Math.random() * (r*c))+1;
            }
        }
        return ar;
    }

    public static int[][] sort_array(int r, int c, int[][] ar)
    {
        for (int i = 0 ; i < r; i++)
        {
            for (int j = 0 ; j < c; j++)
            {
                for (int k = 0 ; k < r; k++)
                {
                    for (int l = 0 ; l < c; l++)
                    {
                        if (ar[i][j] < ar[k][l])
                        {
                            int temp = ar[k][l];
                            ar[k][l] = ar[i][j];
                            ar[i][j] = temp;
                        }
                    }
                }
            }
        }
        return ar;
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("r : ");
        int r = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        int[][] ar = new int[r][c];
        ar = generate_array(r, c, ar);
        System.out.println("**********Unsorted Matrix**********");
        print(r, c, ar);
        ar = sort_array(r, c, ar);
        System.out.println("**********Sorted Matrix**********");
        print(r, c, ar);
    }
}
