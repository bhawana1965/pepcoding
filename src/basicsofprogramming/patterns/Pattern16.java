package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int ost=1;
        int isp=2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=ost;j++){
                System.out.print(j+"\t");
            }
            for(int j=1;j<=isp;j++){
                System.out.print("\t");
            }
            if(i==n){
                ost--;
            }
            for(int j=ost;j>=1;j--){
                System.out.print(j + "\t");
            }

            isp-=2;
            ost++;
            System.out.println();
        }
    }
}
