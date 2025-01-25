//QUESTION 2
public class FlagofUSA {

    public static void main(String[] args) {

        // TO PRINT OUT THE UNITED STATES OF AMERICA'S (USA) FLAG USING A SINGLE FOR LOOP
        for (int i = 1; i <= 6; i++){
            if (i <=3 ){
                System.out.println("* * * * = = = = = = =");
            } else {
                System.out.println("= = = = = = = = = = =");
            }
        }

        // TO PRINT OUT THE UNITED STATES OF AMERICA'S (USA) FLAG USING A NESTED FOR LOOP
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 11; j++){
                if (i <= 3 && j <= 4){
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.print("\n");
        }

    }
}