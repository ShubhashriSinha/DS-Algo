/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author user
 */
public class Anagram2 {
    
    public static void main(String[] args) {
        
        String a = "123%^aab";
        String b = "aba^%231";
        
        boolean isAnagram = true;
        
        int al[] = new int[256];
        
        for(char c: a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
         for(char c: b.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
         for(int i = 0; i < 256; i++) {
             if(al[i] != 0) {
                 isAnagram = false;
                 break;
             }
         }
         
         if(isAnagram) {
             System.out.println("anagram");
         } else {
             System.out.println("not anagram");
         }
    }
    
}
