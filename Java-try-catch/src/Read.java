import java.util.*;

public class Read {

    public int tratat() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Write an integer number: ");
        number = scanner.nextInt();
        return number;
    }

    public float tratat2() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;

        System.out.println("Write a float number: ");
        number = scanner.nextFloat();
        return number;
    }

    public double tratat3() {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        boolean read = false;
        System.out.println("Write a double number: ");
        number = scanner.nextDouble();
        return number;
    }

    public long tratat4() {
        Scanner scanner = new Scanner(System.in);
        long number = 0;
        boolean read = false;
        System.out.println("Write a long number: ");
        number = scanner.nextLong();
        return number;
    }

    public int[] readArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("There are " + (length - i) + " integer numbers left to read.\nEnter an integer number: ");
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Input is not an integer number or is bigger than an integer number! Try again!");
                scanner.nextLine();
                i--;
            }
        }
        return array;
    }

    public List<Integer> readList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        boolean finish = true;
        while (finish) {
            System.out.println("Enter an integer number: ");
            try {
                list.add(scanner.nextInt());
            } catch (InputMismatchException ex) {
                System.out.println("Input is not an integer number or is bigger than an integer number! The reading is finished!");
                finish = false;
            }
        }
        return list;
    }
}
