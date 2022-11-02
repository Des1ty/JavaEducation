package lessons.lesson1.homeWork;

public class SortBubble {
    public static void main(String[] args) {
        int[] numbs = {1, 4, 3, 2, 5};
        for (int numb : numbs) {
            System.out.print(numb + " ");
        }
        sortBubble(numbs);
        System.out.println();
        for (int numb : numbs) {
            System.out.print(numb + " ");
        }
    }
    public static void sortBubble(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = numbs.length - 1; j > i; j--) {
                if (numbs[j - 1] > numbs[j]) {
                    int tmp = numbs[j - 1];
                    numbs[j - 1] = numbs[j];
                    numbs[j] = tmp;
                }
            }
        }
    }
}
