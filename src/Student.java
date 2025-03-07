public class Student extends Person {

    private String studyProgram;
    // Variable for a subject
    public Student(String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram, String studyProgram) {
        //Inherits constructor from person for student info
        super(firstName, lastName, age, height, weight, country, income, likesToProgram);
        this.studyProgram = studyProgram;
    }

    //Is it possible to not use the whole constructor

    public void studyInfo() {
        System.out.println("Studentam ir jāmācās: " + studyProgram);
        //Outputs the subject, student needs to learn in console
    }
}
