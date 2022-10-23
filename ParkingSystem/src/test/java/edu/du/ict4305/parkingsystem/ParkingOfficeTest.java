package edu.du.ict4305.parkingsystem; /**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 10/22/22
 * @author lutherchikumba
 *
 */
public class ParkingOfficeTest {
      ParkingOffice parkingOffice;
      public ParkingOfficeTest() {
      parkingOffice = new ParkingOffice();
      }

      @Test
      public void register() {
      }

      @Test
      public void testRegister() {
      }

      @Test
      public void isCarRegistered() {
      }

      @Test
      public void addCharge() {
      }

      @Test
      public void getName() {
            List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Tafadzwa", "customerId", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########"));
            assertEquals("luther", parkingOffice.getName());
      }

      @Test
      public void setName() {
      }

      @Test
      public void getAddress() {
            assertEquals("4581 S Valdai Way. Aurora CO 80015", parkingOffice.getAddress());
      }

      @Test
      public void setAddress() {
      }

      @Test
      public void getCustomers() {
            List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Tafadzwa", "customerId", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########"));
            customers.add(new Customer("Taurai", "303422425", new Address("4581 S Valdai Way.", "Aurora", "CO", "80015"), "##########"));

            assertEquals("Tafadzwa",customers.get(0).getName());
            assertEquals("customerId",customers.get(0).getCustomerId());
            assertEquals("4581 S Valdai Way.\nAurora, CO 80015",customers.get(1).getAddress().getAddressInfo());
            assertEquals("##########",customers.get(0).getPhoneNumber());
            assertEquals("Taurai",customers.get(1).getName());
            assertEquals("303422425",customers.get(1).getCustomerId());
            assertEquals("4581 S Valdai Way.\nAurora, CO 80015",customers.get(1).getAddress().getAddressInfo());
            assertEquals("##########",customers.get(1).getPhoneNumber());

            assertEquals(2, customers.size());

      }

      @Test
      public void setCustomers() {
      }

      @Test
      public void getCars() {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car("valid", LocalDate.now(), "YYY350", CarType.COMPACT));
            cars.add(new Car("invalid", LocalDate.now(), "YOY350", CarType.SUV));
            assertEquals("valid",cars.get(0).getPermit());
            assertEquals( LocalDate.now(),cars.get(0).getPermitExpiration());
            assertEquals("YYY350",cars.get(0).getLicense());
            assertEquals(CarType.COMPACT,cars.get(0).getType());
            assertEquals("invalid",cars.get(1).getPermit());
            assertEquals( LocalDate.now(),cars.get(1).getPermitExpiration());
            assertEquals("YOY350",cars.get(1).getLicense());
            assertEquals(CarType.SUV,cars.get(1).getType());

            assertEquals(2, cars.size());

      }

      @Test
      public void setCars() {
      }

      @Test
      public void getLots() {
            List<ParkingLot> lots = new ArrayList<>();
            lots.add(new ParkingLot("4728", "4581 S Valdai Way. Aurora CO 80015", 6));
            lots.add(new ParkingLot("2847", "4581 S Valdai Way. Aurora CO 80015", 6));

            assertEquals("4728", lots.get(0).getLotId());
            assertEquals("4581 S Valdai Way. Aurora CO 80015", lots.get(0).getAddress());
            assertEquals(6, lots.get(0).getCapacity());
            assertEquals("2847", lots.get(1).getLotId());
            assertEquals("4581 S Valdai Way. Aurora CO 80015", lots.get(1).getAddress());
            assertEquals(6, lots.get(1).getCapacity());

            assertEquals(2, lots.size());
      }

      @Test
      public void setLots() {
      }

      @Test
      public void getCharges() {
            List<ParkingCharge> charges = new ArrayList<>();
            charges.add(new ParkingCharge("4728", Instant.now(), new Money(200), "valid", 17));
            charges.add(new ParkingCharge("2847", Instant.now(), new Money(78), "invalid", 17));

            assertEquals("4728", charges.get(0).getLotId());
//            assertEquals(Instant.now(), charges.get(0).getIncurred());
            assertEquals(2, charges.get(0).getAmount().getDollars());
            assertEquals("valid", charges.get(0).getPermitId());
            assertEquals(17, charges.get(0).getNumberOfDaysIncurred());
            assertEquals("2847", charges.get(1).getLotId());
//            assertEquals(Instant.now(), charges.get(0).getIncurred());
            assertEquals(.78, charges.get(1).getAmount().getDollars());
            assertEquals("invalid", charges.get(1).getPermitId());
            assertEquals(17, charges.get(1).getNumberOfDaysIncurred());

            assertEquals(2, charges.size());
      }

      @Test
      public void setCharges() {
      }
}