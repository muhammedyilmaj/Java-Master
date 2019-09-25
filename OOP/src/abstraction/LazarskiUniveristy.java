package abstraction;

import java.util.HashMap;
import java.util.Map;

public class LazarskiUniveristy implements University{
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
                throw new NullPointerException("Strudent dont belong to Lazarski");}
        catch (NullPointerException E){
            System.out.println("Student number is not belong to Lazarski university=> " + studentId);
        }
    }

    @Override
    public void freezeStudentMemberShip(final int studentId) {
        try {
            if (students.containsKey(studentId)) {
                students.get(studentId).setStatus("inactive");}}
        catch (NullPointerException E){
            System.out.println("Student number is not belong to Lazarski university=> " + studentId); }}
}
