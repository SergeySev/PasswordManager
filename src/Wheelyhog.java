import java.util.Arrays;

public class Wheelyhog {
    public static String[][] addNewMassiv(String[][] oldArray, String[] subArray) {
        String[][] newArray = new String[oldArray.length + 1][];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = subArray;
        System.out.println((Arrays.toString(newArray)));

        return newArray;
    }

    public static void main(String[] args) {
        String[][] oldArray = {{"sasha","gmail", "123"}, {"pasha", "microsoft", "111"}, {"masha", "vk", "345"}};
        String [] subArray = {"misha", "fb", "000"};
        addNewMassiv(oldArray, subArray);
    }
}