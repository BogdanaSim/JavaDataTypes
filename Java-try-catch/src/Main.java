import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();
        Read read = new Read();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.
        try {
            int res = read.tratat();
            System.out.println("Entered integer number is: " + res);
        } catch (InputMismatchException ex) {
            System.out.println("Input is not an integer number or is bigger than an integer number!");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2.\n");
//        //2.
        try {
            float res = read.tratat2();
            System.out.println("Entered float is: " + res);
        } catch (InputMismatchException ex) {
            System.out.println("Input is not a float number or is bigger than a float number!");
        }
        try {
            double res = read.tratat3();
            System.out.println("Entered double number is: " + res);
        } catch (InputMismatchException ex) {
            System.out.println("Input is not a double number or is bigger than a double number!");
        }
        try {
            long res = read.tratat4();
            System.out.println("Entered long number is: " + res);
        } catch (InputMismatchException ex) {
            System.out.println("Input is not a long number or is bigger than a long number!");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3.\n");
        //3.
        int pos = -1;
        while (pos == -1) {
            try {
                System.out.println("The integer number should be positive.");
                pos = read.tratat();
                if (pos < 0) {
                    System.out.println("Length cannot be negative. Try again!");
                    pos = -1;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Input is not an integer number or is bigger than an integer number!");
            }
        }

        int[] array = read.readArray(pos);
        System.out.println("Entered array: ");
        System.out.println(Arrays.toString(array));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.

        List<Integer> list=read.readList();
        System.out.println("Entered list: ");
        System.out.println(list);


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        int[] array1={1,2,3,45,6};
        logicalOp.displayNrOnPos(array1,-10);
        logicalOp.displayNrOnPos(array1,2);
        logicalOp.displayNrOnPos(array1,9);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.
        logicalOp.wait(-5);
        logicalOp.wait(3);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
