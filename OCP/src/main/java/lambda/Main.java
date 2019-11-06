package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Student> students= new ArrayList<>();
        Student Çağrı= new Student("1244","çağrı", "bachelor",true);
        Student Muhammed= new Student("1244","muhammed", "bachelor",true);
        Student Yılmaz= new Student("1244","yılmaz", "master",true);
        students.add(Çağrı);
        students.add(Muhammed);
        students.add(Yılmaz);
        students.removeIf(s->s.getDegree().equals("bachelor"));
        students.stream().forEach(s-> {
            if(s.getDegree().equals("master")){
                System.out.println(s.toString());
            }
        });

        List <Student>Stude=students.stream().filter(s->s.getDegree().equals("bachelor")).collect(Collectors.toList());

        print(students,a->a.hasAbility());
        print(students,a-> !a.hasAbility());

    }
    private static void print(List<Student> students, Predicate<Student> test){
        for(Student student: students ){
            if(test.test(student)){
                System.out.println(student.toString());
            }
        }
    }


}
