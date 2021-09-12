package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        for(int divi=2;divi*divi<=n;divi++){
            while(n%divi==0){
                n=n/divi;
                System.out.println(divi);
            }
        }
        if(n!=1){
            System.out.println(n);
        }

    }
}
