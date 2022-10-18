package org.simple.algorithms;

public class SearchFibonnaci {
    public static void main(String[] args) {
        System.out.println(MathChallenge(3));
    }
    public static boolean MathChallenge(int num) {
        int cont = 1;
        while (fibo(cont) <= num){
            System.out.println(fibo(cont));
            if (fibo(cont++) == num) {
                return true;
            }
        }
        return false;
    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
