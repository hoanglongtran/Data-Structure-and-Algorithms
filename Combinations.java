
import com.sun.deploy.util.ArrayUtil;

import java.util.*;
public class Combinations {
    public static void main( String[] args ) throws Exception {
        int arr[] = {1, 3, 2 , 1};
        int sum = 4;
        printCombinations(arr, sum);
    }

    public static void printCombinations(int arr[], int sum){
        int count = 0;
        int actualSum = sum;
        while (count < arr.length) {
            int j = 0;
            int arrCollection[] = new int[arr.length];
            for (int k = 0; k < arrCollection.length; k++){
                arrCollection[k] = -99; // as the array can contain only +ve integers
            }
            for (int i = count; i < arr.length; i++) {
                sum = sum - arr[i];
                if (sum < 0){
                    sum = sum + arr[i];
                } else if (sum > 0){
                    arrCollection[j++] = arr[i];
                } else if (sum == 0){
                    System.out.println("");
                    arrCollection[j++] = arr[i];
                    int countElements = 0;
                    for (int k = 0; k < arrCollection.length; k++){
                        if (arrCollection[k] != -99) {
                            countElements++;
                            System.out.print(arrCollection[k] + " ");
                        }
                    }
                    if (countElements == 1){
                        i = arr.length -1;
                    }
                    sum = sum + arr[i];
                    j--;
                }
            }
            count++;
            sum = actualSum;
        }
    }

}
