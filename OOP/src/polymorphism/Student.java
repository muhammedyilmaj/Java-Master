package polymorphism;

public class Student {

    private int    studentNumber;
    private String studentName;
    private String schoolName;
    private String projectTopic;
    private  String lecturerName;
    private String departmentType;
    private final String role = "student";

    public String getRole() {
        return role;
    }

    public Student(int studentNumber,  String studentName, String schoolName, String departmentType) {

        this.departmentType= departmentType;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.schoolName = schoolName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getProjectTopic() {
        return projectTopic;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    private void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    private void setProjectTopic(String projectTopic) {

        this.projectTopic = projectTopic;


    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void selectLecturerName(String name, boolean permission, String role) {
            setLecturerName(name);

    }

    public void selectProjectTopic(String projectTopic, boolean permission, String role) {
            setProjectTopic(projectTopic);}

}