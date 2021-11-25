package Matrix;
import java.util.Scanner;

public class Vestigium
{
    public static void solve(int i)
    {
        int r_rep = 0, c_rep = 0, trace = 0;
        System.out.printf("Case #%d: %d %d %d", i, trace, r_rep, c_rep);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t, i = 0;
        t = sc.nextInt();
        while(t >= 0) 
        {
            solve(i);
            t--;
            i++;
        }
    }
}
