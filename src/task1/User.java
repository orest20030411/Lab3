package task1;

public class User {
    private String firstName;             //значення класу
    private final String lastName;
    private int age;
    private String email;
    public Address address;

    public User(String firstName, String lastName, String email, int age, Address address) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public void showUser() {
        System.out.println("Користувач " + this.firstName + " " + this.lastName);
        System.out.println("Вік: " + this.age);
        System.out.println("E-mail: " + this.email);
        address.showAddress();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {               //для виводу значення getLastName
        return lastName;
    }

}


