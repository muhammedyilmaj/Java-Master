package designpatterns.builder;

import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private final String name;
    private String surName;
    private String Id;
    private List<Lesson> lessons;
    private String school;
    private String phone;

    public Student (StudentBuilder builder) {
        this.name = builder.name;
        this.surName = builder.surName;
        this.Id = builder.Id;
        this.lessons = builder.lessons;
        this.school = builder.school;
        this.phone = builder.phone;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getId() {
        return Id;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public String getSchool() {
        return school;
    }

    public String getPhone() {
        return phone;
    }

    public static class StudentBuilder
    {
        private final String name;
        private final String surName;
        private List<Lesson> lessons;
        private String phone;
        private String school;
        private String Id;

        public StudentBuilder(String name, String surName, String Id) {
            this.name = name;
            this.surName = surName;
        }
        public StudentBuilder lessons(List<Lesson> lesson) {
            this.lessons = lesson;
            return this;
        }
        public StudentBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder school(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            Student student =  new Student(this);

            validateStudentLesson(student.lessons);
            return student;
        }
        private List<String>  validateStudentLesson(List<Lesson> studentLessons) {
            System.out.println(lessons.get(1));
            return studentLessons.stream().filter(p -> p.getName().isEmpty())
                    .map(p -> p.getLessonCode()).collect(Collectors.toList());
        }
    }
}
