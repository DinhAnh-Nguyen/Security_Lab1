package ca.sait.crs;

import java.io.FileNotFoundException;

public class AppDriver {
    /**
     * Entry point to program.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        CourseRegistrationSystem crs = new CourseRegistrationSystem();

        crs.start();
    }
}