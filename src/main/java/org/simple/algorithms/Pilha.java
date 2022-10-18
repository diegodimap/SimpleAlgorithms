package org.simple.algorithms;


public class Pilha {
    static int  posicao = 0;
    public int numeros[] = new int[100];
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        System.out.println(p.desempilhar());
        p.empilhar(4);
        p.empilhar(5);
        System.out.println("posicao=" + posicao);
        p.percorrer();
    }
    
    public void empilhar(int num){
        numeros[posicao++] = num;
    }
    
    public int desempilhar(){
        return numeros[--posicao];
    }
    
    public void percorrer(){
        for (int i = 0; i < posicao; i++) {
            int numero = numeros[i];
            System.out.println("numeros["+i+"] = " + numero);
        }
    }
}
