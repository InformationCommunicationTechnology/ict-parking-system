/**
 * @Course: ICT 4305
 * @File: ParkingLot.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

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
            System.out.println("The car that has entered the parking lot is " + car);
      }

      /**
       * @return
       */
      public String toString() {
            return "";
      }
}
