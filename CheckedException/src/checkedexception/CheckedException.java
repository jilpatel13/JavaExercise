/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexception;

import java.util.Scanner;

/**
 *
 * @author jilpatel
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Enter a number");
        try{
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.close();
        }
        
        catch(Exception e)
        {
            System.out.println("Enter integer only");
        }
        
    }
    
}
