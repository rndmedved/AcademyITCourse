package lesson11.star;

public class Main {
    public static void main(String[] args) {
        char star = 0x2605;
        StringBuilder builder = new StringBuilder();
        String test = "test";
        for (int i = 0; i < test.length(); i++) {
            builder.append(star);
        }
        System.out.println(builder + test + builder);

    }
}
