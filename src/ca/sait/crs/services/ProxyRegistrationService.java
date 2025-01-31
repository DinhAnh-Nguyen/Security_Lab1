package ca.sait.crs.services;
import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.RegistrationService;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;
import java.util.ArrayList;

// TODO: Define the ProxyRegistrationService
// Proxy class should verify the student’s GPA eligibility before allowing them to register for the course
// TODO: Implement the RegistrationService interface
// TODO: Check student can be registered before passing to RealRegistrationService
// TODO: Make this class immutable.


public class ProxyRegistrationService implements RegistrationService {
    private final double requiredGPA;

    public ProxyRegistrationService(double requiredGPA) {
        this.requiredGPA = requiredGPA;
    }

    @Override
    public ca.sait.crs.contracts.Registration register(Student student, Course course) throws CannotCreateRegistrationException {
        if (student.getGpa() < requiredGPA) {
            throw new CannotCreateRegistrationException("Student GPA does not meet the requirements.");
        }
        RealRegistrationService realRegistrationService = new RealRegistrationService();
        return realRegistrationService.register(student, course);
    }

    @Override
    public ArrayList<ca.sait.crs.contracts.Registration> getRegistrations() {
        RealRegistrationService realRegistrationService = new RealRegistrationService();
        return realRegistrationService.getRegistrations();
    }
}