package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class RemoveOneDigitFindMaximum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int tp=1;
        while(temp>=10){
            temp=temp/10;
            tp=tp*10;
        }
        int max=0;
        while(tp>=1){
            int q=n/tp;
            int r=n%tp;

            int q1 = q/10;
            int sum=q1*tp +r;
           if(max<sum){
               max=sum;
           }
            tp=tp/10;

        }
        System.out.println(max);
    }
}
