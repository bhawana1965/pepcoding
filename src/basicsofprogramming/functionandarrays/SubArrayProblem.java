package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class SubArrayProblem {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        for(int si=0;si<a.length;si++){
            for(int ei=si;ei<a.length;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
