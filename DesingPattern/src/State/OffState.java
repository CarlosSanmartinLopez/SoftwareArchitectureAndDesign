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
public class OffState implements State
{
    @Override
    public void doAction(Context context)
    {
        System.out.println("The Button is Off state");
        context.setState(this);
    }
    
    @Override
    public String toString()
    {
      return "Off State";
    }
}
