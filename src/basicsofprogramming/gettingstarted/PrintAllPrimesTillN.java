package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();

        for(int i=low;i<=high;i++){
            int div=2;
            boolean flag=true;
            while(div*div<=i){
                if(i%div == 0){
                    flag=false;
                    break;
                }
                div++;
            }

            if(flag){
                System.out.println(i);
            }
        }
    }
}
