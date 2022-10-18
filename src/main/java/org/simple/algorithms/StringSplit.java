package org.simple.algorithms;

import java.util.ArrayList;


public class StringSplit {
    public static void main(String[] args) {
        String text = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler.";
        
        ArrayList<String> resposta = splitText(text, 40);
        
        for (int i = 0; i < resposta.size(); i++) {
            System.out.println(resposta.get(i));
        }
    }
    
    public static ArrayList<String> splitText(String text, int limit){
        ArrayList<String> resposta = new ArrayList<>();
        ArrayList<String> palavras = new ArrayList<>();
        
        String[] pedacos = text.split(" ");
        
        for(int i=0; i<pedacos.length; i++){
            palavras.add(pedacos[i]);
        }
        
        int tamanho = 0;
        String linha = "";
        for(int i=0; i<palavras.size(); i++){
            if(tamanho + palavras.get(i).length() <= limit){
                tamanho += palavras.get(i).length() + 1;
                linha += palavras.get(i) + " ";
            }else{
                resposta.add(linha);
                tamanho = 0;
                linha = "";
                i--;
            }
        }
        resposta.add(linha);
        
        return resposta;
    }
}
