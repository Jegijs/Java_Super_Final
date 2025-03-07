public class Main {
    public static void main(String[] args) {

        Person person1 = UserInput.getPersonFromUser();
        //Lets user input their data

        System.out.println("------------");
        System.out.println("Person details:");
        person1.printInfo();
        System.out.println("------------");
        //Outputs the data user has input and separates from the next information

        Student student = new Student("Roberts", "Rozentals", 24, 1.8, 95,  "LV", 5000, true, "angļu valoda, fizika un matematika");
        //student info

        student.studyInfo();
        student.printInfo();
        //outputs the subject that needs to be studied and the student info

        //Side quests
        //todo - pievienot while ciklu inputiem. lai varetu atkartoti ievadit nepareizos datus prieks int un double
        //todo - Pievienot iespēju atkārtoti palaist programmu bez nepieciešamības to manuāli restartēt prieks int un double

        //Added new comment
    }
}