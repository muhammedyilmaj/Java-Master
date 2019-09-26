package polymorphism;

import org.apache.log4j.Logger;

public class MasterStudent extends Student{
    private static final Logger LOGGER = Logger.getLogger(MasterStudent.class);

    public MasterStudent(final int studentNumber, final String studentName, final String schoolName) {
        super(studentNumber, studentName, schoolName, "master");
    }

    @Override
    public void selectLecturerName( String name, String role) {
        if (role.equals("teacher")) {
            super.selectLecturerName(name, role);
            LOGGER.info("Thesis lecturer selected");
        }
        else
            LOGGER.info("you can't selecct");
    }


    @Override
    public void selectProjectTopic( String projectTopic, String role) {
        if (role.equals("teacher")) {
            super.selectProjectTopic(projectTopic, role);
            LOGGER.info("thesis topic selected");
        }
        else
            LOGGER.info("you can't selecct");
    }
}
