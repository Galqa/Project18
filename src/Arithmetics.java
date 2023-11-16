
/**
 * Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази
 **/


@FunctionalInterface
interface Calculator {
    double calculate(double x, double y);
}

class Arithmetics {
    public static void main(String[] args) {
        Calculator addition = Double::sum;
        Calculator subtraction = (x, y) -> x - y;
        Calculator multiplication = (x, y) -> x * y;
        Calculator division = (x, y) -> x / y;

        System.out.println("Addition: " + addition.calculate(1, 9));
        System.out.println("Subtraction: " + subtraction.calculate(2, 8));
        System.out.println("Multiplication: " + multiplication.calculate(3, 7));
        System.out.println("Division: " + division.calculate(4, 6));
    }
}