package Matrix;
import java.util.Scanner;

public class Border_Inner_Cell
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
    public static void print_border(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (i == 0 || j == 0 || i == r-1 || j == c-1) System.out.print(ar[i][j] + "\t");
                else System.out.print("   \t");
            }
            System.out.println();
        }
    }
    public static void print_inner(int r, int c, int[][] ar)
    {
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (i != 0 && j != 0 && i != r-1 && j != c-1) System.out.print(ar[i][j] + "\t");
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
        System.out.print("c : ");
        int c = sc.nextInt();
        int[][] ar = new int[r][c];
        ar = generate_array(r, c, ar);
        System.out.println("**********Original Matrix**********");
        print(r, c, ar);
        System.out.println("**********Border Elements**********");
        print_border(r, c, ar);
        System.out.println("**********Inner Elements**********");
        print_inner(r, c, ar);
    }
}
