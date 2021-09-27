package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();

        int first=0;
        int li=0;
        int ri=a.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(a[mid]<k){
                ri=mid-1;
            }else if(a[mid] > k){
                li=mid+1;
            }else{
                first=mid;
                ri=ri-1;
            }
        }
        System.out.println(first);

        int last=0;
        li=0;
        ri=a.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(a[mid]<k){
                ri=mid-1;
            }else if(a[mid]>k){
                li=mid+1;
            }else{
                last=mid;
                li=li+1;
            }
        }
        System.out.println(last);
    }

}
