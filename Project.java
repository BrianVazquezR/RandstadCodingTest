import java.util.Scanner;

public class Project{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int X = scanner.nextInt(); // Size of the list
        int Y = scanner.nextInt(); // Number of operations
        int[] list = new int[X + 1]; // Initialize the list (index 1-based)

        int max = 0; // Initialize max to 0

        // Perform operations
        for (int i = 0; i < Y; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int value = scanner.nextInt();

            // Update the range [left, right] with the value
            list[left] += value;
            if (right + 1 <= X) {
                list[right + 1] -= value;
            }
        }

        // Calculate the maximum value after all operations
        int current = 0;
        for (int i = 1; i <= X; i++) {
            current += list[i];
            max = Math.max(max, current);
        }

        // Print the maximum value
        System.out.println(max);

        scanner.close();
    }
}