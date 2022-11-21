/**
 * @Course: ICT 4305
 * @Project: ParkingSystem
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @Date: 11/16/22
 * @author lutherchikumba
 *
 */
public class TransactionManager {

    private ArrayList<ParkingTransaction> transactions;

    private HashMap<String, ArrayList<ParkingTransaction>> vehicleTransaction;

    public TransactionManager(ArrayList<ParkingTransaction> transactions, HashMap<String, ArrayList<ParkingTransaction>> vehicleTransaction) {
        this.transactions = transactions;
        this.vehicleTransaction = vehicleTransaction;
    }

    @Override
    public String toString() {
        return "TransactionManager{" +
                "transactions=" + transactions +
                ", vehicleTransaction=" + vehicleTransaction +
                '}';
    }

    /**
     * This method will create a parking transaction and will add it to the transactions list.
     */
    public ParkingTransaction park(Calendar date, ParkingPermit permit, ParkingLot lot) {
        ParkingTransaction parkingTransaction = new ParkingTransaction(date,permit,lot,new Money(7));
        transactions.add(parkingTransaction);
        return  parkingTransaction;
    }

    public Money getParkingCharges(ParkingPermit permit) {
        ParkingCharge parkingCharge = null;
        if(permit.getId() != null || !permit.getId().isEmpty()){
            return parkingCharge.getAmount();
        }else {
             throw new IllegalArgumentException("The permit is invalid");
        }
    }

    public Money getParkingCharges(String licensePlate) {
        Vehicle vehicle = null;
        ParkingCharge parkingCharge = null;
        if(vehicle.getLicense().equals(licensePlate)){
            return parkingCharge.getAmount();
        }else {
            throw new IllegalArgumentException("The licensePlate is invalid");
        }
    }
}
