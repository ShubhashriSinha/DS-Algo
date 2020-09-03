/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class MyArrayList {
    
    public static void main(String[] args) {
    
        List<String> fruits = new LinkedList();
        List<String> vegetables = new ArrayList();
        
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Hi");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Carrot");
        
        fruits.addAll(vegetables);
        fruits.set(1, "Banana");
        fruits.remove(2);
//        fruits.clear();
        List<String> toRemove = new ArrayList();
        toRemove.add("Banana");
        toRemove.add("Tomato");
        toRemove.add("Potato");
        
        fruits.removeAll(toRemove);
        
        Object x[] = fruits.toArray();
        
        
//        String temp[] = new String[fruits.size()];
//        fruits.toArray(temp);
//        
        for(Object e: x) {
            System.out.println(e);
        }
//        ArrayList<Integer> marks = new ArrayList();
//
//    Pair<String, Integer> p1 = new Pair("Anuj", 457);
//    Pair<Boolean, String> p2 = new Pair(true, "Hello");
//    
//    p1.getDescription();
//    p2.getDescription();

    }
    
}
