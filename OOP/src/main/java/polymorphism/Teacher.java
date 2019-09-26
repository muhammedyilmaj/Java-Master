package polymorphism;

import java.util.Set;

public class Teacher {
    private String name;
    private String level;
    private static final String role= "teacher";
    private Set<Student> students;

    public Teacher(final String name, final String level) {
        this.name = name;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String isLevel() {
        return level;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(final Set<Student> students) {
        this.students = students;
    }
}
