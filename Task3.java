/*
Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.*/

public class Task3 {
    public static void main(String[] args) {
        double s1 = square1(2,5);
        double s2 = square2(51,2);
        System.out.println("Площадь первого треугольника: " + s1);
        System.out.println("Площадь второго треугольника: " + s2);
        equalsSquare(s1,s2);
    }
    private static double square1 (int a, int b) {
        return (double) (a * b) /2;
    }
    private static double square2 (int a2, int b2) {
        return (double) (a2 * b2) /2;
    }
    private static void equalsSquare (double s1, double s2) {
        if (s1 == s2) System.out.println("Первый треугольник равен второму");
        else if (s1 > s2) System.out.println("Первый треугольник больше второго");
        else if (s1 < s2) System.out.println("Первый треугольник меньше второго");
    }

}
