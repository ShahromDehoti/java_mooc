import java.util.Scanner;
import java.nio.file.Paths;

public class GuestList {
    public static void main(String[] args) {
        Scanner fileName = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = fileName.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (true) {
                System.out.println("Enter names, an empty line quits.");
                Scanner input = new Scanner(System.in);
                String userInput = input.nextLine();
                if (userInput.isEmpty()) {
                    break;
                }
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.equals(userInput)) {
                        System.out.println("The name is on the list.");
                    }
                    else if (line.isEmpty()) {
                        continue;
                    }
                    else {
                        System.out.println("The name is not on the list.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
