import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // В поле класса массив с вложенными массивами. Это наша "База данных".
    // В него мы будем добавлять пользователя и потом логиниться в этого пользователя.
    // Когда сделаем базу данных в отдельном файле, то сможем добавлять нескольких пользователей.

    public static String[][] usersData = {
            {"Email", "Password", "Name", "Surname"},
            {"test123@gmail.com", "123123", "Sergey", "Ivanov"},
            {"testuser@gmail.com", "123123", "John", "Macklein"}
    };

    /*
    В массиве usersPassword будут сохраняться пароли от сайтов в формате:
    Сайт, Почта, Пароль.
    В эту переменную будем добавлять новые пароли или удалять старые.
    Так же из этой переменной будем брать пароли, чтобы показать их пользователю.
     */


    public static String[][] userPassword = {
            {"Web-site", "Email", "Password"},
            {"Google", "test123@gmail.com", "123asd23"}
    };

    static Scanner scanner = new Scanner(System.in);

    public static String[][] addNewMassiv(String[][] oldArray, String[] subArray) {
        String[][] newArray = new String[oldArray.length + 1][];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = subArray;
        return newArray;
    }
 /*       Взял Масэтро-Фронт (Сергей)
        
        Написать функцию, которая:
        1) Принимает массив
        2) Создает Новый массив с длинной на 1 больше, чем oldArray переданный в аргументах
        3) Перезаписывает в Новый массив все данные из массива oldArray
        4) В конец Нового массива добавляет subArray

        Тесты:
        addNewMassiv({{1}, {2, 3}}, {4}) -> {{1}, {2, 3}, {4}}
        addNewMassiv({{1}, {2, 3}}, {}) -> {{1}, {2, 3}, {}}
        addNewMassiv({{1}, {2, 3}}, {1, 2, 3, 4, 5, 6, 7, 8, 9}) -> {{1}, {2, 3}, {1, 2, 3, 4, 5, 6, 7, 8, 9}}
        addNewMassiv({{}}, {}) -> {{}, {}}
        addNewMassiv({{}}, {1, 2, 3}) -> {{}, {1, 2, 3}}


        Сложность функции 2 из 5
         */
//    String[][] newArray;
//    return newArray;
//    }

//    public static String[][] deleteElementByIndex(String[][] array, int index) {
        /*

        Взяли РОБЕРТ и АЛЕКС_________
    

        Написать функцию, которая принимает массив и индекс удаляемого элемента:
        1) Создает новый массив длинной на 1 меньше принимаего
        2) Проходится циклом while по старому массиву ДО удаляемого индекса и перезаписываем его в новый
        3) Запустить новый цикл while и продолжать перезаписывать, только уже newArray[i] = originArray[i+1]
        4) Возвращаем новый список

        Тесты:
        deleteElementByIndex({1, 2 , 3}, 0) -> {2, 3}

        deleteElementByIndex({1, 2, 3}, 2) -> {1, 2}

        deleteElementByIndex({1, 2, 3, 4}, 2) -> {1, 2, 4}

        deleteElementByIndex({1, 2, 3}, 3) -> {1, 2, 3}

        deleteElementByIndex({1}, 0) -> {}

        deleteElementByIndex({}, 1) -> {}


        Сложность 3 из 5
         */
//        String newArray = null;
//        return newArray;
//    }

    public static void adminLookUserPassword() {
        /*
        Написать функцию, которая выводит в консоль список userPassword

        Сложность 0 из 5
         */
    }

    public static void adminLookUserData() {
        /*
        Написать функцию, которая выводит в консоль список userData

        Сложность 0 из 5
         */
    }

    public static String registration() {
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

        /*
        Написать функцию, которая:
        1) Предлагает пользователю ввести Email
        1.1) Если введенный Email уже есть в массиве usersData - Распечатать в консоли:
        Email уже зарегистрирован, введите пожалуйста новый Email.
        Повторить ввод Email и повторять до тех пор, пока пользователь не введет Новый Email.
        Если введенный Email новый - переходим ко второму пункту.
        2) Введите пароль:
        2.1) Пароль должен быть от 8 до 16 символов длинной.
        Если длина меньше 8 или больше 16 - попросить ввести пароль еще раз в этом диапазоне.
        Повторять до тех пор, пока пользователь не введет пароль нужной длины.
        3) Попросить ввести имя (любое)
        4) Попросить ввести фамилию (любую)

        5) Email, Password, Name, Surname - добавить в массив.
        6) Массив с данными добавить массив с данными нового пользователя в userData
        (для этого нужно будет вызвать функцию, которая расширяет массив и добавляет
        вложенный массив в конец)

        Сложность функции 4 из 5
         */
    }

    public static void getLogin(String[][] usersData) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        String[] account = new String[2];

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

    public static void lookPassword() {
        /*
        Написать функцию, которая показывает пароль от конкретного сайта:
        1) Попросить ввести сайт, от которого хочет посмотреть пароль - через Scaner
        2) Пройтись циклом for в массиве userPassword
        3) Если есть совпадение по названию сайта (проверку осуществлять через if):
        3.1) Вывести в консоль логин и пароль от найденного сайта
        3.2) Если НЕ найдено совпадения: выводит в консоль, что такого сайта нет.

        Сложность 4 из 5
         */
    }

    public static void addPassword() {
        /*
        Написать функцию, которая:
        1) Спрашивает у пользователя:
        а) Имя сайта
        б) Логин
        в) Пароль - спросить у пользователя, хочет он воспользоваться генерацией пароля или ввести сам.
        Если сам - через scaner вводит пароль.
        Если воспользоваться генерацией - запускаем функцию generatePassword() и передаем её в качестве пароля
        2) Собирает данные в массив
        3) Запускает функцию addNewMassiv(old massive, massiveWithNewData)

        Сложность: 5 из 5
         */
    }

    public static void deletePassword() {
        /*
        Написать функцию, которая:
        1) Спрашивает у пользователя:
        а) Имя сайта
        2) Проходится циклом for в массиве userPassword
        2.1) Если (цикл if) найдено совпадение введенного имени сайта с именем в базе данных:
        2.2) Запустить функцию удаление элемента из списка - deleteElement(массив, номер удаляемого индекса)

        Сложность 4 из 5
         */
    }

    public static String generatePassword() {
        /*
        Написать функцию, которая:
         1) Генерирует пароль в случайном диапазоне от 8 до 16 символов
         2) Записывает туда случйные буквы, цифры, символы.
         3) Возвращает строку со сгенерированным паролем

         Сложность 5 из 5
         */
        return "";
    }

    public static void programInterface() {
        /*
        Написать функции CLI интерфейса:
        1) При запуске интерфейса, программа спрашивает:
        Что Вы хотите сделать?
        1 - Посмотреть мой пароль от сайта
        2 - Сохранить новый пароль
        3 - Удалить существующий пароль

        Если пользователь вводит:
        "1" - запустить функцию lookPassword()


        "2" - запустить функцию addPassword()

        "3" - запустить функцию deletePassword()

        "4" - запускает функцию registration()

        "5" - запускает функцию logIn()

        "8" - запустить функцию adminLookUserPassword()

        "9" - запустить функцию adminLookUserData()

        После завершения работы, программа спрашивает: вы хотите продолжать?
        y - да и интерфейс запускается снова
        n - нет - программа завершает работу

        Сложность 2 из 5
         */
    }

    public static void main(String[] args) {
        programInterface();
    }

}
