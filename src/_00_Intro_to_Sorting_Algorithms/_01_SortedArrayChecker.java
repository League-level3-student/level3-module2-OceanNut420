package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
    	
    	int[] array = arr;
    	
    	for(int w=0;w<3;w++) {
    		System.out.println(array[w]);
    	}
        
    	//for (int i = 0; i < arr.length; i++) {
        //    for (int k = 0; k < arr.length - 1; k++) {
        //        if( arr[k] > arr[ k+1 ] ) {
        //            int temp = arr[k];
        //            arr[k] = arr[ k+1 ];
        //            arr[ k+1 ] = temp;
        //        }
        //    }
        //}
    	
    	    	
    	if(arr[0] <= arr[1] && arr[1] <= arr[2] && arr[2] <= arr[3]) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */


    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */


    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */

}
