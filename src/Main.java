import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        char[] reverseFullName = reverseFullName();

    }
    
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }

            //Задание 1
            System.out.println("exercise 1");
            int sum = 0;
            for (int a = 0; a < arr.length; a++) {
                sum += arr[a];
                System.out.println(sum);
            }
            //Задание 2
            System.out.println();
            System.out.println("exercise 2");
            int minValueForTheDay = arr[0];
            for (int j : arr) {
                if (j < minValueForTheDay) {
                    minValueForTheDay = j;
                }
            }
            System.out.println("Min value for the day " + minValueForTheDay + " Rubles");

            int maxValueForTheDay = 0;
            for (int j : arr) {
                if (j > maxValueForTheDay) {
                    maxValueForTheDay = j;
                }
            }
            System.out.println("Max value for the day " + maxValueForTheDay + " Rubles");

            //Задание 3
            System.out.println();
            System.out.println("exercise 3");
            double averageValueForTheMonth;
            averageValueForTheMonth = sum/30;
            System.out.println("Average value for the month " + averageValueForTheMonth + " Rubles");

            return arr;
        }
         //Задание 4

        public static char [] reverseFullName() {
            System.out.println();
            System.out.println("exercise 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            int reverse = reverseFullName.length;
            int temp;
            for (int i = 0; i < reverse / 2; i++) {
                temp = reverseFullName[reverse - i - 1];
                reverseFullName[reverse - i - 1] = reverseFullName[i];
                reverseFullName[i] = (char) temp;
            }
                System.out.println(reverseFullName);

            return reverseFullName;
        }
}