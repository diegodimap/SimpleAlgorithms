package org.simple.algorithms;

import java.util.Map;
import java.util.TreeMap;

public class SumMapItens {

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

    public static void main (String[] args) {
        String[] vai =new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"};
        System.out.print(SearchingChallenge(vai));
    }
}