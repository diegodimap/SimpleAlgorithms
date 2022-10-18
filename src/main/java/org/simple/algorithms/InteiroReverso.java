package org.simple.algorithms;


public class InteiroReverso {
    public static void main(String[] args) {
        System.out.println(reverso(-425252522)); 
    }
    
    public static long reverso(long x){
        String xs = x + "";
        String nova = "";
        
        int final2 = 0;
        if(xs.contains("-")) final2 = 1;
        
        for(int i=xs.length()-1; i>=final2; i--){
            nova += xs.charAt(i);
        }
        long novo = Long.parseLong(nova);
        
        if(final2 == 1){
            novo *=-1;
        }
        
        return novo;
    }
}
