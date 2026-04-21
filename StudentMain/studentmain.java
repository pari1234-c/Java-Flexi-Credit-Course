public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStdPrn(1);
        s1.setStdName("Abc");
        s1.setStdDept("CSE");

        int prn = s1.getStdPrn();
        String name = s1.getStdName();
        String dept = s1.getStdDept();

        System.out.println("PRN is " + prn);
        System.out.println("Name is " + name);
        System.out.println("Dept is " + dept);
    }
}
