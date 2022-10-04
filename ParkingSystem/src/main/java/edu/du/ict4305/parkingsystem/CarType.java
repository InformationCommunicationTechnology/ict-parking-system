/**
 *
 * @Course: ICT 4305
 * @File: CarType.java
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
public enum CarType {;

    private String COMPACT;
    private String SUV;

    private CarType(String compact, String suv){
        this.COMPACT = compact;
        this.SUV = suv;
    }
    
}
