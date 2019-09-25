package polymorphism;

public class BachelorDegreeStudent extends Student {


    public BachelorDegreeStudent( int studentNumber,  String studentName,  String schoolName,  String departmentType) {
        super(studentNumber, studentName, schoolName, "bachelor");
    }

    @Override
    public void selectLecturerName( String name, boolean permission, String role) {
        if (permission == true && role.equals("teacher")) {
            super.selectLecturerName(name, permission, role);
            System.out.println("Finish project lecturer selected");
        }
        else
            System.out.println("Can't choose projecttopic");
    }

    @Override
    public void selectProjectTopic( String projectTopic,  boolean permission, String role) {
        if (permission == true && role.equals("teacher")) {
            super.selectProjectTopic(projectTopic, permission,role);
            System.out.println("Finish projecttopic selected");}
        else
            System.out.println("Can't choose projecttopic");


    }
}
