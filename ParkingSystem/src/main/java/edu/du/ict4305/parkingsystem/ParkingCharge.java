/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.Instant;

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
       * Instantiates a new Parking charge.
       */
      public ParkingCharge() {

      }

      /**
       * The Permit id.
       */
      String permitId;

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
       * Sets incurred.
       *
       * @param incurred the incurred
       */
      public void setIncurred(Instant incurred) {
            this.incurred = incurred;
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
       * @return
       */
      public String toString() {
            return "";
      }
}
