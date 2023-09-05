public class KvKor {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 2;
        int d = discriminant(a, b,c);
        findX(d,a,b,c);
    }
    public static void findX (int d, int a, int b, int c) {
        double x1 = (-b + ((double)Math.sqrt(Math.abs(d))))/2*a;
        System.out.println("Значение 1-го корня: " + x1);
        if (d > 0) {
            double x2 = (-b - ((double)Math.sqrt(Math.abs(d))))/2*a;
            System.out.println("Значение 2-го корня: " + x2);
        }
    }
    public static int discriminant(int a, int b, int c) {
        return ((int) Math.pow(b,2)) - 4*a*c;
    }

}


