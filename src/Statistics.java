import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        while (true) {
            System.out.print("Please enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            else if (num % 2 == 0) {
                statisticsEven.addNumber(num);
            }
            else if (num % 2 != 0) {
                statisticsOdd.addNumber(num);
            }
            statistics.addNumber(num);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}

