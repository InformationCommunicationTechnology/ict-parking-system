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
public class ParkingTransaction {


    private Calendar transactionDate;
    private ParkingPermit permit;
    private ParkingLot lot;
    private Money feeCharged;

    public ParkingTransaction(Calendar transactionDate, ParkingPermit permit, ParkingLot lot, Money feeCharged) {
        this.transactionDate = transactionDate;
        this.permit = permit;
        this.lot = lot;
        this.feeCharged = feeCharged;
    }

    public Calendar getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public void setPermit(ParkingPermit permit) {
        this.permit = permit;
    }

    public ParkingLot getLot() {
        return lot;
    }

    public void setLot(ParkingLot lot) {
        this.lot = lot;
    }

    public Money getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(Money feeCharged) {
        this.feeCharged = feeCharged;
    }

    @Override
    public String toString() {
        return "ParkingTransaction{" +
                "transactionDate=" + transactionDate +
                ", permit=" + permit +
                ", lot=" + lot +
                ", feeCharged=" + feeCharged +
                '}';
    }
}
