
public class Infancy extends VentureProgram {

	

	public Infancy(String company_name, int account_number, char seed_type) {
		super(company_name, account_number, seed_type);
		// TODO Auto-generated constructor stub
		this.seedAmount = infancySeedAmount;
		
		this.ROI = infancyReturnPercent;
		
		this.termPeriod = infancyTermPeriod;
	}

}
