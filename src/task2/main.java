package task2;

public class main {
    public static void main(String[] args) {
        try (Sample Sample = new Sample()) {
            Sample.read();
        } catch (Exception e) {
            System.out.println("Caught IOException");
        }
    }
}

