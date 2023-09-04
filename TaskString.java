/* дана строка с текстом, написать 2 метода
  1. возвращает массив цифр
  2.возвращает сумму цифр из массива
  2.1 подсчитать сумму всех чисел строки     */

import java.util.Arrays;

public class TaskString {

    public static void main(String[] args) {
        String value = "Ak13k8f5 f7sss92DFf 0ffEga4s";
        System.out.println(Arrays.toString(resultArray(value)));
        System.out.println("сумма числе массива: "+ (sumArray(resultArray(value))));
    }
    public static int[] resultArray (String value) {
        value = value.replaceAll("[^0-9]", "");
        int[] result = new int[value.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = value.charAt(i);
        }
        return result;
    }
    public static int sumArray (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
    return sum;
    }
}
