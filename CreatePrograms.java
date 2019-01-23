import java.util.ArrayList;
import java.lang.Character;
import java.util.Scanner;

//By Mitchell F Jones

public class CreatePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatePrograms myNewProgram = new CreatePrograms();
		
		myNewProgram.run();
	}
	private void run() {
		
		ArrayList<VentureProgram> myVentures = new ArrayList<VentureProgram>();
		
		Boolean checkAccountNumber = false;
		
		
		while(checkAccountNumber == false) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("What is the Company Name?");
			
			String compName = input.nextLine();
			
			System.out.println("What is the Account Number?");
			
			int acctNumber = input.nextInt();
			
			System.out.println("What type of Seed Venture is this?");
			
			char seedVenture = input.next().charAt(0);
			
			seedVenture = Character.toLowerCase(seedVenture);
			
			if(seedVenture == 't') {
				
				myVentures.add(new Toddler(compName, acctNumber, seedVenture));
			}
			
			else if(seedVenture == 'i') {
				
				myVentures.add(new Infancy(compName, acctNumber, seedVenture));
			}
			
			if(acctNumber == -1) {
				
				checkAccountNumber = true;
			}
			
		}
		
		for(VentureProgram i :myVentures) {
			
			i.toString(i);
			
			//I call an instance of a Venture program only to pass it into a method
			//that's already in it's instance, this is is basically Inception.
		}
		
	}
	

}
