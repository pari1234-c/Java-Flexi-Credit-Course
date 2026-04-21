public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.empId = 100;
        e1.empName = "Abc";
        e1.empDept = "IT";

        System.out.println("Employee id is " + e1.empId);
        System.out.println("Employee Name is " + e1.empName);
        System.out.println("Employee Dept is " + e1.empDept);

        Employee e2 = new Employee();
        e2.empId = 101;
        e2.empName = "Def";
        e2.empDept = "Accounting";

        System.out.println("Employee id is " + e2.empId);
        System.out.println("Employee Name is " + e2.empName);
        System.out.println("Employee Dept is " + e2.empDept);
    }
}
