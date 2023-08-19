package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int product = num1 * num2;
        return num1 + " x " + num2 + " = " + product;
    }
    public static Boolean isPrime(int num) {
    	for(int i=2;i<num;i++) {
    		if(num%i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static Boolean isSquare(int num) {
    	double temp = Math.sqrt(num);
    	if(temp%1 == 0) {
    		return true;
    	}
    	
    	return false;
    }
    public static Boolean isCube(int num) {
    	for(int i=0;i<100;i++) {
    		int cube = i*i*i;
    		if(num == cube) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
