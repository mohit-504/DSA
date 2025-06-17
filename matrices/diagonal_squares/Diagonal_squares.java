package matrices.diagonal_squares;

public class Diagonal_squares {

    public static void findSquares(int [][] mat){

        for(int i=0;i<mat.length && i<mat[0].length;i++){
            System.out.print(mat[i][i]*mat[i][i]+" ");
        }
        System.out.println();

        //for opposite diagonal
        for(int i=0;i<mat.length && i<mat[0].length;i++){
            System.out.print(mat[i][mat[0].length-i-1]*mat[i][mat[0].length-i-1]+" ");
        }
    }
    public static void main(String args[]){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        findSquares(a);
    }
}
