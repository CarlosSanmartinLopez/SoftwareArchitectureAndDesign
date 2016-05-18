/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author 2do A Programacion
 */
public class AutoElectricFeacture extends AutomobileDecorator
{

    public AutoElectricFeacture(Automobile auto) 
    {
        super(auto);
    }

    @Override
    public void on() 
    {
        System.out.println("Starting Electronically");
        getAuto().on();
    }

    @Override
    public void off() 
    {
        System.out.println("Off (Electronic)");
        getAuto().on();
    }

    @Override
    public void accel() 
    {
        System.out.println("Acceleration (Electronic)");
        getAuto().on();
    }

    @Override
    public void stop() 
    {
        System.out.println("Stop (Electronic)");
        getAuto().on();
    }
    
}
