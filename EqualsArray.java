

public class EqualsArray {
    public static void main(String[] args) {
        int[][] values1 =
                {{1, 5, 7},
                {6, 6, 8},
                 {10, 12, 5}};
        int[][] values2 =
                {{1, 5, 7},
                  {6, 6, 7},
                  {10, 12, 5}};
        System.out.println(equalsArrays(values1, values2));
    }    static boolean equalsArrays (int[][] values1, int[][] values2) {
        boolean b = true;
        if (values1.length != values2.length)
            return false;
        for (int i = 0; i < values1.length; i++) {
            int [] array1 = values1[i];
            int [] array2 = values2[i];
            if (array1.length != array2.length)
                return false;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j])
                    return false;
                }
            }
        return b;

        }
    }