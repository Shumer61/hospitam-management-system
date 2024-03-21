public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient = new Patient();

        try {
            patient.setAge(25); // Valid age
            System.out.println("Patient's age set successfully.");

            patient.setAge(190); // Invalid age
            System.out.println("This line will not be executed.");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
