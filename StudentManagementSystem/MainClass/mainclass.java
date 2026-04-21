public class MainClass {

    public static void main(String[] args) {

        GraduateStudent g1 = new GraduateStudent();

        g1.setPerson("Parinita", 20);
        g1.setStudent(101, 85.5);
        g1.setGraduateStudent("Computer Science");

        System.out.println("----- Student Details -----");

        g1.displayPerson();
        g1.displayStudent();
        g1.displayGraduateStudent();
    }
}
