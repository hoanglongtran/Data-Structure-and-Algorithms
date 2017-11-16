/*
  RMIT University Vietnam
  Course: COSC2658 Data Structures & Algorithms
  Semester: 2017C
  Assignment: 1
  Author: Long Hoang Tran
  ID: s3635165
  Created date: 17/11/2017

 Acknowledgement: https://stackoverflow.com/questions/4632322/finding-all-possible-combinations-of-numbers-to-reach-a-given-sum
                  https://www.youtube.com/watch?v=NdF1QDTRkck

*/

import java.util.*;
public class Combinations {
    //public static int currentSum = 0;
    private static ArrayList<Integer> usedNumb = new ArrayList<>();
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
            int[] newReducedArray = Arrays.copyOfRange(arr, 1 + i , arr.length);
            if (sum - arr[i] == 0){
                usedNumb.add(arr[i]);
                System.out.println(Arrays.toString(usedNumb.toArray()));
                usedNumb.remove(usedNumb.size() - 1);
            }
            if(sum < arr[i] ){
                continue;
            }
            usedNumb.add(arr[i]);
            if(sum - arr[i] > 0){
                printCombinations(newReducedArray, sum - arr[i]);
            }
            usedNumb.remove(usedNumb.size() -1 );
        }
    }
}
