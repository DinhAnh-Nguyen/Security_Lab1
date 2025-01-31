package ca.sait.crs.exceptions;

/**
 * Thrown when registration can't be created.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class CannotCreateRegistrationException extends Exception {
    public CannotCreateRegistrationException(String message) {
        super(message);
    }
}
