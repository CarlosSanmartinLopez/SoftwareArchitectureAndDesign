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
public class Logger 
{
    private static Logger INSTANCE = null;
    private String value;
    //private prevents instantiation from other classe
    private Logger()
    {
        value = "Hello Word";
    }
    
    // create a only one INSTANCE 
    private static void createInstance() 
    {
        if (INSTANCE == null) 
        {
            synchronized(Logger.class) 
            {
                if (INSTANCE == null) 
                { 
                    INSTANCE = new Logger();
                }
            }
        }      
    }
    
    // return a only one instance the class
    public static Logger getInstance() 
    {
        if (INSTANCE == null) 
            createInstance();
        
        return INSTANCE;
    }
    
    // prohibits cloning the instance   
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException(); 
    }

    public void setValue(String msg) 
    {
        value = msg;
    }
    
    public String getValue()
    {
        return value;
    }
    
    public void log(String msg)
    {
        System.out.println("> "+msg);
    }
}
