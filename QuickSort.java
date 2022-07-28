public class QuickSort {

    public static int partition(int array[], int low , int high) {
        int pivot = array[high]; 
        int ptr = low-1; // left 
        for(int k =low;k<high;k++) {
            if(pivot>array[k] ) {
                ptr++;
                int temp = array[ptr];
                array[ptr]= array[k];
                array[k]=temp;
            }
        }
        ptr++;
        int temp =array[ptr];
        array[ptr]= array[high];
        array[high]=temp;
        return ptr;

    }
    public static void quickSort(int array[], int low, int high ) {
        if(low<high) {
            int partIndex = partition(array , low ,high);
            quickSort(array ,low , partIndex-1); // left array recursion
            quickSort(array, partIndex+1 , high);
        }

    }
    public static void main(String[] args) {
        // Quick Sort
        int array []= {45,13,23,9,54,23,67,4,22};
        quickSort(array ,0 , array.length-1);

    }
}

