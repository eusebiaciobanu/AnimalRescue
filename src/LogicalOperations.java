public class LogicalOperations {

    public int getGreaterNumber(int first, int second){
        if(first > second){
            return first;
        }
        else{
            return second;
        }
    }

    public String textAndNumberComp(String textInput, int numberInput){
        if(textInput.equals("FastTrack") && numberInput <= 3){
            return textInput + numberInput;
        }
        else if (!textInput.equals("FastTrack") && numberInput >= 4){
            return numberInput + textInput;
        }
        return "No condition was met";
    }

    //Given a text input, if it is “FastTrack”,
    // then print “Learning text comparison”. If not, print “Got to try some more”

    public String textComparison(String textInput){
        if(textInput.equals("FastTrack")){
            return "Learning text comparison";
        }else {
            return "Got to try some more";
        }
    }

    public void printFromNumberTo100(int number){
        for(int i = number;i<=100;i++){
            System.out.println(i);
        }
    }
    public float sumAndAverage(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        return sum/100f;
    }
    public void printFromFirstToLast(int first, int last){
        while(first <= last){
            System.out.println(first);
            first++;
        }
    }
    //Modify the program to sum from 111 to 8899,
    // and compute the average.
    // Introduce an int variable called count to count the numbers
    // in the specified range.

    public float averageFromNumberToNumber(int first, int last){
        float sum = 0;
        int count = 0;
        while(first <= last){
            sum = sum + first;
            first++;
            count++;
        }
        return sum/count;
    }
}
