//Maurice Hanns CSC 242 04/04/2018

public class animalSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] animals = {"Dog", "Cat", "Bird", "Fish"};
		String [] swap = new String [4];
		
		for (int i = 0; i < animals.length; i++){
		
			swap[i] = animals[i]; 
				
		}//for loop
		
		animals[0] = swap[2];
		animals[2] = swap[0];
	
		for (int i = 0; i < animals.length; i++){
		
			System.out.print(animals[i] + " " ); 
			
		}//for loop
	
	}
}