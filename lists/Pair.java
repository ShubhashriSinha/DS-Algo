/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author user
 */
public class Pair<X, Y> {
    
    X x;
    Y y;
    
    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }
    
    public void getDescription(){
        System.out.println(x +" and "+ y);
    }
    
}
