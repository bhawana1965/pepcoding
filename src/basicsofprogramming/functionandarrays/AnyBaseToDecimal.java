package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int num=0;
        int bp=1;

        while(n!=0){
            int r=n%10;
            n=n/10;
            num += r*bp;
            bp = bp*b;
        }

        return num;
    }
}
