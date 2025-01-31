package ca.sait.crs.contracts;

/**
 * Student contract
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public interface Student {
    /**
     * Gets student's name
     * @return Student name
     */
    public String getName();

    /**
     * Gets student GPA
     * @return Students GPA
     */
    public double getGpa();
}
