package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int od=0;
        int op=1;
        int sum=0;
        while(n>0){
            od=n%10;
            int id=op;
            int ip=od;

            sum += (int)(id * Math.pow(10,ip-1));
            n=n/10;
            op++;
        }
        System.out.println(sum);
    }
}
