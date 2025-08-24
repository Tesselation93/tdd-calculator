package tdd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
}
