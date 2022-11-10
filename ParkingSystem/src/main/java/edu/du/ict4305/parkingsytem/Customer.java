/**
 * @Course: ICT 4305
 * @File: Customer.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsytem;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The type Customer.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public class Customer {
      private String customerId;
      private String name;
      private Address address;
      private String phoneNumber;

      /**
       * Instantiates a new Customer.
       */
      public Customer(String name, String customerId, Address address, String phoneNumber) {
            this.name = name;
            this.customerId = customerId;
            this.address = address;
            this.phoneNumber = phoneNumber;
      }

      /**
       * Gets customer id.
       *
       * @return customer id
       */
      public String getCustomerId() {
            return customerId;
      }

      /**
       * Sets customer id.
       *
       * @param customerId the customer id
       */
      public void setCustomerId(String customerId) {
            this.customerId = customerId;
      }

      /**
       * Gets name.
       *
       * @return name
       */
      public String getName() {
            return name;
      }

      /**
       * Sets name.
       *
       * @param name the name
       */
      public void setName(String name) {
            this.name = name;
      }

      /**
       * Gets address.
       *
       * @return address
       */
      public Address getAddress() {
            return address;
      }

      /**
       * Sets address.
       *
       * @param address the address
       */
      public void setAddress(Address address) {
            this.address = address;
      }

      /**
       * Gets phone number.
       *
       * @return phone number
       */
      public String getPhoneNumber() {
            return phoneNumber;
      }

      /**
       * Sets phone number.
       *
       * @param phoneNumber the phone number
       */
      public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      /**
       * Register car.
       *
       * @param license the license
       * @param Car     the car
       * @return car
       */
      public Car register(String license, CarType type) {
            Car car = new Car("invalid", LocalDate.now(), license, type);
            return car;
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return Objects.equals(customerId, customer.customerId) && Objects.equals(name, customer.name) && Objects.equals(address, customer.address) && Objects.equals(phoneNumber, customer.phoneNumber);
      }

      @Override
      public int hashCode() {
            return Objects.hash(customerId, name, address, phoneNumber);
      }

      @Override
      public String toString() {
            return "Customer:" +
                    "customerId='" + customerId + '\'' +
                    ",\nname='" + name + '\'' +
                    ",\naddress=" + address +
                    ",\nphoneNumber='" + phoneNumber + '\'';
      }
}
