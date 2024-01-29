import java.util.Scanner;

public class MoreGPT {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Keep reading words until there are no more
            while (scanner.hasNext()) {
                String word = scanner.next();  // Read the next word
                System.out.println("Read: " + word);
            }

            scanner.close();  // Close the scanner when done
        }
    }


