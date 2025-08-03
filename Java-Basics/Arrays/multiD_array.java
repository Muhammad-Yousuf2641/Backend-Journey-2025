public class multiD_array{
    public static void main(String[] args){
        // declare the variable 
        int [][] flats= new int [2][3];

        // initialize the variable
        flats [0][1]=5;     // r-0 c-1
        flats [0][2]=6;     // r-0 c-2
        flats [0][0]=4;     // r-0 c-0

        flats [1][0]=6;     // r-1 c-0
        flats [1][1]=5;     // r-1 c-1
        flats [1][2]=4;     // r-1 c-2


        // displaying the elements 
        for(int i=0;i<=flats.length;i++){
                for(int j=0; j< flats[i].length; j++){
                    System.out.print(" | ");
                    System.out.print(flats[i][j]);
                    
            }
            System.out.println(" ");
        }
    }
    }
