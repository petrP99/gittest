/*
Даны 3 переменные:
- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.
Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1) */


public class Task2 {
          
 private final static char ADDITION = '+';
 private final static char SUBTRACTION = '-';
 private final static char MULTIPLICATION = '*';
 private final static char DIVISION = '/';
 private final static char MODULUS = '%';
     public static void main(String[] args) {
        double operand1 = 3;
        double operand2 = 7;
        char operation;
        System.out.println(result(operand1, operand2, operation));
    }
    private static double result(double a, double b, char c) {
        return switch (operation) {
          case ADDITION -> operand1 + operand2;
          case SUBTRACTION -> operand1 - operand2;
          case MULTIPLICATION -> operand1 * operand2;
          case DIVISION -> operand1 / operand2;
          case MODULUS -> operand1 % operand2;
          default -> throw new IllegalArgumentException("Неверная математическая операция");
      };
        }
    }
