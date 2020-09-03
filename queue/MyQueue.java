/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import lists.MyLinkedList2.Node;
/**
 *
 * @author user
 */
public class MyQueue<E> {
    
    private Node<E> head, rear;
    
    public void enqueue(E e) {
        
        Node<E> toAdd = new Node<>(e);
        
        if(head == null) {
            head = rear = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }
    
    public E dequeue() {
        
        if(head == null) {
            return null;
        }
        
        Node<E> temp = head;
        head = head.next;
        
        if(head == null) {
            rear = null;
        }
        return temp.data;
    }
    public E peek(){
        if(head == null){
            return null;
        }
        return head.data;
    }
    
}
