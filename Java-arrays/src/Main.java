import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Calculator calculator = new Calculator();
        LogicalOp logicalOp = new LogicalOp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.
        System.out.println("11+98=" + calculator.addition(15, 98));
        System.out.println("15+22+(-3)=" + calculator.addition(15, 98, -3));
        System.out.println("2.5+26.76=" + calculator.addition(2.5f, 26.76f));
        System.out.println("78.11+(-65.24)+(-9.7)=" + calculator.addition(78.11f, -64.24f, -9.7f));
        System.out.println("\n");
        System.out.println("3-27=" + calculator.subtraction(3, 27));
        System.out.println("-44-97-150=" + calculator.subtraction(-44, 97, 150));
        System.out.println("8.9-3.33=" + calculator.subtraction(8.9f, 3.33f));
        System.out.println("117.136-121.780-116.515=" + calculator.subtraction(117.136f, 121.780f, 116.515f));
        System.out.println("\n");
        System.out.println("50*48=" + calculator.multiplication(50, 48));
        System.out.println("185*70*(-75)=" + calculator.multiplication(185, 70, -75));
        System.out.println("-97.890*38.999=" + calculator.multiplication(97.890f, 38.999f));
        System.out.println("1.8*(-12.12)*(-5.77)=" + calculator.multiplication(1.8f, -12.12f, -5.77f));
        System.out.println("\n");
        System.out.println("122/17=" + calculator.division(122, 17));
        System.out.println("-159/69/7=" + calculator.division(-159, 69, 7));
        System.out.println("105.243/(-60.844)=" + calculator.division(105.243f, -60.844f));
        System.out.println("58.179/157.919/7.727=" + calculator.division(58.179f, 157.919f, 7.727f));
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2.\n");
        //2.

        logicalOp.setArray();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3.\n");
        //3.

        System.out.println("Setting empty array with even values:");
        int[] array = new int[50];
        array = logicalOp.getArrayEven(array);
        for (int i = 0; i < 50; i++) {
            System.out.println("array[" + i + "]=" + array[i] + ";");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.
        int[] array1 = {54, 10, -22, 36, -33, 87};
        System.out.println("Average of the array " + Arrays.toString(array1) + " is: " + logicalOp.avgArray(array1));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        String[] array2 = {"Snubbull", "Clawitzer", "Leavanny", "Volcarona", "Vanillish"};
        System.out.println("Result if string \"Hello\" is found in the array " + Arrays.toString(array2) + ": " + logicalOp.findString(array2, "Hello"));
        System.out.println("Result if string \"Leavanny\" is found in the array " + Arrays.toString(array2) + ": " + logicalOp.findString(array2, "Leavanny"));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.
        System.out.println("Position of the element -33 in the array " + Arrays.toString(array1) + ": " + (logicalOp.findNumber(array1, -33) != -1 ? logicalOp.findNumber(array1, -33) : "Not in the array!"));
        System.out.println("Position of the element 100 in the array " + Arrays.toString(array1) + ": " + (logicalOp.findNumber(array1, 100) != -1 ? logicalOp.findNumber(array1, 100) : "Not in the array!"));
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("7.\n");
        //7.

        logicalOp.printGrid();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("8.\n");
        //8.

        int[] array3 = {1, 1, 3, 5, 7, 8, 7, 0, 10, 2};
        System.out.println("Remove element 7 from array "+ Arrays.toString(array3) +": "+ Arrays.toString(logicalOp.findNumber2(array3, 7)));
        System.out.println("Remove element 11 from array "+ Arrays.toString(array3) +": "+ Arrays.toString(logicalOp.findNumber2(array3, 11)));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("9.\n");
        //9.
        System.out.println("The second smallest number in the array "+Arrays.toString(array3) +": "+logicalOp.findMin(array3));
        System.out.println("The second smallest number in the array "+Arrays.toString(array1) +": "+logicalOp.findMin(array1));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("10.\n");
        //10.

        Object[] a1={1,2, "e", 2.5, -1, "str"};
        Object[] a2=new Object[a1.length];
        System.out.println("Original array: "+ Arrays.toString(a1));
        System.out.println("Array before: "+ Arrays.toString(a2));
        logicalOp.changeArray(a1,a2);
        System.out.println("Array after: "+ Arrays.toString(a2));



    }
}
