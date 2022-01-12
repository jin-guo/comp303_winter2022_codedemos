package ca.mcgill.cs.swdesign.m1;

import ca.mcgill.cs.swdesign.m1.Card6.Suit;
import ca.mcgill.cs.swdesign.m1.Card6.Rank;

/** This client class is a stand in for any client code. 
 *  This version is adapted to work with Card7 
 */
public final class Client
{ 
	private Client()
	{}
	
	/**
	 * @param pArgs Not used here
	 */
	public static void main(String[] pArgs)
	{

		Card6 card = new Card6(Rank.KING, Suit.SPADES);
		Card6 newcard = card.getCopy();
		Card6 newCard2 = Card6.makeCopy(card);
		System.out.println(card.getSuit().getColor());
		Deck d = new Deck();
		d.addCard(card);
		d.print();

		//Change the card using the reference outside of deck.
		card.setRank(Rank.KING);
		d.print();
	}

	
	
	
	
	
	
	
	
	
	
	

}
