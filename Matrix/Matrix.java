package Matrix;
import java.util.Scanner;

class Matrix
{
    static void form_matrix(int mat[][])
    {
        int top = 0,
        bottom = mat.length - 1,
        left = 0,
        right = mat[0].length - 1;
        int ele = 1;
        while (true)
        {
            if (left > right) break;
            for (int i = left; i <= right; i++)
            {
                mat[top][i] = ele; 
                ele += 1;
            }
            top++;
            if (top > bottom) break;
            for (int i = top; i <= bottom; i++)
            {
                mat[i][right] = ele;
                ele += 1;
            }
            right--;
            if (left > right) break;
            for (int i = right; i >= left; i--)
            {
                mat[bottom][i] = ele;
                ele += 1;
            }
            bottom--;
            if (top > bottom) break;
            for (int i = bottom; i >= top; i--)
            {
                mat[i][left] = ele;
                ele += 1;
            }
            left++;
        }
    }

    static void print(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
                System.out.printf("%5d",mat[i][j]);
            System.out.println();
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("r : ");
        int r = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        form_matrix(mat);
        print(mat);
    }
}
