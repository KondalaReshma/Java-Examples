package AggregationExample;

public class Palindrome{
	
	public static boolean isPalindrome(int i) {
		StringBuffer strNum= new StringBuffer(i);
        StringBuffer sbReverse=new StringBuffer(strNum);
         sbReverse.reverse();
        
         if(strNum.toString().equals(sbReverse.toString())) {
		         return true;
         }
         
         else {
        	 return false;
         }
	}
public static void main(String[] args) {
	System.out.println(isPalindrome(121));
	
}}