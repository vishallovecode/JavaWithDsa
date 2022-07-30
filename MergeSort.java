import java.util.Arrays;

public class MergeSort {

    public static void merge(int array [], int start , int mid , int end) {
        int combinedarray [] = new int [end-start+1];
        int  i= start;
        int j =  mid+1;
        int k =0;
        while(i<=mid && j<=end) {
            if(array[i]<=array[j]){
                combinedarray[k] = array[i];
                k++;
                i++;
            } else {
                combinedarray[k]= array[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            combinedarray[k]= array[i];
            k++;
            i++;
        } 
        while(j<=end) {
            combinedarray[k] = array[j];
            k++;
            j++;
        } 

        for( int  r= 0, p=start;r<combinedarray.length;r++ ,p++) {
            System.out.println(combinedarray[r]+ "==" + p);
            array[p]= combinedarray[r];
        }

    }
    public static void mergeSort(int array[], int start , int end) {
        if(start>=end) {
            return ;
        }
        int mid  = start +(end-start)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid+1, end);
        merge(array ,start, mid , end);

    } 
    public static void main(String[] args) {
     int array []  = {4,5,11,2,1,34,54,12,18};
     mergeSort(array, 0, array.length-1);
     System.out.println(Arrays.toString(array));
    }
}
