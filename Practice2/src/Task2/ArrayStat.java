package Task2;

public class ArrayStat {

    public static int findMin(int[] array) {
        validate(array);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int findMax(int[] array){
        validate(array);
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    public static double calculateAvg(int[] array){
        validate(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum/array.length;
    }

    private static void validate(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
    }

}
