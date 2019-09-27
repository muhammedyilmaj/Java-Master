package polymorphism;

import java.util.Set;

public class Teacher {
    private String name;
    private String level;
    private static final String ROLE= "teacher";
    private Set<Student> students;

    protected Teacher(final String name, final String level) {
        this.name = name;
        this.level = level;
    }

    protected String getLevel() {
        return level;
    }

    protected String getRole() {
        return ROLE;
    }

    protected String getName() {
        return name;
    }

    protected String isLevel() {
        return level;
    }

    protected Set<Student> getStudents() {
        return students;
    }

    protected void setStudents(final Set<Student> students) {
        this.students = students;
    }
}
