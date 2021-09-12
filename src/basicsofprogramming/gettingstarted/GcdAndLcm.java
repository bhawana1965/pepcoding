package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int gcd=0;
        int i=1;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
