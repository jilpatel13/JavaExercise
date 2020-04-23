/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jilpatel
 */

class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hi obj = new Hi();
        Hello obj1 = new Hello();
        
        obj.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj1.start();
        
        
    }
    
}
