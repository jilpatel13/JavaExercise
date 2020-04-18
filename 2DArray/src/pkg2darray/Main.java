/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

/**
 *
 * @author jilpatel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = {7,8,9};
                
        int d[][] = {
            
                     {1,2,3,4}, 
                     {4,5,6}, 
                     {7,8,9,9,10}
        
                    };
        
        for(int i=0; i<d.length ; i++)
        {
            for(int j=0; j<d[i].length ; j++)
            {
                System.out.print(" " + d[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
