package polymorphism;

import org.apache.log4j.Logger;

public class MasterStudent extends Student{
    private static final Logger LOGGER = Logger.getLogger(MasterStudent.class);

    public MasterStudent(final int studentNumber, final String studentName, final String schoolName) {
        super(studentNumber, studentName, schoolName, "master");
    }

    @Override
    protected void selectLecturerName( String name) {
        if (this.getRole().equals("teacher")) {
            super.selectLecturerName(name);
            LOGGER.info("Thesis lecturer selected");
        }
        else
            LOGGER.info("you can't selecct");
    }


    @Override
    protected void selectProjectTopic( String projectTopic) {
        if (this.getRole().equals("teacher")) {
            super.selectProjectTopic(projectTopic);
            LOGGER.info("thesis topic selected");
        }
        else
            LOGGER.info("you can't selecct");
    }
}
