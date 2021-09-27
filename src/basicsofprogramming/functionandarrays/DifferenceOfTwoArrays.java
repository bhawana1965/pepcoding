package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] one=new int[n1];
        for(int i=0;i<n1;i++){
            one[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] two=new int[n2];
        for(int i=0;i<n2;i++){
            two[i]=scn.nextInt();
        }

        int[] diff=new int[n2];

        int i=one.length-1;
        int j=two.length-1;
        int k=diff.length-1;
        int c=0;
        while(k>=0){
            int d=two[j]-c;

            if(i>=0){
                d = d-one[i];
            }

            if(d<0){
                d=d+10;
                c=1;
            }

            diff[k]=d;

            i--;
            j--;
            k--;
        }

        int idx=0;
        while(idx<diff.length){
            if(diff[idx]!=0){
                break;
            }
            idx++;
        }

        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
}
