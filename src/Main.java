import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = addRandomNumbers();
        System.out.println(list);
        System.out.println();

        //create function called researchAndExploit
        researchAndExploit(list, percentageToActual(list.size()));


    }

    private static void researchAndExploit(ArrayList<Integer> list, int optimalStoppingPoint) {
        int highestValue = 0;
        for (int i = 0; i < optimalStoppingPoint && i < list.size(); i++) {
            if (list.get(i) > highestValue) {
                highestValue = list.get(i);
            }
        }
        for (int i = optimalStoppingPoint; i < list.size(); i++) {
            if (list.get(i) >= highestValue) {
                System.out.println("Found a better or equal value at index " + i);
                System.out.println("The value is " + list.get(i));
                return;
            }
        }
        System.out.println("No better or equal value found");
        highestValue = list.get(list.size() - 1);
        System.out.println("The highest value is " + highestValue);
    }

    private static int percentageToActual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int length = input.nextInt();
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
}