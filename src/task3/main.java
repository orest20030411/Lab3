package task3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(final String[] args) {
        final List<Student> studentList = new ArrayList<>();
        final Map<Subject, Rating> hashMap1 = new HashMap<>();
        final Map<Subject, Rating> hashMap2 = new HashMap<>();
        final Map<Subject, Rating> hashMap3 = new HashMap<>();

        final Subject english = new Subject("English");
        final Subject math = new Subject("Math");
        final Subject physics = new Subject("Physics");

        final Rating rating1 = new Rating(100,4,11);
        final Rating rating2 = new Rating(57,3,8);
        final Rating rating3 = new Rating(17,1,3);

        hashMap1.put(english, rating1);
        hashMap1.put(math, rating2);
        hashMap1.put(physics, rating3);

        hashMap2.put(english, rating1);
        hashMap2.put(math, rating2);
        hashMap2.put(physics, rating3);

        hashMap3.put(english, rating1);
        hashMap3.put(math, rating2);
        hashMap3.put(physics, rating3);


        final Student student1 = new Student("Orest","Yakymiv","", 1, 34, 1,  hashMap1);
        final Student student2 = new Student("Roman","Melnyk","", 3, 23, 2, hashMap2);
        final Student student3 = new Student("Svyatoslav","Lachman","", 2, 26, 2, hashMap3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        final Subject applicationProgramming = new Subject("Application programming");

        display(studentList);
        addSubject(studentList, applicationProgramming);
        display(studentList);

        System.out.println();
        System.out.println("The highest average score = " + average(student1));

        System.out.println();
        System.out.println(displayMapByKey(studentList,english));

        maxAverage(studentList);
    }

    public static List<Student> addSubject(List<Student> list, Subject subject) {
        for (Student student : list) {
            student.getRatingMap().put(subject, new Rating());
        }

        return list;
    }

    public static void display(List<Student> list) {
        for (Student student : list) {
            System.out.println();
            System.out.println(student);
        }
    }

    public static double average(Student student) {
        return student.getRatingMap().values().stream()
                .mapToInt(value -> value.getHundredPointSystem())
                .max().stream().average()
                .getAsDouble();
    }

    public static Map<Long, Rating> displayMapByKey(List<Student> list, Subject subject){
        return list.stream()
                .distinct()
                .collect(Collectors.toMap(student -> student.getId(),student -> student.getRatingMap().get(subject)));
    }

    public static List<Student> removeStudentsWithAnAverageMark(List<Student> list){
        return list.stream().filter(x -> average(x) < 50).collect(Collectors.toList());
    }

    public static void maxAverage(List<Student> list) {
        list.stream().map(e -> e.getRatingMap().values().stream().findFirst()).collect(Collectors.toList());
    }

    public static void getAllEnglishMarks(List<Student> list){
        Subject subject = list.get(0).getRatingMap().keySet().stream().filter(x -> x.getName().equals("English")).findFirst().get();
        list.stream().map(e -> e.getRatingMap().get(subject).getHundredPointSystem()).distinct().forEach(e -> System.out.println(e));
    }



    public static List<Student> sort(List<Student> list){
        return list.stream().sorted().collect(Collectors.toList());
    }


}
