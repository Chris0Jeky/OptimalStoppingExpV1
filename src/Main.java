import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the length of the list: ");
        int length = new Scanner(System.in).nextInt();
        System.out.println("Enter the percentage of the list: ");
        int percentage = new Scanner(System.in).nextInt();
        ArrayList<Integer> list = addRandomNumbers(length);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        System.out.println(list);
        System.out.println();
        System.out.println(researchAndExploit(list, percentageToActual(length, percentage)));
        addValuesToList(length, percentageToActual(length, percentage));
        System.out.println(matrix);


    }

    private static ArrayList<ArrayList<Integer>> addToMatrix(ArrayList<ArrayList<Integer>> matrix, int length, int percentage, int matrixLength) {
        for (int i = 0; i < matrixLength; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < percentage; j++) {
                list.add(j);
            }
            matrix.add(list);
        }
        ArrayList<Integer> list = addValuesToList(length, percentage);
        matrix.add(list);
        return matrix;
    }



    private static ArrayList<Integer> addValuesToList (int length, int optimalStoppingPoint) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            ArrayList<Integer> randomList = addRandomNumbers(length);
            list.add(researchAndExploit(randomList, optimalStoppingPoint));
        }
        return list;
    }

    private static int researchAndExploit(ArrayList<Integer> list, int optimalStoppingPoint) {
        //create a variable called highestValue and initialize it to 0
        int highestValue = 0;
        // loop through the list from 0 to the optimal stopping point
        for (int i = 0; i < optimalStoppingPoint && i < list.size(); i++) {
            // check if the current value is higher than the highestValue
            if (list.get(i) > highestValue) {
                // if yes then set the highestValue as the current value
                highestValue = list.get(i);
            }
        }
        //loop through the list from the optimal stopping point to the end
        for (int i = optimalStoppingPoint; i < list.size(); i++) {
            // check if the current value is greater or equal to the highestValue
            if (list.get(i) >= highestValue) {
                return list.get(i);
            }
        }
        //if no better value is found
        // set the highestValue as the last value of the list
        highestValue = list.get(list.size() - 1);
        return highestValue;
    }

    private static ArrayList<Integer> addRandomNumbers(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * 100) + 1);
        }
        return list;
    }

    private static int percentageToActual(int length, int percentage) {
        return (length * percentage) / 100;
    }
}