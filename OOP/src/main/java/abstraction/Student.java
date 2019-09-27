package abstraction;

public abstract class Student {
    private int studentId;
    private String studentName;
    private String phoneNumber;
    private String status;
    private String university;

    protected Student(final int studentId, final String studentName, final String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
    }
    protected abstract void applyForUniversity( University university);

    protected int getStudentId() {
        return studentId;
    }

    protected void setStudentId(final int studentId) {
        this.studentId = studentId;
    }

    protected String getStudentName() {
        return studentName;
    }

    protected void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    protected String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected String getStatus() {
        return status;
    }

    protected void setStatus(final String status) {
        this.status = status;
    }

    protected String getUniversity() {
        return university;
    }

    protected void setUniversity(final String university) {
        this.university = university;
    }
}
