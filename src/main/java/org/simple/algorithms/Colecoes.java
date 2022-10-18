package org.simple.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;


public class Colecoes {
    public static void main(String[] args) {
        
        //ARVORE
        TreeSet tree = new TreeSet();
        
        
        tree.add(1);
        tree.add(2);
        tree.add(5);
        
        System.out.println(tree.higher(2));
        
        //ARRAY
        int[] numeros = new int[]{1,2,3,4,5};
        
        ArrayList<Integer> numerosList = new ArrayList<Integer>();
        //numerosList = new ArrayList<>(Arrays.asList(numeros));
                
    }
}
