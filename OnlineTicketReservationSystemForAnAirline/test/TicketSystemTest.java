import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicketSystemTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link TicketSystem#flightTypeAmount(float, float)}.
	 */
	@Test
	void testFlightTypeAmount() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float typeRate = 10;
		
		double actual = ticketSystem.flightTypeAmount(basicPrice, typeRate);
		double expected = 10000;
		
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link TicketSystem#flightClassAmount(float, float)}.
	 */
	@Test
	void testFlightClassAmount() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float classRate = 20;
		
		double actual = ticketSystem.flightClassAmount(basicPrice, classRate);
		double expected = 20000;
		
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link TicketSystem#governmentTaxCharge(float, float)}.
	 */
	@Test
	void testGovernmentTaxCharge() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float taxRate = 5;
		
		double actual = ticketSystem.governmentTaxCharge(basicPrice, taxRate);
		double expected = 5000;
		
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link TicketSystem#vipDiscount(float, float)}.
	 */
	@Test
	void testVipDiscount() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float discountRate = 5;
		
		double actual = ticketSystem.vipDiscount(basicPrice, discountRate);
		double expected = 5000;
		
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link TicketSystem#totalTicketPrice(float, float, float, float)}.
	 */
	@Test
	void testTotalTicketPrice() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float flightTypeAmount = 10000;
		float flightClassAmount = 20000;
		float vipDiscount = 5000;
		
		double actual = ticketSystem.totalTicketPrice(basicPrice, flightTypeAmount, flightClassAmount, vipDiscount);
		double expected = 125000;
		
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link TicketSystem#netTicketPrice(float, float)}.
	 */
	@Test
	void testNetTicketPrice() {
		TicketSystem ticketSystem = new TicketSystem();
		float totalTicketPrice = 125000;
		float governmentTaxCharge = 5000;
		
		double actual = ticketSystem.netTicketPrice(totalTicketPrice, governmentTaxCharge);
		double expected = 130000;
		
		assertEquals(actual, expected);
	}
	
	@Test
	void testExtraBaggageAmount() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float extraBagageCharge = 5000;
		
		double actual = ticketSystem.extraBaggageAmount(basicPrice, extraBagageCharge);
		double expected = 105000;
		
		assertEquals(actual, expected);
	}
	
	@Test
	void testFlightMissingCompensation() {
		TicketSystem ticketSystem = new TicketSystem();
		float basicPrice = 100000;
		float extraBagageCharge = 10000;
		
		double actual = ticketSystem.flightMissingCompensation(basicPrice, extraBagageCharge);
		double expected = 110000;
		
		assertEquals(actual, expected);
	}

}
