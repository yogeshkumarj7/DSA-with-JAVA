package Problems;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(binFacto(5,2));
    }
    public static int Factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binFacto(int n,int r){
        int nf=Factorial(n);
        int rf=Factorial(r);
        int nmr=Factorial(n-r);
        int binFact=nf/(rf*nmr);
        return binFact;
    }
}

//LEARNING

//We Can use the one function as a helper for anathor one as i used above...
//