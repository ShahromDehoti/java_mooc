import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> lst = new ArrayList<>();
//
//        while (true) {
//            int input = Integer.parseInt(scanner.nextLine());
//            if (input == -1) {
//                lst.add(-1);
//                break;
//            }
//            lst.add(input);
//        }
//        System.out.println("From where?");
//        int start = Integer.parseInt(scanner.nextLine());
//        System.out.println("To where?");
//        int end = Integer.parseInt(scanner.nextLine());
//
//        int sum = 0;
//        for (Integer integer : lst) {
//            if (integer == -1) {
//                continue;
//            }
//            sum += integer;
//        }
//        double result = (double) sum / (lst.size() - 1);
//        System.out.println(result);
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(6);
//        numbers.add(-1);
//        printNumbersInRange(numbers,0, 5);

//        System.out.println(sum(numbers));
//
//        numbers.add(5);
//        numbers.add(1);
//
//        System.out.println(sum(numbers));
        ageOfTheOldest();
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number: numbers) {
            sum += number;
        }
        return sum;
    }

    public static void ageOfTheOldest() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            ages.add(Integer.parseInt(parts[1]));
        }
    }
}
