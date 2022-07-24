import java.util.Arrays;

public class SelectionSort {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = { 21, 16, 34, 17, 4, 1, 78 };

        // Iteration till length-1
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            // iteration for comparing element and finding the i+1 th smallest element;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        // System.out.println(Arrays.toString(array)); // it will convert array into
        // string
        printArray(array);
    }
}
