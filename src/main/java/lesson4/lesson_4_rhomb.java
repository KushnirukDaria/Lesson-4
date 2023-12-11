package lesson4;

public class lesson_4_rhomb {
    public static void main(String[] args) {

        int rows = 5;
        int i = 1;

        while (i <= 2 * rows - 1) {
            int j = i <= rows ? i : 2 * rows - i;
            int spaces = rows - j;

            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * j - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}