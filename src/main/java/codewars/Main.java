package codewars;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringy(12));
    }

    public static String stringy(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            builder.append(i % 2 == 0 ? "0" : "1");
        }
        return builder.toString();
    }
}
