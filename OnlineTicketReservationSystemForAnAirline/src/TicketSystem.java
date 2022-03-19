
public class TicketSystem {
	
	//calculate flight type amount
	public float flightTypeAmount(float basicPrice, float typeRate) {
		return basicPrice * (typeRate / 100);
	}
	
	// calculate flight class amount
	public float flightClassAmount(float basicPrice, float classRate) {
		return basicPrice * (classRate / 100);
	}
	
	// calculate government tax
	public float governmentTaxCharge(float basicPrice, float taxRate) {
		return basicPrice * (taxRate / 100);
	}
	
	// calculate totalTicketPrice
	public float totalTicketPrice(
			float basicPrice,
			float flightTypeAmount, 
			float flightClassAmount,
			float vipDiscount
			) {
		return (basicPrice + flightTypeAmount + flightClassAmount) - vipDiscount;
	}
	
	// calculate netTicket price
	public float netTicketPrice(float totalTicketPrice, float governmentTaxCharge) {
		return totalTicketPrice - governmentTaxCharge;
	}
	
	//need two more functions
	
}