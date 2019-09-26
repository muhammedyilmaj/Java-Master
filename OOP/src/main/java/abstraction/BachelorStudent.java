package abstraction;

import org.apache.log4j.Logger;

public class BachelorStudent extends Student {
    private static final Logger LOGGER = Logger.getLogger(BachelorStudent.class);


    public BachelorStudent(final int studentId, final String studentName, final String phoneNumber) {
        super(studentId, studentName, phoneNumber);
    }

    @Override
    public void applyForUniversity(University university) {
        university.registerStudent(this);
        LOGGER.info("registerd to bachelor student");

    }
}
