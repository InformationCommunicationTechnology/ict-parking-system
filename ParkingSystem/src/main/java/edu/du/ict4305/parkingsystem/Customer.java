/**
 * @Course: ICT 4305
 * @File: Customer.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

/**
 *
 * @Date: 9/29/2022
 * @author lutherchikumba
 *
 */
public class Customer {
    private String customerId;
    private String name;
    private Address address;
    private String phoneNumber;

    /**
     *
     */
    public Customer() {

    }

    /**
     * @return
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @param license
     * @param Car
     * @return
     */
    public Car register(String license, CarType Car) {
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        return "";
    }
}
