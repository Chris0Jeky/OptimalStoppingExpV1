import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        input.hasNextInt();
        int length = 40;

        // print the list
        System.out.println(addRandomNumbers(length));
        // create a function that returns an integer given the percentage of a number
        int percentage = 33;
        int number = 40;
        System.out.println(percentage(number, percentage));

        // create a scanner to take in input from user



    }

    private static int percentage(int number, int percentage) {
        return (number * percentage) / 100;
    }

    private static ArrayList<Integer> addRandomNumbers(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add((int) (Math.random() * 100) + 1);
        }
        return list;
    }
}