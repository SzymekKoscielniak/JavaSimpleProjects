import java.util.*;
import java.util.Arrays;

public class BiggestPossibleValueOfNumber {

	public static void main(String[] args) {

		
		
		 int N = 6789;
		 int OurNumber = N, DigitNumber = 0;
         int ParsedNumber = 0;
         
		while(OurNumber!=0)
        {   
			++DigitNumber;
            OurNumber/=10;
        }
		
		int[] DividedInt = new int[DigitNumber];

		 while(N!=0)
	        {
	        DividedInt[--DigitNumber]=N%10;
	        N/=10;
	        }
		 
		 
		 
		// sorting and reversing
	       Arrays.sort(DividedInt);
	       
	       
	       
	       for(int h = 0; h<DividedInt.length/2; h++)
	       {
	           int temp = DividedInt[h];
	           DividedInt[h] = DividedInt[DividedInt.length -h -1];
	           DividedInt[DividedInt.length -h -1] = temp;
	       }
	     
	       		N = 1;
	       
	       for(int g = 0; g < DividedInt.length; g++)
	       {
	           ParsedNumber = 10*ParsedNumber+DividedInt[g];
	           
	           	//System.out.println(ParsedNumber);
	 
	       }

	       System.out.println(ParsedNumber);
	        }
		}
	

