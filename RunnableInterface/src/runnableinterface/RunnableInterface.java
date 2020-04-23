/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnableinterface;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jilpatel
 */

class Hi implements Runnable
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
public class RunnableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(RunnableInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
        
    }
    
}
