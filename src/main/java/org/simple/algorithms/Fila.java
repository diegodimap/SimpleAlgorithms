package org.simple.algorithms;


public class Fila {
    
    public static int posicao = 0;
    public static int numeros[] = new int[100];
    
    public static void main(String[] args) {
        Fila f = new Fila();
        
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        System.out.println("removeu = " + f.remove());
        f.add(5);
        f.percorrer();
    }
    
    public void add(int num){
        numeros[posicao++] = num;
    }
    
    public int remove(){
        int resposta = numeros[0];
        
        //andar array
        for(int i=1; i<posicao; i++){
            numeros[i-1] = numeros[i];
        }
        
        posicao--;
        
        return resposta;
    }
    
    public void percorrer(){
        for (int i = 0; i < posicao; i++) {
            int numero = numeros[i];
            System.out.println("numeros["+i+"]=" + numero);
        }
    }
}
