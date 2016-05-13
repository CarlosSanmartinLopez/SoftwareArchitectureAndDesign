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
public class Test 
{
    public static void main(String[] args) 
    {
        ShopKeeper sk = new ShopKeeper();
        
        System.out.println("-----------");
        System.out.println("Maserati");
        sk.maseratiSale();
        
        System.out.println("-----------");
        System.out.println("Aston Martin");
        sk.astonMartinSale();
        
        System.out.println("-----------");
        System.out.println("Pagani");
        sk.paganiSale();
    }
}
