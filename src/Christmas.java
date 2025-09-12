public class Christmas {
    public static void main (String[] main) {
        printTriangle(5);
    }

    public static void printStars(int number) {
        while (number != 0) {
            System.out.print('*');
            number--;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        while (number != 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int count = size;
        for (int i = 1; i < 2 * size + 1; i = i + 2) {
            printSpaces(count);
            printStars(i);
            count--;
        }
        for(int i = 1; i < 3; i++) {
            printSpaces(size-1);
            printStars(3);
        }
    }
}
