package BAcktracking;

public class Maze {
    public static void main(String[] args) {
        maze("",3,3);
    }
    static void maze(String path,int r,int c){
//      if position have only one way to reach to destination
        if (r==1 && c==1){
            System.out.println(path);
        }
//      conditions....
//        int left=maze(r-1,c);//while going to left we are decreasing row by 1
//        int right=maze(r,c-1);//while going to right we are decreasing the column by 1
//        return left+r;

//        Printing the path

//        down
        if (r>1){
            maze(path+'D',r-1,c);
//        right
        }if (c>1){
            maze(path+'R',r,c-1);
        }
//        Digonal
        if (r>1 && c>1){
            maze(path+'D',r-1,c-1);
        }
    }
}
