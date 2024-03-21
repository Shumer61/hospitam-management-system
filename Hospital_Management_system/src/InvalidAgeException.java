public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Invalid age: " + age + ". Age must be between 0 and 130.");
    }
}
