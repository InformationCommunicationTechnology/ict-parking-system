package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/21/22
 * @author lutherchikumba
 *
 */
public class ParkingChargeTest {
      ParkingCharge parkingCharge;
      Instant incurred = Instant.now();

      public ParkingChargeTest() {
            parkingCharge = new ParkingCharge("4728", incurred.minus(17, ChronoUnit.DAYS),new Money(7),"valid",17);
      }

      @Test
      public void setIncurredAmount() {
            parkingCharge.setIncurredAmount(67);
            assertEquals(67,parkingCharge.getIncurredAmount());
      }

      @Test
      public void getNumberOfDaysIncurred() {
            assertEquals(17,parkingCharge.getNumberOfDaysIncurred());
      }

      @Test
      public void setNumberOfDaysIncurred() {
      }

      @Test
      public void getPermitId() {
            assertEquals("valid",parkingCharge.getPermitId());
      }

      @Test
      public void setPermitId() {
      }

      @Test
      public void getLotId() {
            assertEquals("4728", parkingCharge.getLotId());
      }

      @Test
      public void setLotId() {
      }

      @Test
      public void getIncurred() {
            assertEquals( incurred.minus(17, ChronoUnit.DAYS),parkingCharge.getIncurred());
      }

      @Test
      public void setIncurred() {
      }

      @Test
      public void getAmount() {
            assertEquals(new Money(7).getDollars(),parkingCharge.getAmount().getDollars());
      }

      @Test
      public void setAmount() {
      }

      @Test
      public void getIncurredAmount() {
            assertEquals(1.1900000000000002,parkingCharge.getIncurredAmount());
      }

      @Test
      public void testToString() {
      }
}