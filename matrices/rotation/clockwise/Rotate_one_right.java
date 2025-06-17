public class Rotate_one_right {
    
    static int R=4;
    static int C=4;
    
    static void rotatematrix(int m, int n, int mat[][])
    {
        int row = 0, col = 0;
        int prev, curr;

        while (row < m && col < n) {

            if (row + 1 == m || col + 1 == n)
                break;

            
            prev = mat[row + 1][col];

            // handling first row
            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;

            // handling last column
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;

            // handling last row
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;

            // handling first column
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }

        // Print rotated matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
        int r = a.length;
        int c = a[0].length;
        // System.out.println(r+" "+c);
        rotatematrix(r, c, a);
    }
}