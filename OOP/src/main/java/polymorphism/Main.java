package polymorphism;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final String VIJZA = "vizja University";
    private static final String LAZARSKI = "lazarski";

    public static void main(String[] args) {


        Teacher bachelorTeacher = new Teacher("Ferit", "bachelor");
        Teacher masterTeacher   = new Teacher("Semra", "master");

        BachelorDegreeStudent daniel = new BachelorDegreeStudent(33334, "daniel", VIJZA);
        BachelorDegreeStudent cormier = new BachelorDegreeStudent(345345, "cormier", VIJZA);
        BachelorDegreeStudent khabib = new BachelorDegreeStudent(121, "khabib", LAZARSKI);

        MasterStudent gokhan = new MasterStudent(564, "gokhan", LAZARSKI);
        MasterStudent badri = new MasterStudent(126311, "badrı", LAZARSKI);
        MasterStudent tyron = new MasterStudent(563, "tyron", LAZARSKI);

        Set<Student> masterStudent= new HashSet<>();
        Set<Student> bachelorStudent= new HashSet<>();
        bachelorStudent.add(daniel);
        bachelorStudent.add(cormier);
        bachelorStudent.add(khabib);
        masterStudent.add(gokhan);
        masterStudent.add(badri);
        masterStudent.add(tyron);

        bachelorTeacher.setStudents(bachelorStudent);
        masterTeacher.setStudents(masterStudent);


        daniel.selectLecturerName("Vehbi");
        bachelorTeacher.getStudents().stream().filter(s->s.getStudentName().equals("daniel")).findFirst().get().selectLecturerName("Zülfü Livaneli");


    }




}
