package abstraction;

import org.apache.log4j.Logger;

public class MasterStudent extends Student {
    private static final Logger LOGGER = Logger.getLogger(MasterStudent.class);

    public MasterStudent(final int studentId, final String studentName, final String phoneNumber) {
        super(studentId, studentName, phoneNumber);
    }

    @Override
    public void applyForUniversity(University university) {
        university.registerStudent(this);
        LOGGER.info("registered to masterstudent");

    }
}
