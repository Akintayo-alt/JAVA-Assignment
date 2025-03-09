//QUESTION 1

public class FlagofNigeria  {
    public static void main(String[] args) {

        // TO PRINT OUT THE NIGERIA FLAG USING A SINGLE FOR LOOP
        for (int i = 1; i <= 4; i++){
            System.out.println("* * * * = = = = * * * *");
        }

        // TO PRINT OUT THE NIGERIA FLAG USING A NESTED FOR LOOP
           
       
      
        for(int i=0; i<rows; i++){       
            for(int j= 0; j<columns; j++){
                if (j<4) {  
                    System.out.print("*");
                }else if(j>=4 && j<8) {  
                    System.out.print("=");
                }else{   //last 4 columns
                    System.out.print("*");
                }
            }
            System.out.println();  //move to the next row
        }
    }
    
}





    }
}
