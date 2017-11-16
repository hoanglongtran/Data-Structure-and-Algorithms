
import com.sun.deploy.util.ArrayUtil;

import java.util.*;
public class Combinations {
    public static int currentSum = 0;
    public static ArrayList<Integer> usedItems = new ArrayList<>();
    public static void main( String[] args ){

        int arr[] = {1, 2, 3, 4, 2, 5};
        int sum = 6;
        printCombinations(arr, sum);
    }

    public static void printCombinations(int[] availableItems, int goal){

        for (int i = 0; i < availableItems.length; i++){
            if (currentSum + availableItems[i] == goal){
                System.out.println(Arrays.toString(usedItems.toArray()) + availableItems[i]);
                currentSum = 0;
                usedItems.clear();

            }
            if((currentSum + availableItems[i]) > goal){
                continue;
            }
            if(currentSum + availableItems[i] < goal){
                currentSum += availableItems[i];
                usedItems.add(availableItems[i]);
                int[] newAvailableItems = Arrays.copyOfRange(availableItems, 1, availableItems.length);
                printCombinations(newAvailableItems, goal);
            }
        }
    }

    /*public static void printCombinations(int arr[], int sum){
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
    }*/

}
