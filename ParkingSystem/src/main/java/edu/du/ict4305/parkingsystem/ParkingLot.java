/**
 *
 * @Course: ICT 4305
 * @File: ParkingLot.java
 * @Instructor: Dr. Sherri Maciosek
 *
 */
package edu.du.ict4305.parkingsystem;

/**
 * 
 * @Date: 9/29/2022
 * @author lutherchikumba
 *
 */
public class ParkingLot {
    private String lodId;
    private String address;
    private int capacity;

    /**
     *
     */
    public ParkingLot(){

    }

    /**
     * @return
     */
    public String getLodId() {
        return lodId;
    }

    /**
     * @param lodId
     */
    public void setLodId(String lodId) {
        this.lodId = lodId;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @param car
     */
    public void entry(Car car){

    }

    /**
     * @return
     */
    public String toString(){
        return "";
    }
}
