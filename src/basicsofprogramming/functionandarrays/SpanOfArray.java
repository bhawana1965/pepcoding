package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }

        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }

            if (a[i]>max){
                max=a[i];
            }
        }
        int span=max-min;
        System.out.println(span);
    }
}
