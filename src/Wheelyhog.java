import java.util.Arrays;

public class Wheelyhog extends Registration {
    public static String[][] addNewMassiv(String[][] oldArray, String[] subArray) {
        String[][] newArray = new String[oldArray.length + 1][];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = subArray;
//        System.out.println(Arrays.deepToString(newArray));
        return newArray;
    }

    public static void main(String[] args) {

//        String[][] oldArray = {{"1"}, {"2", "3"}};
//        String [] subArray = {"4"};
//        System.out.println("**************");
//        addNewMassiv(oldArray, subArray);
//
//
//        String [] subArray1 = {};
//        System.out.println("**************");
//        addNewMassiv(oldArray, subArray1);
//
//        String [] subArray2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        System.out.println("**************");
//        addNewMassiv(oldArray, subArray2);
//
//        String[][] oldArray1 = {{}};
//        String [] subArray3 = {};
//        System.out.println("**************");
//        addNewMassiv(oldArray1, subArray3);
//
//        String[][] oldArray2 = {};
//        String [] subArray4 = {"1", "2", "3"};
//        System.out.println("**************");
//        addNewMassiv(oldArray2, subArray4);

        String[][] usersData = {
                {"Email", "Password", "Name", "Surname"},
                {"test123@gmail.com", "123123", "Sergey", "Ivanov"},           //исходный массив
                {"testuser@gmail.com", "123123", "John", "Macklein"}
        };

        System.out.println("Enter Email:");
//        getEmail(usersData, str);
//        getPassword();
//        getName();
//        getSurname();

        String[] subarray = {getEmail(usersData, email), getPassword(), getName(), getSurname()};

        System.out.println(Arrays.deepToString(addNewMassiv(usersData, subarray)));


    }
}