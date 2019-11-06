package generics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {
    private static final String VIJZA = "vizja University";
    private static final String LAZARSKI = "lazarski";

    public static void main(String[] args) {


        Teacher<BachelorDegreeStudent> bachelorTeacher = new Teacher<> ("Ferit", "bachelor");
        Teacher<MasterStudent> masterTeacher   = new Teacher<>("Semra", "master");

        BachelorDegreeStudent James = new BachelorDegreeStudent(333, "daniel", VIJZA);
        BachelorDegreeStudent Ronaldo = new BachelorDegreeStudent(22, "cormier", VIJZA);
        BachelorDegreeStudent Falcao = new BachelorDegreeStudent(555, "khabib", LAZARSKI);

        MasterStudent gokhan = new MasterStudent(222, "gokhan", LAZARSKI);
        MasterStudent badri = new MasterStudent(666, "badrı", LAZARSKI);
        MasterStudent tyron = new MasterStudent(777, "tyron", LAZARSKI);

        Set<Student> masterStudent= new HashSet<>();
        Set<Student> bachelorStudent= new HashSet<>();
        Collections.addAll(bachelorStudent,James, Ronaldo,Falcao);
        Collections.addAll(masterStudent,gokhan,badri,tyron);
        bachelorTeacher.addStudent(James);
        bachelorTeacher.setStudents(bachelorStudent);

        masterTeacher.setStudents(masterStudent);
        System.out.println(bachelorStudent.size());
        masterStudent.stream()
            .forEachOrdered(bachelorStudent::add);

        System.out.println(bachelorStudent.size());
        masterStudent.add(new MasterStudent(2,"bedri", VIJZA));
        Optional.ofNullable(masterStudent).ifPresent(bachelorStudent::addAll);
        System.out.println(bachelorStudent.size());

        James.selectLecturerName("Vehbi");

    }




}
