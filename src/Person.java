public class Person {
    // Variables used to describe person
    String firstName;
    String lastName;
    int age;
    double height;
    double weight;
    String country;
    double income;
    boolean likesToProgram;



public Person (String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram) {
    //Constructor method which assigns values
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.country = country;
    this.income = income;
    this.likesToProgram = likesToProgram;
    }


public void printInfo() {
    //Method to showcase information in console
    System.out.println("Name: " + firstName);
    System.out.println("Last name: " + lastName);
    System.out.println("Age: " + age);
    System.out.println("Height(m): " + height);
    System.out.println("Weight(kg): " + weight);
    System.out.println("Country: " + country);
    System.out.println("Income(eur): " + income);
    System.out.println("Person likes to program (True/False): " + likesToProgram);
}


}
