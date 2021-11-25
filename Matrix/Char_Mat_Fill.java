package Matrix;
import java.util.Scanner;

public class Char_Mat_Fill
{
    public static void print(int r, int c, char[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.printf("%c  ", ar[i][j]);
            }
            System.out.println();
        }
    }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the side of matrix : ");
        r = sc.nextInt();
        char[][] ar = new char[r][r];
        System.out.println("Enter the diagonal element : ");
        char ch_dia = sc.next().trim().charAt(0);
        for (int i = 0; i < r; i++)
        {
            ar[i][i] = ch_dia;
            ar[i][r - 1 - i] = ch_dia;
        }
        System.out.println("Enter the upper triangle element : ");
        char ch_up = sc.next().trim().charAt(0);
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                if (i < r/2 && i+j <= r-1 && i < j) 
                {
                    ar[i][j] = ch_up;
                }
            }
        }
        System.out.println("Enter the lower triangle element : ");
        char ch_down = sc.next().trim().charAt(0);
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                if (i > r/2 && i+j >= r-1 && i > j) 
                {
                    ar[i][j] = ch_down;
                }   
            }
        }
        System.out.println("Enter the right triangle element : ");
        char ch_right = sc.next().trim().charAt(0);
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                if (j < r/2 && i+j <= r-1 && i > j) 
                {
                    ar[i][j] = ch_right;
                }
            }
        }
        System.out.println("Enter the left triangle element : ");
        char ch_left= sc.next().trim().charAt(0);
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < r; j++)
            {
                if (j > r/2 && i+j >= r-1 && i < j) 
                {
                    ar[i][j] = ch_left;
                }
            }
        }
        System.out.println("**********Matrix**********");
        print(r, r, ar);
    }
}
