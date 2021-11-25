package Matrix;
import java.util.Scanner;

public class Column_Row_Swap
{
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

    public static void main(String[] args)
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
        System.out.print    ("1. Row swap\n2. Column swap\nSelect operation : ");
        int ch = sc.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.print("Enter row 1 to swap : ");
                int r1 = sc.nextInt() - 1;
                System.out.print("Enter row 2 to swap : ");
                int r2 = sc.nextInt() - 1;
                int[] ar2 = ar[r1];
                ar[r1] = ar[r2];
                ar[r2] = ar2;
                System.out.println("**********New Matrix**********");
                print(r, c, ar);
                break;
            case 2:
                System.out.print("Enter col 1 to swap : ");
                int c1 = sc.nextInt() - 1;
                System.out.print("Enter col 2 to swap : ");
                int c2 = sc.nextInt() - 1;
                for (int i = 0; i < r; i++)
                {
                    int temp = ar[i][c1];
                    ar[i][c1] = ar[i][c2];
                    ar[i][c2] = temp;
                }
                System.out.println("**********New Matrix**********");
                print(r, c, ar);
                break;
        }
    }
}
