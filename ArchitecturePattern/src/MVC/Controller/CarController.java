/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Controller;

import MVC.Model.Car;
import MVC.View.CarView;

/**
 *
 * @author Stelliox.com
 */
public class CarController 
{
    private Car model;
    private CarView view;

    public CarController(Car model, CarView view) 
    {
        this.model = model;
        this.view = view;
    }

    public void setCarBrand(String brand) 
    {
        this.model.setBrand(brand);
    }
    
    public void setCarColor(String color) 
    {
        this.model.setColor(color);
    }
    
    public void setCarPlate(String plate) 
    {
        this.model.setPlate(plate);
    }
    
    public void updateView() 
    {
        view.printCarDetails(this.model.getBrand(), this.model.getColor(),
                this.model.getPlate());
    }
}
