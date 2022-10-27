package lessons.lesson1.homeWork;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(findIndex(num));
    }

    public static int findIndex(int num) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10));
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
