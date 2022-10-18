public class Main2 {

    public static void main(String[] args) {
//        Given two numbers, see which one is the greatest and print it

        int first = 30;
        int second = 30;
        LogicalOperations op = new LogicalOperations();

        System.out.println(op.getGreaterNumber(first,second));
//        Given a text input and a number input,
//        if the text is equal to “FastTrack” AND the number is equal to or lower than 3,
//        print the text and the number.
//        If the text is not “FastTrack” AND the number is equal to or higher than 4,
//        print the number and the text, in this order.

        String textInput = "FastTrack";
        int numberInput = 3;

        System.out.println(op.textAndNumberComp(textInput,numberInput));
        System.out.println(op.textComparison(textInput));


    }
}
