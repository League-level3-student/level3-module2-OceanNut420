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
    	for(int i=0;i<eggs.size();i++) {
    		if(eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for(int i=0;i<oysters.size();i++) {
    		if(oysters.get(i) == true) {
    			count++;
    		}
    	}
    	return count;
    }
    
    public static Double findTallest(List<Double> peeps) {
    	Double tall = 0.0;
    	for(int i=0;i<peeps.size();i++) {
    		if(peeps.get(i) > tall) {
    			tall = peeps.get(i);
    		}
    	}
    	return tall;
    }
    
    public static String findLongestWord(List<String> words) {
    	int tall = 0;
    	String word = "";
    	for(int i=0;i<words.size();i++) {
    		if(words.get(i).length() > tall) {
    			tall = words.get(i).length();
    			word = words.get(i);
    		}
    	}
    	return word;
    }
    
    public static Boolean containsSOS(List<String> message1) {
    	for(int i=0;i<message1.size();i++) {
    		if(message1.get(i).contains("... --- ...")) {
        		return true;
        	}
    	}
    	return false;
    }
    public static Boolean containsSOS2(List<String> message1) {
    	for(int i=0;i<message1.size();i++) {
    		if(message1.get(i).contains("... --- ...")) {
        		return true;
        	}
    	}
    	return false;
    }
    
    
    public static List<Double> sortScores(List<Double> results) {
    	for (int i = 0; i < results.size(); i++) {
            
            for (int k = 0; k < results.size() - 1; k++) {
                
                if( results.get(k) > results.get(k+1) ) {
                    
                    // Swap elements at k and k+1
                    Double temp = results.get(k);
                    Double temp2 = results.get(k+1);
                    results.set(k, temp2);
                    results.set(k+1, temp);
                    
                 
                    
                }
            }
        }
    	
    	
    	return results;
    }
    public static List<String> sortDNA(List<String> unsortedSequences) {
    	
    	for (int i = 0; i < unsortedSequences.size(); i++) {
            for (int k = 0; k < unsortedSequences.size() - 1; k++) {
                if(unsortedSequences.get(k).length() > unsortedSequences.get(k+1).length() ) {
                    // Swap elements at k and k+1
                	String temp = unsortedSequences.get(k);
                    String temp2 = unsortedSequences.get(k+1);
                    unsortedSequences.set(k, temp2);
                    unsortedSequences.set(k+1, temp);
                    
                }
            }
        }
    	
    	return unsortedSequences;
    }
    public static List<String> sortWords(List<String> words){
    	
    	for (int i = 0; i < words.size(); i++) {
            for (int k = 0; k < words.size() - 1; k++) {
                if(words.get(k).compareTo(words.get(k+1)) > 0) {
                    // Swap elements at k and k+1
                	String temp = words.get(k);
                    String temp2 = words.get(k+1);
                    words.set(k, temp2);
                    words.set(k+1, temp);
                    
                }
            }
        }
    	
    	return words;
    }
        
}

//@(3!10$+ bdfghjkmnpqruvwxyz