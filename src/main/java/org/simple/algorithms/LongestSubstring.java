package org.simple.algorithms;


public class LongestSubstring {
    
    public static void main(String[] args) {
        String entrada = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(entrada));
    }
    
    public static int lengthOfLongestSubstring(String s) {
        int maior = 0;
        
        String sub = "";
        int cont = 0;
        for(int i=0; i<s.length(); i++){
            if(!sub.contains(s.charAt(i)+"")){
                cont++;
                sub += s.charAt(i) + "";
            }else{
                sub = "";
                if(cont > maior){
                    maior = cont;
                }
                cont = 0;
            }
                
        }
        
        return maior;
    }
}
