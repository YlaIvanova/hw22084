package task;
public class Main {
    public static void main(String[] args) {
        printIsLeap(2020);
        printInstallationMessage(0, 2013);
        printCalculateDeliveryDays(95);


    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год ");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void printInstallationMessage(int os, int productionYear) {
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("устройство поддерживаемо устройство");
        }

        String versionMessage = productionYear < 2015 ? "облегченную" : "";
        String osMessage = os == 0 ? "IOS" : "android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);
    }


    private static void printCalculateDeliveryDays(int distance) {
        int start = 20;
        int step = 40;
        int result;
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2);
        }
        //System.out.println("Потребуется дней: " + result);
    }
}