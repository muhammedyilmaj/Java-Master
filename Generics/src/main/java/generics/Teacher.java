package generics;

import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public class Teacher<T> {
    private String name;
    private String level;
    private static final String ROLE   = "teacher";
    private Set<T> students;
    private static final Logger LOGGER = Logger.getLogger(Teacher.class);

    protected Teacher(final String name, final String level) {
        this.name = name;
        this.level = level;
        students= new HashSet<>();
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

    protected Set<T> getStudents() {
        return this.students;
    }

    protected void setStudents(Set<Student> students) {
        this.students = (Set<T>) students;
    }

    protected boolean addStudent(T student){
        if(students == null){
            students.add(student);
        }
        else if(students.contains(student)){
            LOGGER.info("The Student is already exist");
            return false;
        }else
            students.add(student);
            return true;
    }
}
