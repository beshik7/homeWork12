import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int year = 2021; // параметр проверяемого года
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");

        int[] osTypes = {0, 1}; // массив с типами ОС (0-iOS, 1-Android)
        int deviceYear = 2018; // год выпуска устройства

        for (int osType : osTypes) {
            suggestAppVersion(osType, deviceYear);
        }
    }

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (deviceYear < currentYear) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неверный тип операционной системы");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неверный тип операционной системы");
            }
        }
    }
}