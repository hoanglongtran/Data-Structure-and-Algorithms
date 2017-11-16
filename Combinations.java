import java.util.*;
public class Combinations {
    //public static int currentSum = 0;
    public static ArrayList<Integer> usedNumb = new ArrayList<>();
    public static void main( String[] args ){

        int arr[] = {1, 3, 2,2};
        int arr1[] = {5,9,10,1,2,6,4,45,15};
        int arr2[] = {2,7,98,31,55,25,67,89,11};
        System.out.println("Output:");
        printCombinations(arr, 5);
        System.out.println("Output:");
        printCombinations(arr1, 10);
        System.out.println("Output:");
        printCombinations(arr2, 100);
    }

    public static void printCombinations(int[] arr, int sum){

        for (int i = 0; i < arr.length; i++){
            //System.out.println("Goal " + goal);
            //System.out.println("Current item: " + availableItems[i]);
            int[] newReducedArray = Arrays.copyOfRange(arr, 1 + i , arr.length);

            if (sum - arr[i] == 0){

                //System.out.println("Current item " + availableItems[i]);
                //usedNumb.add(arr[i]);
                usedNumb.add(arr[i]);
                System.out.println(Arrays.toString(usedNumb.toArray()));
                usedNumb.remove(usedNumb.size() - 1);
                //currentSum = 0;
                //break;
            }

            if(sum < arr[i] ){
                continue;
            }
            usedNumb.add(arr[i]);
            if(sum - arr[i] > 0){
                //currentSum += availableItems[i];

                //System.out.println("Current goal " + (goal - availableItems[i]));



                printCombinations(newReducedArray, sum - arr[i]);
            }
            usedNumb.remove(usedNumb.size() -1 );

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
