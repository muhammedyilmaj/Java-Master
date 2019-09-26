package abstraction;

public interface University {
    void registerStudent(Student student);
    void cancelAgreement(int studentId);
    void freezeStudentMemberShip(int studentId);
}
