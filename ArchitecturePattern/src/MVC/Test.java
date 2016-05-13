/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import MVC.Controller.CarController;
import MVC.Model.Car;
import MVC.View.CarView;

/**
 *
 * @author Stelliox.com
 */
public class Test 
{
    public static Car getCarFromDataBase()
    {
        Car car = new Car();
        car.setBrand("Maserati");
        car.setColor("Black");
        car.setPlate("986-987");
        
        return car;
    }
    
    public static void main(String[] args) 
    {
        Car model = getCarFromDataBase();
        CarView view = new CarView();
        CarController controller = new CarController(model, view);
        
        controller.updateView();
        
        controller.setCarColor("Blue");
        controller.setCarPlate("789-758");
        
        controller.updateView();
    }
}
