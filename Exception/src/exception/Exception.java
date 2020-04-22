/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author jilpatel
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            int a[] = new int[4];
            a[5] = 6;
            int b[] = null;
            int i = 9/0;

        }
       
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Error");
        }
        
        finally
        {
           System.out.println("Bye");
 
        }
    }
    
}
