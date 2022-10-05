/**
 * @Course: ICT 4305
 * @File: Address.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

/**
 * The type Address.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public class Address {
      private String streetAddress1;
      private String getStreetAddress2;
      private String city;
      private String state;
      private String zipCode;

      /**
       * Instantiates a new Address.
       */
      public Address(String streetAddress1, String city, String state, String zipCode) {
            this.streetAddress1 = streetAddress1;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
      }

      /**
       * Gets street address 1.
       *
       * @return street address 1
       */
      public String getStreetAddress1() {
            return streetAddress1;
      }

      /**
       * Sets street address 1.
       *
       * @param streetAddress1 the street address 1
       */
      public void setStreetAddress1(String streetAddress1) {
            this.streetAddress1 = streetAddress1;
      }

      /**
       * Gets get street address 2.
       *
       * @return get street address 2
       */
      public String getGetStreetAddress2() {
            return getStreetAddress2;
      }

      /**
       * Sets get street address 2.
       *
       * @param getStreetAddress2 the get street address 2
       */
      public void setGetStreetAddress2(String getStreetAddress2) {
            this.getStreetAddress2 = getStreetAddress2;
      }

      /**
       * Gets city.
       *
       * @return city
       */
      public String getCity() {
            return city;
      }

      /**
       * Sets city.
       *
       * @param city the city
       */
      public void setCity(String city) {
            this.city = city;
      }

      /**
       * Gets state.
       *
       * @return state
       */
      public String getState() {
            return state;
      }

      /**
       * Sets state.
       *
       * @param state the state
       */
      public void setState(String state) {
            this.state = state;
      }

      /**
       * Gets zip code.
       *
       * @return zip code
       */
      public String getZipCode() {
            return zipCode;
      }

      /**
       * Sets zip code.
       *
       * @param zipCode the zip code
       */
      public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
      }

      /**
       * Gets address info.
       *
       * @return address info
       */
      public String getAddressInfo() {
            getStreetAddress2 = getStreetAddress1() + "\n" + getCity() +", " + getState() + getZipCode();
            return getStreetAddress2;
      }
}
