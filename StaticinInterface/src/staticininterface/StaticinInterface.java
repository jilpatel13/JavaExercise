/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticininterface;

/**
 *
 * @author jilpatel
 */
interface Display
{
    static void show()
    {
        System.out.println("in show");
    }
}
public class StaticinInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Display.show();
    }
    
}
