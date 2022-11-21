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
public class ParkingTransactionTest {
      ParkingTransaction parkingTransaction;
      Calendar transactionDate;
      Calendar expirationDate;
      Calendar registrationDate;
      Vehicle vehicle;
      Money money;
      ParkingLot parkingLot;
      ParkingPermit parkingPermit;
      public ParkingTransactionTest() {
            expirationDate = Calendar.getInstance();
            registrationDate = Calendar.getInstance();
            expirationDate.set(2023, 11, 15, 04, 15, 20);
            registrationDate.set(2022, 11, 16, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            registrationDate.setTime(registrationDate.getTime());
            transactionDate = Calendar.getInstance();
            transactionDate.set(2023, 11, 15, 04, 15, 20);
            transactionDate.setTime(transactionDate.getTime());
            money = new Money(7);
            parkingLot = new ParkingLot("4", "4581 S Valdai Way. Aurora CO 80015", 76);
            vehicle = new Vehicle("valid", LocalDate.now(), "OOY350", CarType.COMPACT);
            parkingPermit = new ParkingPermit("valid",vehicle,expirationDate,registrationDate);
            parkingTransaction = new ParkingTransaction(transactionDate,parkingPermit,parkingLot,money);
      }

      @Test
      public void getTransactionDate() {
            assertEquals(transactionDate,parkingTransaction.getTransactionDate());
      }

      @Test
      public void setTransactionDate() {
            transactionDate.set(2023, 12, 15, 04, 15, 20);
            transactionDate.setTime(transactionDate.getTime());
            parkingTransaction.setTransactionDate(transactionDate);
            assertEquals(transactionDate.getTime(),parkingTransaction.getTransactionDate().getTime());
      }

      @Test
      public void getPermit() {
            assertEquals(parkingPermit,parkingTransaction.getPermit());
      }

      @Test
      public void setPermit() {
            parkingTransaction.setPermit(parkingPermit);
            assertEquals(parkingPermit, parkingTransaction.getPermit());
      }

      @Test
      public void getLot() {
            assertEquals(parkingLot,parkingTransaction.getLot());
      }

      @Test
      public void setLot() {
            parkingTransaction.setLot(parkingLot);
            assertEquals(parkingLot,parkingTransaction.getLot());
      }

      @Test
      public void getFeeCharged() {
            assertEquals(money,parkingTransaction.getFeeCharged());
      }

      @Test
      public void setFeeCharged() {
            parkingTransaction.setFeeCharged(money);
            assertEquals(money,parkingTransaction.getFeeCharged());
      }
}