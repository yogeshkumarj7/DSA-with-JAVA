package BAcktracking;
public class Maze_ways {
    static int mazeWays(int c,int r){
        if (r==1 || c==1){
            return 1;
        }
        int left=mazeWays(c,r-1);
        int right=mazeWays(c-1,r);
        int digonal=mazeWays(c-1,r-1);
        int ways=left+right+digonal;
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(mazeWays(3,3));
    }
}
