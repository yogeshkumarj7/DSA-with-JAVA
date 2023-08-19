package Stringgg;

public class Shortestpath {
    public static void main(String[] args) {
        String path = "WWWSSSS";
        System.out.println(shortPath(path));
    }
    public static float shortPath(String name){
        int x=0;
        int y=0;
        for (int i=0;i<name.length();i++){
            char direction=name.charAt(i);
            if (direction=='S'){
                y--;
            }else if(direction=='N'){
                y++;
            }else if (direction=='W'){
                x--;
            }else {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
}
