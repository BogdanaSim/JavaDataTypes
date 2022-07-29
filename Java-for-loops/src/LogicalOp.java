import java.util.Objects;

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

    //----------------------------------------------------------------------


    public void displayNumbers(int number){
        System.out.println("Countdown from "+number+" to 100:");
        StringBuilder s= new StringBuilder();
        for(int i=number;i<=100;i++){
            s.append(i).append("; ");
        }
        s.append("\n");
        System.out.println(s);
    }

    public void displayNumbersReverse(int number){
        System.out.println("Countdown from "+number+" to -100:");
        StringBuilder s= new StringBuilder();
        for(int i=number;i>=-100;i--){
            s.append(i).append("; ");
        }
        s.append("\n");
        System.out.println(s);
    }

    public void displayBetweenNumbers(int number1,int number2){
        System.out.println("Countdown from "+number1+" to "+number2+":");
        StringBuilder s= new StringBuilder();
        if(number1<=number2){
            for(int i=number1;i<=number2;i++){
                s.append(i).append("; ");
            }
        }
        else {
            for (int i = number1; i >= number2; i--) {
                s.append(i).append("; ");
            }
        }
        s.append("\n");
        System.out.println(s);
    }

    public void displayBetweenNumbersBigger(int number1,int number2){
        StringBuilder s= new StringBuilder();
        int c;
        if(number1<=number2){
            System.out.println("Countdown from "+number1+" to "+number2+":");

        }

        else {
            c=number1;
            number1=number2;
            number2=c;
            System.out.println("Countdown from "+number2+" to "+number1+":");
        }
        for(int i=number1;i<=number2;i++){
            s.append(i).append("; ");
        }
        s.append("\n");
        System.out.println(s);
    }
    public void displayNumbersEven(){
        System.out.println("Countdown of even numbers from 1 to 100:");
        StringBuilder s= new StringBuilder();
        for(int i=2;i<=100;i+=2){
            s.append(i).append("; ");
        }
        s.append("\n");
        System.out.println(s);
    }

    public void displayNumbersOdd(){
        System.out.println("Countdown of odd numbers from 1 to 100:");
        StringBuilder s= new StringBuilder();
        for(int i=1;i<=100;i+=2){
            s.append(i).append("; ");
        }
        s.append("\n");
        System.out.println(s);
    }

    public int sumNumbers(int number){
        int s=0;
        for(int i=number;i<=100;i++){
            s+=i;
        }
        return s;
    }

    public float avgNumbers(int number){
        int s=0,c=0;
        for(int i=number;i<=100;i++){
            s+=i;
            c++;
        }
        if(c==0)
            return (float) s;
        return (float)s/c;
    }

    public void showModel() {
        for (int i = 0; i < 7; i++) {
            StringBuilder s=new StringBuilder();
            for (int j = 0; j < 7 - i; j++)
                s.append("*");
            s.append("\n");
            System.out.println(s);
        }
    }

}
