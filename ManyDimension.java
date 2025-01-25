//QUESTION 4 
import java.util.Scanner;

public class ManyDimension{
    public static void main(String[] args) {

        // MULTI DIMENSIONAL ARRAY

        Scanner input = new Scanner(System.in);
        int [][] array2 = new int [10][10]; // initializing my variable

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                System.out.println("Enter input for row "+(i+1)+" and column "+(j+1)+": "); // specifying the index for each input
                array2[i][j] = input.nextInt();
            }
        }
        System.out.println("YOUR INPUTS ARE: "); // message before printing out my inputs

        for (int[] myInput: array2){
            for (int myInput1 : myInput){
                System.out.print(myInput1 +" "); // Using the for each loop to print out my inputs
            }
            System.out.println();
        }


    }
}