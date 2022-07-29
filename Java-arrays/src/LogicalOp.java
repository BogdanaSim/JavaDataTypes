import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.lang.Object;
public class LogicalOp {

    public int checkBiggerNumber(int number1, int number2){
        return number1>number2 ? number1 : number2;
    }

    public String getStatus(String text) {
        if (Objects.equals(text, "Evozon")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public String getStatusAndNumber(String text,int number){
        if (Objects.equals(text, "Evozon") && number<=3) {
            return text+" "+number ;
        }
        else if (Objects.equals(text, "Evozon") && number>=4) {
            return number+" "+text ;
        }
        return "Number and text with no property!";
    }

    public String getSnow(int number){
        if(number==8 || number==6)
            return "The amount of snow this winter was(cm): "+number;

        return "The forecast snow is(cm): "+number;
    }

    public String greaterNumber(int number){
        if(number>3 && number!=4)
            return "The number is greater than 3 and not equal to 4";
        else if(number==4)
            return "The number is equal to 4";
        else if(number<3)
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

    public boolean isNumberEven(int number){
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int age){
        return age >=18;
    }

    public int greatestNumber3(int number1, int number2, int number3){
        if(number1>=number2 && number1>=number3){
            return number1;
        }
        else if(number2>=number1 && number2>=number3)
            return  number2;
        return number3;
    }

    public void setArray() throws InterruptedException {
        System.out.println("Getting array:\n");
        int[] array=new int[100];
        for(int i=0;i<100;i++){
            array[i]=i+1;
            System.out.println("array["+i+"]="+array[i]+";");
            Thread.sleep(210);
        }

    }

    public int[] getArrayEven(int[] array){
        for(int i=0;i<50;i++){
            array[i]=(i+1)*2;
        }
        return  array;
    }

    public float avgArray(int[] array){
        int s=0;
        for(int elem:array){
            s+=elem;
        }
        return (float) s/array.length;
    }

    public boolean findString(String[] array, String str){
        return Arrays.asList(array).contains(str);
    }

    public int findNumber(int[] array,int number){
       for(int i=0;i<array.length;i++)
            if(array[i]==number)
                return i;
       return -1;
    }

    public void printGrid(){
        String[][] array=new String[10][10];
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                array[i][j]="-";
        StringBuilder s=new StringBuilder();
        for(int i=0;i<10;i++) {

            for (int j = 0; j < 10; j++)
                s.append(array[i][j]);
            s.append("\n\n");
        }
        System.out.println(s);

    }
    public int[] findNumber2(int[] array,int number){
        return Arrays.stream(array).filter(n->(n!=number)).toArray();
    }

    public int findMin(int[] array){
        int min1=array[0],min2=array[0];
        for(int elem:array){
            if(elem<min1){
                min2=min1;
                min1=elem;
            }

            else if(elem<min2){
                min2=elem;
            }
        }
        return min2;
    }

    public void changeArray(Object[] array1, Object[] array2){
        int i=0;
        for(Object elem: array1){
            array2[i]=elem;
            i++;
        }

    }

}
