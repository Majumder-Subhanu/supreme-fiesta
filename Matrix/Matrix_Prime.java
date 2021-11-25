package Matrix;

import java.util.*;

public class Matrix_Prime
{
    public static boolean is_prime(int n )
    {
        return n == 2 || Math.pow(2, n-1) % n == 1;
    }

    public static boolean string_contains(String s, String r)
    {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i; j < s.length(); j++)
            {
                flag = s.substring(j).equals(r);
            }
        }
        return flag;
    }

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
        String s = "";
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (is_prime(ar[i][j]) && string_contains(s, (""+ar[i][j])))
                {
                    s = s.concat(""+ar[i][j]+"   ");
                }
            }
            System.out.println();
        }
        System.out.println(s);
    }
}
