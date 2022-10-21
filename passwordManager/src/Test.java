import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;


public class Test {
    static Random random = new Random();

    // первый заполнили - второй пропустили -
    // вторые два заполнили - вторые два пропустили -
    // следующие ТРИ заполнили - ТРИ пропустили
    // ИТД

    // Функция Сергея
    static int[] fillMassive(int[] array) {
        int index = 0;
        int quantityFill = 1;
        // Первый вариант
        for (index = 0; index < array.length; index+= quantityFill - 1) {
            for (int i = quantityFill; i != 0 && index < array.length; i--) {
                array[index] = random.nextInt(1, 2);
                ++index;
            }
            ++quantityFill;  // итерация - на первой - заполяем один, на второй заполняем два
        }
//        Второй вариант
//        while (index < array.length) {
//            for (int i = quantityFill; i != 0 && index < array.length; i--) {
//                array[index] = random.nextInt(1, 2);
//                ++index;
//            }
//            index += quantityFill;
//            ++quantityFill;  // итерация - на первой - заполяем один, на второй заполняем два
//        }
        return array;
    }
    // Функция Елены
    static int[] fillArray(int[] array) {
        Random random = new Random();
        int[] array1 = new int[array.length];
        int count = 1;
        int startPos = 0;
        int lastPos = 1;
        while (startPos < array1.length) {
            for (int i = startPos; i < lastPos; i++) {
                array1[i] = random.nextInt(1,2);
            }
            startPos = lastPos + count;
            count++;
            lastPos = startPos + count;
            if (lastPos >= array1.length) {
                lastPos = array1.length;
            }
        }
        return array1;
    }

    static void test(long[] Sergey, long[] Elena) {
        System.out.println("Result Sergey = " + Arrays.toString(Sergey));
        System.out.println("Result Elena  = " + Arrays.toString(Elena));

        int fast = 0;
        int slow = 0;
        int equals = 0;
        for (int i = 0; i < Sergey.length; i++) {
            if (Sergey[i] < Elena[i]) {
                ++fast;
            } else if (Sergey[i] > Elena[i]) {
                ++slow;
            }
            else ++equals;
        }
        System.out.println("Fast = " + fast);
        System.out.println("Slow = " +slow);
        System.out.println("Equal = " + equals);
    }

    static long[] runElena(int timeCycle, int functionCycle) {
        long[] result = new long[timeCycle];
        Instant start = Instant.now();
        for (int j = 0; j < timeCycle; j++) {
            for (int i = 0; i < functionCycle; i++) {
                int[] testArray = new int[i];
                fillArray(testArray);
            }
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            result[j] = elapsed;
        }
        return result;
    }
    static long[] runSergey(int timeCycle, int functionCycle) {
        long[] result = new long[timeCycle];
        Instant start = Instant.now();
        for (int j = 0; j < timeCycle; j++) {
            for (int i = 0; i < functionCycle; i++) {
                int[] testArray = new int[i];
                fillMassive(testArray);
            }
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            result[j] = elapsed;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sergey - Elena");
        test(runSergey(20, 10000), runElena(20, 10000));
//        runSergey(20, 40);
    }
}