package ca.sait.crs.contracts;

/**
 * Course contract
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public interface Course {
    /**
     * Gets the course code
     * @return Course code
     */
    String getCode();

    /**
     * Gets name of course
     * @return Name of course
     */
    String getName();
}
