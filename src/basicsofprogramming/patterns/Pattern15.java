package basicsofprogramming.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nsp=n/2;
        int nst=1;

        int count=1;
        for(int i=1;i<=n;i++){
            int icount=count;
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(icount+"\t");
                if(j<=nst/2) {
                    icount++;
                }else{
                    icount--;
                }
            }

            if(i<=n/2){
                nsp--;
                nst+=2;
                count++;
            }else{
                nsp++;
                nst-=2;
                count--;
            }
            System.out.println();
        }
    }
}
