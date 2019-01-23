
public class Toddler extends VentureProgram {

	public Toddler(String company_name, int account_number, char seed_type) {
		super(company_name, account_number, seed_type);
		// TODO Auto-generated constructor stub
		this.seedAmount = toddlerSeedAmount;
		
		this.ROI = toddlerReturnPercent;
		
		this.termPeriod = toddlerTermPeriod;
	}

}
