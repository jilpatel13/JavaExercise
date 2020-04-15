/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author jilpatel
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     * 
     * 
     * you can use string with switch in 1.7 or later version of java
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        int n = 4;
        
        switch(n)
        {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            default:
                System.out.print("No match");

        }
    }
    
}
