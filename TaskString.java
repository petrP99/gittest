public class TaskString {

    public static void main(String[] args) {
        String value = "Akkvf fsss92DFf ffEgas";
        System.out.println(answerUpper(value));

    }
    public static String answerUpper (String value) {
        String result = value.replace(" ", "").toUpperCase();
        StringBuilder sb = new StringBuilder(result);
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i-1)) {
                sb.deleteCharAt(i);
                i--;

            }
        }
        return sb.toString();
    }
}
