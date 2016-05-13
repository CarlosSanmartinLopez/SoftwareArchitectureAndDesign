/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Stelliox.com
 */

interface CarShop
{
    public void model();
    public void price();
}

class Maserati implements CarShop
{
    @Override
    public void model() 
    {
        System.out.println("Model:> GranCabrio");
    }

    @Override
    public void price() 
    {
        System.out.println("Price:> 154 386 €");
    }
}

class AstonMartin implements CarShop
{
    @Override
    public void model() 
    {
        System.out.println("Model:> DB6");
    }

    @Override
    public void price() 
    {
        System.out.println("Price:> 258 026");
    }
}

class Pagani implements CarShop
{
    @Override
    public void model() 
    {
        System.out.println("Model:> Huayra BC");
    }

    @Override
    public void price() 
    {
        System.out.println("Price:> 2 500 000");
    }
}

public class ShopKeeper
{
    private CarShop maserati;
    private CarShop astonMartin;
    private CarShop pagani;

    public ShopKeeper() 
    {
        maserati = new Maserati();
        astonMartin = new AstonMartin();
        pagani = new Pagani();
    }   
    
    public void maseratiSale()
    {
        maserati.model();
        maserati.price();
    }
    
    public void astonMartinSale()
    {
        astonMartin.model();
        astonMartin.price();
    }
    
    public void paganiSale()
    {
        pagani.model();
        pagani.price();
    }
}
