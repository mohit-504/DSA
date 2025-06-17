package matrices.multiplication;

public class Multiplication_recursion {
    static int i=0,j=0,k=0;

    public static void multiply(int r1,int r2,int c1,int c2,int[][] m1,int[][] m2,int[][] ans){
        if(i>=r1){
            return;
        }

        if(j<c2){
            if(k<c1){
                ans[i][j] = ans[i][j] + ( m1[i][k] * m2[k][j] );
                k++;
                multiply(r1, r2, c1, c2, m1, m2, ans);
            }
            k=0;
            j++;
            multiply(r1, r2, c1, c2, m1, m2, ans);
        }
        j=0;
        i++;
        multiply(r1, r2, c1, c2, m1, m2, ans);
    }

    public static void main(String args[]){
        int [][] m1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][] m2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int r1=m1.length;
        int c1=m1[0].length;
        int r2=m2.length;
        int c2=m2[0].length;

        int[][] ans = new int[3][3];

        multiply(r1,r2,c1,c2,m1,m2,ans);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }   
}
