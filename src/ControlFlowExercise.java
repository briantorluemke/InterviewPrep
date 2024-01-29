import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = sc.nextInt();

        if (input%2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }
}
