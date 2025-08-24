package tdd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(String numbers){
        if (numbers.equals("")){
            return 0;
        }
        return Integer.parseInt(numbers);
    }
    public int subtract (int a, int b){
        return a - b;
    }
    public int multiply (int a, int b){
        return a * b;
    }
    public int divide (int a, int b){
        return a / b;
    }
}

