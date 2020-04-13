/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author jilpatel
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long l = 5000000000l; // 8 bytes
        int i = 5; //4 bytes -> 32 bits
        short s = 5; //2 bytes -> 16 bits
        byte b = 5; //1 byte -> 8 bits
        float f = 5.5f;
        double d = 5.5;
        
        char c = 'A';
        c = 66;
        
        System.out.println(c);
        
        double d1 = 5; //implicit conversion
        System.out.println(d1);
        
        int k = (int)5.6; //type casting
        System.out.println(k);

    
    }
}
