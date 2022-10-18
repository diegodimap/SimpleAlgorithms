package org.simple.algorithms;


public class Diego {
    public static void main(String[] args) {
        
        int x = 10*2;
        double z = 20.34324234;
        char letra = 'a';
        String nome = "diego";
        boolean teste = true; 
        //uma linha
        double a = 1;
        double b = 2;
        double c = -15;
        
        double x1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a)  ;
        double x2 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a)  ;
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    }
    
    
}
