/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * The type Parking charge.
 *
 * @author lutherchikumba
 * @Date: 10 /11/22
 */
public class ParkingCharge {
      /**
       * The Lot id.
       */
      String lotId;
      /**
       * The Incurred.
       */
      Instant incurred;
      /**
       * The Amount.
       */
      Money amount;
      /**
       * The Permit id.
       */
      String permitId;

      /**
       * The Incurred amount.
       */
      double incurredAmount;
      /**
       * The Number of days incurred.
       */
      int numberOfDaysIncurred;

      /**
       * Instantiates a new Parking charge.
       *
       * @param lotId                the lot id
       * @param incurred             the incurred
       * @param amount               the amount
       * @param permitId             the permit id
       * @param numberOfDaysIncurred the number of days incurred
       */
      public ParkingCharge(String lotId, Instant incurred, Money amount, String permitId, int numberOfDaysIncurred) {
            this.lotId = lotId;
            this.incurred = incurred;
            this.amount = amount;
            this.permitId = permitId;
            this.numberOfDaysIncurred = numberOfDaysIncurred;
      }

      /**
       * Sets incurred amount.
       *
       * @param incurredAmount the incurred amount
       */
      public void setIncurredAmount(double incurredAmount) {
            this.incurredAmount = incurredAmount;
      }

      /**
       * Gets number of days incurred.
       *
       * @return the number of days incurred
       */
      public int getNumberOfDaysIncurred() {
            return numberOfDaysIncurred;
      }

      /**
       * Sets number of days incurred.
       *
       * @param numberOfDaysIncurred the number of days incurred
       */
      public void setNumberOfDaysIncurred(int numberOfDaysIncurred) {
            this.numberOfDaysIncurred = numberOfDaysIncurred;
      }

      /**
       * Gets permit id.
       *
       * @return the permit id
       */
      public String getPermitId() {
            return permitId;
      }

      /**
       * Sets permit id.
       *
       * @param permitId the permit id
       */
      public void setPermitId(String permitId) {
            this.permitId = permitId;
      }

      /**
       * Gets lot id.
       *
       * @return the lot id
       */
      public String getLotId() {
            return lotId;
      }

      /**
       * Sets lot id.
       *
       * @param lotId the lot id
       */
      public void setLotId(String lotId) {
            this.lotId = lotId;
      }

      /**
       * Gets incurred.
       *
       * @return the incurred
       */
      public Instant getIncurred() {
            return incurred;
      }

      /**
       * Lets say we're charging 100c per day
       * after 30 days how much will the customer have incurred.
       * Sets incurred.
       *
       * @param incurred the incurred
       */
      public void setIncurred(Instant incurred) {
            this.incurred = incurred.minus(numberOfDaysIncurred, ChronoUnit.DAYS);
      }

      /**
       * Gets amount.
       *
       * @return the amount
       */
      public Money getAmount() {
            return amount;
      }

      /**
       * Sets amount.
       *
       * @param amount the amount
       */
      public void setAmount(Money amount) {
            this.amount = amount;
      }

      /**
       * Get incurred amount double.
       * @return the double
       */
      public double getIncurredAmount() {
            incurredAmount = getAmount().getDollars() * numberOfDaysIncurred;
            return incurredAmount;
      }

      /**
       * @return
       */
      public String toString() {
            return "";
      }
}
