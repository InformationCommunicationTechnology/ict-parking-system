/**
 * @Course: ICT 4305
 * @File: ParkingSystem.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.security.Key;
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
            List<Vehicle> cars = new ArrayList<>();
            List<ParkingLot> lots = new ArrayList<>();
            List<ParkingCharge> charges = new ArrayList<>();
            ArrayList<ParkingTransaction> transactions = new ArrayList<>();
            HashMap<String, ArrayList<ParkingTransaction>> vehicleTransaction = new HashMap<>();
            HashMap<String, ParkingPermit> permits = new HashMap<>();
            Address address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            Customer customer = new Customer("luther", "303422428", address, "### ### ####");
            ParkingLot parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);
            Vehicle car = new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            Money money = new Money(67);
            ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17);
            ParkingOffice parkingOffice = new ParkingOffice("DU",new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"),customers,lots);
            Calendar expirationDate = Calendar.getInstance();
            Calendar registrationDate = Calendar.getInstance();
            expirationDate.set(2023, 11, 15, 04, 15, 20);
            registrationDate.set(2022, 11, 16, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            registrationDate.setTime(registrationDate.getTime());
            Calendar transactionDate = Calendar.getInstance();
            transactionDate.set(2023, 11, 15, 04, 15, 20);
            transactionDate.setTime(transactionDate.getTime());
            ParkingPermit parkingPermit = new ParkingPermit("valid",car,expirationDate,registrationDate);
            ParkingTransaction parkingTransaction = new ParkingTransaction(transactionDate,parkingPermit,parkingLot,money);
            PermitManager permitManager = new PermitManager(permits);
            TransactionManager transactionManager = new TransactionManager(transactions,vehicleTransaction);

//            charges.add(parkingCharge);
//            parkingOffice.register("customer", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########");
//            parkingOffice.register(new Customer("luther", "303422428", address, "### ### ####"), "OOY350", CarType.COMPACT);
//            parkingOffice.addCarToParkingLot();

            System.out.println("######## Address ###########\n"
                    + address.toString()
                    + "\n###################");
            System.out.println("######## Vehicle ###########\n"
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
            System.out.println("######## Parking Permit ###########\n"
                    + parkingPermit.toString()
                    + "\n###################");
            System.out.println("######## Parking Transaction ###########\n"
                    + parkingTransaction.toString()
                    + "\n###################");
            System.out.println("######## Permit Manager ###########\n"
                    + permitManager.toString()
                    + "\n###################");
            System.out.println("######## Transaction Manager ###########\n"
                    + transactionManager.toString()
                    + "\n###################");

      }

}
