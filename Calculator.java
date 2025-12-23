public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double num1 = 10;
        double num2 = 5;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + calc.add(num1, num2));
    }
}
