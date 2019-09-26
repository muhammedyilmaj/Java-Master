package abstraction;

import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class LazarskiUniveristy implements University{
    private static final Logger LOGGER = Logger.getLogger(LazarskiUniveristy.class);

    private Map<Integer ,Student> students;

    public LazarskiUniveristy(){
        students= new HashMap<>();
    }

    @Override
    public void registerStudent(Student student) {
        try {
            students.put(student.getStudentId(),student);
            student.setUniversity("Lazarski");
            student.setStatus("active");
            LOGGER.info("registered" + student.getStudentName());
        }

        catch (Exception E){
            LOGGER.info("cancel registeration  student=>" + student.getStudentName());
        }
    }

    @Override
    public void cancelAgreement(int studentId) {
        try{
            if (students.containsKey(studentId)) {
                students.remove(studentId);
                students.get(studentId).setStatus("inactive");
                students.get(studentId).setUniversity("");
            }
            else
                throw new NullPointerException("Strudent dont belong to Lazarski");}
        catch (NullPointerException E){
            LOGGER.info("Student number is not belong to Lazarski university=> " + studentId);
        }
    }

    @Override
    public void freezeStudentMemberShip(final int studentId) {
        try {
            if (students.containsKey(studentId)) {
                students.get(studentId).setStatus("inactive");}}
        catch (NullPointerException E){
            LOGGER.info("Student number is not belong to Lazarski university=> " + studentId); }}
}
