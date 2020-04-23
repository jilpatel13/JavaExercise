/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsynchronized;

/**
 *
 * @author jilpatel
 */

class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class Synchronized {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();
        
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Count: " + c.count);
    }
    
}
