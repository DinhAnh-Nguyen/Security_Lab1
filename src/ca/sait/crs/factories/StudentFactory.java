package ca.sait.crs.factories;

import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateStudentException;

/**
 * Creates student instances.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class StudentFactory {
    public StudentFactory() {

    }

    /**
     * Builds a Student instance
     * @param name Name of student
     * @param gpa Student's GPA
     * @return Student instance
     */
    public Student build(String name, double gpa) throws CannotCreateStudentException {
        if (!this.validateName(name))
            throw new CannotCreateStudentException("Student name is invalid.");

        if (!this.validateGpa(gpa))
            throw new CannotCreateStudentException("Student GPA is invalid.");

        return null;
    }

    /**
     * Validates student name
     * @param name
     * @return True if name is valid
     */
    private boolean validateName(String name) {
        // TODO: Add logic to test name is valid.
        return true;
    }

    /**
     * Validates student GPA
     * @param gpa
     * @return True if GPA is valid
     */
    private boolean validateGpa(double gpa) {
        // TODO: Add logic to test GPA is valid (hint: GPAs cannot be negative or more than 4.0).
        return true;
    }
}
