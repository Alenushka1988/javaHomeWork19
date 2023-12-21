import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2){
            array[i] = 0;
        }
    }
}