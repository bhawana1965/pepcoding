package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int foundAt=-1;
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]<k){
                l=mid+1;
            }else if(a[mid]>k){
                r=mid-1;
            }else{
                foundAt=mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
