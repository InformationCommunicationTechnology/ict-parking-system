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
      private String lodId;
      private String address;
      private int capacity;

      /**
       * Instantiates a new Parking lot.
       */
      public ParkingLot() {

      }

      /**
       * Gets lod id.
       *
       * @return lod id
       */
      public String getLodId() {
            return lodId;
      }

      /**
       * Sets lod id.
       *
       * @param lodId the lod id
       */
      public void setLodId(String lodId) {
            this.lodId = lodId;
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

      }

      /**
       * @return
       */
      public String toString() {
            return "";
      }
}
