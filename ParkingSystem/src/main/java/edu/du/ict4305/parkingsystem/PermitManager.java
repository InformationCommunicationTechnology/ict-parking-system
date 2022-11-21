/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @Date: 11/16/22
 * @author lutherchikumba
 *
 */
public class PermitManager {

    private HashMap<String, ParkingPermit> permits = null;

    public PermitManager(HashMap<String, ParkingPermit> permits) {
        this.permits = permits;
    }

    /**
     * This method will create an object of ParkingPermit class and will add it
     * to the permits collection.
     * Note: Assume that the expiration date will be one year from the current date.
     */
    public ParkingPermit register(Vehicle vehicle) {
        Calendar expirationDate = Calendar.getInstance();
        Calendar registrationDate = Calendar.getInstance();
        expirationDate.set(2023, 11, 15, 04, 15, 20);
        registrationDate.set(2022, 11, 16, 04, 15, 20);
        expirationDate.setTime(expirationDate.getTime());
        registrationDate.setTime(registrationDate.getTime());

        ParkingPermit parkingPermit = new ParkingPermit("valid",vehicle,expirationDate,registrationDate);
        permits.put("valid",parkingPermit);
        return parkingPermit;
    }

    @Override
    public String toString() {
        return "PermitManager{" +
                "permits=" + permits +
                '}';
    }
}
