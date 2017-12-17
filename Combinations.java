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
package Assignments;
import java.util.*;
public class Combinations {
    //public static int currentSum = 0;
    private static ArrayList<Integer> usedNumb = new ArrayList<>(); //Create a data field as an arraylist to be used by the method
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
        for (int i = 0; i < arr.length; i++){   //
            if (sum - arr[i] == 0){ //If the subtraction results in 0, print out all the elements inside the List plus the current element in the array
                usedNumb.add(arr[i]); //This insert the element into the arrayList in order to display everything within the brackets
                System.out.println(Arrays.toString(usedNumb.toArray()));
                usedNumb.remove(usedNumb.size() - 1); //Remove the current element after printing out
            }
            if(sum < arr[i] ){  //If the current number is larger than the sum, skip the iteration
                continue;
            }
            int[] newReducedArray = Arrays.copyOfRange(arr, 1 + i , arr.length); //Create a new array that will be used for the next recursion
            usedNumb.add(arr[i]);   //Add the current element into the List
            if(sum - arr[i] > 0){   //If the sum subtracts the current array doesn't equal 0, hold the current elements inside the arrayList and call the method again to check for the next element
                printCombinations(newReducedArray, sum - arr[i]); // Subtract the sum with the current array element
            }
            usedNumb.remove(usedNumb.size() -1 );   //If there is no suitable next element that sum with the elements inside the arrayList to be equal 0, remove the last one and jump back for the next iteration
        }
    }
}
