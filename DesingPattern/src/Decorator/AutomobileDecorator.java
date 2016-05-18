
package Decorator;

public abstract class AutomobileDecorator implements Automobile
{
    private Automobile auto;

    public AutomobileDecorator(Automobile auto) 
    {
        this.auto = auto;
    }

    protected Automobile getAuto() {
        return auto;
    }   
}
