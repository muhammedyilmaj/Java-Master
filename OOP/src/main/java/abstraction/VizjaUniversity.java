package abstraction;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class VizjaUniversity implements University{
    private static final Logger LOGGER = Logger.getLogger(VizjaUniversity.class);

    private Map<Integer ,Student> students;

    protected VizjaUniversity(){
        students= new HashMap<>();
    }

    @Override
    public void registerStudent(Student student) {
        try {
            students.put(student.getStudentId(),student);
            student.setUniversity("Vizja");
            student.setStatus("active");
            LOGGER.info("registered" + student.getStudentName());
        }

        catch (Exception E){
            LOGGER.info("cancel registeration  student=>" + student.getStudentName());
        }
    }

    @Override
    public void cancelAgreement(int studentId) {

        if (students.containsKey(studentId)) {
            try{
            students.remove(studentId);
            students.get(studentId).setStatus("inactive");
            students.get(studentId).setUniversity("");
        } catch (NullPointerException E){
            LOGGER.info("Student number is not belong to Vizja university=> " + studentId);
        }
    }
    }

    @Override
    public void freezeStudentMemberShip(final int studentId) {

        if (students.containsKey(studentId)) {
            try {
            students.get(studentId).setStatus("inactive");
            }catch (NullPointerException E){
                LOGGER.info("Student number is not belong to Vizja university=> " + studentId); }}

}
}
