package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println(count);
        if(k<0){
            k=count+k;
            System.out.println(k);
        }
        if(k>count){
            k=k%count;
        }
        int div=(int)Math.pow(10,k);
        int q=n/div;
        int rem=n%div;
        while(count>k){
            rem *=10;
            count--;
        }
        int sum=rem+q;
        System.out.println(sum);
    }
}
