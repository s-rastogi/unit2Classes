

/**
 * The class Car has a certain fuel efficiency and a certain amount of fuel in the gas tank.
 * A car may be driven a specified distance which redices the amount of fas in teh tank.
 * 
 * @author Saahil Rastogi
 * @version 10 September 2015
 */
public class Car
{
    /** specifies the fuel efficienct of the car in units of miles per gallon(mpg)*/
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the fas tank in units of gallons*/
    private double fuelInTank;
    /**
     * Contructior for objects of class Car tha
     *  specifies the fuel efficiency of the car.
     */
    public Car(double fuelEfficiency)
    {
        fuelInTank=0.0;
        fuelEfficiency = fuelEfficiency;
    }

    /**
     *Simutates driving the car the specified distance in miles and
     *reduces the amount of fuel in the car's tank
     * @pre        the specified distance cannot consume more than the fuel available 
     *               int the tank
     *         
     * @param    distacne    the specified distance to drive in miles  
     * @return    description of the return value
     */
    public void drive(double distance)
    {
       fuelInTank -= distance/fuelEfficiency;
        
    }
    

    /**
   
     * Returns the number of gallons in the car's tank
  
     * @return Returns the number of gallons in the car's tank
     */
    public double getGasInTank()
    {
        
        return fuelInTank;
    }

    /**
     *Increments the fuel stores in the car's tank by the specified amound in gallons
     *
     * @pre    gallonsOfGas must be positive
     
     * @param   gallonsOfGas amount in gallons to incremtn the fuel in the car's
     *                  tank
     
     */
    public void addGas( double gallonsOfGas)
    {
      fuelInTank += gallonsOfGas;
    }

}
