package basicsofprogramming.functionandarrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int data=scn.nextInt();

        int li=0;
        int ri=a.length-1;
        int ceil=-1;
        int floor=-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(data > a[mid]){
                li=mid+1;
                floor=a[mid];
            }else if(data < a[mid]){
                ri=mid-1;
                ceil=a[mid];
            }else{
                ceil=a[mid];
                floor=a[mid];
                break;
            }
        }

        if(ceil==floor){
            System.out.println(data +" is available");
        }else{
            System.out.println(ceil);
            System.out.println(floor);
        }
    }
}
