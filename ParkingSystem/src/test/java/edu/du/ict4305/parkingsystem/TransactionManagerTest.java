package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 11/19/22
 * @author lutherchikumba
 *
 */
public class TransactionManagerTest {
      TransactionManager transactionManager;
      ArrayList<ParkingTransaction> transactions;
      HashMap<String, ArrayList<ParkingTransaction>> vehicleTransaction;
      Calendar transactionDate;
      Calendar date;
      Calendar registrationDate;
      Calendar expirationDate;
      public TransactionManagerTest() {
            transactions = new ArrayList<>();
            vehicleTransaction = new HashMap<>();
            transactionManager = new TransactionManager(transactions,vehicleTransaction);
            date = Calendar.getInstance();
      }

      @Test
      public void park() {
            date.set(2022, 12, 15, 04, 15, 20);
            date.setTime(date.getTime());
            expirationDate = Calendar.getInstance();
            expirationDate.set(2022, 11, 16, 04, 15, 20);
            Vehicle vehicle = new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            ParkingPermit parkingPermit = new ParkingPermit("valid",vehicle,expirationDate,registrationDate);
            ParkingLot parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);
            assertEquals(transactionManager.park(date, parkingPermit, parkingLot),transactionManager.park(date, parkingPermit, parkingLot));
      }

      @Test
      public void getParkingCharges() {
            ParkingCharge parkingCharge = new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17);

            assertEquals(parkingCharge.getAmount(),transactionManager.getParkingCharges("OOY350"));
      }

      @Test
      public void testGetParkingCharges() {
      }
}