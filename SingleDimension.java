//QUESTION 5
import java.util.Scanner;

public class SingleDimension{

    public static void main(String[] args) {

        //THE JAVA ARRAY ASSIGNMENT

        // SINGLE DIMENSIONAL ARRAY

        // initializing the variable
        Scanner input = new Scanner(System.in);
        String [] arrays  =  new String [10];

        for (int i = 0; i < arrays.length; i++){    // To input data
            System.out.println("Enter your input for index " +(i+1)+": ");
            arrays[i] = input.nextLine();
        }

        System.out.println("YOUR INPUTS ARE: "); // Message before printing out the input

        for (String your_input : arrays){ // print out the inputs using for each loop
            System.out.print(your_input+" ");
        }

    }
}