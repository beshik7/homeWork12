import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int year = 2021; // инициализировал параметр проверяемого года (чтобы добавить этот параметр в скобки к методу)
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {  // для облегчения чтения кода использовал параметр для метода в скобках
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
    public static void task3() {
        System.out.println(" Задача 3 ");
        int deliveryDistance = 95; // дистанция до клиента
        int deliveryDays = calculateDeliveryDays(deliveryDistance); //присваиваю параметр для вызова метода со значением расстояния
        System.out.println("Количество дней для доставки: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1; // доставка в пределах 20 км занимает сутки
        } else if (deliveryDistance <= 60) {
            return 2; // доставка в пределах от 20 км до 60 км добавляет еще один день доставки
        } else if (deliveryDistance <= 100) {
            return 3; // доставка в пределах от 60 км до 100 км добавляет еще одни сутки
        } else {
            return -1; // свыше 100 км доставки нет, возвращаем -1 для обозначения невозможности доставки
        }
    }
}
