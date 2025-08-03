import java.util.Arrays;
public class methods_in_array {
    public static void main(String[] args) {
        
    
    // declare an array 
    int [] arr = new int[5];

    // filling method to input same value in a array
    Arrays.fill(arr, 100);
    System.out.println(Arrays.toString(arr));

    // copyof method to copy the orignal array and also can modify the length of array
    int[] newarr= Arrays.copyOf(arr, 6);
    newarr[2]=20;
        System.out.println(Arrays.toString(newarr));

    //equals method used to check the number of elements and values return boolean data
    String  result= (Arrays.equals(arr,newarr)) ? "Matched":"Not matched";
    System.out.println(result);
    
    // sort() method used to sorting the array
     Arrays.sort(newarr);
    System.out.println(Arrays.toString(newarr));

    // binary search method used to give a key and it will return the ondex of number
    
    System.out.println(Arrays.binarySearch(newarr, 20)); // it wil retun the index 1
}


}
