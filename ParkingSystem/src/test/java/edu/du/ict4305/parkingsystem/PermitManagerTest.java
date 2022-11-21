package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 11/19/22
 * @author lutherchikumba
 *
 */
public class PermitManagerTest {
      PermitManager permitManager;
      HashMap<String, ParkingPermit> permits;

      public PermitManagerTest() {
            permits = new HashMap<>();
            permitManager = new PermitManager(permits);
      }

      @Test
      public void register() {
            Money money = new Money(7);
            ParkingLot parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);
            Vehicle vehicle = new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            Calendar expirationDate = Calendar.getInstance();
            Calendar registrationDate = Calendar.getInstance();
            expirationDate.set(2023, 11, 15, 04, 15, 20);
            registrationDate.set(2022, 11, 16, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            registrationDate.setTime(registrationDate.getTime());
            ParkingPermit parkingPermit = new ParkingPermit("valid",vehicle,expirationDate,registrationDate);
            permits.put("valid",parkingPermit);
            assertEquals(permits.get("valid").getId(),permitManager.register(new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT)).getId());
      }
}