import java.util.Scanner;

public class Registration {
    static Scanner scanner = new Scanner(System.in);
    static String str;
    static String email;
    static String pswd;
    static String name;
    static String surname;


    static String getString() {
        str = scanner.nextLine();
        if (str.length() == 0) {
            System.out.println("Entered data must have at least 1 symbol. Please, try again:");
            getString();
        }
        return str;
    }

    static String getEmail(String[][] usersData, String str) {
        str = getString();
        for (int i = 1; i < usersData.length; i++) {
            if (str.equals(usersData[i][0])) {
                System.out.println("This email exists! Enter again:");
                getEmail(usersData, str);
                break;
            } else {
                email = str;
            }
        }
        return email;
    }

    static String getPassword() {
        System.out.println("Please, enter password:");
        pswd = getString();
        if (pswd.length() < 8 || pswd.length() > 16) {
            System.out.println("Password must be in range of [8 ... 16] symbols");
            getPassword();
        } else {
            System.out.println("Good!");
        }
        return pswd;
    }

    static String getName() {
        System.out.println("Please, enter your name");
        name = getString();
        System.out.println("name accepted");
        return name;
    }

    static String getSurname() {
        System.out.println("Please, enter your surname");
        surname = getString();
        System.out.println("surname accepted");
        return surname;
    }


}