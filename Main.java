import java.util.Arrays;

public class Main {

    // for printing the elements of an array 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
    // Print the elements in reverse order.
        for (int i = arr.length -1 ; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    // Find the sum of all elements.
        double avg = average(arr);
        System.out.println("average is " + avg);
        
        
    } static int sum(int[] arr) {
        int total = 0;
        for (int i = 0 ; i< arr.length ; i++){
            total += arr[i];
        }
        return total;
    }
    static double average (int[] arr) {
        double average = (int)sum(arr) / arr.length;
        return average;

    }
}
