//QUESTION 1

public class FlagofNigeria  {
    public static void main(String[] args) {

        // TO PRINT OUT THE NIGERIA FLAG USING A SINGLE FOR LOOP
        for (int i = 1; i <= 4; i++){
            System.out.println("* * * * = = = = * * * *");
        }

        // TO PRINT OUT THE NIGERIA FLAG USING A NESTED FOR LOOP
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 12; j++){
                if (j==5 || j==6 || j==7 || j==8){
                    System.out.print("= ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }





    }
}