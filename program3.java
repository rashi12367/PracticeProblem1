import java.util.*;

public class program3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomValues = new int[5];
        for (int i = 0; i < 5; i++) {
            randomValues[i] = rand.nextInt(900) + 100;
        }
        
       
        System.out.println("Random values:");
        for (int value : randomValues) {
            System.out.println(value);
        }
        int minValue = randomValues[0];
        int maxValue = randomValues[0];
        
        for (int value : randomValues) {
            if (value < minValue) {
                minValue = value;
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }
        
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}
