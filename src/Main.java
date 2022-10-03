import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName;

        fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");

        String fullName = "Ivanov Ivan Ivanovich";
        String preparedFullName;

        preparedFullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + preparedFullName);

    }

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");

        String fullName = "Иванов Семён Семёнович";
        String preparedFullName;

        preparedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + preparedFullName);

    }

    public static void task5() {
        System.out.println();
        System.out.println("Задание №5");

        String fullName = "Ivanov Ivan Ivanovich";

        String firstName;
        String middleName;
        String lastName;

        lastName = fullName.substring(0, 6);
        firstName = fullName.substring(7, 11);
        middleName = fullName.substring(12, 21);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

    }

    public static void task6() {
        System.out.println();
        System.out.println("Задание №6");

        String fullName = "ivanov ivan ivanovich";
        String preparedFullName = "";
        String partName;
        char firstCharacter;

        String[] arrFullName = fullName.split(" ");

        for (int i = 0; i < arrFullName.length; i++) {
            partName = arrFullName[i];
            firstCharacter = Character.toUpperCase(partName.charAt(0));
            preparedFullName = preparedFullName + firstCharacter + partName.substring(1, partName.length()) + " ";
        }

        System.out.println("Верное написание Ф. И. О. сотрудника c заглавных букв — " + preparedFullName);

    }

    public static void task7() {
        System.out.println();
        System.out.println("Задание №7");

        StringBuilder firstString = new StringBuilder("135");
        StringBuilder secondString = new StringBuilder("246");
        StringBuilder preparedString = new StringBuilder();

        for (int i = 0; i < secondString.length(); i++){
            preparedString.insert(preparedString.length(), firstString.charAt(i));
            preparedString.insert(preparedString.length(), secondString.charAt(i));
        }

        System.out.println("Данные строки — " + preparedString);
    }

    public static void task8() {
        System.out.println();
        System.out.println("Задание №8");

        String initialString = "aabccddefgghiijjkk";
        String preparedString = "";
        char symbol;
        String subsequence = "";

        for (int i = 0; i < initialString.length(); i++){
            symbol = initialString.charAt(i);
            if(initialString.contains(symbol + "" + symbol) && preparedString.contains(symbol + "") == false){
                preparedString = preparedString + symbol;
            }
        }
        System.out.println("Результат преобразования строки — " + preparedString);
    }

}