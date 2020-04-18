/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforloop;

/**
 *
 * @author jilpatel
 */
public class EnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4};
        
        for(int k:a)
        {
            System.out.print(" " + k);
        }
        
        int d[][] = {
            
                     {1,2,3,4}, 
                     {4,5,6}, 
                     {7,8,9,9,10}
        
                    };
        
        for(int j[]:d) // 2D array
        {
            for(int l:j)
            {
               System.out.print(" " + l);  
            }
            
            System.out.println();
        }
    }
    
}
