public class BinarySeach {
            public static int binarySearch(int array[], int target, int start, int end) {
                int mid = Math.round((start+end)/2);
                if(array[mid]==target) {
                    return mid;
                }
                if(array[mid]> target) {
                    return binarySearch(array, target, start, mid-1);
                } else {
                    return binarySearch(array, target, mid+1, end);
                }
            }
            public static void main(String[] args) {
                int array[] =  {18,19,23,45,67,89,98,102,123,456};
                int start  = 0;
                int end  = array.length-1;
               
                int index =  binarySearch(array, 123, start, end);
                if(index==-1) {
                    System.out.println("Element not found");
                } else {
                    System.out.println("Element found: " + index);
                }
                
            
            }
}
