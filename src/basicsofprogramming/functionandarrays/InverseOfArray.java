package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }

        int[] res=inverse(a);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] +" ");
        }
    }
    public static int[] inverse(int[] a){
        int[] inv=new int[a.length];
        for(int i=0;i<a.length;i++){
            inv[a[i]]=i;
        }
        return inv;
    }
}
