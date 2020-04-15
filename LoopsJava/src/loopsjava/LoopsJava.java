/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsjava;

/**
 *
 * @author jilpatel
 */
public class LoopsJava {

    /**
     * @param args the command line arguments
     * 
     * while, for, do while
     * 
     * 
     */
    public static void main(String[] args) {
        //while
        int i = 1;
        while(i<=5)
        {
            System.out.println("Hello");
            i++;
        }
        
        //do-while
        int j = 8;
        do
        {
            System.out.println("Bye");
            j++;
        }while(j<=5);
        
        //for
        for(int k=1;k<=5;k++){
            System.out.println("This is for loop");

        }
    }
    
}
