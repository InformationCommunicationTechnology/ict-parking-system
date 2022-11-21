package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 11/19/22
 * @author lutherchikumba
 *
 */
public class ParkingPermitTest {
      ParkingPermit parkingPermit;
      Vehicle vehicle;
      Calendar expirationDate;
      Calendar registrationDate;
      public ParkingPermitTest() {
            expirationDate = Calendar.getInstance();
            registrationDate = Calendar.getInstance();
            expirationDate.set(2023, 11, 15, 04, 15, 20);
            registrationDate.set(2022, 11, 16, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            registrationDate.setTime(registrationDate.getTime());
            vehicle = new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            parkingPermit = new ParkingPermit("id",vehicle,expirationDate,registrationDate);
      }

      @Test
      public void getId() {
            assertEquals("id",parkingPermit.getId());
      }

      @Test
      public void setId() {
            parkingPermit.setId("id");
            assertEquals("id",parkingPermit.getId());
      }

      @Test
      public void getVehicle() {
            assertEquals(vehicle,parkingPermit.getVehicle());
      }

      @Test
      public void setVehicle() {
            parkingPermit.setVehicle(new Vehicle("invalid", LocalDate.now(), "OOY350", CarType.COMPACT));
            assertEquals(vehicle,parkingPermit.getVehicle());
      }

      @Test
      public void getExpirationDate() {
            assertEquals(expirationDate.getTime(),parkingPermit.getExpirationDate().getTime());
      }

      @Test
      public void setExpirationDate() {
            expirationDate.set(2023, 12, 15, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            parkingPermit.setExpirationDate(expirationDate);
            assertEquals(expirationDate,parkingPermit.getExpirationDate());
      }

      @Test
      public void getRegistrationDate() {
            assertEquals(registrationDate.getTime(),parkingPermit.getRegistrationDate().getTime());
      }

      @Test
      public void setRegistrationDate() {
            registrationDate.set(2022, 12, 15, 04, 15, 20);
            registrationDate.setTime(registrationDate.getTime());
            parkingPermit.setRegistrationDate(registrationDate);
            assertEquals(registrationDate,parkingPermit.getRegistrationDate());
      }

}