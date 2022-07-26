public class InsertionSort {
    public static void main(String[] args) {
        int array [] = { 14 , 6, 8 ,12 , 45 ,3  ,48 , 4 , 7 , 1 };

        // insertion sort 
        for(int i = 1;i<array.length;i++) {
            int temp = array[i];
            int j = i-1;
            while(j>=0 && temp<array[j]) {
                array[j+1]= array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
