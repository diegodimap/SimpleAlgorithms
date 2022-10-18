package org.simple.algorithms;


public class ListaEncadeada {
    
    int contador=0;
    Item root;
    Item current;
    
    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        l.remove(3);
        l.percorrer();
    }
    
    public void add(int n){
        if(contador==0){
            Item i = new Item(n, null);
            contador++;
            root = i;
            current = i;
        }else{
            Item i = new Item(n, null);
            contador++;
            current.next = i;
            current = current.next;
        }   
    }
    
    public void remove(int num){
        Item atual = root;
        Item anterior = null;
        while(true){
            if(atual.valor == num){
                if(atual == root){
                    root = root.next;
                }else{
                    anterior.next = atual.next;
                    atual = anterior;
                }
                break;
            }else{
                if(atual.next != null){
                    anterior = atual;
                    atual = atual.next;
                }else{
                    break;
                }
            }
        }
    }
    
    public void percorrer(){
        Item atual = root;
        while(true){
            System.out.println(atual.valor);
            if(atual.next != null){
                atual = atual.next;
            }else{
                break;
            }
        }
    }
}

class Item{
    int valor;
    Item next;
    
    public Item(int v, Item n){
        valor = v;
        next = n;
    }
}
