import java.io.BufferedReader;
import java.io.InputStreamReader;

class InsertionSort {

    public static void main(String[] args) {
        // Read input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] A = input.lines().mapToInt(i -> Integer.parseInt(i)).toArray();

        A = insertionSort(A);

        // Print result
        for (int num : A) {
            System.out.println(num);
        }
    }

    static int[] insertionSort(int[] A) {
        int n = A.length; 
        for (int i = 1; i < n; i++) {
            int j = i; 
            while (j > 0 && A[j-1] > A[j]) {
                int temp = A[j-1];
                A[j-1] = A[j];
                A[j] = temp;

                j = j-1;
            }
        }
        return A;
    }
}