public class GitTest {
    public static void main(String[] args) {
        StringBuilder value = new StringBuilder();;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            value.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " +(end - start));
    }
}
