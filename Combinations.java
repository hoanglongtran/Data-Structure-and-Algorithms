package Assignments;
import java.util.*;
public class Combinations {
    public static void main(String[] args) {

        System.out.printf("Please enter the array:");
        int[] a = {1};
        ArrayList<Integer> soFar = new ArrayList<>();
        printCombinations(soFar,a);
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
    public static void printCombinations(ArrayList<Integer> current, int[]arr ) {
        if (arr.equals(0)){
            System.out.println(current);
        }
        else {

            printCombinations(new ArrayList<Integer>(current) {{ add(arr[0]); }}, Arrays.copyOfRange(arr, 1, arr.length) );

            printCombinations(current, Arrays.copyOfRange(arr, 1, arr.length));
        }

    }

}
