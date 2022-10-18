/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

      /**
       * Instantiates a new Parking office.
       */
      public ParkingOffice() {

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
            }else {
                  String customerId = "303422425";
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
            }else{
                  String permit = "valid";
                  car = new Car(permit, LocalDate.now(), license, t);
                  cars.add(car);
                  return car;
            }

      }
      public void isCarRegistered(){
            for (Car car1: cars) {
                  System.out.println("Check these cars " + car1);
            }
      }

      /**
       * Add charge money.
       *
       * @return the money
       */
      public Money addCharge(ParkingCharge parkingCharge) {

            return parkingCharge.getAmount();
      }

      /**
       * Gets name.
       *
       * @return the name
       */
      public String getName() {
            return name;
      }

      /**
       * Sets name.
       *
       * @param name the name
       */
      public void setName(String name) {
            this.name = name;
      }

      /**
       * Gets address.
       *
       * @return the address
       */
      public String getAddress() {
            return address;
      }

      /**
       * Sets address.
       *
       * @param address the address
       */
      public void setAddress(String address) {
            this.address = address;
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
       * Sets customers.
       *
       * @param customers the customers
       */
      public void setCustomers(List<Customer> customers) {
            this.customers = customers;
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
       * Sets cars.
       *
       * @param cars the cars
       */
      public void setCars(List<Car> cars) {
            this.cars = cars;
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
       * Sets lots.
       *
       * @param lots the lots
       */
      public void setLots(List<ParkingLot> lots) {
            this.lots = lots;
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
       * Sets charges.
       *
       * @param charges the charges
       */
      public void setCharges(List<ParkingCharge> charges) {
            this.charges = charges;
      }
}
