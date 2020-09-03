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
public class Anagrams {
    
    public static void main(String[] args) {
        
        String a = "lisenn";
        String b = "silent";
        
        boolean isAnagram = false;
        
        boolean visited[] = new boolean[b.length()];
       
        if(a.length() == b.length()) {  
        
            for(int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;

                for(int j = 0; j < b.length(); j++) {
                    if(b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram) {
                    break;
                }
            }
            
        }    
        if(isAnagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
    
}
