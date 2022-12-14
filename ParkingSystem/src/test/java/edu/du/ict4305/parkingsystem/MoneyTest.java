package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/21/22
 * @author lutherchikumba
 *
 */
public class MoneyTest {

      public MoneyTest() {

      }

      @Test
      public void getDollars() {
            Money money = new Money(7);
            assertEquals(0.07,money.getDollars());
      }

      @Test
      public void testToString() {
            Money money = new Money(200);
            assertEquals("$2.0",money.toString());
      }
}