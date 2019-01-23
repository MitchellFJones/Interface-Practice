
public abstract class VentureProgram implements VentureConstants{
	
	public String companyName;
	
	public int accountNumber;

	public double seedAmount;
	
	public double ROI;
	
	public double termPeriod;
	
	public char seedType;
	
	public VentureProgram(String company_name, int account_number, char seed_type) {
		
		this.companyName = company_name;
		
		this.accountNumber = account_number;
		
		this.seedType = seed_type;
		
	}
	private String returnWord(char _type) {
		
		String type = null;
		
		if(_type == 't') {
			
			type = "Toddler";
		}
		else if(_type == 'i') {
			
			type = "Infancy";
		}
		
		return type;
	}
	
	//I know I could have made seed_type a String and just skipped some extra work
	//but I had already made it a char in the other classes and was too lazy, even though
	//changing it in the first place would have been way easier :).
	
	public String toString(VentureProgram output) {
	
		System.out.println("Name: " + output.companyName);
		
		System.out.println("Account Number: " + output.accountNumber);
		
		System.out.println(String.format("Seed Amount: $ %.2f",output.seedAmount));
		
		System.out.println("Return on Investment (Percent): " + output.ROI * 100 + "%");
		
		System.out.println(String.format("Term Period Length (Years): %.0f", output.termPeriod));
		
		System.out.println("Venture Type: " + returnWord(output.seedType));
		
		String returnStatement = output.companyName + "," +output.accountNumber + "," + output.seedAmount + "," + output.ROI +","+output.termPeriod + "," + output.seedType;
		
		//I made my ToString also output to the screen, but the string is there in case I had to write it to a text file.
		
		return returnStatement;
	}
	
}


