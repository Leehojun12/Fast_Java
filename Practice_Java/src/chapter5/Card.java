package chapter5;

public class Card {

	private static int serialNumber = 10000;	
	private int CardNumber;
	
	public Card() {
		serialNumber++;
		CardNumber = serialNumber;
	}
	public int getCardNumber() {
		serialNumber++;
		return CardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.CardNumber = cardNumber;
	}	
}
