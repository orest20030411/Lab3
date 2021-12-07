package task1;

public class main {
    public static void main(String[] args) {
        Address trueAddress = new Address("Lviv", "Zamarstunivska", "150", 57);
        User trueUser = new User("Vasya", "Petrovich", "vasyapetrovich@gmail.com", 12, trueAddress);
        Address fakeAddress = new Address("City123", "NO NAME STREEET", "-1", 0);
        User fakeUser = new User("Vasylyna", "Vasilenko", "vasylyna@ukr.net", 12, fakeAddress);

        try {       //true user validate
            ValidateUser.validate(trueUser);
        } catch (InvalidUserInput e) {
            System.out.println(e.getMessage());
        }

        try {       //fake user validate
            ValidateUser.validate(fakeUser);
        } catch (InvalidUserInput e) {
            System.out.println(e.getMessage());
        }

    }
}


