/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Model;

/**
 *
 * @author Stelliox.com
 */
public class Car 
{
    private String Brand;
    private String Color;
    private String Plate;

    public Car(String Brand, String Color, String Plate) 
    {
        this.Brand = Brand;
        this.Color = Color;
        this.Plate = Plate;
    }
    
    public Car() 
    {
        this.Brand = "";
        this.Color = "";
        this.Plate = "";
    }

    public String getBrand() 
    {
        return Brand;
    }

    public void setBrand(String Brand) 
    {
        this.Brand = Brand;
    }

    public String getColor() 
    {
        return Color;
    }

    public void setColor(String Color) 
    {
        this.Color = Color;
    }

    public String getPlate() 
    {
        return Plate;
    }

    public void setPlate(String Plate) 
    {
        this.Plate = Plate;
    }
}
