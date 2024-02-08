public class average {

    public static int getAverage(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total/numbers.length;
    }

    public static int[] getDifferance(int[] numbers){
        int avg = getAverage(numbers);
        int[] diffs = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            diffs[i] = avg - numbers[i];
        }
        return diffs;

    }
    
    public static String ArrayString(int[] numbers){
        String output = "{";
        for (int i = 0; i < numbers.length-1; i++) {
            String a = numbers[i]+",";
            output += a;
        }
        output += numbers[numbers.length-1]+"}";
        return output;
    }

}
