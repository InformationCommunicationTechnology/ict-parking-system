/**
 * @Course: ICT 4305
 * @File: CarType.java
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.parkingsystem;

/**
 * The enum Car type.
 *
 * @author lutherchikumba
 * @Date: 9 /29/2022
 */
public enum CarType {
      ;

      private String COMPACT;
      private String SUV;

      private CarType(String compact, String suv) {
            this.COMPACT = compact;
            this.SUV = suv;
      }

}
