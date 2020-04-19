/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author jilpatel
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 5; // primitive datatype
        Integer ii = new Integer(5); // wrapping
        
        int j = ii.intValue(); // unboxing - unwrapping
        
        Integer value = i; //autoboxing
        
        int k = value; // autounboxing
        
        String s = "1234";
        
        int n = Integer.parseInt(s);
        System.out.println(n);
    }
    
}
