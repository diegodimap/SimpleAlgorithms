package org.simple.algorithms;

public class TreeBFS {
    static No root;
    static No current;
    
    public static void main(String[] args) {
        TreeBFS tree = new TreeBFS();
        tree.addNo(4, "quatro");
        tree.addNo(5, "cinco");
        tree.addNo(1, "um");
        tree.addNo(2, "dois");
        tree.addNo(3, "tres");

        inOrderTraverseTree(root);
        System.out.println(findNo(3).value);

    }
    
    public void addNo(int key, String value){
        
        No novo = new No(key, value);
        
        if(root == null){
            root = novo;
            current = root;
        }else{
            current = root;
            No parent;
            while(true){
                parent = current;
                if(key < current.key){
                    current = current.left;
                    if(current == null){
                        parent.left = novo;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = novo;
                        return;
                    }
                }
            }
        }
    }
    
    public static void inOrderTraverseTree(No focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.left);
            System.out.println(focusNode.value);
            inOrderTraverseTree(focusNode.right);
        }
    }
    
    public static No findNo(int key){
        No current = root;
        
        while(true){
            if(current.key != key){
                if(key < current.key){
                    current = current.left;
                }else{
                    current = current.right;
                }
            }else{
                return current;
            }
            
            if(current == null){
                return null;
            }
        }
    }
    
    
}

class No{
    int key;
    String value;
    
    No left;
    No right;
    
    public No(int key, String value){
        this.key = key;
        this.value = value;
    }
}
