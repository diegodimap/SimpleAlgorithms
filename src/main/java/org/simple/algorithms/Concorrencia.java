package org.simple.algorithms;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Concorrencia implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("VAI");
            
            Thread.sleep(3000);
            
            System.out.println("LOGO");
        } catch (InterruptedException ex) {
            Logger.getLogger(Concorrencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
