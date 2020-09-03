/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;


/**
 *
 * @author user
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        MyQueue<Integer> mq = new MyQueue<>();

        mq.enqueue(12);
        mq.enqueue(2);
        mq.enqueue(42);
        mq.enqueue(62);
        
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        
        mq.enqueue(565);
        
        System.out.println(mq.dequeue());
        System.out.println(mq.peek());
        System.out.println(mq.dequeue());
        System.out.println(mq.peek());
        System.out.println(mq.dequeue());
        System.out.println(mq.peek());
    }
    
}
