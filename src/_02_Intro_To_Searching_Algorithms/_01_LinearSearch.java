package _02_Intro_To_Searching_Algorithms;

public class _01_LinearSearch {
    /*
     * When finding the location of a certain element in an array,
     * there are many algorithms that can do so. The simplest is the 
     * linear search. This is best for short unsorted lists of data.
     */
    public static int linearSearch(String[] words, String value) {
        // 1. Complete the method using a for loop to find the value
        //    in the array. Return the location in the array
        //    where the value was found.
        //    If the value is not found in the array, return -1.

    	for(int i=0;i<words.length;i++) {
    		if(words[i] == value) {
    			return i;
    		}
    	}
    	
    	// l1 i! a@ e3 s$ o0 +t c( l i a e s o t c
    	// c t o s e a i l
    	// 1!3 +0@$+ $@+ (@+ $00+ +03$ $@!1 $3@ 0!1    	
  
    	    	    	
        return -1;
    }
}
