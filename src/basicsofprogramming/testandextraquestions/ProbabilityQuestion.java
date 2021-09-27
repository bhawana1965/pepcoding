package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class ProbabilityQuestion {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int x=scn.nextInt();

        double cnmx=combination(4,n-x);
        double cnx=combination(4,x);
        double cnn=combination(8,n);
        double prob = (cnmx * cnx)/cnn;
        prob=prob*100;
       int result = (int)prob;
        System.out.println(result);

    }
    public static int combination(int n,int r){
        return fact(n) / (fact(n-r) * fact(r));
    }
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans *= i;
        }
        return ans;
    }
}
