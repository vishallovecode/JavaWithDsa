public class SlidingWindowTechniqueMaximumSubarray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 6, 7, 8, 9, 12 };
        int maximumSum = 0;
        int k = 3;
        int latest_sum = 0;
        // sum of first k the element
        for (int i = 0; i < k; i++) {
            latest_sum = latest_sum + array[i];
        }
        maximumSum = latest_sum;
        for (int j = k; j < array.length; j++) {
            latest_sum = latest_sum + array[j] - array[j - k];
         // sum of next kth element will be sum of last three element + next one element and removing forst element of window
            maximumSum = Math.max(maximumSum, latest_sum);
        }
        System.out.println("Maximum Sum " + maximumSum);

    }

}
