/**
 * @Course: ICT 4305
 * @File: ParkingSystem.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

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
            Address address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            System.out.println("My address is\n" + address.getAddressInfo());
            Customer customer = new Customer("luther", "303422428", address, "### ### ####");
            ParkingLot parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);

            // ##############################################################################################
            //                                                                                              #
            //            ASSIGNMENT: ADD MONEY, PARKING CHARGE, AND PARKING OFFICE CLASSES                 #
            //                                                                                              #
            // ##############################################################################################
            List<Customer> customers = new ArrayList<>();
            List<Car> cars = new ArrayList<>();
            List<ParkingLot> lots = new ArrayList<>();
            List<ParkingCharge> charges = new ArrayList<>();

            ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17);
            ParkingOffice parkingOffice = new ParkingOffice("luther", "4581 S Valdai Way. Aurora CO 80015", customers, cars, lots, charges, new Car("valid", LocalDate.now(), "OOY350", CarType.COMPACT), new ParkingLot("lotId", "My Address", 90));

            parkingOffice.register("customer", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########");
            System.out.println("The size of the customers is " + customers.size());
            parkingOffice.register(new Customer("luther", "303422428", address, "### ### ####"), "OOY350", CarType.COMPACT);
            System.out.println("The size of the cars is " + cars.size());

            System.out.println("The parking charge is " + parkingOffice.addCharge(new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17)));

            parkingOffice.addCarToParkingLot();
            Collection <String > permits;
            permits = parkingOffice.getPermitAllIds();
            System.out.println(permits);
            permits = parkingOffice.getCustomerPermitIds(customer);
            System.out.println("Here's the permit id for " + customer.getName() + " : " + permits);

      }

}
