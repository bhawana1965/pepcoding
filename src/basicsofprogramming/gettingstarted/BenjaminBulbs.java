package basicsofprogramming.gettingstarted;

import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
       //simple logic h ---only perfect squares have odd factors and odd factors will result into bulbs ON!!
        //even factors--- ON -> OFF->ON->OFF
        //odd factors--- ON-> OFF-> ON -> OFF -> ON
        //loop will go to only square root of n and print squares for all numbers
        for(int f=1;f*f<=n;f++){
            System.out.println(f*f);
        }

    }

}
