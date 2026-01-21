@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

 class Lamda{
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        int num1 = 5;
        int num2 = 3;

        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
    }
}
