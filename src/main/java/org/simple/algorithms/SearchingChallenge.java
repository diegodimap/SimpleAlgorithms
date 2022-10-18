package org.simple.algorithms;

public class SearchingChallenge {

    public static void main(String[] args) {
        System.out.println(SearchingChallenge("3gy41d216"));
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
}
