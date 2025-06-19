package arrays.count;

public class Count_negatives {
    public static int countNegatives(int[][] grid) {
        int lastcol = grid[0].length;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<lastcol;j++){
                if(grid[i][j] < 0){
                    count = count + ((lastcol - j) * (grid.length - i));
                    lastcol = j;
                }
            }
        }
    return count;
    }

    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println("Count of negatives in the grid is: "+countNegatives(grid));
    }
}