/*import java.util.ArrayList;
import java.util.Scanner;

public class Bogus {

    // creates an ArrayList of random integers and assigns it to the variable 'list'
    ArrayList<Integer> list = addRandomNumbers();
        System.out.println(list);
        System.out.println();

    //call the function researchAndExploit and pass the list and the optimal stopping point
    researchAndExploit(list, percentageToActual(list.size()));



    // function that implements the research and exploit algorithm
    private static void researchAndExploit(ArrayList<Integer> list, int optimalStoppingPoint) {
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
                // if yes then print a message
                System.out.println("Found a better or equal value at index " + i);
                System.out.println("The value is " + list.get(i));
                return;
            }
        }
        //if no better value is found
        System.out.println("No better or equal value found");
        // set the highestValue as the last value of the list
        highestValue = list.get(list.size() - 1);
        System.out.println("The highest value is " + highestValue);
    }

    // function that takes the percentage of the list and converts it to an actual number
    private static int percentageToActual() {
        Scanner input = new Scanner(System.in);
        // ask the user for the length of the list
        System.out.println("Enter the length of the list: ");
        int length = input.nextInt();
        // ask the user for the percentage of the list
        System.out.println("Enter the percentage of the list: ");
        int percentage = input.nextInt();
        return (length * percentage) / 100;
    }

    private static int percentageToActual(int length) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage of the list: ");
        int percentage = input.nextInt();
        return (length * percentage) / 100;
    }



    private static ArrayList<Integer> addRandomNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int length = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * 100) + 1);
        }
        return list;
    }

    private static ArrayList<Integer> addRandomNumbers(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * 100) + 1);
        }
        return list;
    }
} */
