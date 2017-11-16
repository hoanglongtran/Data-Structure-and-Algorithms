package Assignments;
import com.sun.deploy.util.ArrayUtil;

import java.util.*;
public class Combinations {
    public static void main(String[] args) {

        System.out.printf("Please enter the array:");
        int[] a = {1, 2, 3, 4, 5};

        printCombinations(a, 4);
        //getInput();
    }
    /*public static List<Integer> getInput() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while   (in.hasNextInt()){
            int i = in.nextInt();
            input.add(i);
        }

        return input;
    }*/
    public static void printCombinations(int[]arr, int sum ) {

        List<Integer> input = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++){
            if (input.get(i) > sum){
                input.remove(i);
            }
        }
        System.out.println(input);

    }

}
