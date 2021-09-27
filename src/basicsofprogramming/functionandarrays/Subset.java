package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class Subset {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int limit = (1<<a.length);

        for(int i=0;i<limit;i++){
            int dec=i;
            String str="";
            for(int j=0;j<a.length;j++){
                int rem=dec%2;
                dec=dec/2;

                if(rem==0){
                    str = "-\t"+str;
                }else{
                    str = a[a.length-1-j] + "\t"+str;
                }
            }
            System.out.println(str);
        }
    }
}
