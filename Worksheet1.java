/** @author
 * Ellen Sutton
 * This class contains the solution for Worksheet1
 */

public class Worksheet1 {

  // Exercise 1

   /**
    * power is a method that calculates m^n
    * @param m - a non-negative integer
    * @param n - a non-negative integer
    * @return m^n
    */
    public static int power(int m, int n) {
        if (n==0)
            return 1;
        else {
            return m * power(m, n-1);
        }
    }

   
   /**
    * fastPower is a method that calculates m^n more efficiently than power
    * @param m - a non-negative integer
    * @param n - a non-negative integer
    * @return m^n
    */
    public static int fastPower(int m, int n) {
        if (n==0)
            return 1;
        else if (n==1)
        	return m;
        else if (m%2 == 0)
            return fastPower(m, n/2) * fastPower(m, n/2);
        else
            return m * fastPower(m, n-1);
    }
    
    
    
   
    // Exercise 2
    
    /**
     * negateAll is a method that given a list, returns a new list with all 
     * of the elements of that list with signs negated.
     * @param a - a list
     * @return a list with all the elements of a, negated.
     */
    public static List<Integer> negateAll(List<Integer> a) {
    	if (a.isEmpty())
    		return new List<Integer>(); 
    	else 
    		return new List<Integer>(-a.getHead(), negateAll(a.getTail()));           
    }

   
    
    
 
 
   
  // Exercise 3
    
    /**
     * find is a method that finds the position of an integer in a list
     * @param x - an integer
     * @param a - a list
     * @return the position of x in a
     */
    public static int find(int x, List<Integer> a) {
    	if (a.isEmpty())
    		throw new IllegalArgumentException();
    	else if (a.getHead() == x)
    		return 0;
    	else
    		return 1 + find(x, a.getTail());
    }

   
   
   
   
   
   
    // Exercise 4
    
    /**
     * allPositive is a method that returns true if all elements 
     * of a given list are positive, and returns false otherwise
     * @param a - a list
     * @return true if all elements of a are positive, false otherwise
     */
    public static boolean allPositive(List<Integer> a) {
    	if (a.isEmpty())
            return true; 
    	else if (a.getHead() < 0)
    		return false;
    	else
    		return allPositive(a.getTail());
    }

   
   
   
   
   
   
   
    // Exercise 5
    
    /**
     * positives is a method that given a list, returns a new list which
     * contains all the positive elements of that list
     * @param a - a list
     * @return a list containing all positive elements of a
     */
    public static List<Integer> positives(List<Integer> a) {
    	if (a.isEmpty())
    		return new List <Integer>();
    	else if (a.getHead() < 0)
    		return positives(a.getTail());
    	else
    		return new List<Integer>(a.getHead(), positives(a.getTail()));
        
    }

   
   
   
   
   
  
   
   
    // Exercise 6
    /**
     * sorted is a method that returns true if a given list is in
     * ascending order and false otherwise
     * @param a - a list
     * @return true if a is in ascending order, false otherwise
     */
    public static boolean sorted(List<Integer> a) {
    	if (a.isEmpty())
    		return true;
    	else if (a.getTail().isEmpty())
            return true;
    	else if (a.getHead() > a.getTail().getHead())
    		return false;
    	else
    		return sorted(a.getTail());
    }

   
   
   
   
   
   
   
   
    // Exercise 7
    /**
     * merge is a method that given two sorted lists, returns a new sorted 
     * list containing all of the elements of those lists (including duplicates)
     * @param a - a sorted list
     * @param b - a sorted list
     * @return a sorted list containing all elements of a and b 
     */
    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
    	if (a.isEmpty())
    		return b;
    	if (b.isEmpty())
    		return a;
    	if (a.getHead() < b.getHead()) 
            return new List<Integer>(a.getHead(), merge(a.getTail(), b));
    	else
    		return new List<Integer>(b.getHead(), merge(a, b.getTail()));
    }

   
   
   
 
   
   
    // Exercise 8
    /**
     * removeDuplicates is a method that given a sorted list, returns
     * a copy of that list with duplicates removed
     * @param a - a sorted list
     * @return a copy of a with duplicates removed
     */
    static List<Integer> removeDuplicates(List<Integer> a) {
    	if (a.isEmpty())
            return a;
    	else if (a.getTail().isEmpty())
    		return a;
    	else if (a.getHead() == a.getTail().getHead())
    		return removeDuplicates(a.getTail());
    	else
    		return new List<Integer>(a.getHead(), removeDuplicates(a.getTail()));
    }
   

   
}