package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class BoundaryPattern {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int dec_limit=n+1;
        int constant=n;
        for(int i=1;i<=n;i++){
            int x=0;
                //Decreasing Function
            for(int j=n;j>=dec_limit;j--){
                if(j%2!=0){
                    System.out.print("# ");
                }else {
                    System.out.print(j + " ");
                }
                x++;
            }
                //Constant
            int limit=2*n - 2*x -1;
            for(int j=1;j<=limit;j++){
                if(constant%2!=0){
                    System.out.print("# ");
                }else{
                System.out.print(constant+" ");
                }
            }


                //Increasing Function
            for(int j=dec_limit;j<=n;j++){
                if(j%2!=0){
                    System.out.print("# ");
                }else {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
            dec_limit--;
            constant--;
        }
        dec_limit=3;
        constant=2;
        for(int i=1;i<n;i++){
            int x=0;
            for(int j=n;j>=dec_limit;j--){
                if(j%2!=0){
                    System.out.print("# ");
                }else {
                    System.out.print(j + " ");
                }
                x++;
            }
            int limit=2*n - 2*x -1;
            for(int j=1;j<=limit;j++){
                if(constant%2!=0){
                    System.out.print("# ");
                }else{
                    System.out.print(constant+" ");
                }
            }

            //Increasing Function
            for(int j=dec_limit;j<=n;j++){
                if(j%2!=0){
                    System.out.print("# ");
                }else {
                    System.out.print(j + " ");
                }
                x++;
            }

            System.out.println();
            dec_limit++;
            constant++;
        }
    }
}
