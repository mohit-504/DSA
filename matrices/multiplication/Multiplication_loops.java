package matrices.multiplication;

public class Multiplication_loops {

    public static int[][] multiply(int[][]m1, int[][]m2){
        int[][] result = new int [m1.length][m2[0].length];
        
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                for(int k=0;k<m1[0].length;k++){
                    result[i][j] = result[i][j] + (m1[i][k] * m2[k][j]);
                }
            }
        }

        return result;
    }
    public static void main(String args[]){

        int [][] m1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][] m2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(m1.length+" ");
        System.out.println(m1[0].length+" ");

        int [][] ans = multiply(m1,m2);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
