import java.util.Arrays;

public class BubbleSort {

    public  static void printMyArray(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ ",");
        }
    }
    public static void main(String[] args) {
        int array [] = {7,8,3,12,21,14,2,90,5,16,12,1};
      
        // Bubble Sort 
        for(int i= 0 ;i<array.length;i++){ 
          
          // loop for comparing adjacent element
            for(int j = 0; j<array.length-i-1;j++) {
              // comparing if right side of current element is smaller is yes swap it
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        // System.out.println(Arrays.toString(array)); // This is converting array into string 
        printMyArray(array);
    }
}

