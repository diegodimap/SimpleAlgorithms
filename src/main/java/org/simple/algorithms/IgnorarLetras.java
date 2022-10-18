package org.simple.algorithms;

public class IgnorarLetras {

    static String saida = "";
    public static void main(String[] args) {
        add('1');
        add('a');
        add('2');
        add('b');
        add('0');
        add('0');
        
        System.out.println("saida = " + saida);
    }

    public static void add(char c) {
        try {
            int numero = Integer.parseInt(c + "");
            if (numero >= 0 && numero <= 9) {
                saida += c;
            }
        } catch (Exception e) {

        }
    }

    public String getValue() {
        return saida;
    }
}
