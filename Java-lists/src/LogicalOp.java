import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LogicalOp {

    public int checkBiggerNumber(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public String getStatus(String text) {
        if (Objects.equals(text, "Evozon")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public String getStatusAndNumber(String text, int number) {
        if (Objects.equals(text, "Evozon") && number <= 3) {
            return text + " " + number;
        } else if (Objects.equals(text, "Evozon") && number >= 4) {
            return number + " " + text;
        }
        return "Number and text with no property!";
    }

    public String getSnow(int number) {
        if (number == 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;

        return "The forecast snow is(cm): " + number;
    }

    public String greaterNumber(int number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        else if (number == 4)
            return "The number is equal to 4";
        else if (number < 3)
            return "The number is lower than 3";
        return "Number with no property!";
    }

    public String checkNumber(int number) {
        return switch (number) {
            case 0 -> "\"The number is:  0 !\"";
            case 1 -> "\"The number is:  1 !\"";
            case 2 -> "\"The number is:  2 !\"";
            case 3 -> "\"The number is:  3 !\"";
            case 4 -> "\"The number is:  4 !\"";
            case 5 -> "\"The number is:  5 !\"";
            case 6 -> "\"The number is:  6 !\"";
            case 7 -> "\"The number is:  7 !\"";
            case 8 -> "\"The number is:  8 !\"";
            case 9 -> "\"The number is:  9 !\"";
            default -> "The number is not a digit!";
        };
    }

    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public int greatestNumber3(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3)
            return number2;
        return number3;
    }

    public void showList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem);
    }

    public void addToList(List<Integer> list, int number) {
        list.add(number);
    }

    public void displayListNumber(List<Integer> list, int number) {
        boolean passed = false;
        StringBuilder stringBuilder=new StringBuilder();
        for (Integer elem : list) {
            if (elem == number) {
                passed = true;
                stringBuilder.append("\n");
            }
            if(passed){
                stringBuilder.append(elem).append("\n");

            }
            else
                stringBuilder.append(elem).append("; ");

        }
        System.out.println(stringBuilder);
    }


    public void showListReverse(List<Object> list) {
        List<Object> copy=new ArrayList<>(list);
        Collections.reverse(copy);
        for (Object elem : copy)
            System.out.println(elem);
    }

    public void addOnPos(List<String> list, int pos, String str){
        if(pos<0 || pos>list.size())
            System.out.println("Invalid position!");
        else{
            list.set(pos,str);
        }
    }

    public void addOnFirst(List<Object> list,Object obj){
        if(list.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        list.set(0,obj);
    }

    public void showContentsList(List<Object> list){
        for(int i=0;i<list.size();i++){
            System.out.println("Pe pozitia "+i+" valoare este "+list.get(i));
        }
    }

    public int getMax(List<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("Empty list does not have a maximum value!");

        } else {
            return list.stream().max(Integer::compare).get();
        }
    }



}
