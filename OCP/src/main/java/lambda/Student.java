package lambda;

public class Student {
    private String studentID;
    private String studentName;
    private String degree;
    private boolean ability;

    public Student(String studentID, String studentName, String degree, boolean ability) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.degree = degree;
        this.ability= ability;

    }
    public boolean hasAbility(){
        return ability;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(final String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(final String degree) {
        this.degree = degree;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("studentId"+ getStudentID()+"\n");
        stringBuilder.append(("studentNAme" + getStudentName()+ "\n"));
        return stringBuilder.toString();
    }
}

