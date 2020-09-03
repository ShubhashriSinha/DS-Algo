/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.priorityQueue;

import java.util.PriorityQueue;

/**
 *
 * @author user
 */
public class MainClass {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(12);
        pq.add(11);
        pq.add(100);
        
        System.out.println(pq);
        
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }
    
}
