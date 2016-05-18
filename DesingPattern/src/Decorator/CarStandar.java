package Decorator;

public class CarStandar implements Automobile
{
    private String name;
    public CarStandar(String aName) 
    {
        name = aName;
    }

    @Override
    public void on() 
    {
        System.out.println("On Standar");
    }

    @Override
    public void off() 
    {
        System.out.println("Off Standar");
    }

    @Override
    public void accel() 
    {
        System.out.println("Acceleration Standar");
    }

    @Override
    public void stop() 
    {
        System.out.println("Stop Standar");
    }
    
}
