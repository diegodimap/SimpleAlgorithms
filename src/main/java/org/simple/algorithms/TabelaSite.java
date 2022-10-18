package org.simple.algorithms;

//faça um método que recebe um array e retorna uma página HTML

//array 1, 2, 3, 4, 5:L10, 6, 7, 8, 9, 10:L20
//L10 L20
//1   6
//2   7
//3   8
//4   9
//5  10
public class TabelaSite {
    public static void main(String[] args) {
        String numeros = "1,2,3,4,5:L10,6,7,8,9,10:L20";
        String resposta = converteMatriz2Site(numeros);
        System.out.println(resposta);
    }
    
    public static String converteMatriz2Site(String numeros){
        
        int lines = 0;
        int columns = 0;
        
        String parts[] = numeros.split(",");
        
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
        
        return "";
    }
}


