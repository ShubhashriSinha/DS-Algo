/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author user
 */
public class LinkedList3of2 {
    
    public static void main(String[] args) {
        
        MyLinkedList2<String> myll = new MyLinkedList2();
        
        for(int i =0; i < 10; i++) {
            myll.add(i +"added");
        }
        
        myll.print();
        
    }
    
}
