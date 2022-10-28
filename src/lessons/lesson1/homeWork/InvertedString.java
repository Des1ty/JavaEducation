package lessons.lesson1.homeWork;

public class InvertedString {
    public static void main(String[] args) {
        System.out.println(invertString("HELLO"));
    }

    public static String invertString(String str) {
        String rsl = "";
        for (int i = 0; i < str.length(); i++) {
            rsl = str.charAt(i) + rsl;
        }
        return rsl;
    }
}
