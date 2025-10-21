import java.util.Scanner;
import java.nio.file.Paths;

public class PrintFile {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = prompt.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
