class Solution{
     static int  count [];
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        count = new int[nums.length]; 
        int indexes [] = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            indexes[i] =i;
        }
        mergeSort(nums , indexes , 0,  nums.length-1);
        for(int k=0;k<count.length;k++){
            result.add(count[k]);
        }
        return result;
    }


    public static void mergeSort(int nums[] , int indexes[] , int start , int end) {
        if(start>=end) {
            return;
        }
        int mid  = (start+end)/2;
        mergeSort(nums, indexes, start , mid);
        mergeSort(nums, indexes, mid+1, end);
        merge(nums, indexes, start, end);
    }
    public static void merge(int nums[] , int indexes [] ,int start , int end) {
        int mid = (start+end)/2;
        int li = start ; 
         int ri = mid+1;
         int scount = 0;
         int i =0;
         int [] latest_index = new int [end-start +1];
         while(li<=mid && ri<=end) {
             if(nums[indexes[ri]]< nums[indexes[li]]){
                 latest_index[i] = indexes[ri];
                    scount++;
                    ri++;
             }else {
                 latest_index[i]= indexes[li];
                 count[indexes[li]]+=scount;
                 li++;
             }
             i++;
         }

         while(li<=mid){
             latest_index[i]=indexes[li];
             count[indexes[li]]+=scount;
             li++;
             i++;
         }
         while(ri<=end) {
             latest_index[i]= indexes[ri];
             ri++;
             i++;
         }
         for( int p = start ; p<=end; p++) {
             indexes[p] = latest_index[p-start];
         }

        
    }
}
