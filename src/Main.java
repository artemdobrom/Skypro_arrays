import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    //Образец
    public static void task0() {
        System.out.println("Массивы. Образец");
        int[] weights = new int[12];
        int[] weightsCopy = new int[12];
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[i]);

        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
    }


    //Задание 1 & 2
    public static void task1() {
        System.out.println("Массивы. Задание 1 & 2");
        int[] a = new int[]{1, 2, 3};
        float[] b = {1.57f, 7.654f, 9.986f};
        char[] c = {'s', 'u', 'n'};

        //Задание 2

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                break;
            }
        }
    }

    //Задание 3
    public static void task2() {
        System.out.println("Массивы. Задание 3");

        int[] a = new int[]{1, 2, 3};
        float[] b = {1.57f, 7.654f, 9.986f};
        char[] c = {'s', 'u', 'n'};


        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);

            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();


        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);

            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);

            if (i != 0) {
                System.out.print(",");
            }
        }
    }

    //Задание 4
    public static void task3() {
        System.out.println();
        System.out.println("Массивы. Задание 4");

        int[] a = new int[]{1, 2, 3};
        float[] b = {1.57f, 7.654f, 9.986f};
        char[] c = {'s', 'u', 'n'};


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    //Задание 5
    public static void task4() {
        System.out.println();
        System.out.println("Массивы. Задание 5");

        int[] salaryArray = generateRandomArray();
        int salaryA = 0;

        System.out.println(Arrays.toString(salaryArray));

        for (int salary : salaryArray) {
            salaryA += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salaryA + " рублей");
    }

    //Задание 6
    public static void task5() {
        System.out.println();
        System.out.println("Массивы. Задание 6");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int solary : salaryArray) {
            if (solary < min) {
                min = solary;
            }
            if (solary > max) {
                max = solary;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    //Задание 7
    public static void task6() {
        System.out.println();
        System.out.println("Массивы. Задание 7");


        int[] salaryArray = generateRandomArray();
        int salaryA = 0;

        System.out.println(Arrays.toString(salaryArray));

        for (int salary : salaryArray) {
            salaryA += salary;
        }
        double solaryAverage = (double) salaryA / salaryArray.length;

        System.out.println("Средняя сумма трат за месяц составила " + solaryAverage + " рублей");

    }

    //Задание 8
    public static void task7() {
        System.out.println();
        System.out.println("Массивы. Задание 8");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);


        }
    }
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }






