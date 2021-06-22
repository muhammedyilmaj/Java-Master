package designpatterns;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            Lesson english = new Lesson("english", "00001");
            Lesson turkish = new Lesson("turkish", "00002");
            Lesson french = new Lesson("french", "00003");
            Lesson russian = new Lesson("", "00004");
        List<Lesson> lessons = Arrays.asList(english,french,turkish,russian);
        Student muhammed = new Student.StudentBuilder("muhammed","yilmaz", "5152").lessons(lessons).phone("*********").school("Lazarski").build();

    }
}
