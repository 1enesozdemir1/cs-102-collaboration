import java.util.Random;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i=0;i<arraySize;i++){
            array[i]= random.nextInt(0,101);
            System.out.println(array[i]);
        }
    }
}