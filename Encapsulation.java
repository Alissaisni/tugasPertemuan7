package encapsulation;
import java.util.Random;

/**
 *
 * @author alissais
 */
public class Encapsulation {
    public static void main(String[] args) {
        // Membuat array dengan 100.000 angka acak
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        // Menggunakan StopWatch untuk mengukur waktu eksekusi
        stopWatch StopWatch = new stopWatch();
        StopWatch.start();

        // Melakukan pengurutan selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        StopWatch.stop();
        System.out.println("Waktu eksekusi pengurutan: " + StopWatch.getElapsedTime() + " milidetik");
    }
}
