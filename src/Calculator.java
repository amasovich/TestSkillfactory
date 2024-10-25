import java.util.Scanner;

// Класс Калькулятор
public class Calculator {

    // Основной метод для запуска калькулятора
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Считывание первого операнда
        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();

        // Считывание операции
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Считывание второго операнда
        System.out.print("Введите второе число: ");
        double operand2 = scanner.nextDouble();

        // Обработка и выполнение операции
        double result = performOperation(operand1, operand2, operation);

        // Если операция корректная, выводим результат
        if (!Double.isNaN(result)) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }

    // Метод для сложения
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления с проверкой деления на ноль
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN; // Возвращаем NaN для обозначения ошибки
        }
        return a / b;
    }

    // Метод для выполнения операции
    public double performOperation(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+':
                return add(operand1, operand2);
            case '-':
                return subtract(operand1, operand2);
            case '*':
                return multiply(operand1, operand2);
            case '/':
                return divide(operand1, operand2);
            default:
                System.out.println("Ошибка: неподдерживаемая операция!");
                return Double.NaN; // Возвращаем NaN для обозначения ошибки
        }
    }
}