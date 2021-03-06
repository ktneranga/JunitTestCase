
public class TicketSystem {
	
	// calculate ticket amount according to the flight type
	public float flightTypeAmount(float basicPrice, float typeRate) {
		return basicPrice * (typeRate / 100);
	}
	
	// calculate ticket amount according to the passenger class
	public float flightClassAmount(float basicPrice, float classRate) {
		return basicPrice * (classRate / 100);
	}
	
	// calculate government tax
	public float governmentTaxCharge(float basicPrice, float taxRate) {
		return basicPrice * (taxRate / 100);
	}
	
	// calculate VIP discount
	public float vipDiscount(float basicPrice, float discountRate) {
		return basicPrice * (discountRate / 100);
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
		return totalTicketPrice + governmentTaxCharge;
	}
	
	// calculate extra baggage price
	public float extraBaggageAmount(float basicPrice, float extraBagageCharge) {
		return basicPrice + extraBagageCharge;
	}
	
	public float flightMissingCompensation(float basicPrice, float delayCompensation) {
		return basicPrice + delayCompensation;
	}
	
	
}
