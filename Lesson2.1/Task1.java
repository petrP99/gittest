package CyclesTask;

/* Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
*/

public class Task1 {
    public static void main(String[] args) {
        int value = 4401255;
        System.out.println("Количество четных чисел: " + countChet(value));
        System.out.println("Количество нечетных чисел: " + countNechet(value));
    }
    private static int countChet (int value) {
        int count = 0;
        while (value > 0 ){
            int temp = value % 10;
            if (temp % 2 == 0) count++;
            value = value/10;
        }
        return count;
    }
    private static int countNechet (int value) {
        int count = 0;
        while (value > 0 ){
            int temp = value % 10;
            if (temp % 2 != 0) count++;
            value = value/10;
        }
        return  count;
    }

    }

