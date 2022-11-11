import java.util.Scanner;

public class ArrayExample {
    public static int findOccurence(int elem[], int k) {
        int xOcc = 0;
        int len = elem.length;
        for (int i = 0; i <= len - 1; i++) {
            if (elem[i] == k) {
                xOcc++;
            }
        }
        return xOcc;
    }

    public static void displayArray(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void modifyArray(int array[], int k) {
        k = 40;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void replaceArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        String array[] = {
                "Vishal",
                "Newton",
                "FSD",
                "fULL stack"
        };
        // getting the length of the array
        int len = array.length; // array if zero based indexing so traversing all the array of element you have
                                // upper limit is lenght-1
        // accessing first element
        String firstIndexValue = array[0]; // =>0 => 1=>2=>3
        String lastElementOfArray = array[len - 1];

        for (int i = 0; i <= len - 1; i++) {
            System.out.print(array[i]);
        }
        int elements[] = {
                6, 7, 7, 6, 8, 9, 10, 9, 9, 10, 18
        };
        // int occurrence = findOccurence(elements, 18);
        // System.out.println(occurrence);
        int k = 30;
        displayArray(elements);
        // modifyArray(elements, k);
        System.out.println();
        displayArray(elements);

        replaceArray(elements);

        displayArray(elements);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arrayInput[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter the element for index: " + i + " 10 ");
            arrayInput[i] = sc.nextInt();
        }

        System.out.println("Array output");
        displayArray(arrayInput);

    }
}

// Array =>
// given a array of element find the occurrence of given element

// [4,5,2,6,8,9,7,2,1,4,4,2,2,4,4,5]
// int k = 5
// int k=4

// Array is reference variable

// int , boolean , double , float , biginteger , long , long , char

// [4,5,6,8,10,12,17,18] => [0 ,1,0,0,0,0,1,0]
// if element of array is even replace with 0 else replace with 1 and print the
// array
