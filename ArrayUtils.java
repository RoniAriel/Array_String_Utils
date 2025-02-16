import java.util.Arrays;

public class ArrayUtils {

	public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
		
	if (array.length == 0) {
		return array;
		}
	int m = (Math.abs(move)%array.length);
	if (((direction == 'R') && (move > 0)) || ((direction == 'L') && (move)< 0)) {
		for (int i=0 ; i< m; i++) {
			rotatedright(array);
		}
	}
	if (((direction == 'L') && (move > 0)) || ((direction == 'R') && (move)< 0)) {
		for (int i= 0; i< m; i++) {
			rotatedleft(array);
		}
	}
	return array;
	}
		
	private static void rotatedleft(int[] ArrayofNumbers) {
		int temp = ArrayofNumbers[0];
		for (int i = 0; i< (ArrayofNumbers.length-1); i++) { 
			ArrayofNumbers[i]= ArrayofNumbers[i+1];
		}
		ArrayofNumbers[ArrayofNumbers.length-1]= temp;
	}
		
	private static void rotatedright(int[] ArrayofNumbers) {
		int temp = ArrayofNumbers[ArrayofNumbers.length-1];
		for (int i =ArrayofNumbers.length-1; i> 0; i--) { 
			ArrayofNumbers[i]= ArrayofNumbers[i-1];
			}
			ArrayofNumbers[0]= temp;

	}
	
	



	
	


	
			
	
	
}
