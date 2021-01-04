package generics;

public abstract class Student {

    private int studentNumber;
    private String studentName;
    private String schoolName;
    private String projectTopic;
    private  String lecturerName;
    private String departmentType;
    private static final String ROLE = "student";

    protected String getRole() {
        return ROLE;
    }

    protected Student(int studentNumber,  String studentName, String schoolName, String departmentType) {

        this.departmentType= departmentType;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.schoolName = schoolName;
    }

    protected int getStudentNumber() {
        return studentNumber;
    }

    protected String getStudentName() {
        return studentName;
    }

    protected String getSchoolName() {
        return schoolName;
    }

    protected String getProjectTopic() {
        return projectTopic;
    }

    protected String getLecturerName() {
        return lecturerName;
    }

    private void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    private void setProjectTopic(String projectTopic) {

        this.projectTopic = projectTopic;


    }

    protected String getDepartmentType() {
        return departmentType;
    }

    protected void selectLecturerName(String name) {
            setLecturerName(name);

    }

    protected void selectProjectTopic(String projectTopic) {
            setProjectTopic(projectTopic);}

}