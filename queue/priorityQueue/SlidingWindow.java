/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.priorityQueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class SlidingWindow {
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        int a[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
        int ans[] = solution.maxSlidingWindow(a, 4);
        
        for(int x: ans){
            System.out.println(x+ " ");
        }
        
    }
    
    static class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = a.length;
        int ans[] = new int[n-k+1];
        
        int i = 0;
        for( ; i<k; i++){
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(; i<n; i++){
            ans[i-k] = a[dq.peekFirst()];
            
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        ans[i-k] = a[dq.peekFirst()];
        
        return ans;
    }
}
    
}
