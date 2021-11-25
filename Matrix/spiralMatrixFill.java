package Matrix;

import java.util.Scanner;

public class spiralMatrixFill {
    public static void print(int r, int c, int[][] ar) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%c  ", ar[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("r : ");
        int r = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        int r_val = 0, c_val = 0;
        int r_bound = r - 1;
        int c_bound = c - 1;
        char move = 'r';
        int[][] matrix = new int[r][c];
        System.out.println("**********The Matrix**********");
        for (int i = 1; i < r * c + 1; i++) {
            if (r_val < r && c_val < c) {
                matrix[r_val][c_val] = i;
                switch (move) {
                    case 'r': c_val += 1; break;
                    case 'l': c_val -= 1; break;
                    case 'u': r_val -= 1; break;
                    case 'd': r_val += 1; break;
                }
                if (i == r_bound) {
                    r_bound += c_bound;
                    switch (move) {
                        case 'r': c_val += 1; break;
                        case 'l': c_val -= 1; break;
                        case 'u': r_val -= 1; break;
                        case 'd': r_val += 1; break;
                    }
                }
            }
        }
        print(r, c, matrix);
    }
}