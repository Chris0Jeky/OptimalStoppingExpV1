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
        matrix = addToMatrix(matrix, 100, 0, 100);

        matrixAnalysis(matrix);


    }

    /*
    This block of code defines a method called "matrixAnalysis" which takes in a 2D ArrayList of integers as an input.
    Within the method, a for-each loop is used to iterate over each ArrayList within the matrix
    Within the loop, a Double variable called "average" is defined and assigned the average value of the integers in the current ArrayList
    The average value is then printed to the console
     */
    private static void matrixAnalysis (ArrayList<ArrayList<Integer>> matrix){
        for (ArrayList<Integer> listOfInts: matrix) {
            Double average = listOfInts.stream().mapToInt(val -> val).average().orElse(0.0);
            System.out.println(average);
        }
    }


    /*
    This block of code defines a method called "addToMatrix" which takes in a 2D ArrayList of integers, an integer length, an integer percentage, and an integer matrixLength as inputs
    Within the method, a for loop is used to iterate over a range of values from 0 to matrixLength
    Within the loop, an integer variable called "optimalStoppingPoint" is defined and assigned the value of a method called "percentageToActual" which takes in the length and percentage + i as inputs
    A new ArrayList of integers is defined and assigned the value of a method called "addValuesToList" which takes in the length and optimalStoppingPoint as inputs
    The newly created ArrayList is then added to the input matrix
    The input matrix is then returned as output.

     */
    private static ArrayList<ArrayList<Integer>> addToMatrix(ArrayList<ArrayList<Integer>> matrix, int length, int percentage, int matrixLength) {
        for (int i = 0; i < matrixLength; i++) {
            int optimalStoppingPoint = percentageToActual(length, percentage + i);
            ArrayList<Integer> list = addValuesToList(length, optimalStoppingPoint);
            matrix.add(list);
        }
        return matrix;
    }

    //This method creates an empty ArrayList of integers called "list" and then iterates through a loop that runs "length" times.
    //On each iteration, it creates another ArrayList of integers called "randomList" by calling the addRandomNumbers method, passing the length as a parameter.
    //It then adds the result of calling the researchAndExploit method, passing both the randomList and the optimalStoppingPoint as parameters, to the "list" ArrayList.
    //Finally, the method returns the "list" ArrayList with all the added values.
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