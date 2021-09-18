package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
       int pos=1;
       int inv=0;
       while(n>0){
           int r=n%10;
           inv += pos*(int)Math.pow(10,r-1);
           pos++;
           n=n/10;
       }
       System.out.println(inv);

    }
}
