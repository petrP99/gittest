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
    public static void main(String[] args) {
        double a = 3;
        double b = 7;
        char c = '%';
        System.out.println(result(a, b, c));
    }
    private static double result(double a, double b, char c) {
        if(c == '+') return a + b;
        else if (c == '-') return a - b;
        else if (c == '*') return a * b;
        else if (c == '/') return a / b;
        else if (c == '%') return a % b;
        else return 0;
        }
    }