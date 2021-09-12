package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int div=1;
        while(temp>=10){
            temp=temp/10;
            div = div*10;
        }

        while(div>=1){
            int q=n/div;
            n= n%div;
            System.out.println(q);
            div=div/10;
        }
    }
}
