/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Stelliox.com
 */
public class Test 
{
    public static void main(String[] args) 
    {
        Context context = new Context();
        
        OnState onState = new OnState();
            onState.doAction(context);
            System.out.println(context.getState());
            
        OffState offState = new OffState();
            offState.doAction(context);
            System.out.println(context.getState());
    }
}
