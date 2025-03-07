import java.awt.*;
import java.util.Objects;
import java.util.Scanner;


public class UserInput {
    // User input method that returns a Person object
    public static Person getPersonFromUser() {

        //Methods to calculate height in cm and age in days.
        CalculateAge calculateAge = new CalculateAge();
        CalculateHeightInCM heightCalculator = new CalculateHeightInCM();

        // Create a new Scanner instance
        Scanner scanner = new Scanner(System.in);


        // Collect user input information with instructions
        String firstName;

        while (true) {

            System.out.println("Ievadi vārdu: ");
            firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                System.out.println("Neatstāj tukšu lauku!");
                continue;
            } else {
                break;
            }

        }


        String lastName;
        while (true) {
        //Outer Loop to restart
            System.out.println("Ievadi uzvārdu: ");
            System.out.println("Vai raksti Restart un sāc no jauna.");
            lastName = scanner.nextLine();

            // Check if the user wants to restart the whole cycle
            if (lastName.equals("Restart")) {
                System.out.println("Sākam no jauna...");
                return getPersonFromUser();
                // If person types restart the method will call itself again and restart the whole cycle
            }

            if (lastName.isEmpty()) {
                System.out.println("Neatstāj tukšu lauku!");
                continue;
            } else {
                break;
            }
        }


        System.out.println("Ievadi vecumu: ");
        int age = scanner.nextInt();

            //check if age is a positive number
            if (age <= 0) {
                System.out.println("Vecums nevar būt 0 vai mazāk ");
                return null;
            }


        System.out.println("Ievadi savu garumu metros: ");
        double height = scanner.nextDouble();

        //check if height is a positive number
        if (height <= 0) {
            System.out.println("Augums nevar būt 0 vai mazāk ");
            return null;
        }


        System.out.println("Ievadi savu svaru kilogramos: ");
        double weight = scanner.nextDouble();

        //check if weight is a positive number
        if (weight <= 0) {
            System.out.println("Svars nevar būt 0 vai mazāk ");
            return null;
        }

        scanner.nextLine();


        String country;
        //declare outside while
        while (true) {
            System.out.println("Ievadi valsti, kurā piedzimi: ");
            System.out.println("Vai raksti Restart un sāc no Jauna");
            country = scanner.nextLine();

            // Check if the user wants to restart the whole cycle
            if (country.equals("Restart")) {
                System.out.println("Sākam no jauna...");
                return getPersonFromUser();  // Recursively restart the process
            }

            if (country.isEmpty()) {
                System.out.println("Neatstāj tukšu lauku!");
                continue;
            } else {
                break;
            }
        }

            switch (country) {
                case "Latvija":
                    System.out.println("Latvia is one of the 3 Baltic states");
                    break;
                case "Lietuva":
                    System.out.println("Lithuania has a beautiful old town.");
                    break;
                case "Igaunija":
                    System.out.println("Estonia has great saunas and spa centres");
                    break;
                case "ASV":
                    System.out.println("The United States is one of the world's largest economies.");
                    break;
                case "Vācija":
                    System.out.println("Germany is the largest economy in Europe.");
                    break;
                case "Francija":
                    System.out.println("France is famous for its rich culture and history.");
                    break;
                default:
                    System.out.println("Interesting! I don't have information about " + country + ".");
                    break;

        }

        System.out.println("Ievadi savu mēneša ienākumu: ");
        double income = scanner.nextDouble();
        System.out.println("Vai Tev patīk programmēt(jā/nē): ");
        boolean likesToProgram = scanner.nextLine().equalsIgnoreCase("jā");
        System.out.println("------------");
        System.out.println("Papildus info:");
        System.out.println("Vecums dienās: " + calculateAge.calculateAge(age));
        System.out.println("Augums centimetros: " + heightCalculator.heightCalculator(height));
        System.out.println("Gada Ienākumi: " + (income * 12));

        if (weight / (height * height) < 25) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Overweight");
        }

        if (income < 1000) {
            System.out.println("Jūsu ienākumi ir zem vidējā");
        }

        if (country.equals("Latvija")) {
            System.out.println("Jūs dzīvojat Latvijā. Vidējie ienākumi šeit ir aptuveni 1500 EUR.");
        }


        // Create and return a new Person object using the collected data
        Person person1 = new Person(firstName, lastName, age, height, weight, country, income, likesToProgram);

        // Return the Person object
        return person1;
    }





}
