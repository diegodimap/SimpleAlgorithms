package org.simple.algorithms;


public class Concorrencia2 {
    public static void main(String[] args) throws InterruptedException {
        Concorrencia c = new Concorrencia();
        Thread t = new Thread(c);
        t.start();
        
    }
}
