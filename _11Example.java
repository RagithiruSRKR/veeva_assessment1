class Example {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

            try {
                int result = numbers[1] / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch.");
    }
}
