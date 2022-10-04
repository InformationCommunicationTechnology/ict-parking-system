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

    public  Car(){

    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public LocalDate getPermitExpiration() {
        return permitExpiration;
    }

    public void setPermitExpiration(LocalDate permitExpiration) {
        this.permitExpiration = permitExpiration;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String owner(Customer id){
        return "";
    }
    public String toString(){
        return "";
    }
}
