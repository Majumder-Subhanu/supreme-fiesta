package Matrix;

import java.util.*;

/*
00 01 02 03 **
10 11 12 ** 14
20 21 ** 23 24 
30 ** 32 33 34
** 41 42 43 44 
*/
public class TrianglePrint
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
    
    public static void primary_upper_triangle(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (j > i) System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void primary_lower_triangle(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (i > j) System.out.print(ar[i][j] + "\t");
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
    
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("r : ");
        int r = sc.nextInt();
        int[][] ar = new int[r][r];
        ar = generate_array(r, r, ar);
        System.out.println("**********Matrix**********");
        print(r, r, ar);
        System.out.println("**********Triangle 1**********");
        primary_upper_triangle(r, r, ar);
        System.out.println("**********Triangle 2**********");
        primary_lower_triangle(r, r, ar);
    }
}
