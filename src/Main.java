import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = addRandomNumbers();
        System.out.println(list);
        System.out.println(percentageToActual(list.size()));

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