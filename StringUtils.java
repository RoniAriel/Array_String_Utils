import java.util.Arrays;

public class StringUtils {
	

	
	private static boolean compareTwoElements(String a, String b) {
		return a.compareTo(b) <= 0;
	}

	public static String findSortedSequence(String str) {
		String Maxseq = "";
		String Currseq = "";
		String [] arr= str.split(" ");
		for (int i =0; i< arr.length-1; i++) {
			if (Currseq.isEmpty()){
				 Currseq = arr[i];	
			}
			if (compareTwoElements((arr[i]),(arr[i+1]))) {
				Currseq = String.join(" ",Currseq, arr[i+1]);
			}
			else {
				Currseq = ""; 
			}if (Currseq.length() >=  Maxseq.length()) {
					Maxseq = Currseq;
				}
			}
		if ((arr.length>0) && (Maxseq.length()== 0)) {
			Maxseq = arr[arr.length-1];
	}
		
	   return Maxseq;
	}


	
	public static boolean isEditDistanceOne(String a, String b){
		if ((a.length() > b.length()+1 )||(b.length() > a.length()+1 ) ) {
			return false;
	   }if (a.equals(b)) {
			return true;
			
		}
		int cnt = 0;
		if (a.length() == b.length()){
			for (int i=0; i< a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					cnt++;
					if (cnt > 1) {
						return false;
				}
				} 
			}
			return true;
		}
	
	
		if ((a.length()+1) == b.length()) {
			int i =0;
			int j =0;

			while (i<a.length() && j< b.length()) {
				if (a.charAt(i) != b.charAt(j)) {
					j++;
					cnt++;
				}if (cnt> 1) {
					return false;
				}	
			
			return true;
		}
	}
		if ((b.length()+1) == a.length()) {
			int i =0;
			int j =0;
			while (i<a.length() && j< b.length()) {
				if (a.charAt(i) != b.charAt(j)) {
					i++;
					cnt++;
				}else {
					i++;
					j++;	
				}if (cnt> 1) {
					return false;
			}	
		}
			return true;
			
	}
	return false;
	}
	
}

