package task3;

import java.util.Map;

public class Student implements Comparable{
    private String name;
    private String lastName;
    private String patronymicName;
    private int age;
    private Map<Subject, Rating> ratingMap;
    private int course;
    private long id;

    public Student(String name, String lastName, String patronymicName, long id, int age, int course, Map<Subject, Rating> hashMap) {
        this.name = name;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.age = age;
        this.course = course;
        this.id = id;
        this.ratingMap = hashMap;
    }


    public Map<Subject, Rating> getRatingMap() {
        return ratingMap;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRatingMap(Map<Subject, Rating> ratingMap) {
        this.ratingMap = ratingMap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student " +
                "name = " + name +
                ", age = " + age
                + ", course = " + course +
                ", id = " + id +
                ". Mark of subject = " + ratingMap;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
