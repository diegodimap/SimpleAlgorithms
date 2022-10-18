package org.simple.algorithms;


public class SudokuValid {
    
    public static void main(String[] args) {
        String[][] board = new String[][]{
            {"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"},
        
        };
        
        System.out.println(isValidSudoku(board));
    }
    
    public static boolean isValidSudoku(String[][] board) {
        
        boolean line = true;
        boolean column = true;
        
        for(int i=0; i<9; i++){
            String linha = "123456789";
            for(int j=0; j<9; j++){
                if(board[i][j].equals(".")) continue;
                if(linha.contains(board[i][j])){
                    linha = linha.replace(board[i][j]+"", " ");
                    
                    System.out.println(i + " - " + linha);
                }else{
                    return false;
                }
            }
        }
        
        for(int i=0; i<9; i++){
            String linha = "123456789";
            for(int j=0; j<9; j++){
                if(board[j][i].equals(".")) continue;
                if(linha.contains(board[j][i])){
                    linha = linha.replace(board[j][i], " ");
                    System.out.println(linha);
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
}
