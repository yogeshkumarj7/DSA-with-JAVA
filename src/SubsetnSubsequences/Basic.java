package SubsetnSubsequences;
//Weather take it or leave it
//[1,2,3]=>[1],[2],[3],[1,2],[2,3],[1,3],[]

public class Basic {
    public static void main(String[] args) {
        subseq("","abc");
    }
//    Print all the possible subsets
    static void subseq (String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
//        Weather add it or ignore it...
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
        subseq(p+(ch+0),up.substring(1));
    }
}
