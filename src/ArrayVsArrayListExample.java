import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayListExample {
    public static void main(String[] args) {
        String[] colors = new String[4];
        colors[0] = "Blue";
        colors[1] = "Green";
        colors[2] = "Red";
        colors[3] = "Orange";

        ArrayList<String> colorsList = new ArrayList<>();
        for (int i = 0; i < colors.length; i++) {
            colorsList.add(colors[i]);
        }
        System.out.println(Arrays.toString(colors));
        System.out.println(colorsList);

        // Additional Exercise: Add and Remove Elements
        // Add another color
        // TODO: Your code for adding another color goes here

        // Remove the color "Green"
        // TODO: Your code for removing the color "Green" goes here

        // Print the updated array and ArrayList
        System.out.println("Updated Array: " + Arrays.toString(colors));
        System.out.println("Updated ArrayList: " + colorsList);
    }
}