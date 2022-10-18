package org.simple.algorithms;

//dado um array, achar 2 números dentro de um array cuja soma seja X
public class ArraySum {
    public static void main(String[] args) {
        int numeros[] = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        
        String resposta = findPair(numeros, 10);
        
        System.out.println(resposta);
    }
    
    public static String findPair(int[] numeros, int soma){
        String resposta = "";
        
        for (int i = 0; i < numeros.length; i++) {
            int numero1 = numeros[i];
            for (int j = 0; j < numeros.length; j++) {
                int numero2 = numeros[j];
                
                if(numero1 + numero2 == soma){
                    resposta += numero1+ " + " + numero2 + "\n";
                }
            }
        }
        
        return resposta;
    }
}
