package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int srcBase=scn.nextInt();
        int destBase=scn.nextInt();

        int result=baseToBase(n,srcBase,destBase);
        System.out.println(result);
    }

    public static int baseToBase(int n,int src,int dest){
        int num=baseToDecimal(n,src);
        int res=decimalToBase(num,dest);
        return res;
    }
    public static int decimalToBase(int n,int base){
        int num=0;
        int tp=1;
        while(n!=0){
            int r=n%base;
            n=n/base;
            num += r*tp;
            tp=tp*10;
        }
        return num;
    }

    public static int baseToDecimal(int n,int base){
        int num=0;
        int bp=1;
        while(n!=0){
            int r=n%10;
            n=n/10;
            num+=r*bp;
            bp =bp*base;
        }
        return num;
    }
}
