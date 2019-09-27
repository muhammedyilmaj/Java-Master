package polymorphism;
import org.apache.log4j.Logger;

public class BachelorDegreeStudent extends Student {
    private static final Logger LOGGER = Logger.getLogger(BachelorDegreeStudent.class);


    protected BachelorDegreeStudent( int studentNumber,  String studentName,  String schoolName) {
        super(studentNumber, studentName, schoolName, "bachelor");
    }

    @Override
    protected void selectLecturerName( String name) {
        if ( this.getRole().equals("teacher")) {
            super.selectLecturerName(name);
            LOGGER.info("Finish project lecturer selected");
        }
        else
            LOGGER.info("Can't choose projecttopic");
    }

    @Override
    protected void selectProjectTopic( String projectTopic) {
        if (this.getRole().equals("teacher")) {
            super.selectProjectTopic(projectTopic);
            LOGGER.info("Finish projecttopic selected");}
        else
            LOGGER.info("Can't choose projecttopic");


    }
}
