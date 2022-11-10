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
public class AddressTest {
      private final Address address;

      public AddressTest() {
            address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
      }

      @Test
      public void getStreetAddress1() {
            assertEquals("4581 S Valdai Way.", address.getStreetAddress1());
      }

      @Test
      public void getGetStreetAddress2() {
            address.setGetStreetAddress2("4581 S Valdai Way. Aurora CO 80015");
            assertEquals("4581 S Valdai Way. Aurora CO 80015", address.getGetStreetAddress2());
      }

      @Test
      public void getCity() {
            assertEquals("Aurora", address.getCity());
      }

      @Test
      public void getState() {
            assertEquals("CO", address.getState());
      }

      @Test
      public void getZipCode() {
            assertEquals("80015", address.getZipCode());
      }

      @Test
      public void getAddressInfo() {
            assertEquals("4581 S Valdai Way.\nAurora, CO 80015", address.getAddressInfo());
      }

      @Test
      public void testGetStreetAddress1() {
            assertEquals("Aurora", address.getCity());
      }


      @Test
      public void setStreetAddress1() {
            address.setStreetAddress1("4581 S Valdai Way.");
            assertEquals("4581 S Valdai Way.", address.getStreetAddress1());
      }


      @Test
      public void setGetStreetAddress2() {
            address.setGetStreetAddress2("4581 S Valdai Way.\nAurora, CO 80015");
            assertEquals("4581 S Valdai Way.\nAurora, CO 80015", address.getGetStreetAddress2());
      }

      @Test
      public void setCity() {
            address.setCity("Aurora");
            assertEquals("Aurora", address.getCity());
      }


      @Test
      public void setState() {
            address.setState("CO");
            assertEquals("CO", address.getState());
      }


      @Test
      public void setZipCode() {
            address.setZipCode("80015");
            assertEquals("80015", address.getZipCode());
      }

      @Test
      public void testGetAddressInfo() {
            assertEquals("4581 S Valdai Way.\nAurora, CO 80015", address.getAddressInfo());
      }
}