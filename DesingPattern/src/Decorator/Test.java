
package Decorator;

public class Test 
{
    public static void main(String[] args) 
    {
        Automobile carStandar = new CarStandar("Ford");
            carStandar.on();
            carStandar.accel();
            carStandar.stop();
            carStandar.off();
            
        System.out.println("Change ----------------");
        carStandar = new AutoElectricFeacture(carStandar);
            carStandar.on();
            carStandar.accel();
            carStandar.stop();
            carStandar.off();
    }
}
