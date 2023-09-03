
public class Arrays {
    public static void main(String[] args) {
        int[] mass = new int[100];
        printArrays(loadArray(mass));
    }
     static int[] loadArray(int[] mass) {
         for (int i = 1, currenIndex = 0; currenIndex < mass.length; i++) {
             if (i % 13 == 0 || i % 17 == 0) {
                 mass[currenIndex++] = i;
               //  currenIndex++; можно инкрементировать ++ как в строчке выше,
                 //  тк по началу все равно идет операция присваивания, а затем ++
             }
         }
         return mass;
     }
    public static void printArrays (int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + ", ");
        }
    }
}

