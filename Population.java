//QUESTION 3
import java.util.Arrays;
public class Population {
    public static void main(String[] args) {

        // ARRAY ASSIGNMENT IN JAVA
        int[] data = {2,5,5,9,4,7,0,9,6,11,12};
        int sum = 0;

        // USING FOR EACH LOOP TO GET THE SUM OF DATA IN THE ARRAY
        for (int count : data){
            sum=sum+count;
        }

        System.out.println("The sum of all the data: "+sum);
        //  NOW TO CALCULATE THE MEAN
        float Mean = (float) sum/data.length; // Sum of data divide by the number of time they appear (Mean)

        System.out.println("The Mean of the data is: "+"\n"+ Mean);



        //THE MEDIAN
        Arrays.sort(data); // To arrange the data in ascending order
        // NOW TO CALCULATE THE MEDIAN
        if (data.length % 2 != 0){
            System.out.println("The median of the data is: "+ data[data.length/2]);
        } else {
            System.out.println("The median of the data is: "+(data[data.length/2]) + (data[data.length/2-1])/2.0);
        }




        // TO CALCULATE THE STANDARD DEVIATION
        int size_of_population = data.length; // N = size_of_population
        float the_population_mean = Mean; // U = the_population_mean (Mean we calculated already)

        double sum_of_data_minus_mean =((2-Mean)+(5-Mean)+(5-Mean)+(9-Mean)+(4-Mean)+(7-Mean)+(0-Mean)+(9-Mean)+(6-Mean)+(11-Mean)+(12-Mean));
        //Now the Standard Deviation
        double standardDeviation = Math.sqrt(Math.pow(sum_of_data_minus_mean,2)/size_of_population);

        System.out.println( "The Standard Deviation of the data is: "+standardDeviation);

    }
}