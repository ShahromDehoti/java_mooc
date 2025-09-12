public class Stars {
    public static void main (String[] args) {
        //printStars(3);
        //printSquare(4);
        //printRectangle(17,3);
        printTriangle(4);
    }

    public static void printStars(int number) {
        while (number != 0) {
            System.out.print('*');
            number--;
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int count = size;
        while (count != 0) {
            printStars(size);
            count--;
        }
    }

    public static void printRectangle(int side1, int side2) {
        while (side2 != 0) {
            printStars(side1);
            side2--;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < size + 1; i++) {
            printStars(i);
        }
    }
}
