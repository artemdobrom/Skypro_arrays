import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task0();
        task1();
        task2();
        task3();
    }

    public static void task0() {
        System.out.println("Массивы. Образец");
        int[] weights = new int[12];
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
    }
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



        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);

            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();


        for (int i = b.length -1; i >= 0; i--) {
            System.out.print(b[i]);

            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = c.length -1; i >= 0; i--) {
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
                if (a[i]% 2 != 0) {
                    a[i]++;
                }
            }
            System.out.println(Arrays.toString(a));



        }
}






