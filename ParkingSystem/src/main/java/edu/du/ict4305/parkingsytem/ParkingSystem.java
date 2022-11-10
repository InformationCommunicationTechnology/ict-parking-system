/**
 * @Course: ICT 4305
 * @File: ParkingSystem.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsytem;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

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
            List<Customer> customers = new ArrayList<>();
            List<Car> cars = new ArrayList<>();
            List<ParkingLot> lots = new ArrayList<>();
            List<ParkingCharge> charges = new ArrayList<>();
            Address address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            Customer customer = new Customer("luther", "303422428", address, "### ### ####");
            ParkingLot parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);
            Car car = new Car("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            Money money = new Money(67);
            ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17);
            ParkingOffice parkingOffice = new ParkingOffice("luther", "4581 S Valdai Way. Aurora CO 80015", customers, cars, lots, charges, new Car("valid", LocalDate.now(), "OOY350", CarType.COMPACT), new ParkingLot("lotId", "My Address", 90));

            charges.add(parkingCharge);
            parkingOffice.register("customer", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########");
            parkingOffice.register(new Customer("luther", "303422428", address, "### ### ####"), "OOY350", CarType.COMPACT);
            parkingOffice.addCarToParkingLot();

            System.out.println("######## Address ###########\n"
                    + address.toString()
                    + "\n###################");
            System.out.println("######## Car ###########\n"
                    + car.toString()
                    + "\n###################");
            System.out.println("######## Customer ###########\n"
                    + customer.toString()
                    + "\n###################");
            System.out.println("######## Money ###########\n"
                    + money.toString()
                    + "\n###################");
            System.out.println("######## Parking Charge ###########\n"
                    + parkingCharge.toString()
                    + "\n###################");
            System.out.println("######## Parking Lot ###########\n"
                    + parkingLot.toString()
                    + "\n###################");
            System.out.println("######## Parking Office ###########\n"
                    + parkingOffice.toString()
                    + "\n###################");

      }

}
