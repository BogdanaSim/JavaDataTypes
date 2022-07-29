public class Main {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        LogicalOp logicalOp=new LogicalOp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.
        logicalOp.displayNumbers(55);
        logicalOp.displayNumbers(100);
        logicalOp.displayNumbers(153);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2.\n");
        //2.
        logicalOp.displayNumbersReverse(19);
        logicalOp.displayNumbersReverse(-100);
        logicalOp.displayNumbersReverse(-111);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("3.\n");
        //3.

        logicalOp.displayBetweenNumbers(12,45);
        logicalOp.displayBetweenNumbers(-22,79);
        logicalOp.displayBetweenNumbers(-120,-36);
        logicalOp.displayBetweenNumbers(1,1);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.


        logicalOp.displayBetweenNumbersBigger(13,44);
        logicalOp.displayBetweenNumbersBigger(77,18);
        logicalOp.displayBetweenNumbersBigger(-12,-80);
        logicalOp.displayBetweenNumbersBigger(-20,-1);
        logicalOp.displayBetweenNumbersBigger(14,14);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        logicalOp.displayNumbersEven();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.
       logicalOp.displayNumbersOdd();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("7.\n");
        //7.

        System.out.println("Sum from 70 to 100: "+logicalOp.sumNumbers(70));
        System.out.println("Sum from -20 to 100: "+logicalOp.sumNumbers(-20));
        System.out.println("Sum from 100 to 100: "+logicalOp.sumNumbers(100));
        System.out.println("Sum from 200 to 100: "+logicalOp.sumNumbers(200));


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("8.\n");
        //8.
        System.out.println("Average from 22 to 100: "+logicalOp.avgNumbers(22));
        System.out.println("Average from -120 to 100: "+logicalOp.avgNumbers(-120));
        System.out.println("Average from 100 to 100: "+logicalOp.avgNumbers(100));
        System.out.println("Average from 321 to 100: "+logicalOp.avgNumbers(321));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("9.\n");
        //9.
        logicalOp.showModel();


    }
}
