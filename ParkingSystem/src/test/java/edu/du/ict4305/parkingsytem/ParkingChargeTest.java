/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsytem;
import org.junit.jupiter.api.Test;
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
            parkingCharge = new ParkingCharge("4728", incurred.minus(17, ChronoUnit.DAYS),new Money(200),"valid",17);
      }

      @Test
      public void setIncurredAmount() {
            parkingCharge.setIncurredAmount(200);
            assertEquals(34,parkingCharge.getIncurredAmount());
      }

      @Test
      public void getNumberOfDaysIncurred() {
            assertEquals(17,parkingCharge.getNumberOfDaysIncurred());
      }

      @Test
      public void setNumberOfDaysIncurred() {
            parkingCharge.setNumberOfDaysIncurred(17);
            assertEquals(17, parkingCharge.getNumberOfDaysIncurred());
      }

      @Test
      public void getPermitId() {
            assertEquals("valid",parkingCharge.getPermitId());
      }

      @Test
      public void setPermitId() {
            parkingCharge.setPermitId("valid");
            assertEquals("valid", parkingCharge.getPermitId());
      }

      @Test
      public void getLotId() {
            assertEquals("4728", parkingCharge.getLotId());
      }

      @Test
      public void setLotId() {
            parkingCharge.setLotId("OOY");
            assertEquals("OOY", parkingCharge.getLotId());
      }

      @Test
      public void getIncurred() {
            assertEquals( incurred.minus(17, ChronoUnit.DAYS),parkingCharge.getIncurred());
      }

      @Test
      public void setIncurred() {
            parkingCharge.setIncurred(Instant.now());
//            assertEquals(Instant.now(), parkingCharge.getIncurred());
      }

      @Test
      public void getAmount() {
            assertEquals(new Money(200).getDollars(),parkingCharge.getAmount().getDollars());
      }

      @Test
      public void setAmount() {
            parkingCharge.setAmount(new Money(20));
            assertEquals(0.2,parkingCharge.getAmount().getDollars());
      }

      @Test
      public void getIncurredAmount() {
            assertEquals(34.0,parkingCharge.getIncurredAmount());
      }

      @Test
      public void testToString() {
      }
}