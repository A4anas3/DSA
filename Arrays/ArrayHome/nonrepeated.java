import java.util.Scanner;

public class nonrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size = ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.print("Enter the values = ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        // Array to store counts of elements
        int[] counts = new int[size];
        // First pass to count occurrences of each element
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (list[i] == list[j]) {
                    counts[i]++;
                }
            }
        }

        // Second pass to find the first non-repeating element
        for (int i = 0; i < size; i++) {
            if (counts[i]==1) {
                System.out.println("Output is = " + list[i]);
              // return;
            }
        }

        System.out.println("No non-repeating element found.");
    }
}
