package org.simple.algorithms;

import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Random ale = new Random();
        
        for(int i=0; i<15; i++){
            int sorteado = 1+ale.nextInt(25);
            
            System.out.println(sorteado);
        }
        
        
    }
}
