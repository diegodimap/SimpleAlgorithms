package org.simple.algorithms;

import java.util.ArrayList;

public class Parentesis {

    static ArrayList<String> in = new ArrayList<String>();
    static ArrayList<String> out = new ArrayList<String>();
    static int contIn = 0;
    static int contOut = 0;

    public static void main(String[] args) {
        System.out.println("(a[0]+b[2c[6]])             passed:" + parensMatch("(a[0]+b[2c[6]])"));
        System.out.println("f(e(d))                 	passed:" + parensMatch("f(e(d))"));
        System.out.println("[()]{}([])                	passed:" + parensMatch("[()]{}([])"));
        System.out.println("((b)                     	passed:" + !parensMatch("((b)"));
        System.out.println("(c]                       	passed:" + !parensMatch("(c]"));
        System.out.println("{(a[])                   	passed:" + !parensMatch("{(a[])"));
        System.out.println("([)]                      	passed:" + !parensMatch("([)]"));
        System.out.println("[({{}}])                 	passed:" + !parensMatch("[({{}}])"));
        System.out.println(")(                        	passed:" + !parensMatch(")("));

//        for (int i = 0; i < in.size(); i++) {
//            System.out.println(in.get(i));
//        }
    }

    public static boolean parensMatch(String sentence) {
        boolean test = true;
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) + "").equals("(") || (sentence.charAt(i) + "").equals("[") || (sentence.charAt(i) + "").equals("{")) {
                in.add(sentence.charAt(i) + "");
                contIn++;
            }

            if ((sentence.charAt(i) + "").equals(")")) {
                if (in.size() > 0) {
                    if (in.get(in.size() - 1).equals("(")) {
                        in.remove(in.size() - 1);
                        contOut++;
                    } else {
                        test = false;
                    }
                } else {
                    test = false;
                }
            }

            if ((sentence.charAt(i) + "").equals("]")) {
                if (in.size() > 0) {
                    if (in.get(in.size() - 1).equals("[")) {
                        //System.out.println(in.get(in.size()-1).equals("[")); //last one
                        in.remove(in.size() - 1);
                        contOut++;
                    } else {
                        test = false;
                    }
                } else {
                    test = false;
                }
            }

            if ((sentence.charAt(i) + "").equals("}")) {
                if (in.size() > 0) {
                    if (in.get(in.size() - 1).equals("{")) {
                        in.remove(in.size() - 1);
                        contOut++;
                    } else {
                        test = false;
                    }
                } else {
                    test = false;
                }
            }

        }

        if(contIn != contOut) test = false;
        contIn = 0;
        contOut = 0;
        
        in.clear();

        return test;
    }

// Write a function that returns true if the brackets in a given string are balanced. 
// Balanced means that every parenthesis/bracket or brace that is opened must be closed
// And it must be closed in the right order (Always close the last symbol you opened)
// The function must handle parens (), square brackets [], and curly braces {}.

}
