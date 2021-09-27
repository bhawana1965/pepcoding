package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }

        reverse(a);
        display(a);
    }

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a){
        int l=0;
        int r=a.length-1;

        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;

            l++;
            r--;
        }
    }

}
