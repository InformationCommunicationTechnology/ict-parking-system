/**
 * @Course: ICT 4305
 * @File: ParkingLot.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;

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

      /**
       * Entry.
       *
       * @param car the car
       */
      public void entry(Car car) {
            car.setLicense("YYY:350");
            car.setPermit("Invalid");
            car.setType(CarType.COMPACT);
            car.setPermitExpiration(LocalDate.now());
            System.out.println("The car that has entered the license is " + car.getLicense());
            System.out.println("The car that has entered the permit is " + car.getPermit());
            System.out.println("The car that has entered the car type is " + car.getType());
            System.out.println("The car that has entered the permit expiration date is " + car.getPermitExpiration());
      }

}
