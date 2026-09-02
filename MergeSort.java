
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MergeSort {

    public static void main(String[] args) {
        // Read input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] A = input.lines().mapToInt(i -> Integer.parseInt(i)).toArray();

        A = mergeSort(A);

        System.out.println();
        // Print result
        for (int num : A) {
            System.out.println(num);
        }
    }
    

    static int[] mergeSort(int[] tall) { //rekursjon hvor de deles
        int n = tall.length;
        if (n <= 1) {
            return tall;
        }
        int i = (int) Math.ceil(n/2); // dele og runde opp til nærmeste heltall

        int[] del1 = Arrays.copyOfRange(tall, 0, i);
        int[] del2 = Arrays.copyOfRange(tall, i, n);

        del1 = mergeSort(del1);
        del2 = mergeSort(del2);

        return merge(tall, del1, del2);
    }

    static int[] merge(int[] tall, int[] del1, int[] del2) { // funksjonen hvor de flettes
        int i = 0; 
        int j = 0;

        while (i < del1.length && j < del2.length) {
            if (del1[i] <= del2[j]) {
                tall[i+j] = del1[i]; 
                i = i+1;
            } else {
                tall[i+j] = del2[j];
                j = j+1;
            }
        }
        
        while (i < del1.length) {
            tall[i+j] = del1[i];
            i = i+1;
        }

        while (j < del2.length) {
            tall[i+j] = del2[j];
            j = j+1;
        }
    
    
        return tall;   
    }
}

    
