/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.*;

/**
 * The type Parking office.
 *
 * @author lutherchikumba
 * @Date: 10 /11/22
 */
public class ParkingOffice {

      /**
       * The Name.
       */
      String name;
      /**
       * The Address.
       */
      String address;
      /**
       * The Customers.
       */
      List<Customer> customers;
      /**
       * The Cars.
       */
      List<Car> cars;
      /**
       * The Lots.
       */
      List<ParkingLot> lots;
      /**
       * The Charges.
       */
      List<ParkingCharge> charges;
      Car car;
      ParkingLot parkingLot;

      /**
       * Instantiates a new Parking office.
       */
      public ParkingOffice(String name, String address, List<Customer> customers, List<Car> cars, List<ParkingLot> lots, List<ParkingCharge> charges, Car car, ParkingLot parkingLot) {
            this.name = name;
            this.address = address;
            this.customers = customers;
            this.cars = cars;
            this.lots = lots;
            this.charges = charges;
            this.car = car;
            this.parkingLot = parkingLot;

      }

      /**
       * Register customer.
       *
       * @param name    the name
       * @param address the address
       * @param phone   the phone
       * @return the customer
       */
      public Customer register(String name, Address address, String phone) { // You changed this line of code to start using Address instead of String
            if (name.isEmpty() || address == null || phone.isEmpty()) {
                  throw new IllegalArgumentException("Either name or address or phone is empty!!");
            } else {
                  String customerId = "303422425";
                  customers.add(new Customer(name, customerId, address, phone));
                  return new Customer(name, customerId, address, phone);
            }
      }

      /**
       * Register car.
       *
       * @param c       the c
       * @param license the license
       * @param t       the t
       * @return the car
       */
      public Car register(Customer c, String license, CarType t) {
            if (c == null || license.isEmpty() || t == null) {
                  throw new IllegalArgumentException("Customer is not registered!");
            } else {
                  if (isCarRegistered()) {
                        throw new IllegalArgumentException("The car is already registered registered!");
                  } else {
                        String permit = "valid";
                        car = new Car(permit, LocalDate.now(), license, t);
                        cars.add(car);
                        return car;
                  }

            }

      }

      public boolean isCarRegistered() {
            return cars.contains(car);
      }

      public List<ParkingLot> addCarToParkingLot() {

            if (Objects.equals(car.getPermit(), "valid") && !(parkingLot.isCapacityFull())) {
                  lots.add(parkingLot);
                  return lots;
            } else {
                  throw new IllegalArgumentException("The either the parking lot is full or you have invalid permit");
            }
      }

      /**
       * Add charge money.
       *
       * @return the money
       */
      public Money addCharge(ParkingCharge parkingCharge) {
            if (!lots.contains(parkingLot) && !(addCarToParkingLot() == null)) {
                  System.out.println("The size is " + lots.size());
                  return parkingCharge.getAmount();
            } else {
                  charges.add(parkingCharge);
                  return parkingCharge.getAmount();
            }

      }


      /**
       * Gets customers.
       *
       * @return the customers
       */
      public List<Customer> getCustomers() {
            return customers;
      }


      /**
       * Gets cars.
       *
       * @return the cars
       */
      public List<Car> getCars() {
            return cars;
      }

      /**
       * Gets lots.
       *
       * @return the lots
       */
      public List<ParkingLot> getLots() {
            return lots;
      }


      /**
       * Gets charges.
       *
       * @return the charges
       */
      public List<ParkingCharge> getCharges() {
            return charges;
      }

      /**
       * @return customerIds
       */
      public Collection<String> getCustomerIds() {
            Collection<String> customerIds = new ArrayList<>();
            for (Customer customer : customers) {
                  customerIds.add(customer.getCustomerId());
            }
            return customerIds;
      }

      /**
       * @return permitIds
       */
      public Collection<String> getPermitIds() {
            Collection<String> permitIds = new ArrayList<>();
            for (ParkingCharge parkingCharge : charges) {
                  permitIds.add(parkingCharge.getPermitId());
            }
            return permitIds;
      }

      /**
       * @param customer
       * @return permitIds
       */
      public Collection<String> getPermitIds(Customer customer) {
            Collection<String> permitIds = new ArrayList<>();
            if (customers.contains(customer)) {
                  permitIds.add(customer.getCustomerId());
            }
            return permitIds;
      }

      @Override
      public String toString() {
            return "ParkingOffice:" +
                    "name='" + name + '\'' +
                    ",\naddress='" + address + '\'' +
                    ",\ncustomers=" + customers +
                    ",\ncars=" + cars +
                    ",\nlots=" + lots +
                    ",\ncharges=" + charges +
                    ",\ncar=" + car +
                    ",\nparkingLot=" + parkingLot;
      }

}
