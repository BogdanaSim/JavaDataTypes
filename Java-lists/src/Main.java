import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        LogicalOp logicalOp=new LogicalOp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.\n");
        //1.

        Object[] a={1,2, "e", 2.5, -1, "str"};
        List<Object> list = new ArrayList<>(Arrays.stream(a).toList());
        System.out.println("Used list: "+list);
        logicalOp.showList(list);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("2.\n");
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,12,87,-10,73,19);
        System.out.println("List before adding: "+ list2);
        logicalOp.addToList(list2,13);
        System.out.println("List after adding '13': "+ list2);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("3.\n");
        //3.

        System.out.println("Used list: "+list2);
        System.out.println("Result using the value '-10': ");
        logicalOp.displayListNumber(list2,-10);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4.\n");
        //4.
        System.out.println("Used list: "+list);
        System.out.println("Reverse list:");
        logicalOp.showListReverse(list);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("5.\n");
        //5.
        List<String> list1=new ArrayList<>();
        Collections.addAll(list1,"Snubbull", "Clawitzer", "Leavanny", "Volcarona", "Vanillish");

        System.out.println("Used list: "+list1);
        System.out.println("Result after adding the value 'str' on position 10: ");
        logicalOp.addOnPos(list1,10,"str");
        logicalOp.addOnPos(list1,4,"str");
        System.out.println("\nAfter adding the value 'str' on position 4: "+list1);



        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("6.\n");
        //6.

        System.out.println("Used list: "+list);
        logicalOp.addOnFirst(list,"strnew");
        System.out.println("Result after adding \"strnew\" on the first position: "+list);
        System.out.println("\nUsed list: []");
        System.out.println("Result after adding '2' on the first position: ");
        logicalOp.addOnFirst(new ArrayList<>(),2);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("7.\n");
        //7.

        System.out.println("Used list: "+list);
        logicalOp.showContentsList(list);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("8.\n");
        //8.
        try {
            System.out.println("Maximum number from the list " + list2 + " is: " + logicalOp.getMax(list2));
            System.out.println("Maximum number from the list [] is: " + logicalOp.getMax(new ArrayList<>()));
        }
        catch (EmptyListException ex){
            System.out.println("Maximum number from the list [] is: " );
            System.out.println(ex.getMessage());
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~||~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
