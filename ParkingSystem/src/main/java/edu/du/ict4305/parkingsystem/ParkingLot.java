/**
 * @Course: ICT 4305
 * @File: ParkingLot.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Parking lot.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public class ParkingLot {
      private String lotId;
      private String address;
      private int capacity;

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ParkingLot that = (ParkingLot) o;
            return capacity == that.capacity && Objects.equals(lotId, that.lotId) && Objects.equals(address, that.address);
      }

      @Override
      public int hashCode() {
            return Objects.hash(lotId, address, capacity);
      }

      /**
       * Instantiates a new Parking lot.
       */
      public ParkingLot(String lotId, String address, int capacity) {
            this.lotId = lotId;
            this.address = address;
            this.capacity = capacity;
      }

      /**
       * Gets lod id.
       *
       * @return lod id
       */
      public String getLotId() {
            return lotId;
      }

      /**
       * Sets lod id.
       *
       * @param lodId the lod id
       */
      public void setLotId(String lodId) {
            this.lotId = lodId;
      }

      /**
       * Gets address.
       *
       * @return address address
       */
      public String getAddress() {
            return address;
      }

      /**
       * Sets address.
       *
       * @param address the address
       */
      public void setAddress(String address) {
            this.address = address;
      }

      /**
       * Gets capacity.
       *
       * @return capacity capacity
       */
      public int getCapacity() {
            return capacity;
      }

      /**
       * Sets capacity.
       *
       * @param capacity the capacity
       */
      public void setCapacity(int capacity) {
            this.capacity = capacity;
      }

      public boolean isCapacityFull() {
            if (getCapacity() <= 0) {
                  throw new IllegalArgumentException("Parking Lot is full");
            } else {
                  return false;
            }
      }

      /**
       * Entry.
       *
       * @param car the car
       */
      public void entry(Vehicle car) {
//            car.setLicense("YYY:350");
//            car.setPermit("Invalid");
//            car.setType(CarType.COMPACT);
//            car.setPermitExpiration(LocalDate.now());
//            System.out.println("The car that has entered the license is " + car.getLicense());
//            System.out.println("The car that has entered the permit is " + car.getPermit());
//            System.out.println("The car that has entered the car type is " + car.getType());
//            System.out.println("The car that has entered the permit expiration date is " + car.getPermitExpiration());
            // ##############################################################################################
            //                                                                                              #
            //            ASSIGNMENT: ADD MONEY, PARKING CHARGE, AND PARKING OFFICE CLASSES                 #
            //                                                                                              #
            // ##############################################################################################

            List<Customer> customers = new ArrayList<>();
            List<Vehicle> cars = new ArrayList<>();
            List<ParkingLot> lots = new ArrayList<>();
            List<ParkingCharge> charges = new ArrayList<>();
            ParkingOffice parkingOffice = new ParkingOffice("DU",new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"),customers,lots);
            long cents = 100;
            int numberOfDaysIncurred = 17;
            if (Objects.equals(car.getPermit(), "valid") && !isCapacityFull()) {
                  System.out.println("Enter the parking lot");
                  if (car.getType() == CarType.COMPACT) {
                        ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(cents), "valid", numberOfDaysIncurred);
                        double regularChargeWithDiscount = parkingCharge.getIncurredAmount() - ((cents / 100.0) * .2);
                        System.out.println("Your total amount is " + regularChargeWithDiscount);
                  } else {
                        ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(cents), "valid", numberOfDaysIncurred);
                        double regularCharge = parkingCharge.getIncurredAmount();
                        System.out.println("Your total amount is " + regularCharge);
                  }

            }
      }

      @Override
      public String toString() {
            return "ParkingLot:\n" +
                    "lotId='" + lotId + '\'' +
                    ",\naddress='" + address + '\'' +
                    ",\ncapacity=" + capacity;
      }
}
