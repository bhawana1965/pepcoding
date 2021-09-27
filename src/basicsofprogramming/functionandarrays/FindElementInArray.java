package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int foundAt=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                foundAt=i;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
