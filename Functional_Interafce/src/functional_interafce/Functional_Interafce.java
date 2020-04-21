/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional_interafce;

/**
 *
 * @author jilpatel
 * 
 * 
 * Types of Interface
 * Normal
 * Single abstract method - Functional Interface
 * Marker interface
 */

interface Test
{
    void show();
}
public class Functional_Interafce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Test obj = () -> System.out.println("Lamda expr");
          
                obj.show();

        }   
}
