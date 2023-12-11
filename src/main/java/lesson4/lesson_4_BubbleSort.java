package lesson4;

public class lesson_4_BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {89, 77, 212, 45, 22, 67, 113};

        System.out.println("До сортування:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        bubbleSort(arr);

        System.out.println("\nПісля сортування:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
