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
       //other values
       Temperature testerK2 = new Temperature(100.0, Temperature.Units.KELVIN);
       assertEquals("It is in KELVIN",Temperature.Units.KELVIN,testerK2.getUnits());
       Temperature testerC2 = new Temperature(-100.0, Temperature.Units.CELSIUS);
       assertEquals("It is in CELSIUS",Temperature.Units.CELSIUS,testerC2.getUnits());
       Temperature testerF2 = new Temperature(200.0, Temperature.Units.FAHRENHEIT);
       assertEquals("It is in FAHRENHEIT",Temperature.Units.FAHRENHEIT,testerF2.getUnits());
   }

   @Test
   public void testGetValue(){
	   //valid inputs
	   Temperature test1 = new Temperature(0.0, Temperature.Units.KELVIN);
	   assertEquals("It's value is 0.0", 0.0, test1.getValue(),6);
	   Temperature test2 = new Temperature(100.0, Temperature.Units.KELVIN);
	   assertEquals("It's value is 100.0", 100.0, test2.getValue(),6);
	   Temperature test3 = new Temperature(200.0, Temperature.Units.KELVIN);
	   assertEquals("It's value is 200.0", 200.0, test3.getValue(),6);
	   //other units
	   Temperature test4 = new Temperature(200.0, Temperature.Units.CELSIUS);
	   assertEquals("It's value is 200.0", 200.0, test4.getValue(),6);
	   Temperature test5 = new Temperature(200.0, Temperature.Units.FAHRENHEIT);
	   assertEquals("It's value is 200.0", 200.0, test5.getValue(),6);
	   //negative inputs
	   Temperature test6 = new Temperature(-200.0, Temperature.Units.CELSIUS);
	   assertEquals("It's value is -200.0", -200.0, test6.getValue(),6);
	   Temperature test7 = new Temperature(-200.0, Temperature.Units.FAHRENHEIT);
	   assertEquals("It's value is -200.0", -200.0, test7.getValue(),6);
   }

   @Test
   public void testChangeUnits() {
   //valid inputs	
	   //K to C
       Temperature testerKtoC = new Temperature(0.0, Temperature.Units.KELVIN);
       testerKtoC.changeUnits(Temperature.Units.CELSIUS);
       assertEquals("It is in CELSIUS now",Temperature.Units.CELSIUS,testerKtoC.getUnits());
       assertEquals("It's value should now be -273.15",-273.15,testerKtoC.getValue(),6);
       
       //C to K
       Temperature testerCtoK = new Temperature(0.0, Temperature.Units.CELSIUS);
       testerCtoK.changeUnits(Temperature.Units.KELVIN);
       assertEquals("It is in KELVIN now",Temperature.Units.KELVIN,testerCtoK.getUnits());
       assertEquals("It's value should now be 273.15",273.15,testerCtoK.getValue(),6);
       
       //K to F
       Temperature testerKtoF = new Temperature(0.0, Temperature.Units.KELVIN);
       testerKtoF.changeUnits(Temperature.Units.FAHRENHEIT);
       assertEquals("It is in FAHRENHEIT now",Temperature.Units.FAHRENHEIT,testerKtoF.getUnits());
       assertEquals("It's value should now be -457.87",-457.87,testerKtoF.getValue(),6);
       
       //F to K
       Temperature testerFtoK = new Temperature(0.0, Temperature.Units.FAHRENHEIT);
       testerFtoK.changeUnits(Temperature.Units.KELVIN);
       assertEquals("It is in KELVIN now",Temperature.Units.KELVIN,testerFtoK.getUnits());
       assertEquals("It's value should now be 255.372",255.372,testerFtoK.getValue(),6);
       
       //C to F
       Temperature testerCtoF = new Temperature(0.0, Temperature.Units.CELSIUS);
       testerCtoF.changeUnits(Temperature.Units.FAHRENHEIT);
       assertEquals("It is in FAHRENHEIT now",Temperature.Units.FAHRENHEIT,testerCtoF.getUnits());
       assertEquals("It's value should now be 32.0",32.0,testerCtoF.getValue(),6);
       
       //F to C
       Temperature testerFtoC = new Temperature(32.0, Temperature.Units.FAHRENHEIT);
       testerFtoC.changeUnits(Temperature.Units.CELSIUS);
       assertEquals("It is in CELSIUS now",Temperature.Units.CELSIUS,testerFtoC.getUnits());
       assertEquals("It's value should now be 0.0",0.0,testerFtoC.getValue(),6);
   }
}
