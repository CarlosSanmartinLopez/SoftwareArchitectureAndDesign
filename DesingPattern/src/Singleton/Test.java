/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Stelliox.com
 */
public class Test 
{
    public static void main(String[] args) 
    {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        System.out.println("logger1 > "+logger1.getValue());
        System.out.println("logger2 > "+logger2.getValue());
        
        logger1.setValue("Hello 1");
            System.out.println("logger1 > "+logger1.getValue());
            System.out.println("logger2 > "+logger2.getValue());
            
        logger2.setValue("Hello 2");
            System.out.println("logger1 > "+logger1.getValue());
            System.out.println("logger2 > "+logger2.getValue());            
    }
}
