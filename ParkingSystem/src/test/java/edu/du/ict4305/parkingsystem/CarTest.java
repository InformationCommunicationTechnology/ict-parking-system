package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/5/22
 * @author lutherchikumba
 *
 */
public class CarTest {
      Car car;
      LocalDate date;
      CarType type;
      public CarTest() {
            date = LocalDate.now();
            type = CarType.COMPACT;
            car = new Car("valid", date, "YYY:350", type);
      }

      @Test
      public void getPermit() {
            assertEquals("valid",car.getPermit());
      }

      @Test
      public void setPermit() {
      }

      @Test
      public void getPermitExpiration() {
            assertEquals(date,car.getPermitExpiration());
      }

      @Test
      public void setPermitExpiration() {
      }

      @Test
      public void getLicense() {
            assertEquals("YYY:350",car.getLicense());
      }

      @Test
      public void setLicense() {
      }

      @Test
      public void getType() {
            assertEquals(type,car.getType());
      }

      @Test
      public void setType() {
      }

      @Test
      public void owner() {
            Address address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            Customer customer = new Customer("luther", "303422425",address,"##########");
            assertEquals("303422425", car.owner(customer));
      }

      @Test
      public void testToString() {
      }
}