/**
 *
 * @Course: ICT 4305
 * @File: Car.java
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;

/**
 * 
 * @Date: 9/29/2022
 * @author lutherchikumba
 *
 */
public class Car {
    private String permit;
    private LocalDate permitExpiration;
    private String license;
    private CarType type;

    /**
     * 
     */
    public  Car(){

    }

    /**
     * @return
     */
    public String getPermit() {
        return permit;
    }

    /**
     * @param permit
     */
    public void setPermit(String permit) {
        this.permit = permit;
    }

    /**
     * @return
     */
    public LocalDate getPermitExpiration() {
        return permitExpiration;
    }

    /**
     * @param permitExpiration
     */
    public void setPermitExpiration(LocalDate permitExpiration) {
        this.permitExpiration = permitExpiration;
    }

    /**
     * @return
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return
     */
    public CarType getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(CarType type) {
        this.type = type;
    }

    /**
     * @param id
     * @return
     */
    public String owner(Customer id){
        return "";
    }

    /**
     * @return
     */
    public String toString(){
        return "";
    }
}
