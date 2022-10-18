package org.simple.algorithms;

import java.util.ArrayList;

/**
 * @author diego
 */
public class Threads {
    static ArrayList<Long> receivedTimes = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<100; i++){
            Thread.sleep(500);
            System.out.println(testTime(System.currentTimeMillis()));
        }
    }
    
    public static boolean testTime(long receivedTime){
        if(receivedTimes.size() == 10){
            receivedTimes.remove(0);
        }
        receivedTimes.add(receivedTime);
        long currentTime = System.currentTimeMillis();
        boolean answer = false;
        
        int sameSecond = 0;
        if(receivedTimes.size() >= 10){
            int size = receivedTimes.size()-1;
            for(int i=size; i>=0; i--){
                if(currentTime - receivedTimes.get(i) < 1000){
                    sameSecond++;
                }
            }
            
            if(sameSecond >= 10){
                answer = true;
            }else{
                answer = false;
            }
        }else{
            answer = false;
        }        
        return !answer;
    }
}
