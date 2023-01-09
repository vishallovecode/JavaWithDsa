package vishal2;

import java.util.Arrays;

public class firstAndLastoccurrence {
    public static int firstOcc(int array [] , int start , int end , int target) {
        int mid   = (start+end)/2;
        if(start>end) {
            return -1;
        }
        if(array[mid]==target && (mid==0 || array[mid-1]!=target)) {
            return mid;
        } 
        else if(array[mid]>target) {
            return firstOcc(array ,start , mid-1, target );
        } else {
            return firstOcc(array ,mid+1 ,end , target );
        }


}
public static int lastOcc(int array [] , int start , int end , int target , int n) {
    int mid   = (start+end)/2;
    if(start>end) {
        return -1;
    }
    if(array[mid]==target && (mid==n-1 || array[mid+1] !=target)) {
        return mid;
    } 
    else if(array[mid]>target) {
        return lastOcc(array ,start , mid-1, target ,n );
    } else {
        return lastOcc(array ,mid+1 ,end , target ,n );
    }


}
public static void main(String[] args) {
    int array[] = {1,2,3,4,5,5,5,5,6};
    int array1[] = {-1,-1};
    if(array.length==0) {
            System.out.println(Arrays.toString(array1));
    } else {
        int first  =  firstOcc(array, 0, array.length-1, 5);
        int lastOcc =  lastOcc(array, 0, array.length-1, 5, array.length);
        array1[0] = first;
        array1[1] = lastOcc;
        System.out.println(first + "" +lastOcc);
        // occurence of given element in sorted array
        int occurrence = lastOcc - first+1;
        System.out.println(Arrays.toString(array1) );
    }
}
}
package vishal2;

import java.util.Arrays;

public class firstAndLastoccurrence {
    public static int firstOcc(int array [] , int start , int end , int target) {
        int mid   = (start+end)/2;
        if(start>end) {
            return -1;
        }
        if(array[mid]==target && (mid==0 || array[mid-1]!=target)) {
            return mid;
        } 
        else if(array[mid]>target) {
            return firstOcc(array ,start , mid-1, target );
        } else {
            return firstOcc(array ,mid+1 ,end , target );
        }


}
public static int lastOcc(int array [] , int start , int end , int target , int n) {
    int mid   = (start+end)/2;
    if(start>end) {
        return -1;
    }
    if(array[mid]==target && (mid==n-1 || array[mid+1] !=target)) {
        return mid;
    } 
    else if(array[mid]>target) {
        return lastOcc(array ,start , mid-1, target ,n );
    } else {
        return lastOcc(array ,mid+1 ,end , target ,n );
    }


}
public static void main(String[] args) {
    int array[] = {1,2,3,4,5,5,5,5,6};
    int array1[] = {-1,-1};
    if(array.length==0) {
            System.out.println(Arrays.toString(array1));
    } else {
        int first  =  firstOcc(array, 0, array.length-1, 5);
        int lastOcc =  lastOcc(array, 0, array.length-1, 5, array.length);
        array1[0] = first;
        array1[1] = lastOcc;
        System.out.println(first + "" +lastOcc);
        // occurence of given element in sorted array
        int occurrence = lastOcc - first+1;
        System.out.println(Arrays.toString(array1) );
    }
}
}
