package org.simple.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Romans {

    /*
     * Complete the 'sortRoman' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY names as parameter.
     */
    
    public static void main(String[] args) {
        System.out.println(toRoman(1));
    }

    public static List<String> sortRoman(List<String> names) {
    // Write your code here
    
        
        
        Collections.sort(names);
        
        if(names.size() > 0){
            List<String> names2 = new ArrayList<String>();
            List<String> numbers = new ArrayList<String>();
            List<String> answer = new ArrayList<String>();
            
            answer.add("");
            
            for (String string : names) {
                names2.add(string.split(" ")[0]);
                numbers.add(string.split(" ")[1]);
            }
        
            for (int i = 0; i < names2.size(); i++) {
                System.out.println(names2.get(i) + " " + numbers.get(i));
                answer.add(names2.get(i) + " " + toDecimal(numbers.get(i)));
            }
            
            Collections.sort(answer);
            
            List<String> finalAnswer = new ArrayList<String>();
            
            for (String string : answer) {
                if(string.contains(" ")){
                    String name = string.split(" ")[0];
                    String number = string.split(" ")[1];
                    finalAnswer.add(name + " " + toRoman(Integer.parseInt(number)));
                }
            }
            
           
            return finalAnswer;
        }else{
            return null;
        }

    }
    
    static int value(char r){ 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 

        return -1; 
    }
    
    static int toDecimal(String str){ 
       int res = 0; 
  
        for (int i = 0; i < str.length(); i++) { 
            int s1 = value(str.charAt(i)); 
  
            if (i + 1 < str.length()) { 
                int s2 = value(str.charAt(i + 1)); 
  
                if (s1 >= s2) { 
                    res = res + s1; 
                } 
                else { 
                    res = res + s2 - s1; 
                    i++; 
                } 
            } 
            else { 
                res = res + s1; 
                i++; 
            } 
        } 
  
        return res; 
    } 
 
    static String toRoman(int num) {
        String[] romanCharacters = {"L", "X", "IX", "V", "I" };
        int[] romanValues = {50, 10, 9, 5, 1 };
        String result = "";
        
        for (int i = 0; i < romanValues.length; i++) {
            int numberInPlace = num / romanValues[i];
            if (numberInPlace == 0) continue;
            result += numberInPlace == 4 && i > 0? romanCharacters[i] + romanCharacters[i - 1]:
            new String(new char[numberInPlace]).replace("\0",romanCharacters[i]);
            num = num % romanValues[i];
        }
        return result;
    }

}
