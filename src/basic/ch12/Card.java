package basic.ch12;

public class Card {
	
	private static double cardnum1;
	private static int cardnum2;
	private static int cardnum3;
	
	private String cardname;
	String name;
	
	public Card(String name) {
		this.name = name;
		cardnum1 = CardMain.cardnumber1;
		CardMain.cardnumber1++;
		cardnum2 = CardMain.cardnumber2;
		CardMain.cardnumber2++;
		cardnum2 = CardMain.cardnumber3;
		CardMain.cardnumber3++;
		
		
	}

	public static int getCardnum2() {
		return cardnum2;
	}

	public static void setCardnum2(int cardnum2) {
		Card.cardnum2 = cardnum2;
	}
	public String getCardname2() {
		return cardname;
	}

	public void setCardname2(String cardname) {
		this.cardname = cardname;
	}

	public static int getCardnum3() {
		return cardnum3;
	}

	public static void setCardnum3(int cardnum3) {
		Card.cardnum3 = cardnum3;
	}
	public String getCardname3() {
		return cardname;
	}

	public void setCardname3(String cardname) {
		this.cardname = cardname;
	}

	public static double getCardnum() {
		return cardnum1;
	}

	public static void setCardnum(int cardnum) {
		Card.cardnum1 = cardnum;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	
}
