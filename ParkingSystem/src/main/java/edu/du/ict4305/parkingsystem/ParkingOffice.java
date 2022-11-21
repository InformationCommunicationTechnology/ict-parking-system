/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.util.*;

/**
 * The type Parking office.
 *
 * @author lutherchikumba
 * @Date: 10 /11/22
 */
public class ParkingOffice {

      /**
       * The parkingOfficeName.
       */
      String parkingOfficeName;
      /**
       * The Address.
       */
      Address address;
      /**
       * The Customers.
       */
      List<Customer> customers;

      /**
       * The Lots.
       */
      List<ParkingLot> lots;

      public ParkingOffice(String parkingOfficeName, Address address, List<Customer> customers, List<ParkingLot> lots) {
            this.parkingOfficeName = parkingOfficeName;
            this.address = address;
            this.customers = customers;
            this.lots = lots;
      }

      public String getParkingOfficeName() {
            return parkingOfficeName;
      }
      public void register(Customer customer){

      }
      public ParkingPermit register(Vehicle car){
            Calendar expirationDate = Calendar.getInstance();
            Calendar registrationDate = Calendar.getInstance();
            expirationDate.set(2023, 11, 15, 04, 15, 20);
            registrationDate.set(2022, 11, 16, 04, 15, 20);
            expirationDate.setTime(expirationDate.getTime());
            registrationDate.setTime(registrationDate.getTime());

            return new ParkingPermit("valid",car,expirationDate,registrationDate);
      }
      public ParkingTransaction park(Date date, ParkingPermit parkingPermit, ParkingLot parkingLot){
            Calendar calenderDate = Calendar.getInstance();
            calenderDate.setTime(date);
            return new ParkingTransaction(calenderDate,parkingPermit,parkingLot,new Money(7));
      }

      public Money getParkingCharges(ParkingPermit parkingPermit){
            return new Money(9);

      }
      public Money getParkingCharges(Customer customer){
            return new Money(7);
      }


}
