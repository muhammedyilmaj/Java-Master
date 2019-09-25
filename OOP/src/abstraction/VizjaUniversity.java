package abstraction;
import java.util.HashMap;
import java.util.Map;

public class VizjaUniversity implements University{
    private Map<Integer ,Student> students;

    public VizjaUniversity(){
        students= new HashMap<>();
    }

    @Override
    public void registerStudent(Student student) {
        try {
            students.put(student.getStudentId(),student);
            student.setUniversity("Vizja");
            student.setStatus("active");
            System.out.println("registered" + student.getStudentName());
        }

        catch (Exception E){
            System.out.println("cancel registeration  student=>" + student.getStudentName());
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
        throw new NullPointerException("new null");}
        catch (NullPointerException E){
            System.out.println("Student number is not belong to Vizja university=> " + studentId);
        }
    }

    @Override
    public void freezeStudentMemberShip(final int studentId) {
        try {
        if (students.containsKey(studentId)) {
            students.get(studentId).setStatus("inactive");}}
        catch (NullPointerException E){
            System.out.println("Student number is not belong to Vizja university=> " + studentId); }}
}
