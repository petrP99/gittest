public class MinMaxIndex {
    public static void main(String[] args) {
        //               0  1   2   3   4  5  6  7   8   9
        int [] array = {20, 10, 2, -70, 74, 18, 3, 1, 98, 12, -1};
        System.out.println("min index " + findMin(array));
        System.out.println("max index " + findMax(array));
        System.out.println(sumBetweenMinMax(array, findMin(array),findMax(array)));
    }
    private static int findMin (int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    private static int findMax (int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private static int sumBetweenMinMax (int[] massive, int min, int max) {
        int sum = 0;
        int start = Math.min(min, max);
        int end = Math.max(min, max);
        for (int i = start+1; i < end; i++) {
            sum += massive[i];
            }

    return sum;
    }
}
