/**
 * @Course: ICT 4305
 * @File: Address.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

/**
 *
 * @Date: 9/29/2022
 * @author lutherchikumba
 *
 */
public class Address {
    private String streetAddress1;
    private String getStreetAddress2;
    private String city;
    private String state;
    private String zipCode;

    /**
     *
     */
    public Address() {

    }

    /**
     * @return
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * @param streetAddress1
     */
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    /**
     * @return
     */
    public String getGetStreetAddress2() {
        return getStreetAddress2;
    }

    /**
     * @param getStreetAddress2
     */
    public void setGetStreetAddress2(String getStreetAddress2) {
        this.getStreetAddress2 = getStreetAddress2;
    }

    /**
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return
     */
    public String getAddressInfo() {
        return "";
    }
}
