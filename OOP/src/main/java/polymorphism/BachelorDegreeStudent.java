package polymorphism;
import org.apache.log4j.Logger;

public class BachelorDegreeStudent extends Student {
    private static final Logger LOGGER = Logger.getLogger(BachelorDegreeStudent.class);


    public BachelorDegreeStudent( int studentNumber,  String studentName,  String schoolName) {
        super(studentNumber, studentName, schoolName, "bachelor");
    }

    @Override
    public void selectLecturerName( String name, String role) {
        if ( role.equals("teacher")) {
            super.selectLecturerName(name, role);
            LOGGER.info("Finish project lecturer selected");
        }
        else
            LOGGER.info("Can't choose projecttopic");
    }

    @Override
    public void selectProjectTopic( String projectTopic,  String role) {
        if (role.equals("teacher")) {
            super.selectProjectTopic(projectTopic,role);
            LOGGER.info("Finish projecttopic selected");}
        else
            LOGGER.info("Can't choose projecttopic");


    }
}
