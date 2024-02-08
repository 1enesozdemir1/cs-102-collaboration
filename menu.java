import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the random array: ");
        arraySize = scanner.nextInt();
        scanner.close();
    }
}