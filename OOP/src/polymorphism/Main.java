package polymorphism;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Teacher bachelorTeacher = new Teacher("Ferit", "bachelor");
        Teacher masterTeacher   = new Teacher("Semra", "master");

        BachelorDegreeStudent daniel = new BachelorDegreeStudent(121, "daniel", "vizja");
        BachelorDegreeStudent cormier = new BachelorDegreeStudent(121, "cormier", "vizja");
        BachelorDegreeStudent khabib = new BachelorDegreeStudent(121, "khabib", "vizja");

        MasterStudent gokhan = new MasterStudent(111, "gokhan", "lazarski");
        MasterStudent badri = new MasterStudent(111, "badrı", "lazarski");
        MasterStudent tyron = new MasterStudent(111, "tyron", "lazarski");

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


        daniel.selectLecturerName("Vehbi",true, daniel.getRole());
        bachelorTeacher.getStudents().stream().filter(s->s.getStudentName().equals("daniel")).findFirst().get().selectLecturerName("Zülfü Livaneli",true,bachelorTeacher.getRole());


    }




}
