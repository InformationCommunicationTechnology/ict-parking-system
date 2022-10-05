/**
 * @Course: ICT 4305
 * @File: ParkingSystem.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

/**
 * The type Parking system.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public class ParkingSystem {

      /**
       * The entry point of application.
       *
       * @param args the input arguments
       */
      public static void main(String[] args) {
            Address address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            System.out.println("My address is\n" + address.getAddressInfo());
            Customer customer = new Customer("luther", "303422428", address, "### ### ####");
            CarType type = CarType.SUV;
            Car register = customer.register("YYY:350", type);
            System.out.println("Hello World! My here's my new registered car type is " + register.getType());
            System.out.println("Hello World! My here's my new registered car license is " + register.getLicense());
      }
}
