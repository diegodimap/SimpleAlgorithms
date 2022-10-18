package org.simple.algorithms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class HashReview {
    public static void main(String[] args) {
        Hashtable<Integer, String> tabela = new Hashtable<>(); //OLD
        HashMap<Integer, String> tabela2 = new HashMap<>();
        
        tabela2.put(0, "diego");
        tabela2.put(1, "flavia");
        tabela2.put(2, "bolsa");
        tabela2.put(3, "flaviana");
        tabela2.put(4, "flokito");
        tabela2.put(5, "anne");
        
        HashMap<Integer, String> tabela3 = new HashMap<>();
        
        tabela3.put(0, "andre");
        tabela3.put(1, "milena");
        tabela3.put(2, "miguel");

        
        
        tabela2.remove(1);
        
        Set chaves = tabela2.keySet();
        
        for (Object chave : chaves) {
            System.out.println(tabela2.get(Integer.parseInt(chave.toString()))); //pode ser só 'chave' aqui
        }
        
        System.out.println("PUT ALL");
        
        tabela2.putAll(tabela3);
        
        for (String value : tabela2.values()) {
            System.out.println(value);
        }
        
    }
}
