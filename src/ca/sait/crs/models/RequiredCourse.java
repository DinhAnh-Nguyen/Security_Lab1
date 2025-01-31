package ca.sait.crs.models;

import ca.sait.crs.contracts.Course;

// TODO: Make this class immutable.

/**
 * Represents a required (for credit) course.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class RequiredCourse implements Course {
    /**
     * Course code
     */
    private String code;

    /**
     * Course name
     */
    private String name;

    /**
     * Course credits
     */
    private int credits;

    /**
     * Initializes instance
     * @param code Course code
     * @param name Course name
     * @param credits Course credits (cannot be zero or negative)
     */
    public RequiredCourse(String code, String name, int credits) {
        this.setCode(code);
        this.setName(name);
        this.setCredits(credits);
    }

    /**
     * Gets course code
     * @return Course code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets course name
     * @return Course name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets course credits
     * @return Credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the course code
     * @param code Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Sets the course name
     * @param name Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the course credits
     * @param credits Credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.getName(), this.getCode());
    }
}
