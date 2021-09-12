package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();

        for(int i=1;i<=t;i++){
            int n= scn.nextInt();
            int div=2;
            boolean flag=true;
            while(div*div<=n){
                if(n%div==0){
                    flag=false;
                    break;
                }
                div++;
            }
            if(flag==true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
