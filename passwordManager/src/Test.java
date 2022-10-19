import java.util.Arrays;

public class Test {

    static int indexEl(int[] numbers, int findNum)
    {
        /*
        Написать функцию, которая ищет индекс элемента в массиве чисел:
        1) Принимает массив чисел и число, индекс которого надо узнать
        2) Возвращает числовое значение индекса искомого числа.

        Тесты:

        indexEl({1, 2, 3}, 1) -> 0

        indexEl({3, 1, 4}, 4) -> 2

        indexEl({1 ,2, 3}, 0) -> -1

        indexEl({2, 3, 3}, 3) -> 1

        indexEl({1}, 1) -> 0

        indexEl({1}, 0) -> -1

        indexEl({}, 3) -> -1

         */

        boolean findIndex = false;
        int index = 0;
        while (index < numbers.length)
        {
            if (numbers[index] == findNum)
            {
                findIndex = true;
                return index;
            }
            index++;
        }

        if (findIndex == false) {
            index = -1;  // Возвращает -1, потому что такого индекса быть не может. Следовательно - числа нет в массиве
        }

        return index;
    }
    public static String perezagruzka() {
        return "Перезапустились";
    }

//   false == false : true
    // true == true : true
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        //   deleteElement



    }

}
