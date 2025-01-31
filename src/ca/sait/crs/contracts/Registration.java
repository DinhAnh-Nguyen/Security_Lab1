package ca.sait.crs.contracts;

public interface Registration {
    /**
     * Gets the Course instance
     * @return Course the student is registered to.
     */
    Course getCourse();

    /**
     * Gets the Student instance
     * @return Student registered to course.
     */
    Student getStudent();
}
