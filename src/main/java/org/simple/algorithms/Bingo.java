package org.simple.algorithms;

public class Bingo {
     private boolean isValidBingo(boolean[] card) {
     
        boolean test = false;
       
        boolean myCards[][] = new boolean[5][5];
     
        int count = 0;
        for(int i=0; i<5; i++){
          for(int j=0; j<5; j++){
             myCards[i][j] = card[count++];
          }
        }
         
        for(int i=0; i<5; i++){
          int line = 0;
          for(int j=0; j<5; j++){
             if(myCards[i][j] == true) line++;
          }
         
          if(line == 5){
            return true;
          }else{
            line = 0;
          }
     
        }
     
       for(int j=0; j<5; j++){
          int column = 0;
          for(int i=0; i<5; i++){
             if(myCards[i][j] == true) column++;
          }
         
          if(column == 5){
            return true;
          }else{
            column = 0;
          }
        }
        int line = 0;
        int line2 = 0;
        for(int i=0; i<5; i++){
          for(int j=0; j<5; j++){
             if(myCards[i][j] == true && i==j) line++;
              if(myCards[i][j] == true && (i+j+1)==5) line2++;
          }
        }
     
        if(line == 5 || line2==5){
           return true;
        }
        // TODO implement this method
        return test;
    }
     
    public Bingo() {
        test(card1, true);
        test(card2, true);
        test(card3, true);
        test(card4, true);
        test(card5, false);
    }
     
    private void test(boolean[] card, boolean expectedValue) {
        if (isValidBingo(card) == expectedValue) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
    }
     
    // horizontal
    private boolean[] card1 = {
        false, false, false, false, false,
        false, false, false, false, false,
        false, false, false, false, false,
        true,  true,  true,  true,  true,
        false, false, false, false, false,
    };
    // vertical
    private boolean[] card2 = {
        false, true, false, false, false,
        false, true, false, false, false,
        false, true, false, false, false,
        false, true, false, false, false,
        false, true, false, false, false,
    };
    // diagonal
    private boolean[] card3 = {
        true,  false, false, false, false,
        false, true,  false, false, false,
        false, false, true,  false, false,
        false, false, false, true,  false,
        false, false, false, false, true,
    };
    // diagonal
    private boolean[] card4 = {
        false, false, false, false, true,
        false, false, false, true,  false,
        false, false, true,  false, false,
        false, true,  false, false, false,
        true,  false, false, false, false,
    };
    // no bingo
    private boolean[] card5 = {
        false, true,  true,  true,  true,
        true,  false, true,  true,  true,
        true,  true,  false, true,  true,
        true,  true,  true,  false, true,
        true,  true,  true,  true,  false,
    };
     
    public static void main(String[] args) {
        new Bingo();
    }
     
}
     

//BIG FISH GAMES