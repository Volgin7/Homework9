import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int totalPayments = 0;

        for(int payment:array) {
            totalPayments += payment;
        }
        System.out.println("Сумма трат за месяц составила " + totalPayments + " рублей");
        System.out.println();
    } // end of task

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int minPayment = array[0];
        int maxPayment = array[0];

        for(int payment:array) {
            if (payment > maxPayment) {
                maxPayment = payment;
            }
            if (payment < minPayment) {
                minPayment = payment;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + minPayment + " рублей. ");
        System.out.print("Максимальная сумма трат за день составила " + maxPayment + " рублей");
        System.out.println();
    } // end of task

} // end of main