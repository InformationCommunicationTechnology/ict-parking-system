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
//            customers.add(new Customer("Tafadzwa", "customerId", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########"));
//            customers.add(new Customer("Taurai", "303422425", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########"));
//            cars.add(new Car("valid", LocalDate.now(), "YYY350", CarType.COMPACT));
//            cars.add(new Car("invalid", LocalDate.now(), "YOY350", CarType.SUV));
//            lots.add(new ParkingLot("4728", "4581 S Valdai Way. Aurora CO 80015", 6));
//            lots.add(new ParkingLot("2847", "4581 S Valdai Way. Aurora CO 80015", 6));
//            charges.add(new ParkingCharge("4728", Instant.now(), new Money(78), "valid", 17));
//            charges.add(new ParkingCharge("2847", Instant.now(), new Money(78), "invalid", 17));
//
//            for (Customer customer1 : customers) {
//                  System.out.println("Here's the customer's addresses " + customer1.getAddress().getAddressInfo());
//            }
//
//            for (Car car : cars) {
//                  System.out.println("Here's the customer's car's type " + car.getType());
//            }
//
//            for (ParkingLot parkingLot1 : lots) {
//                  System.out.println("Here's the customer's parking lots " + parkingLot1.getLotId());
//            }
//
//            for (ParkingCharge parkingCharge : charges) {
//                  System.out.println("Here's the customer's parking charge " + parkingCharge.getAmount().getDollars());
//            }
//
//            ParkingLot parkingLot1 = new ParkingLot("4728", "4581 S Valdai Way. Aurora CO 80015", 6);
//            parkingLot1.entry(new Car("valid", LocalDate.now(), "YYY350", CarType.COMPACT));
//            parkingLot1.entry(new Car("valid", LocalDate.now(), "YYY350", CarType.SUV));
            ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(200), "valid",17);
//            parkingCharge.setAmount(new Money(200));
//            System.out.println("The amount is " + parkingCharge.getAmount().getDollars());
//            System.out.println("The amount incurred is " + parkingCharge.getIncurredAmount());
//            parkingCharge.setIncurred(Instant.now());
            // Lets say you have been parking for 17 days
            ParkingOffice parkingOffice = new ParkingOffice("luther","4581 S Valdai Way. Aurora CO 80015",customers,cars,lots,charges,new Car("valid",LocalDate.now(),"OOY350",CarType.COMPACT));
            parkingOffice.register("customer",new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"),"##########");
            System.out.println("The size of the customers is " + customers.size());
            parkingOffice.register(new Customer("luther", "303422428", address, "### ### ####"),"OOY350",CarType.COMPACT);
            System.out.println("The size of the cars is " + cars.size());

      }

}
