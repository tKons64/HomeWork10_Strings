import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        System.out.println("Задание №2");

        String fullName = "Иванов Семён Семёнович";
        String preparedFullName;

        preparedFullName = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + preparedFullName);

    }

}