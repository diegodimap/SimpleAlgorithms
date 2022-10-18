package org.simple.algorithms;

public class Sort { //bubble sort
    public static void main(String[] args) {
        int number[] = {8,5,3,2,9,1,2,7,6,4};
        
        boolean fixed = false;
        
        while(fixed == false){
            fixed = true;
            for (int i = 0; i < number.length-1; i++) {
                if(number[i] > number[i+1]){
                    int temp = number[i];
                    number[i] = number[i+1];
                    number[i+1] = temp;
                    fixed=false;
                }
            }
        }
        
        
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
