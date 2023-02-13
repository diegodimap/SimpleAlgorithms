package org.simple.algorithms;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o tamanho do losango: ");
        int T = leia.nextInt();

        int m = (T+1)/2 ;
        int e = m;
        int d = m;

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= T; j++) {

                if(j==e||j==d){
                    System.out.print("X ");
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println("");
            if(i < m){
                e--;
                d++;
            }else{
                e++;
                d--;
            }
        }
    }
}
