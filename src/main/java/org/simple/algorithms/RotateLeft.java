package org.simple.algorithms;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

}

public class RotateLeft {
    public static void main(String[] args) throws IOException {
        List<Integer> input = new LinkedList<Integer>();
        
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        
        List<Integer> output = rotLeft(input, 2);
        
        for (Integer integer : output) {
            System.out.println(integer);
        }
        
    }
    
    //O(d)
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        //mycode
        

        
        for(int i=0; i<d; i++){
            int temp = a.get(0);
            a.remove(0);
            a.add(temp);
        }

        
        return a;
    }
}

