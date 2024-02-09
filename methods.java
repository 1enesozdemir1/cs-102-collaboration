import java.util.Random;

public class methods {

    public static int getAverage(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total / numbers.length;
    }

    public static int[] getDifferance(int[] numbers) {
        int avg = getAverage(numbers);
        int[] diffs = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            diffs[i] = avg - numbers[i];
        }
        return diffs;
    }

    public static int getMinimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (min >= numbers[i]){
                min = numbers[i];
            }
        }
    }

    public static int getMaximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (max <= numbers[i]){
                max = numbers[i];
            }
        }
    }
    
    public static String arrayString(int[] numbers) {
        String output = "{";
        for (int i = 0; i < numbers.length - 1; i++) {
            String a = numbers[i] + ",";
            output += a;
        }
        output += numbers[numbers.length - 1] + "}";
        return output;
    }

    public static int[] generateArray(int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(0, 101);
        }
        return array;
    }
}
