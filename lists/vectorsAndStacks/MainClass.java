/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.vectorsAndStacks;

import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author user
 */
public class MainClass {
    
    public static void main(String[] args) throws Exception {
        
//        Vector<Integer> v = new Vector();
//        
//        v.add(23);
//        v.add(22);
          MyStack<Integer> stack = new MyStack();
          
//          stack.push(12);
//          stack.push(23);
//          stack.push(34);
//          stack.push(78);
          
          int popped = stack.pop();
          
          System.out.println(popped);
          
          int peeked = stack.peek();
          
          System.out.println(peeked);
        
    }
    
}
