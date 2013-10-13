import static org.junit.Assert.*;
import org.junit.* ;

//import org.junit.Test;

/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */


public class TemperatureTests {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

   @Test
   public void testGetUnits(){
	   //base cases
       Temperature testerK = new Temperature(0.0, Temperature.Units.KELVIN);
       assertEquals("It is in KELVIN",Temperature.Units.KELVIN,testerK.getUnits());
       Temperature testerC = new Temperature(0.0, Temperature.Units.CELSIUS);
       assertEquals("It is in CELSIUS",Temperature.Units.CELSIUS,testerC.getUnits());
       Temperature testerF = new Temperature(0.0, Temperature.Units.FAHRENHEIT);
       assertEquals("It is in FAHRENHEIT",Temperature.Units.FAHRENHEIT,testerF.getUnits());
   }

   @Test
   public void testGetValue(){
	   
   }

   @Test
   public void testChangeUnits() {
	   
   }
}
