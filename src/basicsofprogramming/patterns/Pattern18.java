package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int osp=0;
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                if(i>1 && i<=n/2){
                    if(j!=1 && j!=nst){
                        System.out.print("\t");
                    }else{
                        System.out.print("*\t");
                    }
                }else {
                    System.out.print("*\t");
                }
            }


            if(i<=n/2){
                osp++;
                nst-=2;
            }else{
                osp--;
                nst+=2;
            }
            System.out.println();
        }
    }
}
