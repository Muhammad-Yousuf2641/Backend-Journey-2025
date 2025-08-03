
import java.util.Arrays;

public class oneD_array {
    public static void main(String[] args) {
        
    
        // declare and assign the size of array 
        int [] house_series = new int[10];

        // initialize the array 
        System.out.println("Before assigning the values " + Arrays.toString(house_series));

        house_series[0]=615;
        house_series[1]=616;
        house_series[2]=617;
        house_series[3]=618;
        house_series[4]=619;
        house_series[5]=620;
        house_series[6]=621;
        house_series[7]=622;
        house_series[8]=623;
        house_series[9]=624;

        System.out.println();
        System.out.println("After assigning the values");
        
        // displaying the variables
        for(Integer census :house_series ){
            System.out.print(census+" ");

    }    
    }
}