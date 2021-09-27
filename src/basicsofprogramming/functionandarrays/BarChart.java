package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int ht = max; ht >= 1; ht--) {
            for(int i=0;i<n;i++) {
                 if(a[i]>=ht){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
            }
            System.out.println();
        }
    }
}
