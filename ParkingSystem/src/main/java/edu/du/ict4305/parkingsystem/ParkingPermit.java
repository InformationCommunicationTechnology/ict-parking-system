/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.util.Calendar;

/**
 *
 * @Date: 11/16/22
 * @author lutherchikumba
 *
 */
public class ParkingPermit {
    private String id;
    private Vehicle vehicle;
    private Calendar expirationDate;
    private Calendar registrationDate;

    public ParkingPermit(String id, Vehicle vehicle, Calendar expirationDate, Calendar registrationDate) {
        this.id = id;
        this.vehicle = vehicle;
        this.expirationDate = expirationDate;
        this.registrationDate = registrationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "ParkingPermit{" +
                "id='" + id + '\'' +
                ", vehicle=" + vehicle +
                ", expirationDate=" + expirationDate +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
