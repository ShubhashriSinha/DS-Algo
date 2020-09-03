/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.*;

/**
 *
 * @author user
 */
public class MyLinkedList {
    
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        
        getTimeDiff(al);
        getTimeDiff(ll);
    }
    
    static void getTimeDiff(List<Integer> list) {
        
        long start = System.currentTimeMillis();
        
        for(int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        
        System.out.println(list.getClass().getName() + "-->" + (end - start));
            
    }
}
