import java.util.*;

public class Anas {

    static char[][] rotateRight(char[][] g) {
        int r = g.length;
        int c = g[0].length;
        char[][] ng = new char[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ng[i][j] = g[r - 1 - j][i];
            }
        }
        return ng;
    }

    static char[][] rotateLeft(char[][] g) {
        int r = g.length;
        int c = g[0].length;
        char[][] ng = new char[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ng[i][j] = g[j][c - 1 - i];
            }
        }
        return ng;
    }

    static void applyGravity(char[][] g) {
        int r = g.length;
        int c = g[0].length;
        for (int col = 0; col < c; col++) {
            int count = 0;
            for (int row = 0; row < r; row++) {
                if (g[row][col] == '*') count++;
            }
            int row = r - 1;
            while (count-- > 0) {
                g[row--][col] = '*';
            }
            while (row >= 0) {
                g[row--][col] = '.';
            }
        }
    }

    static void printGrid(char[][] g) {
        int r = g.length;
        int c = g[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append(g[i][j]);
                if (j < c - 1) sb.append(' ');
            }
            if (i < r - 1) sb.append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String token = sc.next();
                grid[i][j] = token.charAt(0);
            }
        }
        int k = sc.nextInt();
        List<String> instr = new ArrayList<>();
        for (int i = 0; i < k; i++) instr.add(sc.next());

        for (String s : instr) {
            if (s.equalsIgnoreCase("right")) {
                grid = rotateRight(grid);
            } else {
                grid = rotateLeft(grid);
            }
            applyGravity(grid);
        }

        printGrid(grid);
    }
}
