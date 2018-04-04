//Maurice Hanns CSC 242 04/04/2018

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = {3,21,64,1,7,63};
		int largest = values[0];
			
		for (int i = 1; i < values.length; i++){
			if (values [i] > largest){
				largest = values[i];
			}
				
		}//for loop
		
		System.out.println(largest);
	}
		

}