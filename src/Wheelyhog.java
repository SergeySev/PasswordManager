import java.util.Arrays;

public class Wheelyhog {
    public static String[][] addNewMassiv(String[][] oldArray, String[] subArray) {
        String[][] newArray = new String[oldArray.length + 1][];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = subArray;
        System.out.println(Arrays.deepToString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
//        String[][] oldArray = {{"sasha","gmail", "123"}, {"pasha", "microsoft", "111"}, {"masha", "vk", "345"}};
//        String [] subArray = {"misha", "fb", "000"};
        String[][] oldArray = {{"1"}, {"2", "3"}};
        String [] subArray = {"4"};
        System.out.println("**************");
        addNewMassiv(oldArray, subArray);


        String [] subArray1 = {};
        System.out.println("**************");
        addNewMassiv(oldArray, subArray1);

        String [] subArray2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        System.out.println("**************");
        addNewMassiv(oldArray, subArray2);

        String[][] oldArray1 = {{}};
        String [] subArray3 = {};
        System.out.println("**************");
        addNewMassiv(oldArray1, subArray3);

        String[][] oldArray2 = {};
        String [] subArray4 = {"1", "2", "3"};
        System.out.println("**************");
        addNewMassiv(oldArray2, subArray4);

//        addNewMassiv({{1}, {2, 3}}, {4}) -> {{1}, {2, 3}, {4}}
//
//        addNewMassiv({{1}, {2, 3}}, {}) -> {{1}, {2, 3}, {}}
//
//        addNewMassiv({{1}, {2, 3}}, {1, 2, 3, 4, 5, 6, 7, 8, 9}) -> {{1}, {2, 3}, {1, 2, 3, 4, 5, 6, 7, 8, 9}}
//
//        addNewMassiv({{}}, {}) -> {{}, {}}
//
//        addNewMassiv({{}}, {1, 2, 3}) -> {{}, {1, 2, 3}}
    }
}