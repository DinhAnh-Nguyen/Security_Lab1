package ca.sait.crs.services;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.exceptions.CannotCreateCourseException;
import ca.sait.crs.factories.CourseFactory;
import ca.sait.crs.models.OptionalCourse;
import ca.sait.crs.models.RequiredCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// TODO: Make this class immutable.

/**
 * Manages courses
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public final class CourseService {
    /**
     * Path to courses.csv file.
     */
    public static final String COURSES_CSV = "res/courses.csv";

    /**
     * Holds Course instances.
     */
    private final ArrayList<Course> courses;

    /**
     * Initializes CourseService instance
     * @throws FileNotFoundException Thrown if COURSES_CSV file can't be found.
     */
    public CourseService() throws FileNotFoundException {
        // Use a temporary list during initialization.
        ArrayList<Course> tempCourses = new ArrayList<>();
        this.load(tempCourses);
        // Assign the fully loaded list to the final field.
        this.courses = tempCourses;
    }

    /**
     * Finds course with code
     * @param code Course code
     * @return Course instance or null if not found.
     */
    public Course find(String code) {
        for (Course course : this.courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }

        return null;
    }

    /**
     * Gets copy of courses array list.
     * @return Array list of courses.
     */
    public ArrayList<Course> getCourses() {
        // Return a defensive copy so the internal list remains unmodifiable.
        return new ArrayList<>(this.courses);
    }

    /**
     * Loads courses from CSV file.
     * @throws FileNotFoundException Thrown if file can't be found.
     */
    private void load(ArrayList<Course> courses) throws FileNotFoundException {
        File file = new File(COURSES_CSV);
        Scanner scanner = new Scanner(file);

        // TODO: Create instance of CourseFactory
        CourseFactory courseFactory = new CourseFactory();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split(",");

            if (parts.length != 3) {
                continue;
            }

            String code = parts[0];
            String name = parts[1];
            int credits = Integer.parseInt(parts[2]);

            // TODO: Call build() method in CourseFactory instance to handle validating parameters and creating new Course object.
            try {
                Course course = courseFactory.build(code, name, credits);
                courses.add(course);
            } catch (CannotCreateCourseException e) {
                System.err.println("Failed to create course for code " + code + ": " + e.getMessage());
            }
             // TODO: Catch and handle CannotCreateCourseException
            
            
        }

        scanner.close();
    }
}
