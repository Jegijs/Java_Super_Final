import java.util.Scanner;

public class UserInput {
    // User input method that returns a Person object
    public static Person getPersonFromUser() {
        // Create a new Scanner instance
        Scanner scanner = new Scanner(System.in);

        // Collect user input information with instructions
        System.out.println("Ievadi vārdu: ");
        String firstName = scanner.nextLine();
        System.out.println("Ievadi uzvārdu: ");
        String lastName = scanner.nextLine();
        System.out.println("Ievadi vecumu: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Ievadi savu garumu metros: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Ievadi savu svaru kilogramos: ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Ievadi valsti, kurā piedzimi: ");
        String country = scanner.nextLine();
        System.out.println("Ievadi savu mēneša ienākumu: ");
        double income = Double.parseDouble(scanner.nextLine());
        System.out.println("Vai Tev patīk programmēt(jā/nē): ");
        boolean likesToProgram = scanner.nextLine().equalsIgnoreCase("jā");

        // Create and return a new Person object using the collected data
        Person person1 = new Person(firstName, lastName, age, height, weight, country, income, likesToProgram);

        // Return the Person object
        return person1;
    }
}
