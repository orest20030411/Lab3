package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSimple {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private int age;
    private int course;


    public StudentSimple(String firstName, String lastName, String patronymicName, int age, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.age = age;
        this.course = course;
    }

    public List<StudentSimple> toStudentSimple(List<Student> list){
        return list.stream().map(e -> new StudentSimple(e.getName(), e.getLastName(), e.getPatronymicName(), e.getAge(), e.getCourse())).collect(Collectors.toList());
    }









    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
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
        return "StudentSimple{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentSimple that = (StudentSimple) o;

        if (age != that.age) return false;
        if (course != that.course) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return patronymicName != null ? patronymicName.equals(that.patronymicName) : that.patronymicName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronymicName != null ? patronymicName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + course;
        return result;
    }
}
