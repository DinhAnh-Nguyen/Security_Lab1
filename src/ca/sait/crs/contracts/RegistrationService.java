package ca.sait.crs.contracts;


import ca.sait.crs.exceptions.CannotCreateRegistrationException;
import ca.sait.crs.contracts.Registration;

import java.util.ArrayList;

/**
 * Registration service
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public interface RegistrationService {
    /**
     * Registers student with course
     * @param student Student
     * @param course Course
     * @return Registration model or null.
     */
    Registration register(Student student, Course course) throws CannotCreateRegistrationException;

    /**
     * Gets registrations.
     * @return All registrations
     */
    ArrayList<Registration> getRegistrations();
}
