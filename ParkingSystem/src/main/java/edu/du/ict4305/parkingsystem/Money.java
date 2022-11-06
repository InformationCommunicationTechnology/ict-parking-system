/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.Instant;

/**
 * The type Money.
 *
 * @author lutherchikumba
 * @Date: 10 /11/22
 */
public class Money {
      /**
       * The Cents.
       */
      long cents;

      /**
       * Instantiates a new Money.
       *
       * @param cents the cents
       */
      public Money(long cents) {
            this.cents = cents;
      }

      /**
       * Gets dollars.
       *
       * @return dollars
       */
      public double getDollars() {
            return (double) cents / 100.0;
      }

      /**
       * @return
       */
      @Override
      public String toString() {
            return "Money{" +
                    "cents=" + cents +
                    '}';
      }
}
