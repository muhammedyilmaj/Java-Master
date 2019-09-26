package abstraction;

public abstract class Student {
    private int studentId;
    private String studentName;
    private String phoneNumber;
    private String status;
    private String university;

    public Student(final int studentId, final String studentName, final String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
    }
    public abstract void applyForUniversity( University university);

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(final int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(final String university) {
        this.university = university;
    }
}
