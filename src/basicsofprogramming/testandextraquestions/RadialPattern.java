package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class RadialPattern {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();

        if(n%2 !=0){
            int k=0;
            for(int i=1;i<=n;i++){
                int sv=(n*k)+1;
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n){
                        System.out.print(sv + " ");
                    }else if(j==1 || j==n){
                        System.out.print(sv + " ");
                    } else{
                        System.out.print("* ");
                    }
                    sv++;
                }
                if(i<=n/2){
                    k=k+2;
                }else if(i==n/2+1){
                    k = k-1;
                }else{
                    k = k-2;
                }
                System.out.println();
            }
        }else{
            int k=0;
            for(int i=1;i<=n;i++){
                int sv=(n*k)+1;
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n) {
                        System.out.print(sv + " ");
                    }else if(j==1 || j==n){
                        System.out.print(sv + " ");
                    }else{
                        System.out.print("* ");
                    }
                    sv++;
                }
                if(i<n/2){
                    k=k+2;
                }else if(i==n/2){
                    k=k+1;
                }else{
                    k=k-2;
                }
                System.out.println();
            }
        }


    }
}
