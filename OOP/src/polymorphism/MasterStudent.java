package polymorphism;

public class MasterStudent extends Student{

    public MasterStudent(final int studentNumber, final String studentName, final String schoolName) {
        super(studentNumber, studentName, schoolName, "master");
    }

    @Override
    public void selectLecturerName( String name,  boolean permission, String role) {
        if (permission == true && role.equals("teacher")) {
            super.selectLecturerName(name, permission, role);
            System.out.println("Thesis lecturer selected");
        }
        else
            System.out.println("you can't selecct");
    }

    @Override
    public void selectProjectTopic( String projectTopic,  boolean permission, String role) {
        if (permission == true && role.equals("teacher")) {
            super.selectProjectTopic(projectTopic, permission, role);
            System.out.println("thesis topic selected");
        }
        else
            System.out.println("you can't selecct");
    }
}
