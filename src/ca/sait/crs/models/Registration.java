package ca.sait.crs.models;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;

// TODO: Make this class immutable.

/**
 * Represents a registration.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class Registration implements ca.sait.crs.contracts.Registration {
    /**
     * Associated course
     */
    private Course course;
    /**
     * Associated student
     */
    private Student student;

    /**
     * Initializes instance.
     * @param course Course instance
     * @param student Student instance
     */
    public Registration(Course course, Student student) {
        this.setCourse(course);
        this.setStudent(student);
    }

    /**
     * Gets the course.
     * @return Course
     */
    @Override
    public Course getCourse() {
        return course;
    }

    /**
     * Gets the student
     * @return Student
     */
    @Override
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the course
     * @param course Course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * Sets the student
     * @param student Student
     */
    public void setStudent(Student student) {
        this.student = student;
    }
}
