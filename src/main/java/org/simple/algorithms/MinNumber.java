package org.simple.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(-3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(minX(numeros));
    }
    
    public static int minX(List<Integer> arr) {
        // Write your code here

        int startValue = 0;
        for(int x = startValue; x <= Integer.MAX_VALUE; x++){
            int sum = x;
            for(int n: arr){
                sum += n;
                if(sum < 1){
                    break;
                }
            }
            if(sum >= 1){
                return x;
            }
        }
        
        return 0;
    }
}
