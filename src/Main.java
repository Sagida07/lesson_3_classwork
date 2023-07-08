import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {89, 76, 54, 32, 21, 98};
        System.out.println(myNumbers[4]);
        System.out.println(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
        myNumbers[5] = 76543;
        myNumbers[0] = 1652490087;
        System.out.println(Arrays.toString(myNumbers));

        double[] numbers = new double[7];
        System.out.println(Arrays.toString(numbers));
        numbers[6] = 6.14322;
        numbers[3] = 789.4443;
        System.out.println(Arrays.toString(numbers));

        numbers = new double[18];
        System.out.println(Arrays.toString(numbers));
        numbers = new double[1];
        System.out.println(Arrays.toString(numbers));

        int[][] nums2D = new int[3][4];
        nums2D[1][2] = 7;
        System.out.println(Arrays.deepToString(nums2D));

        String[][] names = {{"Jack", "Jim"}, {"Julie", "Jannet"}};
        System.out.println(Arrays.deepToString(names));

        int[][] nums2DMine = new int[3][4];
        nums2D[1][2] = 7;
        System.out.println(Arrays.deepToString(nums2DMine));

        double[][] names2 = {{9.1, 9.2}, {8.1, 8.2}, {7.1, 7.2}};
        System.out.println(Arrays.deepToString(names2));

        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("Hello " + i);
        }
        for (int i = 1; i <= 10; i++) { // i = i + 1 = i++ инкрементация
            System.out.println("4 * " + i + " = " + 4 * i);
        }
        System.out.println("-------------------------------");

        for (int i = 10; i >= 1; i--) {  // i = i + 1 => i--  декрементация
            System.out.println("7 * " + i + " = " + 7 * i);
        }
        System.out.println("-------------------------------");

        for (double i = 1.0; i <= 8.0; i = i + 2.0) {
            System.out.println(2.0 + i);
        }
        System.out.println("---------------");

        for (int i = 10; i >= 1; i -= 2) { // i = i - 2 => i -= 2, i = i * 8 => i *= 8
            System.out.println("9 x " + i + " = " + (9 * i));
        }
        int s = 7;
        while (s < 10) {
            System.out.println("Hi " + s);
            s++;
        }
        String name = "Sagida";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.codePointAt(3));
        String str = "7";
        while (str.length() <= 5) {
            System.out.println(str);
            str = str + "7";
        }
        String[] puppies = new String[10];
        for (int i = 0; i < puppies.length; i++) {
            puppies[i] = "Puppy0" + i;
        }
        System.out.println(Arrays.toString(puppies));


        String[] sisters = {"Sagida", "Sumaya", "Saaliha"};
        for (String siblings : sisters) {
            System.out.println("Hi, " + siblings);
        }
        System.out.println("--------------");
        int[] nums = {56, -11, 32, 7, 991};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                break; // экстренно прерывает работу всего цикла
            }
            System.out.println(nums[i]);
        }
        System.out.println("-----------");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                continue;// прерывает работу текущего круга
            }
            System.out.println(nums[i]);
        }
        System.out.println("-----------");

        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }

        System.out.println("-----------");

        int myArray[] = {10, 12, 14, 16, 18};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i] / myArray.length;
        }
        System.out.println(sum);

        double[] numers = {0.78, -673.987, -0.392745, 936.7, 342.988, 1.320, 64.2, -52.8, -4.87, -5.987, 12.60542, 273.609, 778.99, -349.0002, -694.607};

        double result = 0;

        for (double m : numers) {

            result += m;

        }

        System.out.println(result / numers.length);

        for (int i = 0; i < 3; i++) {
            System.out.println("Наружный цикл " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("Внутренний цикл " + j);
            }
    }
        double result = 0;
        for (double m : myNumbers) {
            result += m;
        }
        System.out.println(result / myNumbers.length);
    }

}


