import java.util.Arrays;
import java.util.Scanner;

public class Login extends Wheelyhog {
    Scanner scanner = new Scanner(System.in);
    static boolean flag = false;
    static String[] account = new String[2];
    static String[][] usersData = {
            {"Email", "Password", "Name", "Surname"},
            {"test123@gmail.com", "123123123", "Sergey", "Ivanov"},           //исходный массив
            {"testuser@gmail.com", "123123123", "John", "Macklein"}
    };

    public static void getLogin(String[][] usersData) {
        System.out.println("Please, enter Email:");
        account[0] = getString();
        account[1] = getPassword();
        System.out.println(Arrays.toString(account));
        while (!flag) {
            for (int i = 1; i < usersData.length; i++) {
                if (usersData[i][0].equals(account[0]) && usersData[i][1].equals(account[1])) {
                    System.out.println("Login Success!!!");
                    flag = true;
                    break;
                }
            } if (!flag){
                System.out.println("You enter wrong data! Please, try again...");
                getLogin(usersData);
            } else break;
        }
    }

    public static void main(String[] args) {
        getLogin(usersData);

    }
}
