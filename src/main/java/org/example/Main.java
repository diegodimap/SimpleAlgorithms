package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static String SearchingChallenge(String[] s) {
        String output = "";

        Map<String, Integer> letters = new TreeMap<>();

        for(int i=0; i<s.length; i++){
            String key = s[i].split(":")[0];
            int value = Integer.parseInt(s[i].split(":")[1]);
            if(!letters.containsKey(key)){
                letters.put(key, value);
            }else{
                int numOld = letters.get(key);
                int numNew = numOld + letters.get(key);
                letters.put(key, numNew);
            }
        }

        for (Map.Entry<String,Integer> entry : letters.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

            if(entry.getValue() != 0){
                output += entry.getKey() + ":" + entry.getValue()+ ",";
            }
        }

        output = output.substring(0, output.length()-1);

        return output;
    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static boolean MathChallenge(int num) {

        int cont = 1;
        while (fibo(cont) <= num){
            System.out.println(fibo(cont));
            if (fibo(cont++) == num) {
                return true;
            }
        }

        return false;
    }

    public static String SearchingChallenge(String s) {

        String s2 = "";
        for (int i = 0; i < s.length()-1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                s2+=s.charAt(i);
            }
        }

        for (int i = 0; i < s2.length()-1; i++) {
            int number = Integer.parseInt(s2.charAt(i)+"");
            if(number%2==0){
                int number2 = Integer.parseInt(s2.charAt(i+1)+"");
                if(number2%2==0){
                    return "true";
                }
            }
        }

        return "false";
    }

    public static void main (String[] args) {
        String[] vai =new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};
        System.out.print(SearchingChallenge(vai));
        //System.out.println(MathChallenge(3));
        //System.out.println(SearchingChallenge("3gy41d216"));
    }
}