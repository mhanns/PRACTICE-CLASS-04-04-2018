//Maurice Hanns CSC 242 04/04/2018

public class sndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = {3,21,64,1,7,63};
		int smallest = values[0];
		int sndSmall = values[0];
			
		for (int i = 1; i < values.length; i++){
			if (values [i] < smallest){
				smallest = values[i];
				
			}
		}//for loop
		
		for (int j = 1; j < values.length; j++){
			if (values [j] < smallest){
				sndSmall = values[j];
			}
		}//for loop
		System.out.println(smallest);
		System.out.println(sndSmall);
		
	}
		

}
