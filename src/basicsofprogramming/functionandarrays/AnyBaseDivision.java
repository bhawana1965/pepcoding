package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseDivision {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
       // int b=scn.nextInt();
        //n1/n2
        //int n1=scn.nextInt();
       // int n2=scn.nextInt();

        int res=getDivision(5,134,4);
        System.out.println(res);
    }

    public static int getDivision(int b,int n1,int n2){

        int temp=n1;
        int ans=0;
        int tp=1;
        while(temp>=10){
            temp=temp/10;
            tp=tp*10;
        }

        System.out.println(tp);

        while(tp>=1){
            int q=n1/tp;

            if(q>=n2){
                n1=n1%tp;
                //multiply dekhenge
                for(int i=1;i<=10;i++) {

                }
            }
            tp=tp/10;

        }

        return ans;
    }
    public static int getSingleProduct(int b,int n1,int d2){
        int c=0;
        int tp=1;
        int multiply=0;
        while(n1!=0){
            int d1=n1%10;
            n1=n1/10;

            int pro=(d1*d2)+c;
            c=pro/b;
            pro=pro%b;

            multiply += pro*tp;
            tp=tp*10;
        }
        return multiply;
    }
}
