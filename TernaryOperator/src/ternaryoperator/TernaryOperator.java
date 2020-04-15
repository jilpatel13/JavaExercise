/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaryoperator;

/**
 *
 * @author jilpatel
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     * 
     * 
     * ?: -->> condition?expr1:expr2;
     * 
     */
    public static void main(String[] args) {
        
       int i = 2;
       int j = 6;
       
       /* if(i>6)
           j=1;
       else
           j=2;
        */
       
       j = i>6?1:2;
       
       System.out.print(j);
    }
    
}
