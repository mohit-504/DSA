package matrices.diagonal_squares;

public class Diagonal_square_recursion {
    static int i=0;

    public static void findOppositeDiagonalSquares(int[][] a, int r, int c){
        if(i>=r || i>=c){
            return;
        }

        System.out.print((int)Math.pow(a[i][a[0].length-i-1],2)+" ");
        i++;
        findOppositeDiagonalSquares(a, r, c);
    }

    public static void findDiagonalSquares(int[][] a, int r, int c){
        if(i>=r || i>=c){
            System.out.println();
            i=0;
            findOppositeDiagonalSquares(a,r,c);
            return;
        }

        System.out.print((int)Math.pow(a[i][i],2)+" ");
        i++;
        findDiagonalSquares(a, r, c);
    }

    public static void main(String args[]){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        findDiagonalSquares(a,a.length,a[0].length);
    }
}
