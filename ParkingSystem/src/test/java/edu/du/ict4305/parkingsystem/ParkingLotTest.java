package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/5/22
 * @author lutherchikumba
 *
 */
public class ParkingLotTest {
      ParkingLot parkingLot;
      public ParkingLotTest() {
            parkingLot = new ParkingLot("3", "4581 S Valdai Way. Aurora CO 80015", 100);
      }

      @Test
      public void getLotId() {
            assertEquals("3", parkingLot.getLotId());
      }

      @Test
      public void setLotId() {
            parkingLot.setLotId("5");
            assertEquals("5", parkingLot.getLotId());
      }

      @Test
      public void getAddress() {
            assertEquals("4581 S Valdai Way. Aurora CO 80015", parkingLot.getAddress());
      }

      @Test
      public void setAddress() {
            parkingLot.setAddress("4581 S Valdai Way. Aurora CO 80015");
            assertEquals("4581 S Valdai Way. Aurora CO 80015", parkingLot.getAddress());
      }

      @Test
      public void getCapacity() {
            assertEquals(100, parkingLot.getCapacity());
      }

      @Test
      public void setCapacity() {
            parkingLot.setCapacity(67);
            assertEquals(67, parkingLot.getCapacity());
      }

      @Test
      public void entry() {

      }

      @Test
      public void testToString() {
      }
}