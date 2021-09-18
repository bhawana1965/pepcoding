package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        for(int i=1;i<=2*n+1;i++){
            int num=1;
            for(int j=1;j<=nst;j++){
                if(j==1 || j==nst) {
                    System.out.print("*\t");
                }else{
                    System.out.print(num+"\t");
                    if(j<=nst/2){
                        num++;
                    }else{
                        num--;
                    }
                }
            }
            System.out.println();
            if(i<n+1){
                nst+=2;
            }else{
                nst-=2;
            }
        }
    }
}
