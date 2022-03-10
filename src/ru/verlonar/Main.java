package ru.verlonar;

public class Main {

    public static void main(String[] args) {

        //задание 1

	    byte clientOS = 1;
        task1(clientOS);

        clientOS = 8;
        task1(clientOS);

        clientOS = 0;
        task1(clientOS);

        split();

        //задание 2

        int clientDeviceYear = 2014;

        clientOS = 1;
        task2(clientOS, clientDeviceYear);

        clientOS = 0;
        task2(clientOS, clientDeviceYear);

        clientOS = 6;
        task2(clientOS, clientDeviceYear);

        clientDeviceYear = 2015;

        clientOS = 1;
        task2(clientOS, clientDeviceYear);

        clientOS = 0;
        task2(clientOS, clientDeviceYear);

        clientOS = 6;
        task2(clientOS, clientDeviceYear);

        clientDeviceYear = 2020;

        clientOS = 1;
        task2(clientOS, clientDeviceYear);

        clientOS = 0;
        task2(clientOS, clientDeviceYear);

        clientOS = 6;
        task2(clientOS, clientDeviceYear);

        split();

        //задание 3

        int year = 2021;
        task3(year);

        year = 2020;
        task3(year);

        split();

        //задание 4

        int deliveryDistance = 18;
        task4(deliveryDistance);

        deliveryDistance = 21;
        task4(deliveryDistance);

        deliveryDistance = 59;
        task4(deliveryDistance);

        deliveryDistance = 65;
        task4(deliveryDistance);

        deliveryDistance = 110;
        task4(deliveryDistance);

        split();

        //задание 5

        int monthNumber = 12;
        task5(monthNumber);

        for (int i = 1; i <= 15; i++) {
            task5(i);
        }

        split();

    }

    private static void task1(byte clientOS) {
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неопознанная операционная система");
        }
    }

    private static void task2(byte clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неопознанная операционная система");
        }
    }

    private static void task3(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task4(int deliveryDistance) {
        byte deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60){
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка на такое расстояние не осуществляется");
        }
    }

    private static void task5(int monthNumber) {
        String[] seasons = {"зима", "весна", "лето", "осень"};
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println(monthNumber + " месяц принадлежит к сезону " + seasons[0]);
            case 3, 4, 5 -> System.out.println(monthNumber + " месяц принадлежит к сезону " + seasons[1]);
            case 6, 7, 8 -> System.out.println(monthNumber + " месяц принадлежит к сезону " + seasons[2]);
            case 9, 10, 11 -> System.out.println(monthNumber + " месяц принадлежит к сезону " + seasons[3]);
            default -> System.out.println(monthNumber + " месяца не существует");
        }
    }

    public static void split() {
        System.out.println("-----------------------------------------------------");
    }
}
