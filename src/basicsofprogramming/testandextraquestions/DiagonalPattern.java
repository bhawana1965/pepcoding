package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class DiagonalPattern {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==i || j+i==2*n){
                    if(i<=n) {
                        System.out.print(i + "\t");
                    }else{
                        System.out.print((2*n)-i + "\t");
                    }
                }else{
                    System.out.print("\t");
                }

            }

            System.out.println();
        }
    }
}
