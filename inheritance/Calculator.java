class Calculator {
    int number1;
    int number2;

    Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    void add() {
        System.out.println("Addition: " + (number1 + number2));
    }

    void subtract() {
        System.out.println("Subtraction: " + (number1 - number2));
    }

    void multiply() {
        System.out.println("Multiplication: " + (number1 * number2));
    }

    void divide() {
        if (number2 != 0) {
            System.out.println("Division: " + (number1 / number2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calc = new Calculator(20, 5);

        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}