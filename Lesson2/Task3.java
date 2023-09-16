/** Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 Возвращает функция эти три массива в виде одного двумерного.
 Пример:
                                    [-4, -18]
        [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
                                    [1, 9, 3]
 **/


package ArraysTask;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {17, -8, 11, 0, -6, 99, 5, 0, -68, 3, -7, -440};
        splitArray(array);
    }

    private static void splitArray(int[] array) {
        int lengthPositive = 0;
        int lengthNull = 0;
        int lengthNigative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) lengthPositive++;
            else if (array[i] == 0) lengthNull++;
            else lengthNigative++;
        }
        int[] positiveArray = new int[lengthPositive];
        int[] nigativeArray = new int[lengthNigative];
        int[] nullArray = new int[lengthNull];
        int countPositive = 0;
        int countNull = 0;
        int countNigative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) positiveArray[countPositive++] = array[i];
            else if (array[i] == 0) nullArray[countNull++] = array[i];
            else nigativeArray[countNigative++] = array[i];
        }
        System.out.println(Arrays.toString(positiveArray));
        System.out.println(Arrays.toString(nullArray));
        System.out.println(Arrays.toString(nigativeArray));
    }
}
