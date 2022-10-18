package org.simple.algorithms;


public class RodarEsquerda {
    public static void main(String[] args) {
        int[] numeros = rotateLeft(5, 1);
        
        for(int i=0; i<5; i++){
            System.out.println(numeros[i]);
        }  
    }
    
    public static int[] rotateLeft(int tamanho, int vezes){
        
        int[] numeros = new int[tamanho];
        
        for(int i=0; i<tamanho; i++){
            numeros[i] = i+1;
        }  
        
        for(int v=0; v<vezes; v++){
            int temp = numeros[0];
            for(int i=0; i<tamanho-1; i++){
                numeros[i] = numeros[i+1];
            }
            numeros[tamanho-1] = temp;
        }
        
        return numeros;
    }
}
