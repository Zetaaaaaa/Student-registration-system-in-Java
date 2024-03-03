import java.util.*;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter email id: ");
        String email = scanner.nextLine();

        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter marks for Theory Paper 1: ");
        double theoryPaper1 = scanner.nextDouble();

        System.out.print("Enter marks for Theory Paper 2: ");
        double theoryPaper2 = scanner.nextDouble();

        System.out.print("Enter marks for Theory Paper 3: ");
        double theoryPaper3 = scanner.nextDouble();

        System.out.print("Enter marks for Lab Paper 1: ");
        double labPaper1 = scanner.nextDouble();

        System.out.print("Enter marks for Lab Paper 2: ");
        double labPaper2 = scanner.nextDouble();

        System.out.print("Enter marks for Lab Paper 3: ");
        double labPaper3 = scanner.nextDouble();

        // Calculate subject-wise percentages
        double theoryPercentage = (theoryPaper1 + theoryPaper2 + theoryPaper3) / 3;
        double labPercentage = (labPaper1 + labPaper2 + labPaper3) / 3;

        // Calculate aggregate percentage
        double aggregatePercentage = (theoryPercentage + labPercentage) / 2;

        // Check if all inputs are provided
        String status = (name.isEmpty() || address.isEmpty() || email.isEmpty() || contactNumber.isEmpty() ||
                rollNumber <= 0 || theoryPaper1 < 0 || theoryPaper2 < 0 || theoryPaper3 < 0 ||
                labPaper1 < 0 || labPaper2 < 0 || labPaper3 < 0) ? "unregistered" : "registered";

        // Display student data and status
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
        System.out.println("Email ID: " + email);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Theory Paper 1: " + theoryPaper1);
        System.out.println("Theory Paper 2: " + theoryPaper2);
        System.out.println("Theory Paper 3: " + theoryPaper3);
        System.out.println("Lab Paper 1: " + labPaper1);
        System.out.println("Lab Paper 2: " + labPaper2);
        System.out.println("Lab Paper 3: " + labPaper3);
        System.out.println("Subject-wise Percentage (Theory): " + theoryPercentage + "%");
        System.out.println("Subject-wise Percentage (Lab): " + labPercentage + "%");
        System.out.println("Aggregate Percentage: " + aggregatePercentage + "%");
        System.out.println("Status: " + status);
        scanner.close();

    }
}