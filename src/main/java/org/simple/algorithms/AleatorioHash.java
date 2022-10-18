package org.simple.algorithms;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class AleatorioHash {
    public static void main(String[] args) {
        System.out.println(encurtarURL("diego"));
    }
    
    public static String encurtarURL(String entrada){
        String saida = "";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5"); //pode ser SHA-1 ou SHA-256
            m.update( entrada.getBytes(), 0 , entrada.length() );
            byte[] digest = m.digest();
            saida = new BigInteger(1,digest).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return saida;
    }
}
