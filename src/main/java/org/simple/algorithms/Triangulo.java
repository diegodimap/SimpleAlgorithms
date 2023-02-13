package org.simple.algorithms;

public class Triangulo {
    public static void main(String[] args) {
        int M = 6;
        int E = 6;
        int D = 6;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= 11; j++) {
                if(i==1 && j == M || i == M || j == D || j == E){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }


            }

            E--;
            D++;
            System.out.println();
        }
    }
}
