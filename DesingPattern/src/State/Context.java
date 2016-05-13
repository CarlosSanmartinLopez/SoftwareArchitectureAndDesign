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
public class Context 
{
    private State state;

    public Context() 
    {
        state = null;
    }

    public State getState() 
    {
        return state;
    }

    public void setState(State state) 
    {
        this.state = state;
    }
}
