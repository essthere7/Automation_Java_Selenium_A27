package homework;

public class App4 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Before sorting");
        printArray(arr); // calling printArray before sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int b = i+1; b < arr.length; b++) {
                if (arr[i] > arr[b]) {
                    int temp = arr[i];
                    arr[i] = arr[b];
                    arr[b] = temp;
                }
            }
        }
        System.out.println("After sorting");
        printArray(arr); // calling printArray after sorting

    }

    public static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();


    }

}
