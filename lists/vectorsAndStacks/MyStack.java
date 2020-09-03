/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.vectorsAndStacks;

import lists.MyLinkedList2;

/**
 *
 * @author user
 * @param <E>
 */
public class MyStack<E> {
    
    private MyLinkedList2<E> ll = new MyLinkedList2<>();
    
    void push(E e) {
        ll.add(e);
    }
    
    E pop()throws Exception{
        if(ll.isEmpty()) {
            throw new Exception("Popping from empty stack is not allowed");
        }
        return ll.removeLast();
    }
    
    E peek() throws Exception{
        if(ll.isEmpty()) {
            throw new Exception("Peeking from empty stack is not allowed");
        }
        
        return ll.getLast();
    }
    
}
