package lessons.lesson1.homeWork;

public class Convert {
    public static void main(String[] args) {
        System.out.println(decToHex(252));
    }

    public static String decToHex(int num) {
        String str = "";
        int rem;
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7',
                     '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num != 0) {
            rem = num % 16;
            num /= 16;
            str = ch[rem] + str;
            new StringBuilder(str).reverse().toString();
        }
        return str;
    }
}
