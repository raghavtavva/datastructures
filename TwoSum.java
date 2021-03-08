/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//System.out.println("Hello World1");
		int[] input = {1,3,7,9,2};
		int target = 11;
		System.out.println(TwoSum(input, target));
	}
	
	private static String TwoSum(int[] input, int target){
	    //System.out.println("Hello World2 "+ input.length);
	    
	    int arrayLength = input.length;
	    String index = "";
	    for(int i=0;i<arrayLength;i++){
	           int mainNumber = input[i];
	          // System.out.println(mainNumber);
	           for(int j=i+1;j<arrayLength;j++){
	               int sum = mainNumber + input[j];
	              // System.out.println(sum);
	               if (sum == target){
	                   index = i + "," + j;
	                   break;
	               }
	               if (!index.equals("")){
	                   break;
	               }
	           }
	           
	    }
	    return index;
	}
}
