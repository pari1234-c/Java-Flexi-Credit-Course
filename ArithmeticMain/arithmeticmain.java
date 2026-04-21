public class ArithmeticMain {

    public static void main(String[] args) {

        Arithmetic_Operations obj1 = new Arithmetic_Operations();

        obj1.setValue1(200);
        obj1.setValue2(100);

        obj1.additionOperation();
        double result = obj1.getResult();

        System.out.println("Addition is : " + result);
    }
}
