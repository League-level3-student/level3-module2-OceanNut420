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
    public static Boolean containsSOS(List<String> message1) {
    	for(int i=0;i<message1.size();i++) {
    		if(message1.get(i).equals("... --- ...")) {
    			return true;
    		}
    	}
    	return false;
    }
    public static Boolean containsSOS2(List<String> message2) {
    	for(int i=0;i<message2.size();i++) {
    		if(message2.get(i).equals("... --- ...")) {
    			return true;
    		}
    	}
    	return false;
    }
    public static List<Double> sortScores(List<Double> results) {
    	
    	for (int i = 0; i < results.size(); i++) {
            for (int k = 0; k < results.size() - 1; k++) {
                if( results.get(k) > results.get(k+1) ) {
                    //Double temp = results[k];
                    //results(k) = arr[ k+1 ];
                    //arr[ k+1 ] = temp;
                	
                	Double temp = results.get(k);
                	results.remove(k);
                	results.add(k+1, temp);;
                }
            }
        }
    	
    	/*
    	for(int j=0;j<results.size();j++) {
    		System.out.println(results.get(j));
    	}
    	*/
    	
    	return results;
    }
}
