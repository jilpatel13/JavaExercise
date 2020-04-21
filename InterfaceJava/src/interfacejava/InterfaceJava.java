/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacejava;

/**
 *
 * @author jilpatel
 */
interface Writer
{
    void write();
}

class Pen implements Writer
{
    public void write()
    {
        System.out.println("writing using pen");
    }
}
class Pencil implements Writer
{
    public void write()
    {
        System.out.println("writing using pencil");
    }
}
class Kit
{
    public void doSomething(Writer p)
    {
        p.write();
    }
}
public class InterfaceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kit k = new Kit();
        
        Writer p = new Pen();
        Writer pc = new Pencil();
        
        k.doSomething(p);
    }
    
}
