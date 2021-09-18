package basicsofprogramming.testandextraquestions;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int x=64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                if (j == 1 || j == i) {
                    char ch = (char)(x+i);
                    System.out.print(ch + "\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
