public class NumberInWord {
    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(30);

    }
    public static void printNumberInWord(int number) {
        String numberInWord="x";
        if (number < 0 || number > 9) {
            numberInWord = "other";
        } else if (number == 0)
            numberInWord = "ZERO";
        else if (number == 1)
            numberInWord = "ONE";
        else if (number == 2)
            numberInWord = "TWO";
        else if (number == 3)
            numberInWord = "THREE";
        else if (number == 4)
            numberInWord = "FOUR";
        else if (number == 5)
            numberInWord = "FIVE";
        else if (number == 6)
            numberInWord = "SIX";
        else if (number == 7)
            numberInWord = "SEVEN";
        else if (number == 8)
            numberInWord="EIGHT";
        else if(number==9)
            numberInWord="NINE";
        System.out.println(numberInWord);
    }
}