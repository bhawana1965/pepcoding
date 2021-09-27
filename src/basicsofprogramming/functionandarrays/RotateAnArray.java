package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();

        rotate(a,k);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void rotate(int[] a,int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }

        reverse(a,0,a.length-1-k);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
    }

    public static void reverse(int[] a,int l,int h){
        while(l<h){
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;

            l++;
            h--;
        }
    }
}
