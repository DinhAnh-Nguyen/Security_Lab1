package ca.sait.crs.exceptions;

/**
 * Thrown when course can't be created.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class CannotCreateCourseException extends Exception {
    public CannotCreateCourseException(String message) {
        super(message);
    }
}
