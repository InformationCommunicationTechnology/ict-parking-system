package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lutherchikumba
 * @Date: 10/5/22
 */
public class CustomerTest {
      Customer customer;
      Address address;

      public CustomerTest() {
            address = new Address("4581 S Valdai Way.", "Aurora", "CO", "80015");
            customer = new Customer("luther", "303422425", address, "##########");
      }

      @Test
      public void getCustomerId() {
            assertEquals("303422425", customer.getCustomerId());
      }

      @Test
      public void setCustomerId() {
            customer.setCustomerId("303422425");
            assertEquals("303422425", customer.getCustomerId());
      }

      @Test
      public void getName() {
            assertEquals("luther", customer.getName());
      }

      @Test
      public void setName() {
            customer.setName("luther");
            assertEquals("luther", customer.getName());
      }

      @Test
      public void getAddress() {
            assertEquals(address, customer.getAddress());
      }

      @Test
      public void setAddress() {
            customer.setAddress(address);
            assertEquals(address, customer.getAddress());
      }

      @Test
      public void getPhoneNumber() {
            assertEquals("##########", customer.getPhoneNumber());
      }

      @Test
      public void setPhoneNumber() {
            customer.setPhoneNumber("##########");
            assertEquals("##########", customer.getPhoneNumber());
      }

      @Test
      public void register() {
            LocalDate date = LocalDate.now();
            CarType type = CarType.SUV;
            assertEquals("YYY:350", customer.register("YYY:350", type).getLicense());
      }

}