package week4;

public class Enumeration {
    // Add your method here
    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public static void describe(String colour, Priority priority) {
        System.out.println(colour + " indicates " + priority.toString().toLowerCase() + " priority");
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
