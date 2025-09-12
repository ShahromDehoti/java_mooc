import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many times?");
//        int times = Integer.parseInt(scanner.nextLine());
//        while (times != 0) {
//            printText();
//            times--;
//        }
//        printUntilNumber(5);
//        printFromNumberToOne(5);
//        divisibleByThreeInRange(2, 10);
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i < number + 1; i++) {
            System.out.println(i);
        }
    }

    public static void printFromNumberToOne(int number) {
        while (number != 0) {
            System.out.println(number);
            number--;
        }
    }

    public static void divisibleByThreeInRange(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int smallest(int n1, int n2) {
        return Math.min(n1,n2);
    }
}
