/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.deque;

import java.util.ArrayDeque;

/**
 *
 * @author user
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        
        ad.addFirst(12);
        ad.addFirst(23);
        
        ad.pop();
        System.out.println(ad.peek());
        
    }
    
}
