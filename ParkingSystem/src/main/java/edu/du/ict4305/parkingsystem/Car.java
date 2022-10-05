/**
 * @Course: ICT 4305
 * @File: Car.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;

/**
 * The type Car.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public class Car {
      private String permit;
      private LocalDate permitExpiration;
      private String license;
      private CarType type;

      /**
       * Instantiates a new Car.
       */
      public Car(String permit, LocalDate permitExpiration, String license, CarType type ) {
            this.permit = permit;
            this.permitExpiration = permitExpiration;
            this.license = license;
            this.type = type;
      }

      /**
       * Gets permit.
       *
       * @return permit permit
       */
      public String getPermit() {
            return permit;
      }

      /**
       * Sets permit.
       *
       * @param permit the permit
       */
      public void setPermit(String permit) {
            this.permit = permit;
      }

      /**
       * Gets permit expiration.
       *
       * @return permit expiration
       */
      public LocalDate getPermitExpiration() {
            return permitExpiration;
      }

      /**
       * Sets permit expiration.
       *
       * @param permitExpiration the permit expiration
       */
      public void setPermitExpiration(LocalDate permitExpiration) {
            this.permitExpiration = permitExpiration;
      }

      /**
       * Gets license.
       *
       * @return license
       */
      public String getLicense() {
            return license;
      }

      /**
       * Sets license.
       *
       * @param license the license
       */
      public void setLicense(String license) {
            this.license = license;
      }

      /**
       * Gets type.
       *
       * @return type
       */
      public CarType getType() {
            return type;
      }

      /**
       * Sets type.
       *
       * @param type the type
       */
      public void setType(CarType type) {
            this.type = type;
      }

      /**
       * Owner string.
       *
       * @param id the id
       * @return string
       */
      public String owner(Customer id) {
            return id.getCustomerId();
      }

      /**
       * @return
       */
      public String toString() {
            return "";
      }
}
