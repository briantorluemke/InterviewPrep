import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

         for (int i = 0; i<=10; i++) {
            numbers.add(i);
        }

        System.out.println("First number = " + numbers.get(0));

         for (Integer number: numbers) {
             System.out.println(number);
         }
        // Displaying elements
        System.out.println("Original ArrayList: " + numbers);

        // Updating an element
        numbers.set(2, 10);
        System.out.println("ArrayList after updating: " + numbers);

        // Removing an element
        numbers.remove(4);
        System.out.println("ArrayList after removing: " + numbers);

        // Checking if an element exists
        boolean containsElement = numbers.contains(3);
        System.out.println("Does ArrayList contain 3? " + containsElement);

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);





        List<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        // Display original list
        System.out.println(colors);

        // Update one color on the list
        colors.set(0, "Rojo");

        // Remove one color from the list
        try {
            colors.remove(9);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finished color removal.");
        }


        // Check if a specific color exists in the list
        boolean hasColor = colors.contains("Green");
        System.out.println("Does it contain green? " + hasColor);

        // Print new list
        System.out.println(colors);

        // Print the final size of the list
        System.out.println("Size of the list: " + colors.size());
    }


}
