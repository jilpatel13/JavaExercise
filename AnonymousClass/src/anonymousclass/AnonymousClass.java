/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclass;

/**
 *
 * @author jilpatel
 */

interface Printer
{
    void print();
}
public class AnonymousClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Printer p = new Printer()
                        {
                            public void print()
                            {
                                System.out.println("Printing....");
                            }

                        };
        p.print();
    }
    
}
